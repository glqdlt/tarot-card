package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.teller.strategy.DeckSetupStrategy;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;

import java.util.LinkedList;
import java.util.List;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
//TODO getDeck() 으로 내부 타로카드를 조작할수있는 캡슐화문제가 있음. 그냥 내가 직접 List 를 구현하는 것도 나쁘지 않을듯
public abstract class Hands {
    private List<Tarot> deck;
    private List<Tarot> open;

    private DeckSetupStrategy deckSetup;
    private DeckShuffleStrategy shuffleStrategy;

    public Hands(DeckSetupStrategy deckSetup,
                 DeckShuffleStrategy shuffleStrategy) {
        this.deckSetup = deckSetup;
        this.shuffleStrategy = shuffleStrategy;
        deckSetup();
    }

    public void setDeckSetupStrategy(DeckSetupStrategy deckSetup) {
        this.deckSetup = deckSetup;
    }

    public void setShuffleStrategy(DeckShuffleStrategy shuffleStrategy) {
        this.shuffleStrategy = shuffleStrategy;
    }

    public void deckSetup() {
        if (deckSetup == null) {
            throw new RuntimeException("Please Setup DeckSetup");
        }
        if (shuffleStrategy == null) {
            throw new RuntimeException("Please Setup ShuffleStrategy");
        }
        setDeck(deckSetup.setDecks());
        this.open = new LinkedList<>();
        deckShuffle();
    }

    private void setDeck(List<Tarot> deck) {
        this.deck = deck;
    }

    public void deckShuffle() {
        setDeck(shuffleStrategy.shuffle(getDeck()));
    }

    public boolean isCardEmpty() {
        return getDeck() == null || getDeck().size() == 0;
    }

    public final Tarot getTarot() {
        if (isCardEmpty()) {
            throw new RuntimeException("Tarot Deck is Empty");
        }
        int zz = nextInt();
        Tarot y = getDeck().get(zz);
        deck.remove(y);
        open.add(y);
        return y;
    }

    abstract int nextInt();

    public final List<Tarot> getDeck() {
        return deck;
    }

    public List<Tarot> getOpen() {
        return open;
    }
}
