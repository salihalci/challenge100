import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerSolution {
    public static void main(String[] args) {
        BufferedReader newReader = new BufferedReader(new InputStreamReader(System.in));


        try {
            String integerString1 = newReader.readLine();
            String integerString2 = newReader.readLine();

            BigInteger num1 = new BigInteger(integerString1);
            BigInteger num2 = new BigInteger(integerString2);

            System.out.println(num1.add(num2));
            System.out.println(num1.multiply(num2));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
