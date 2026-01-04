import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    // Input "He is a good person, isn't he?"

    // Output:
    // 8
    // He
    // is
    // a
    // good
    // person
    // isn
    // t
    // he?
}