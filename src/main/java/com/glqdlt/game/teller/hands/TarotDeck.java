package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.error.TarotErrorWithCode;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;

import java.util.LinkedList;
import java.util.List;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
public abstract class TarotDeck {
    private List<Tarot> deck;
    private List<Tarot> open;

    private DeckShuffleStrategy shuffleStrategy;

    public TarotDeck(List<Tarot> deck,
                     DeckShuffleStrategy shuffleStrategy) {
        this.setDeck(deck);
        this.setShuffleStrategy(shuffleStrategy);
        this.open = new LinkedList<>();
        deckShuffle();
    }

    public DeckShuffleStrategy getShuffleStrategy() {
        return shuffleStrategy;
    }

    public void setShuffleStrategy(DeckShuffleStrategy shuffleStrategy) {
        this.shuffleStrategy = shuffleStrategy;
    }

    private void setDeck(List<Tarot> deck) {
        this.deck = deck;
    }

    public void deckShuffle() {
        if (getShuffleStrategy() == null) {
            throw new ShuffleNotSeupError();
        }
        checkCardEmpty();
        setDeck(getShuffleStrategy().shuffle(getDeck()));
    }

    private void checkCardEmpty() {
        if (isTarotEmpty()) {
            throw new DeckEmptyError();
        }
    }

    private boolean isTarotEmpty() {
        return getDeck() == null || getDeck().size() == 0;
    }

    public boolean hashNextTarot() {
        return !isTarotEmpty();
    }

    public final Tarot openTarot() {
        checkCardEmpty();
        int i = nextIndex();
        Tarot y = getDeck().get(i);
        deck.remove(y);
        open.add(y);
        return y;
    }

    abstract int nextIndex();

    public final List<Tarot> getDeck() {
        return deck;
    }

    public List<Tarot> getOpen() {
        return open;
    }

    public Tarot getLastedOpenCard() {
        if (getOpen() == null || getOpen().size() == 0) {
            throw new TarotErrorWithCode("Tarot Not open") {
                @Override
                public String getCode() {
                    return "p123";
                }

                @Override
                public String getErrorMessage() {
                    return "타로를 한번도 오픈 하지 않았습니다.";
                }
            };
        }
        return getOpen().get(getOpen().size() - 1);
    }
}
