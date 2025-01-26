// define a class for server instances
class Server {
    private String ipAddress;
    private int currentLoad;

    public Server(String ipAddress, int currentLoad) {
        this.ipAddress = ipAddress;
        this.currentLoad = currentLoad;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void incrementLoad() {
        currentLoad++;
    }
}