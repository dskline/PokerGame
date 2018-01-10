package rules.common.bidding;

import player.Player;

/**
 * The first two players will be forced to place blind bids, then bidding will continue as normal.
 */
public class BlindBidding extends TraditionalBidding {

    @Override
    public void initiate(Iterable<Player> players) {
        // TODO: first two players give blind bids, then call super()
    }
}
