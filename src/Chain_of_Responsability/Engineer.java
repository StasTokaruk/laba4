package Chain_of_Responsability;
/**
 * A handler that processes level 2 requests.
 * Passes unhandled requests to the next handler in the chain, if available.
 */
public class Engineer implements Handler {
    private Handler nextHandler;

    /**
     * Sets the next handler in the chain.
     *
     * @param nextHandler the next handler in the chain.
     */
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Handles level 2 requests. If the request level is not 2, it delegates the request
     * to the next handler in the chain, if available.
     *
     * @param reql the level of the request to be handled.
     */
    @Override
    public void handleReq(int reql) {
        if (reql == 2) {
            System.out.println("Старший інженер обробив запит 2-го рівня.");
        } else if (nextHandler != null) {
            nextHandler.handleReq(reql);
        } else {
            System.out.println("Рівень запиту " + reql + " неможливо обробити");
        }
    }
}
