public class Main {
    public static void main(String[] args) {
        // 1. Setup
        
        //Singleton Server
        Server server = Server.getInstance();
        
        // Workstation
        Workstation workstation = new Workstation("PC_Design");
        
        // Kết nối Workstation -> Server
        workstation.insertNode(server); 

        //
         // 2. RUN

        System.out.println("--- TEST CASE 1: print short content ---");
        // Workstation tạo text, gửi tới "PrintServer"
        workstation.originate("PrintServer", "Hello World");

        System.out.println("\n--- TEST CASE 2: print long content ---");
        workstation.originate("PrintServer", "Report  a b c d e f g h j z x c v b n m a s d f g...");

        System.out.println("\n--- CHECK SINGLETON ---");
        Server server2 = Server.getInstance();
        if (server == server2) {
            System.out.println("Check successfully: server and server2 is the same object!");
        }
    }
}