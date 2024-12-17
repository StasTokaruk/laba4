package Chain_of_Responsability;
/**
 * The main class demonstrating the Chain of Responsibility pattern.
 * It creates a chain of handlers and sends various requests through the chain.
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Handler operator = new Operator();
        Handler engineer = new Engineer();
        Handler seniorEngineer = new SeniorEngineer();

        operator.setNextHandler(engineer);
        engineer.setNextHandler(seniorEngineer);

        int[] reqs = {1, 2, 3, 4};
        for (int request : reqs) {
            System.out.print("Рівень запиту: " + request + " ");
            operator.handleReq(request);
        }
    }
}
