package rules.common.bidding;

import player.Player;

public interface BiddingStrategy {

    void initiate(Iterable<Player> players);
}
