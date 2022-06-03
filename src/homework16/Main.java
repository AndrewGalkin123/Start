package homework16;

import lesson6.ChessItem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, LocalDate> map = new HashMap<>();
        map.put("Смирнов", LocalDate.parse("1916-06-01"));
        map.put("Петров", LocalDate.parse("1993-01-08"));
        map.put("Волков", LocalDate.parse("1974-02-09"));
        map.put("Андреев", LocalDate.parse("1994-03-12"));
        map.put("Яковлев", LocalDate.parse("1978-07-21"));
        map.put("Громов", LocalDate.parse("1934-09-11"));
        map.put("Воронцов", LocalDate.parse("1915-08-10"));
        map.put("Жданов", LocalDate.parse("1976-10-09"));
        map.put("Зиновьев", LocalDate.parse("1923-11-15"));
        map.put("Рогов", LocalDate.parse("1956-12-13"));
        System.out.println(map);
        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, LocalDate> a = iterator.next();
            int m = a.getValue().getMonthValue();
            if (m ==  6 || m == 7 || m == 8)
                iterator.remove();
        }
        System.out.println(map);
    }

}
