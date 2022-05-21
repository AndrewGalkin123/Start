package lesson9.task;

public class Student {
    private String name;
    private DayOfWeek scheduleAt;
    public Student(String name, DayOfWeek scheduleAt) {
        this.name = name;
        this.scheduleAt = scheduleAt;
    }

    public String getName() {
        return name;
    }

    public DayOfWeek getScheduleAt() {
        return scheduleAt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scheduleAt=" + scheduleAt +
                '}';
    }
}
