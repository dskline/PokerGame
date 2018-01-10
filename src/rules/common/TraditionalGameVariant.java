package rules.common;

import player.Player;
import rules.GameVariant;
import rules.Round;
import rules.common.scoring.WinningPlayer;
import rules.common.scoring.WinningsCalculator;
import state.GameState;
import state.RoundState;

import java.util.Collection;
import java.util.List;

/**
 * In a traditional poker game, all players take part in each round as long as they have money in their bankroll.
 * When one player remains, the game is over.
 */
public abstract class TraditionalGameVariant implements GameVariant {

    @Override
    public void playRound(GameState gameState) {
        Round round = getRound(gameState);
        RoundState roundState = round.play();

        List<WinningPlayer> winners = WinningsCalculator.calculate(roundState);
        for (WinningPlayer winner : winners) {
            winner.setBankroll(winner.getBankroll() + winner.getWinnings());
        }
    }

    @Override
    public boolean isGameOver(GameState state) {
        // TODO: return true if only one player has a bankroll
        return false;
    }

    protected abstract Round getRound(GameState gameState);
}
