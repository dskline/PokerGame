import player.Player;
import rules.GameVariant;
import config.GameOptions;
import state.GameState;

import java.util.Collection;

/**
 * Creates a new poker game with a given set of options and players
 */
public class PokerGame {

    private GameState state;

    public PokerGame(GameOptions options, Collection<Player> players) {
        state = new GameState(options, players);
    }

    public void play() {
        GameVariant gameVariant = state.getGameOptions().getGameVariant();

        while (!gameVariant.isGameOver(state)) {
            gameVariant.playRound(state);
        }
    }
}
