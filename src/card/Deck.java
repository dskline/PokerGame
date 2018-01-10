package card;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class Deck {

    private Set<Card> cards;

    public Deck(Set<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        // TODO: Deck.shuffle()
    }

    public Collection<Card> draw() {
        return draw(1);
    }

    public Collection<Card> draw(Integer numberToDraw) {
        // TODO: Deck.draw()
        return Collections.emptyList();
    }
}
