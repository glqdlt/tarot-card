package com.glqdlt.game.teller.strategy;

import com.glqdlt.game.card.Tarot;

import java.util.List;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
@FunctionalInterface
public interface DeckSetupStrategy {
    List<Tarot> setDecks();
}
