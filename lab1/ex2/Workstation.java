public class Workstation extends Node {

    public Workstation(String name) {
        this.name = name;
    }

    public void originate(String destination, String contents) {
        Packet p = new Packet(this.name, destination, contents);
        System.out.println(this.name + ": sent packet with content '" + contents + "' to " + destination);
        
        if (this.nextNode != null) {
            this.nextNode.accept(p);
        } else {
            System.out.println("Error: not connect (nextNode is null)");
        }
    }

    @Override
    public void accept(Packet p) {
        if (p.isDestination(this)) {
            System.out.println(this.name + ": received response.");
        } else {
            if (nextNode != null) nextNode.accept(p);
        }
    }
}