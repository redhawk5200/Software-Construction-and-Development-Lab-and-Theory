import java.net.Socket;
 
public class DisconnectedState implements connection{
    private Socket socket;
    // public Event CONNECT(){
 
    // }
    public void connect(){
 
    }
   
    public void disconnect(){};
    public int recieve(){return 0;};
    public void send(int data){};
}
