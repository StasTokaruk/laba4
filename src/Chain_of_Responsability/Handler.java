package Chain_of_Responsability;
/**
 * Interface representing a handler in the Chain of Responsibility pattern.
 * Each handler can process a request or pass it to the next handler in the chain.
 */
public interface Handler {
    /**
     * Sets the next handler in the chain.
     *
     * @param nextHandler the next handler in the chain.
     */
    void setNextHandler(Handler nextHandler);

    /**
     * Handles a request of a given level. If the handler cannot process the request,
     * it passes the request to the next handler in the chain.
     *
     * @param reql the level of the request to be handled.
     */
    void handleReq(int reql);
}
