import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSolution {
    static void main() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String listSize = reader.readLine();
            String listItems = reader.readLine();

            int numberOfQueries = Integer.parseInt(reader.readLine()) ;

            String[] tempList = listItems.split(" ");


            List<String> itemList = new ArrayList<>(Arrays.asList(tempList));



            for (int i = 0; i < numberOfQueries; i++) {
                String command = reader.readLine();
                String targetStr = reader.readLine();

                String targetStrArr[] = targetStr.split(" ");

                String targetIndex = targetStrArr[0];
                String targetItem="";
                try {

                }catch (Exception e){
                    
                }
                if (targetStrArr[1]!=null)
                     targetItem = targetStrArr[1];

                System.out.println("targetIndex:"+targetIndex);
                System.out.println("targetItem:"+targetItem);

                if(command.equals("Insert")){
                    itemList.add(Integer.parseInt(targetIndex), targetItem);
                }else if (command.equals("Delete")){
                    itemList.remove(targetIndex);
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
