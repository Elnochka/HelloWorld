import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;


public class HelloWorld {
    private static final Logger log = Logger.getLogger(HelloWorld.class);


    public static void main(String[] args) {

        Locale current = Locale.getDefault();

        HelloWorld event = new HelloWorld();
        String strEvent = event.getWorld();
        String strPrint = event.printLocal(strEvent, current);
        System.out.println(strPrint);

    }


    private Date currentDate;
    private int hours;


    public HelloWorld(){
        this.currentDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        this.hours = cal.get(Calendar.HOUR_OF_DAY);

    }
    public HelloWorld(int hours) {
        this.hours = hours;
    }

    public String getWorld(){


        String str = "";

        switch (hours) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

                str = "night";
                break;

            case 6:
            case 7:
            case 8:

                str = "morning";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                str = "day";
                break;

            case 19:
            case 20:
            case 21:
            case 22:
                str = "evening";
                break;
            case 23:
            case 24:
                str = "night";
                break;


        }
        log.info("Create  -> Good " + str + ", HelloWorld!");
        return str;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public int getHours() {
        return hours;
    }

    public String printLocal(String str, Locale loc) {
        ResourceBundle res = ResourceBundle.getBundle("bn",loc);
        String strRes = res.getString(str);
        log.info(strRes);
        return strRes;

    }

}
