package player;

import action.ActionOption;
import action.ActionRequest;
import action.ActionResponse;
import card.Card;

import java.util.Collection;

public abstract class Player {

    private String name;
    private Long bankroll;
    private Collection<Card> hand;

    public Player(String name, Long bankroll) {
        this.name = name;
        this.bankroll = bankroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBankroll() {
        return bankroll;
    }

    public void setBankroll(Long bankroll) {
        this.bankroll = bankroll;
    }

    public Collection<Card> getHand() {
        return hand;
    }

    public void setHand(Collection<Card> hand) {
        this.hand = hand;
    }

    public abstract <T extends ActionOption> ActionResponse<T> acceptActionRequest(ActionRequest<T> request);
}
