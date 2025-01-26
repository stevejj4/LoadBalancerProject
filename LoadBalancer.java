import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {
    // this manages multiple servers and distributes incoming requests among them
    private List<Server> servers;

    public LoadBalancer() {
        servers = new ArrayList<>();
    }

    // Method to add servers to the load balancer
    public void addServer(String ipAddress, int currentLoad) {
        servers.add(new Server(ipAddress, currentLoad));
    }

    // Method to get the next server IP address using minimum-load strategy
    /**
     * @return
     */
    public String getNextServer() {
        if (servers.isEmpty()) {
            throw new IllegalStateException("No servers available in the load balancer.");
        }
        Server minLoadServer = servers.get(0);
        for (Server server : servers) {
            if (server.getCurrentLoad() < minLoadServer.getCurrentLoad()) {
                minLoadServer = server;
            }
        }
        // Increment the load of the selected server
        minLoadServer.incrementLoad();

        return minLoadServer.getIpAddress();

    }
}
