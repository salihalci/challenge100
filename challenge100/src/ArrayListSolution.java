import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListSolution {

    public static void main(String[] args) {

        try {

            ArrayList<String> firstList=  new ArrayList<>();
            ArrayList<String> secondList=  new ArrayList<>();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int firstNum = Integer.parseInt(reader.readLine());

            for (int i = 0; i < firstNum; i++) {
                String s  = reader.readLine();
                firstList.add(s);
            }

            int secondNum = Integer.parseInt(reader.readLine());

            for (int i = 0; i < secondNum; i++) {

                String s  = reader.readLine();
                secondList.add(s);
            }

            for (int i = 0; i <secondList.size() ; i++) {
                String tempStr = secondList.get(i);
                String[] parts = tempStr.split(" ");

                try {
                    String indexStr = parts[0];
                    String targetStr = parts[1];
                    int index = Integer.parseInt(indexStr)-1;
                    String[] tempArr = firstList.get(index).split(" ");
                    System.out.println(tempArr[Integer.parseInt(targetStr)]);

                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("ERROR!");
                    continue;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
