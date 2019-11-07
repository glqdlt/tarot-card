package com.glqdlt.game.teller.hands;

import com.glqdlt.game.error.TarotErrorWithCode;

/**
 * Date 2019-11-07
 *
 * @author glqdlt
 */
public class ShuffleNotSeupError extends TarotErrorWithCode {
    public ShuffleNotSeupError() {
        super("Shutffle Straegy is null");
    }

    @Override
    public String getCode() {
        return "s00909";
    }

    @Override
    public String getErrorMessage() {
        return "타로 셔플 전략을 셋업해주세요.";
    }
}
