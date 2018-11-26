package decorator;

public class Warrior extends BeeImpl {

    //    protected int attack = 3;
    //    // double defense;
    //    int collection = 3;
    //    int food = 10;
    //    int rest = 10;
    //    boolean isBusy = false;
    //    boolean isQueen = false;

    @Override
    public void spawn() {
        this.isWarrior = true;
        System.out.print("Warrior created. ");
    }
}