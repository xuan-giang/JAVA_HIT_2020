import java.util.Calendar;
import java.util.Date;

public class DATE {
    Calendar now = Calendar.getInstance();

    @Override
    public String toString() {
        return now.get(Calendar.HOUR) + ":" + now.get(Calendar.MINUTE) + " " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH)
                + "/" + now.get(Calendar.MONTH) + "/" + now.get(Calendar.YEAR);
    }
}
