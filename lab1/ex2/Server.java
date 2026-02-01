public class Server extends Node {
    private static Server instance;
    
    private Printer1 printer1;
    private Printer2 printer2;

    private Server() {
        this.name = "PrintServer";
        this.printer1 = new Printer1();
        this.printer2 = new Printer2();
    }

    public static Server getInstance() {
        if (instance == null) {
            instance = new Server();
        }
        return instance;
    }

    public boolean isForMe(Packet p) {
        return p.isDestination(this);
    }

    @Override
    public void accept(Packet p) {
        if (isForMe(p)) {
            System.out.println("Server: received packet. Processing...");
            
            //  Nội dung ngắn (< 20 ký tự) -> Printer 1, Dài -> Printer 2
            if (p.getContents().length() < 20) {
                printer1.accept(p);
            } else {
                printer2.accept(p);
            }
        } else {
            // Nếu không phải gửi cho Server
            if (nextNode != null) nextNode.accept(p);
        }
    }
}