package lesson6.homework;

public class Kelvin extends ConvertItem{

    @Override
    public void convert(){
        System.out.println(ConvertItem.getDegreeForKelvin + 273.15);
    }
}
