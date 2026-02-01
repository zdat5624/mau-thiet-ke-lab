public class Packet {
    private String originator;
    private String destination;
    private String contents;

    public Packet(String originator, String destination, String contents) {
        this.originator = originator;
        this.destination = destination;
        this.contents = contents;
    }

    public String getContents() {
        return contents;
    }

    public String getOriginator() {
        return originator;
    }

    public String getDestination() {
        return destination;
    }

    public boolean isOriginator(Node n) {
        return this.originator.equalsIgnoreCase(n.getName());
    }

    public boolean isDestination(Node n) {
        return this.destination.equalsIgnoreCase(n.getName());
    }
}