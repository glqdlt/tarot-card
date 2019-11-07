package com.glqdlt.game.card;

import com.glqdlt.game.card.major.MajorCards;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TarotTest {

    @Test
    public void simpleTarotStateTest() {
        Tarot tarot = new Tarot(MajorCards.FOOL, CardPosition.UP);
        Assert.assertEquals(CardPosition.UP, tarot.getPosition());
        tarot.positionToggle();
        Assert.assertEquals(CardPosition.DOWN, tarot.getPosition());
        Assert.assertTrue(tarot.isTarotDown());
        tarot.positionToggle();
        Assert.assertFalse(tarot.isTarotDown());
    }
}