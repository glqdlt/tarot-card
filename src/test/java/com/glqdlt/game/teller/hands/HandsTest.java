package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.CardPosition;
import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.card.major.MajorCards;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;
import com.glqdlt.game.teller.strategy.DefaultDeckSetupStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void emptyTarotCard() {
        Hands hands = new Hands(() -> {
            List<Tarot> a = new ArrayList<>();
            a.add(new Tarot(MajorCards.FOOL, CardPosition.UP));
            return a;
        }, deck -> deck) {
            @Override
            int nextInt() {
                return 0;
            }
        };

        List<Tarot> deck = hands.getDeck();
        Assert.assertEquals(1, deck.size());
        Tarot t = hands.getTarot();
        Assert.assertEquals(MajorCards.FOOL, t.getTarotCard());
        try {
            Tarot t2 = hands.getTarot();
            Assert.fail("I will expect Exception..");
        } catch (DeckEmptyError error) {
            Assert.assertEquals("TH001", error.getCode());
            Assert.assertEquals("타로 카드를 다 뽑았습니다.", error.getErrorMessage());
        }
    }
}