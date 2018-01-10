package state;

import card.Deck;
import player.Player;

import java.util.Collection;

public interface RoundState {

    Collection<Player> getPlayers();

    Deck getDeck();

    Long getPot();
}
