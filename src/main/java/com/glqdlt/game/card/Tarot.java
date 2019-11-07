package com.glqdlt.game.card;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
public class Tarot {
    private TarotCard tarotCard;
    private CardPosition position;

    public Tarot(TarotCard tarotCard, CardPosition position) {
        this.tarotCard = tarotCard;
        this.position = position;
    }

    public void setUpPosition() {
        this.position = CardPosition.UP;
    }

    public void positionToggle() {
        CardPosition z = getPosition();
        if (z.equals(CardPosition.UP)) {
            this.position = CardPosition.DOWN;
        } else {
            this.position = CardPosition.UP;
        }
    }

    public boolean isTarotDown() {
        return this.getPosition().equals(CardPosition.DOWN);
    }

    public CardPosition getPosition() {
        return position;
    }

    public TarotCard getTarotCard() {
        return tarotCard;
    }


}
