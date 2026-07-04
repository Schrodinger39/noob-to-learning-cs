import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int calendar[][] = new int[6][7];
        int totalDays = 0;
        if (year % 4 == 0) {
            days[1] = 29;
        }
        for (int y = 2000; y < year; y++) {
            if (y % 4 == 0) {
                totalDays += 366;
            }
            else{
                totalDays += 365;
            }
        }
        for (int m = 0; m < month - 1; m++) {
            totalDays += days[m];
        }
        //every first day of the month is in the first row
        int r = 0;
        // the first date of this month is in which column
        int c = (totalDays + 5) % 7;

        for (int d = 1; d <= days[month - 1]; d++) {
            calendar[r][c] = d;
            c++;
            if (c == 7) {
                c = 0;
                r++;
            }
        }
        System.out.println("一\t二\t三\t四\t五\t六\t日");
        for (int i = 0; i < calendar.length; i++) {
            for (int j = 0; j < calendar[0].length; j++) {
                if (calendar[i][j] == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print(calendar[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}