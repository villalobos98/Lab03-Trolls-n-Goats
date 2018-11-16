package trolls;
/**
 * @Author Isaias Villalobos
 * Java 9
 * 2/6/18
 * Description: This class controls the behaviors of the behaviors of the
 * BattleTroll.
 */
import goats.IGoat;

public class CuteTroll implements ITroll {
    private int hp;
    private int maxHappy;

    /**
     * Connstructor
     * @param maxHappy integer
     */
    public CuteTroll(int maxHappy) {
        hp = 0;
        this.maxHappy = maxHappy;
    }
    /**
     * Message that is displayed to the goat.
     * @param goat Object
     */
    public void interact(IGoat goat) {
        System.out.println("A troll stands guard");
        System.out.println("The troll pets " + goat);
        if (this.isActive())
            System.out.println(goat + " returns to the back of the line.");
    }
    /**
     * Messaged that is displayed whent he troll is finished.
     * @param hp Integer.
     */
    public void adjustPower(int hp) {
        this.hp += hp;
    }

    /**
     * Messaged that is displayed whent he troll is finished.
     * @param goat Object.
     */
    public void finished(IGoat goat) {

        System.out.println("The troll falls asleep after petting" + goat + " goat");
    }

    /**
     * Check if the Troll is still active.
     * @return True if health is not 0
     */
    public boolean isActive() {
        return hp < maxHappy;
    }
}
