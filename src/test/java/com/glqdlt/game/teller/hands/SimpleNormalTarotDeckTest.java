package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategys;
import com.glqdlt.game.teller.strategy.SimpleDeckMaker;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SimpleNormalTarotDeckTest {

    @Test
    public void name() {
        SimpleNormalTarotDeck simpleNormalTarotDeck = new SimpleNormalTarotDeck(DeckShuffleStrategys.NOT_SHUFFLE);
        int i = 0;
        List<Tarot> z = SimpleDeckMaker.make();
        while (simpleNormalTarotDeck.hashNextTarot()) {
            Assert.assertEquals(z.get(i).getTarotCard().getCardName(), simpleNormalTarotDeck.openTarot().getTarotCard().getCardName());
            i++;
        }
    }
}