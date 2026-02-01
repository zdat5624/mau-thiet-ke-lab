/*
        RUN

        javac -d out *.java
     * javac -encoding UTF-8 -d out *.java
     * java -cp out Main
     * 
     */
public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println("=== Kẻ địch ở xa ===");
        hero.chooseStrategy(true, false);
        hero.useAbility("Tên địch A");

        System.out.println("\n=== Kẻ địch đông ===");
        hero.chooseStrategy(false, true);
        hero.useAbility("Nhóm địch B");

        System.out.println("\n=== Giả lập nhiều lần ===");
        hero.chooseStrategy(true, false);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nLần " + i + ":");

            boolean enemyFar = Math.random() < 0.5;
            boolean enemyCrowded = !enemyFar;

            hero.chooseStrategy(enemyFar, enemyCrowded);
            hero.useAbility("Boss X");
        }
    }
}
