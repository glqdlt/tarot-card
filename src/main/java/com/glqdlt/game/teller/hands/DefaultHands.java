package com.glqdlt.game.teller.hands;

import com.glqdlt.game.teller.strategy.DeckSetupStrategy;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Date 2019-11-01
 *
 * @author glqdlt
 */
public class DefaultHands extends Hands {
    public DefaultHands(DeckSetupStrategy deckSetup, DeckShuffleStrategy shuffleStrategy) {
        super(deckSetup, shuffleStrategy);
    }

    @Override
    int nextInt() {
        return ThreadLocalRandom.current().nextInt(0, super.getDeck().size());
    }
}
