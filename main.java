public class main {
    public static void main(String[] args) {
        LoadBalancer loadBalancer = new LoadBalancer();

        // Add some dummy server IP Address and loads
        loadBalancer.addServer("192.168.1.10", 10);
        loadBalancer.addServer("192.168.1.11", 10);
        loadBalancer.addServer("192.168.1.12", 10);
        // Retrieve the next server for routing requests

        String ipAddress1 = loadBalancer.getNextServer();
        System.out.println("Request routed to server: " + ipAddress1);

        String ipAddress2 = loadBalancer.getNextServer();
        System.out.println("Request routed to server: " + ipAddress2);

        String ipAddress3 = loadBalancer.getNextServer();
        System.out.println("Request routed to server: " + ipAddress3);

    }

}
