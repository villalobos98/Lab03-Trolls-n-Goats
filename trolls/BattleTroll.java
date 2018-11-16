package trolls;
/**
 * @Author Isaias Villalobos
 * Java 9
 * 2/6/18
 * Description: This class controls the behaviors of the behaviors of the
 * BattleTroll.
 */
import goats.IGoat;

public class BattleTroll implements ITroll{
    private int hp;

    /**
     * Connstructor
     * @param HP integer
     */
    public BattleTroll(int HP){
        this.hp = HP;
    }

    /**
     * Message that is displayed to the goat.
     * @param goat Object
     */
    public void interact(IGoat goat) {
        System.out.println(goat.approach());
        System.out.println("A troll stands guard");
        System.out.println("The troll eats "  + goat);
    }

    /**
     * Adjust the health of the troll.
     * @param x integer health
     */
    public void adjustPower(int x) {
        this.hp -= x;
    }

    /**
     * Messaged that is displayed whent he troll is finished.
     * @param goat Object.
     */
    public void finished(IGoat goat) {
        System.out.println("The troll is vanquished by " + goat);
    }

    /**
     * Check if the Troll is still active.
     * @return True if health is not 0
     */
    public boolean isActive() {
        if(this.hp > 0)
            return true;
        return false;
    }
}
