package Stream_Grouping;

import java.util.List;
import java.util.stream.*;

public class Lamda {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> list = List.of(1, 2, 3, 4, 10);
        int sum = IntStream.rangeClosed(1,n).sum();
        int actual = list.stream().mapToInt(i->i).sum();

        System.out.println(sum - actual);
    }
}
