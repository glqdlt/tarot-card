package com.glqdlt.game.teller.strategy;

import com.glqdlt.game.card.Tarot;

import java.util.Collections;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
public class DeckShuffleStrategyArchive {

    /**
     * 그냥 현재 덱을 쓰까버림
     */
    public final static DeckShuffleStrategy DEFAULT_SHUFFLE = (x) -> {
        Collections.shuffle(x);
        return x;
    };
    /**
     * 다 정방향으로
     */
    public final static DeckShuffleStrategy ONLY_UP_SHUFFLE = (x) ->
    {
        Collections.shuffle(x);
        for (Tarot t : x) {
            t.setUpPosition();
        }
        return x;
    };

    /**
     * 정방향, 역방향 모두
     */
    public final static DeckShuffleStrategy WITH_UP_DOWN_SHUFFLE = new LocalRandomRandomDeckShuffleStrategy();


}
