package com.glqdlt.game.teller;

import com.glqdlt.game.spread.Spread;
import com.glqdlt.game.teller.hands.Hands;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
public class FortuneTeller {
    private Hands hands;
    private Spread spread;

    public FortuneTeller(Hands hands,
                         Spread spread) {
        this.hands = hands;
        this.spread = spread;
    }
}
