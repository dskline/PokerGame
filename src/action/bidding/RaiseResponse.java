package action.bidding;

import action.ActionResponse;

public class RaiseResponse extends ActionResponse<BiddingOption> {

    private Integer raiseAmount;

    public RaiseResponse(Integer raiseAmount) {
        super(BiddingOption.RAISE);
        this.raiseAmount = raiseAmount;
    }

    public Integer getRaiseAmount() {
        return raiseAmount;
    }
}
