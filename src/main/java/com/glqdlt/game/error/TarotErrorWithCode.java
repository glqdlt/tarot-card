package com.glqdlt.game.error;

/**
 * Date 2019-11-02
 *
 * @author glqdlt
 */
public abstract class TarotErrorWithCode extends TarotError {

    public abstract String getCode();

    public abstract String getErrorMessage();

    public TarotErrorWithCode(String message) {
        super(message);
    }

    public TarotErrorWithCode(String message, Throwable cause) {
        super(message, cause);
    }
}
