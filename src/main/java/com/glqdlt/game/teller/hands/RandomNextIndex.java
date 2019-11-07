package com.glqdlt.game.teller.hands;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Date 2019-11-07
 *
 * @author glqdlt
 */
public abstract class RandomNextIndex implements NextIndexStrategy {

    abstract Integer getLimit();

    @Override
    public Integer next() {
        return ThreadLocalRandom.current().nextInt(0, getLimit());
    }
}
