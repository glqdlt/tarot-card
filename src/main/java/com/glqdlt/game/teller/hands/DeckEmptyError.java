package com.glqdlt.game.teller.hands;

import com.glqdlt.game.error.TarotErrorWithCode;

/**
 * Date 2019-11-02
 *
 * @author glqdlt
 */
public class DeckEmptyError extends TarotErrorWithCode {
    public DeckEmptyError() {
        super("Tarot deck is empty.");
    }

    @Override
    public final String getCode() {
        return "TH001";
    }

    @Override
    public final String getErrorMessage() {
        return "타로 카드를 다 뽑았습니다.";
    }
}
