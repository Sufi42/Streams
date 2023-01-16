import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringDemo {
        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();
            list.add("sufi");
            list.add("Maaz");
            list.add("Sufiyan");
            list.add("Mehrin");

            int n = list.size();

            List<String> list1 = list.stream().filter(p -> !p.isEmpty()).collect(Collectors.toList());
            System.out.println(list1.toString());
        }
    }

