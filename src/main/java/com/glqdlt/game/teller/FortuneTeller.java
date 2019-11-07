package com.glqdlt.game.teller;

import com.glqdlt.game.spread.Spread;
import com.glqdlt.game.teller.hands.TarotDeck;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
public class FortuneTeller {
    private TarotDeck hands;
    private Spread spread;

    public FortuneTeller(TarotDeck hands,
                         Spread spread) {
        this.hands = hands;
        this.spread = spread;
    }
}
