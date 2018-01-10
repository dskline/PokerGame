package player;

import action.ActionOption;
import action.ActionRequest;
import action.ActionResponse;

public class ComputerPlayer extends Player {

    public ComputerPlayer(String name, Long bankroll) {
        super(name, bankroll);
    }

    @Override
    public <T extends ActionOption> ActionResponse<T> acceptActionRequest(ActionRequest<T> request) {
        // TODO: use machine learning algorithms to respond with unbeatable poker decision making
        return null;
    }
}
