import java.util.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(60);
        list1.add(500000);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        list2.add(12);
        list2.add(87);
        int i = 0;
        int j = 0;
        List<Integer> combinedList = new ArrayList<>();
        if (i < list1.size() && j < list2.size()) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(j));
            i++;
            j++;
        }
        while (i < list1.size()) {
            combinedList.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            combinedList.add(list2.get(j));
            j++;
        }
        Iterator iterator = combinedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}