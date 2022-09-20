import java.util.*;

public class main {

    public static void main(String[] args) {

        ArrayList<Integer> examples = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            examples.add(i);
        }
        ArrayList<Integer> examples2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            examples2.add(i);
        }
        ArrayList<Integer> examples3 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            examples3.add(i);
        }

        System.out.println(examples);
        System.out.println(removeTheRange(examples, 4, 70));

        System.out.println(examples2);
        System.out.println(removeTheRange(examples2, 8, 60));

        System.out.println(examples3);
        System.out.println(removeTheRange(examples3, 2, 88));
    }

    public static ArrayList<Integer> removeTheRange(ArrayList<Integer> nums, int from, int to){
        //if (!nums.contains(from) {
        //       starts from closest value
        // }
        //if (!nums.contains(to) {
        //       ends at closest value
        // }

        List<Integer> temp;
        int indexFrom = nums.indexOf(from);
        int indexTo = nums.indexOf(to);

        temp = nums.subList(indexFrom, indexTo + 1);

        nums.removeAll(temp);

        return nums;
    }
}
