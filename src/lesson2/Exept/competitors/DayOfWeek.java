package lesson2.Exept.competitors;


//Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
public enum DayOfWeek {
    MONDAY(8),
    TUESDAY(8),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(8),
    SATURDAY(0),
    SUNDAY(0);

    private int hour;

    public int getHour() {
        return hour;
    }

    DayOfWeek(int hour) {
        this.hour = hour;
    }
}