package pl.infoshare.piatylis;

import java.util.Calendar;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        Properties prop = new Properties();
        prop.setProperty("username", "test");

        System.out.println(prop.getProperty("username"));
    }
}