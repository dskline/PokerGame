package rules;

import state.GameState;

/**
 * Implementations of this interface will dictate how a full game of poker should be played.
 */
public interface GameVariant {

    void playRound(GameState state);

    boolean isGameOver(GameState state);
}
