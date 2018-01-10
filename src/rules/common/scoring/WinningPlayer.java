package rules.common.scoring;

import action.ActionOption;
import action.ActionRequest;
import action.ActionResponse;
import player.Player;

/**
 * A decorator for a player who won money in a round (for display purposes)
 */
public class WinningPlayer extends Player {

    private Player wrappedPlayer;
    private Long winnings;
    private PokerHandCategory pokerHandCategory;

    public WinningPlayer(Player player, Long winnings, PokerHandCategory pokerHandCategory) {
        super(player.getName(), player.getBankroll());
        this.wrappedPlayer = player;
        this.winnings = winnings;
        this.pokerHandCategory = pokerHandCategory;
    }

    @Override
    public <T extends ActionOption> ActionResponse<T> acceptActionRequest(ActionRequest<T> request) {
        return wrappedPlayer.acceptActionRequest(request);
    }

    public Long getWinnings() {
        return winnings;
    }

    public PokerHandCategory getPokerHandCategory() {
        return pokerHandCategory;
    }
}
