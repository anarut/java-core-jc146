package lesson10.animal;

public abstract class Pet extends EarthAnimal {

    private boolean liveAtHome;

    public Pet(String name, int age, boolean liveAtHome) {
        super(name, age);
        this.liveAtHome = liveAtHome;
    }

    public boolean isLiveAtHome() {
        return liveAtHome;
    }
}
