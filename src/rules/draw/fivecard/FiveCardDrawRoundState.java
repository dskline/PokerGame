package rules.draw.fivecard;

import rules.common.BasicRoundState;
import state.GameState;

public class FiveCardDrawRoundState extends BasicRoundState {

    private static final Integer STARTING_HAND_SIZE = 5;

    public FiveCardDrawRoundState(GameState gameState) {
        super(gameState);
    }

    @Override
    protected Integer getStartingHandSize() {
        return STARTING_HAND_SIZE;
    }
}
