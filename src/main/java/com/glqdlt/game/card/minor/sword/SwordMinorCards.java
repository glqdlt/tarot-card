package com.glqdlt.game.card.minor.sword;

import com.glqdlt.game.card.minor.MinorCards;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
public enum SwordMinorCards implements MinorCards {
    ACE("Ace", 1),
    TWO("Sword 2", 2);

    private final String name;
    private final Integer number;


    SwordMinorCards(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public Integer getCardNumber() {
        return number;
    }

    @Override
    public String getCardName() {
        return name;
    }
}
