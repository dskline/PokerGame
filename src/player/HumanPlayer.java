package player;

import action.ActionOption;
import action.ActionRequest;
import action.ActionResponse;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, Long bankroll) {
        super(name, bankroll);
    }

    @Override
    public <T extends ActionOption> ActionResponse<T> acceptActionRequest(ActionRequest<T> request) {
        // TODO: return a response generated from user input
        return null;
    }
}
