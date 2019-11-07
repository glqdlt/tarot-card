package com.glqdlt.game.teller.hands;

import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.error.TarotErrorWithCode;
import com.glqdlt.game.teller.strategy.DeckShuffleStrategys;
import com.glqdlt.game.teller.strategy.SimpleDeckMaker;
import org.junit.Assert;
import org.junit.Test;

public class RandomNextTarotDeckTest {

    @Test
    public void name() {
        RandomNextTarotDeck randomNextTarotDeck = new RandomNextTarotDeck(SimpleDeckMaker.make(), DeckShuffleStrategys.DEFAULT_SHUFFLE);
        while (randomNextTarotDeck.hashNextTarot()) {
            Tarot z = randomNextTarotDeck.openTarot();
            Tarot y = randomNextTarotDeck.getLastedOpenCard();
            Assert.assertEquals(z, y);
        }
    }

    @Test(expected = TarotErrorWithCode.class)
    public void name2() {
        RandomNextTarotDeck randomNextTarotDeck = new RandomNextTarotDeck(SimpleDeckMaker.make(), DeckShuffleStrategys.DEFAULT_SHUFFLE);
        randomNextTarotDeck.getLastedOpenCard();
    }
}