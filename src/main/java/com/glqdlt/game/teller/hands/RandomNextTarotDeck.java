package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;

import java.util.List;

/**
 * Date 2019-11-07
 *
 * @author glqdlt
 */
public class RandomNextTarotDeck extends StrategyNextIndexTarotDeck {

    public RandomNextTarotDeck(List<Tarot> deck, DeckShuffleStrategy shuffleStrategy) {
        super(deck, shuffleStrategy);
        super.setIndexStrategy(new RandomNextIndex() {
            @Override
            Integer getLimit() {
                return getLimitSize();
            }
        });
    }

    private Integer getLimitSize() {
        return super.getDeck().size();
    }
}
