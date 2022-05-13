package lesson6.homework1;

public class Boxer  extends Bodyguard{
    @Override
    public void defend(){
        System.out.println("Используя приемы бокса ваш телохранитель защитил вас");
    }
    public Boxer() {
        super("Boxer");
    }
}
