import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("12");
        list.add("0");
        list.add("1");
        list.add("78");
        list.add("12");

        list.add(5,"23");
        System.out.println(String.join(" ", list));

    }
}
