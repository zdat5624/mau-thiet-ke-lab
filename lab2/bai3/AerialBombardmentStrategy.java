import java.util.Random;

public class AerialBombardmentStrategy implements AbilityStrategy {

    private Random random = new Random();

    @Override
    public void executeAbility(String targetName) {
        System.out.println("Gọi hỗ  trợ không quân, máy bay đang tiếp cận " + targetName + "...");

        boolean hit = random.nextBoolean();

        if (hit) {
            System.out.println("BOOM! " + targetName + " bị trúng tên lửa. Sát thương diện rộng.");
        } else {
            System.out.println("Tên lửa trượt mục tiêu do gió lớn.");
        }
    }
}
