package club.avence.spring.boot.date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {

    @Test
    public void test() {
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.FEBRUARY, 28);
        c.add(Calendar.YEAR, 1);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));
    }

}
