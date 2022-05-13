package lesson6.homework1;

public abstract class Bodyguard {
    public String bodyguardType;
    public abstract void defend();
    public Bodyguard(String martialArt) {
        this.bodyguardType = martialArt;
    }
    @Override
    public String toString() {
        return bodyguardType;
    }
}
