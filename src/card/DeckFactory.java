package card;

import java.util.Collections;
import java.util.Set;

public class DeckFactory {

    /**
     * @return a standard 52-card card
     */
    public static Deck createDeck() {
        // TODO: iterate through all suits and card values
        Set<Card> cards = Collections.emptySet();
        return new Deck(cards);
    }
}
