import java.util.Random;

public class SniperHeadshotStrategy implements AbilityStrategy {

    private Random random = new Random();

    @Override
    public void executeAbility(String targetName) {
        System.out.println("Đang nín thở, tính toán sức gió và khoảng cách tới " + targetName + "...");

        int accuracy = random.nextInt(100) + 1; // 1 - 100

        if (accuracy > 90) {
            System.out.println("HEADSHOT! Sát thương chí mạng (Critical Hit).");
        } else if (accuracy > 50) {
            System.out.println("Trúng vai. Sát thương bình thường.");
        } else {
            System.out.println("Viên đạn sượt qua tai. Kẻ địch đã phát hiện vị trí!");
        }
    }
}
