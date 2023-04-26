import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class TaskSem3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        
        String a = list.get(2);
        System.out.println(a);

        list.remove(1);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i=0; i<10; i++){
            list1.add(new Random().nextInt(30));
            list2.add(new Random().nextInt(30));
        }
        for (int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        for (int i=0; i<list2.size(); i++){
            System.out.print(list2.get(i) + " ");
        }

        ListIterator<Integer> iterator = list1.listIterator(list1.size());
        while (iterator.hasNext()){
            int n = iterator.next();
            System.out.println(n+" ,");
            iterator.remove();
        } 

        list1.addAll(0, list2);
        System.out.println();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("-".repeat(40));

        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println("-".repeat(40));

        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i=0; i<10; i++){
            list3.add(new Random().nextInt(30));
            list4.add(new Random().nextInt(30));
        }
        System.out.println(list3);
        System.out.println(list4);
        list3.retainAll(list4);
        System.out.println(list3);
        System.out.println("-".repeat(40));

        if (list3.contains(5)) System.out.println(true);
        //List<Integer> list5 = list4.subList(1, 4);
        //list5 = (List<Integer>) list4.clone(); 

        System.out.println(list2);
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%2 != 0) return 1;
                if (o2%2 != 0) return 0;
                return -1;
            }
        });
        System.out.println(list2);

        LinkedList<Integer> integers=new LinkedList<>();
        integers.addFirst(10);

    }
}
