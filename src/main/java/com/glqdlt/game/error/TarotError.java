package com.glqdlt.game.error;

/**
 * Date 2019-11-02
 *
 * @author glqdlt
 */
class TarotError extends RuntimeException {
    TarotError(String message) {
        super(message);
    }

    TarotError(String message, Throwable cause) {
        super(message, cause);
    }
}
