import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodilityTest {

    public static void main(String[] args) {
        System.out.println(new CodilityTest().solution(new int[]{-1, -3}));
    }


    public int solution(int[] A) {

        var listInt = IntStream.of(A).boxed().collect(Collectors.toList());


        var sortList = listInt.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());


        var position = 0;
        var result = 0;
        for (Integer num : sortList) {
            if (position == sortList.size() -1) break;
            if (num - sortList.get(++position) > 1) {

                result = sortList.get(position) + 1;
            }


        }

        if(result < 0) {
            for (int i = 1; i < sortList.size();i++) {
                if(!sortList.contains(i)) {
                    return i;
                }
            }
        }

        return result;


    }

}
