public class Hero {
    private AbilityStrategy abilityStrategy;

    public void chooseStrategy(boolean enemyFar, boolean enemyCrowded) {
        if (enemyFar) {
            abilityStrategy = new SniperHeadshotStrategy();
        } else if (enemyCrowded) {
            abilityStrategy = new AerialBombardmentStrategy();
        }
    }

    public void useAbility(String targetName) {
        if (abilityStrategy == null) {
            System.out.println("Hero chưa chọn kỹ năng!");
            return;
        }
        abilityStrategy.executeAbility(targetName);
    }
}
