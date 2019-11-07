package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.CardPosition;
import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.card.major.MajorCards;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategy;
import com.glqdlt.game.teller.strategy.SimpleDeckMaker;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class HandsTest {

    private DeckShuffleStrategy testMockStrategy = deck -> deck;

    public static class AA {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AA aa = (AA) o;
            return Objects.equals(name, aa.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    @Test
    public void name() {
        AA a = new AA();
        a.setName("qq");
        Integer ee = 0;
        ee.equals(78);

        AA b = new AA();
        b.setName("qq");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        a.equals(b);
        System.out.println(a == b);
        HashMap<AA, String> aaa = new HashMap<>();
        aaa.put(a, "asd");
        aaa.put(b, "sdf");
        System.out.println(aaa);
    }

    @Test
    public void simpleGetCartTest() {
        TarotDeck hands = new TarotDeck(SimpleDeckMaker.make(), testMockStrategy) {
            @Override
            int nextIndex() {
                return 0;
            }
        };
        Tarot z = hands.openTarot();
        Assert.assertEquals("The Fool", z.getTarotCard().getCardName());
        Tarot z2 = hands.openTarot();
        Assert.assertEquals("The Magician", z2.getTarotCard().getCardName());

    }

    @Test
    public void emptyTarotCard() {
        List<Tarot> a = new ArrayList<>();
        a.add(new Tarot(MajorCards.FOOL, CardPosition.UP));


        TarotDeck hands = new TarotDeck(a, deck -> deck) {
            @Override
            int nextIndex() {
                return 0;
            }
        };

        List<Tarot> deck = hands.getDeck();
        Assert.assertEquals(1, deck.size());
        Tarot t = hands.openTarot();
        Assert.assertEquals(MajorCards.FOOL, t.getTarotCard());
        try {
            Tarot t2 = hands.openTarot();
            Assert.fail("I will expect Exception..");
        } catch (DeckEmptyError error) {
            Assert.assertEquals("TH001", error.getCode());
            Assert.assertEquals("타로 카드를 다 뽑았습니다.", error.getErrorMessage());
        }
    }
}