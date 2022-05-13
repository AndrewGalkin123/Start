package lesson6.homework;

public class Fahrenheit extends ConvertItem{

    @Override
    public void convert(){
        System.out.println((ConvertItem.degree * 9 / 5) + 32);
    }
}
