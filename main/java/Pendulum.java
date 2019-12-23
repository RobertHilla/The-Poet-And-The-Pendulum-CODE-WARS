import java.util.*;

public class Pendulum {


    public static int[] pendulum(final int[] values){

        Deque<Integer> result = new ArrayDeque<>();
        List<Integer> input = new ArrayList<>();

        for (Integer valuesInput: values) {
            input.add(valuesInput);
        }
        Collections.sort(input);

        for (int i = 0; i < input.size() ; i++) {
            if (i == 0){
                result.addFirst(input.get(i));
            }
            else if (i == 1){
                result.addLast(input.get(i));
            }
            else if (i%2 == 0){
                result.addFirst(input.get(i));
            }
            else if (!(i%2 == 0)){
                result.addLast(input.get(i));
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
