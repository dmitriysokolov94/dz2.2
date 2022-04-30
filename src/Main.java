import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int payment = 1001;
        if (payment > 1000) {
            int bonus = payment / 100;
            System.out.println("на счету " + (balance + payment + bonus));
            System.out.println("бонус " + bonus);
        } else {
            System.out.println("на счету " + (balance + payment));
        }
    }
}
