import java.util.Scanner;

class Q03_CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        System.out.println("Characters occurring more than " + n + " times.");
        for (int i = 0; i < 256; i++) {
            if (count[i] > n)
                System.out.println((char)i);
        }
        sc.close();
    }
}
