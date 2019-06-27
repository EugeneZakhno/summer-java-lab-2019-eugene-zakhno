import java.util.*;
import java.text.*;

import static java.util.Locale.getDefault;

public class Today {

    public static void main(String args[]) {

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MMMM ss HH yyyy mm", getDefault());
        System.out.println("Hello world: " + formatForDateNow.format(dateNow));


        Date datePlusWeek = new Date();
        SimpleDateFormat formatForDateLater = new SimpleDateFormat("dd MMMM ss HH yyyy mm", getDefault());
        Calendar c = Calendar.getInstance();
        c.setTime(datePlusWeek);
        c.add(Calendar.DAY_OF_WEEK, 7);
        datePlusWeek = c.getTime();
        System.out.println( "Hello world + 1 week: " + formatForDateLater.format(datePlusWeek));
        }

    }
