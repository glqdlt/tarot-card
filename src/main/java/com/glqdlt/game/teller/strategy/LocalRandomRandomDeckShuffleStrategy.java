package com.glqdlt.game.teller.strategy;

import com.glqdlt.game.card.Tarot;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
public class LocalRandomRandomDeckShuffleStrategy implements RandomDeckShuffleStrategy {
    @Override
    public List<Tarot> shuffle(List<Tarot> deck) {
        Collections.shuffle(deck);
        for (Tarot t : deck) {
            int y = nextInt();
            if (y % 2 == 0) {
                t.positionToggle();
            }
        }
        return deck;
    }

    @Override
    public int nextInt() {
        return ThreadLocalRandom.current().nextInt();
    }
}
