import java.util.*;
class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            System.out.println("Example: java DayOfWeek 8 15 2025");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of the week is: " + d0);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Which is: " + days[d0]);
    }
}
