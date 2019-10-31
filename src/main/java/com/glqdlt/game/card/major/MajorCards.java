package com.glqdlt.game.card.major;

import com.glqdlt.game.card.TarotCard;

public enum MajorCards implements TarotCard {
    FOOL("The Fool", 0),
    MAGICIAN("The Magician", 1),
    HIGH_PRIESTESS("The High Priestess", 2),
    EMPRESS("The Empress", 3),
    EMPEROR("The Emperor", 4),
    POPE("The Hierophant", 5),
    LOVERS("The Lovers", 6),
    CHARIOT("The Chariot", 7),
    STRENGTH("The Strength", 8),
    HERMIT("The Hermit", 9),
    FORTUNE("Wheel Of Fortune", 10),
    JUSTICE("Justice", 11),
    HANGED_MAN("The Hanged Man", 12),
    DEATH("Death", 13),
    TEMPERANCE("Temperance", 14),
    DEVIL("The Devil", 15),
    TOWER("The Tower", 16),
    STAR("The Star", 17),
    MOON("The Moon", 18),
    SUN("The Sun", 19),
    JUDGEMENT("Judgement", 20),
    WORLD("The World", 21);

    private final String name;

    private final Integer number;

    MajorCards(String name, Integer number) {
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