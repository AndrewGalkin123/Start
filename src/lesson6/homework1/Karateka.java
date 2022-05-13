package lesson6.homework1;

public class Karateka extends Bodyguard{
    @Override
    public void defend(){
        System.out.println("Используя карате ваш телохранитель защитил вас");
    }
    public Karateka() {
        super("Karateka");
    }
}
