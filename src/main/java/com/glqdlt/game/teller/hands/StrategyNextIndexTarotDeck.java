package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;

import java.util.List;

/**
 * Date 2019-11-07
 *
 * @author glqdlt
 */
public class StrategyNextIndexTarotDeck extends TarotDeck {

    private NextIndexStrategy indexStrategy;

    public StrategyNextIndexTarotDeck(List<Tarot> deck, DeckShuffleStrategy shuffleStrategy) {
        super(deck, shuffleStrategy);
    }

    public StrategyNextIndexTarotDeck(List<Tarot> deck,
                                      DeckShuffleStrategy shuffleStrategy,
                                      NextIndexStrategy indexStrategy) {
        super(deck, shuffleStrategy);
        this.indexStrategy = indexStrategy;
    }

    public void setIndexStrategy(NextIndexStrategy indexStrategy) {
        this.indexStrategy = indexStrategy;
    }

    @Override
    int nextIndex() {
        return indexStrategy.next();
    }
}
