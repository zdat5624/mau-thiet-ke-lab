public abstract class Node {
    protected String name;
    protected Node nextNode; // Liên kết đến node tiếp theo

    public String getName() {
        return name;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void insertNode(Node n) {
        this.nextNode = n;
    }

    public abstract void accept(Packet p);
}