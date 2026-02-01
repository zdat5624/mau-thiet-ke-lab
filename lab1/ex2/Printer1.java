public class Printer1 extends Node {
    public Printer1() {
        this.name = "Printer 1";
    }

    @Override
    public void accept(Packet p) {
        print(p);
    }

    public void print(Packet p) {
        System.out.println(">>> Printer 1 printing: " + p.getContents());
    }
}