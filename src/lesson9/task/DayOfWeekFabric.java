package lesson9.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DayOfWeekFabric {
    public static void main(String[] args) throws IOException {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input day of week");
        System.out.println(Arrays.toString(DayOfWeek.values()));
        String day = reader.readLine().toUpperCase(Locale.ROOT);
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day);
       // System.out.println(createTask(dayOfWeek));
        System.out.println(createTask2(dayOfWeek));
    }
    private static String createTask(DayOfWeek dayOfWeek){
        String task = "";
        switch (dayOfWeek){
            case MONDAY:
                task = "Сегодня окна ";
                break;
            case FRIDAY:
                task = "Сегодня цветы";
                break;
            case TUESDAY:
                task = "Сегодня парты";
                break;
            case WEDNESDAY:
                task = "Сегодня доску";
                break;
            case THURSDAY:
                task = "Сегодня книжки ";
                break;
            case SATURDAY:
                task = "Сегодня шторы ";
                break;
            case SUNDAY:
                task = "Сегодня полируем доску ";
                break;
        }
        return task;
    }
    private static String createTask2(DayOfWeek dayOfWeek){
        Map<DayOfWeek, String> map = new HashMap<>();
        map.put(DayOfWeek.MONDAY, "Сегодня окна ");
        map.put(DayOfWeek.TUESDAY, "Сегодня парты");
        map.put(DayOfWeek.WEDNESDAY, "Сегодня доску");
        map.put(DayOfWeek.THURSDAY, "Сегодня книжки ");
        map.put(DayOfWeek.FRIDAY, "Сегодня цветы");
        map.put(DayOfWeek.SATURDAY, "Сегодня шторы ");
        map.put(DayOfWeek.SUNDAY, "Сегодня полируем доску ");
        return map.get(dayOfWeek);
    }
}
