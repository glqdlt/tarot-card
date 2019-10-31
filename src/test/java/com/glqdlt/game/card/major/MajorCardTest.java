package com.glqdlt.game.card.major;

import com.glqdlt.game.card.TarotCard;
import org.junit.Assert;
import org.junit.Test;

public class MajorCardTest {

    @Test
    public void name() {
        TarotCard tarotCard = MajorCards.valueOf("FOOL");
        Assert.assertEquals("The Fool", tarotCard.getCardName());
    }
}