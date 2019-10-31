package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;
import com.glqdlt.game.teller.strategy.DefaultDeckSetupStrategy;
import org.junit.Assert;
import org.junit.Test;

public class HandsTest {

    private DeckShuffleStrategy testMockStrategy = deck -> deck;

    @Test
    public void simpleGetCartTest() {
        Hands hands = new Hands(new DefaultDeckSetupStrategy(), testMockStrategy) {
            @Override
            int nextInt() {
                return 0;
            }
        };
        Tarot z = hands.getTarot();
        Assert.assertEquals("The Fool", z.getTarotCard().getCardName());
        Tarot z2 = hands.getTarot();
        Assert.assertEquals("The Magician", z2.getTarotCard().getCardName());

    }
}