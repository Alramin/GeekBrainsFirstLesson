
package lesson2.Exept.competitors;

/**
 * Created by Toliman on 02.02.2020.
 */

public class DayOfWeekMain {

    public static int getWorkingHours(DayOfWeek dayOfWeek) {
        int result = 0;
        for (int i = dayOfWeek.ordinal(); i < dayOfWeek.values().length; i++)
            result += dayOfWeek.values()[i].getHour();
        return result;
    }
}