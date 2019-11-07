package com.glqdlt.game.teller.strategy;

import com.glqdlt.game.card.Tarot;

import java.util.List;

/**
 * Date 2019-11-07
 *
 * @author glqdlt
 */
public class SimpleDeckMaker {
    private static final DefaultDeckMaker ins = new DefaultDeckMaker();
    public static List<Tarot> make(){
        return ins.make();
    }
}
