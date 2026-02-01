public class Printer2 extends Node {
    public Printer2() {
        this.name = "Printer 2";
    }

    @Override
    public void accept(Packet p) {
        print(p);
    }

    public void print(Packet p) {
        System.out.println(">>> Printer 2 (High Capacity) printing: " + p.getContents());
    }
}