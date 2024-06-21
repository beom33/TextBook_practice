package example.mydate;

import java.util.Calendar;
import java.util.Date;


public class Mydate {

    private int year;
    private int month;
    private int day;
    private boolean isValid;

    public Mydate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public static void main(String[] args) {
        Mydate date1 = new Mydate(30, 2, 2000);
        System.out.println(date1.isValid());
        Mydate date2 = new Mydate(2, 10, 2006);
        System.out.println(date2.isValid());
    }
}
