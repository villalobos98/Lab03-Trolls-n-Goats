package trolls;

import goats.IGoat;

public interface ITroll {

    public void interact(IGoat goat);

    public void adjustPower(int x);

    public void finished(IGoat goat);

    public boolean isActive();

}
