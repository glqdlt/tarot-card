package com.glqdlt.game.teller.hands;

import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;
import com.glqdlt.game.teller.strategy.SimpleDeckMaker;

/**
 * Date 2019-11-01
 *
 * @author glqdlt
 */
public class SimpleNormalTarotDeck extends TarotDeck {
    public SimpleNormalTarotDeck(DeckShuffleStrategy shuffleStrategy) {
        super(SimpleDeckMaker.make(), shuffleStrategy);
    }

    @Override
    int nextIndex() {
        return 0;
    }
}
