import java.util.Arrays;

public class SortContext {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void executeSort(int[] arr) {
        if (sortStrategy == null) {
            System.out.println("Chưa chọn thuật toán sắp xếp!");
            return;
        }

        sortStrategy.sort(arr);
        System.out.println("Kết quả: " + Arrays.toString(arr));
    }
}
