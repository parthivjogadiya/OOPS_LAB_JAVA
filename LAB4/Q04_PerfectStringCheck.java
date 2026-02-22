
import java.util.Scanner;

class Q04_PerfectStringCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int[] count = new int[256];
        boolean Perfect = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;

            if (count[ch] > 1) {
                Perfect = false;
                break;
            }
        }

        if (Perfect)
            System.out.println("Perfect String");
        else
            System.out.println("Not a Perfect String");

        sc.close();
    }
}