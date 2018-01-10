package rules;

import state.RoundState;

public interface Round<T extends RoundState> {

    RoundState play();
}
