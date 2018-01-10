package action;

public class ActionResponse<T extends ActionOption> {

    private T chosenOption;

    public ActionResponse(T chosenOption) {
        this.chosenOption = chosenOption;
    }

    public T getChosenOption() {
        return chosenOption;
    }
}
