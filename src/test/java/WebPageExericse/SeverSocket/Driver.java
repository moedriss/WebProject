package WebPageExericse.SeverSocket;

public class Driver {

    public static void main(String[] args) {
       String msg = "Hello sever!";
       MohdServer server = new MohdServer( 5000, msg);
       server.start();

    }
}

