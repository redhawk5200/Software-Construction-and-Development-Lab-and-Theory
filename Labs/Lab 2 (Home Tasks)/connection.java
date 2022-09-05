public interface connection {
    public void connect();
    public void disconnect();
    public int recieve();
    public void send(int data);
}
