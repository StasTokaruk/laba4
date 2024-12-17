package Chain_of_Responsability;
/**
 * A handler that processes level 1 requests.
 * Passes unhandled requests to the next handler in the chain, if available.
 */
public class Operator implements Handler {
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
     * Handles level 1 requests. If the request level is not 1, it delegates the request
     * to the next handler in the chain, if available.
     *
     * @param reql the level of the request to be handled.
     */
    @Override
    public void handleReq(int reql) {
        if (reql == 1) {
            System.out.println("Старший інженер обробив запит 1-го рівня.");
        } else if (nextHandler != null) {
            nextHandler.handleReq(reql);
        } else {
            System.out.println("Рівень запиту " + reql + " неможливо обробити");
        }
    }
}
