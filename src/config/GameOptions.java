package config;

import rules.GameVariant;
import rules.common.bidding.BiddingStrategy;
import rules.common.bidding.TraditionalBidding;

/**
 * Options that will change how the game is played.
 */
public class GameOptions {

    private final GameVariant gameVariant;
    private BiddingStrategy biddingRules = new TraditionalBidding();

    public GameOptions(GameVariant gameVariant) {
        this.gameVariant = gameVariant;
    }

    public GameVariant getGameVariant() {
        return gameVariant;
    }

    public BiddingStrategy getBiddingRules() {
        return biddingRules;
    }

    public void setBiddingRules(BiddingStrategy biddingRules) {
        this.biddingRules = biddingRules;
    }
}
