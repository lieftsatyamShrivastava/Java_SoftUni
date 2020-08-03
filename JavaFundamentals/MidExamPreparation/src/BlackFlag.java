import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lastDays = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        double expectedPlunder = Double.parseDouble(scan.nextLine());

        double plunder = 0.0;

        for (int i = 1; i <= lastDays; i++) {
            plunder += dailyPlunder;
            if (i % 3 == 0) {
                plunder +=  dailyPlunder * 0.5;
            }
            if (i % 5 == 0) {
                plunder -= plunder * 0.3;
            }
        }
        if (plunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunder);
        } else {
            double percentageLeft = (plunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentageLeft);
        }
    }
}
