package rules.common.bidding;

import action.ActionRequest;
import action.ActionResponse;
import action.bidding.BiddingRequest;
import player.Player;

/**
 * Players bid until a full cycle has completed with no raises made.
 */
public class TraditionalBidding implements BiddingStrategy {

    @Override
    public void initiate(Iterable<Player> players) {
        // TODO: each player will be asked to bid like so
        ActionRequest biddingRequest = new BiddingRequest();
        for (Player player : players) {
            ActionResponse biddingResponse = player.acceptActionRequest(biddingRequest);
        }
    }
}
