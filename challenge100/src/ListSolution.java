import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSolution {
    public static void main(String args[]) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String listSize = reader.readLine();
            String listItems = reader.readLine();

            int numberOfQueries = Integer.parseInt(reader.readLine()) ;

            String[] tempList = listItems.split(" ");


            List<String> itemList = new ArrayList<>(Arrays.asList(tempList));


            // 2 defa dön
            for (int i = 0; i < numberOfQueries; i++) {
                String command = reader.readLine(); //Insert or Delete
                String targetStr = reader.readLine();// 5 23 gibi

                String targetStrArr[] = targetStr.split(" ");

                if(command.equals("Insert")){
                    itemList.add(Integer.parseInt(targetStrArr[0]), targetStrArr[1]);
                }else if (command.equals("Delete")){
                    itemList.remove(Integer.parseInt(targetStrArr[0]));
                }
            }

            System.out.println(String.join(" ", itemList));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
