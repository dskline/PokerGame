package action.bidding;

import action.ActionRequest;

import java.util.Arrays;
import java.util.Collection;

public class BiddingRequest extends ActionRequest<BiddingOption> {

    public BiddingRequest() {
        super(Arrays.asList(BiddingOption.values()));
    }
}
