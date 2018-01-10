package action;

import java.util.Collection;

public class ActionRequest<T extends ActionOption> {

    private Collection<T> options;

    public ActionRequest(Collection<T> options) {
        this.options = options;
    }

    public Collection<T> getOptions() {
        return options;
    }
}
