package lesson6.homework1;

public class Juugist  extends Bodyguard{
    @Override
    public void defend(){
        System.out.println("Используя джиуджитсу ваш телохранитель защитил вас");
    }

    public Juugist() {
        super("Juugist");
    }
}
