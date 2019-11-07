package com.glqdlt.game.teller.strategy;

import com.glqdlt.game.card.CardPosition;
import com.glqdlt.game.card.Tarot;
import com.glqdlt.game.card.major.MajorCards;
import com.glqdlt.game.card.minor.sword.SwordMinorCards;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Date 2019-10-31
 *
 * @author glqdlt
 */
public class DefaultDeckMaker implements DeckMaker {

    @Override
    public List<Tarot> make() {
        return Stream.of(
                MajorCards.values(),
                SwordMinorCards.values()
        )
                .map(Stream::of)
                .flatMap(Stream::distinct)
                .map(x -> new Tarot(x, CardPosition.UP))
                .collect(Collectors.toList());
    }
}
