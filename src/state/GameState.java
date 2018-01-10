package state;

import config.GameOptions;
import player.Player;

import java.util.Collection;

public class GameState {

    private GameOptions gameOptions;
    private Collection<Player> players;

    public GameState(GameOptions gameOptions, Collection<Player> players) {
        this.gameOptions = gameOptions;
        this.players = players;
    }

    public GameOptions getGameOptions() {
        return gameOptions;
    }

    public Collection<Player> getPlayers() {
        return players;
    }
}
