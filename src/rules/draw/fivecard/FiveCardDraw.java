package rules.draw.fivecard;

import rules.Round;
import rules.common.TraditionalGameVariant;
import state.GameState;

public class FiveCardDraw extends TraditionalGameVariant {

    @Override
    protected Round getRound(GameState gameState) {
        return new FiveCardDrawRound(gameState);
    }
}
