public class Main {
    public static void main(String[] args) {

        /*
         * RUN
         * 
         * javac -d out *.java
         * javac -encoding UTF-8 -d out *.java
         * java -cp out Main
         * 
         */

        int[] data1 = { 5, 3, 8, 4, 2 };
        int[] data2 = { 7, 1, 9, 6, 3 };
        int[] data3 = { 10, 2, 5, 1, 8 };

        SortContext context = new SortContext();

        System.out.println("=== Bubble Sort ===");
        context.setSortStrategy(new BubbleSortStrategy());
        context.executeSort(data1);

        System.out.println("\n=== Selection Sort ===");
        context.setSortStrategy(new SelectionSortStrategy());
        context.executeSort(data2);

        System.out.println("\n=== Insertion Sort ===");
        context.setSortStrategy(new InsertionSortStrategy());
        context.executeSort(data3);
    }
}
