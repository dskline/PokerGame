package rules.draw.fivecard;

import rules.Round;
import rules.common.bidding.BiddingStrategy;
import state.GameState;
import state.RoundState;

/**
 * A round of Five Card Draw consists of a bidding phase, a card-trading phase, and another bidding phase.
 */
public class FiveCardDrawRound implements Round<FiveCardDrawRoundState> {

    private BiddingStrategy biddingStrategy;
    private RoundState roundState;

    public FiveCardDrawRound(GameState gameState) {
        this.biddingStrategy = gameState.getGameOptions().getBiddingRules();
        this.roundState = new FiveCardDrawRoundState(gameState);
    }

    @Override
    public RoundState play() {
        doBidding();
        doTrading();
        doBidding();
        return roundState;
    }

    private void doBidding() {
        biddingStrategy.initiate(roundState.getPlayers());
    }

    private void doTrading() {
        // TODO: each player trades any cards from their hand with new cards from the deck
        // roundState.getDeck().draw();
    }
}
