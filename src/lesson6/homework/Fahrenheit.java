package lesson6.homework;

public class Fahrenheit extends ConvertItem{
    @Override
    public void convert(float degree){
        System.out.println((degree * 9 / 5) + 32);
    }

}
