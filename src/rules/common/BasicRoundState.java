package rules.common;

import card.Deck;
import card.DeckFactory;
import player.Player;
import state.GameState;
import state.RoundState;

import java.util.Collection;

public abstract class BasicRoundState implements RoundState {

    private Collection<Player> players;
    private Deck deck;
    private Long pot = 0L;

    public BasicRoundState(GameState gameState) {
        this.deck = DeckFactory.createDeck();
        this.players = gameState.getPlayers();
        for(Player player : this.players) {
            player.setHand(deck.draw(getStartingHandSize()));
        }
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }

    public Long getPot() {
        return pot;
    }

    public void addMoneyToPot(Long amountToAdd) {
        pot += amountToAdd;
    }

    protected abstract Integer getStartingHandSize();
}
