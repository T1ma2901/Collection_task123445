import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
        //Избавиться от повторяющихся элементов в строке и вывести результат на экран.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your num: ");
        int userNum = in.nextInt();
        String valNum = String.valueOf(userNum);
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < valNum.length(); i++) {
            list.add(Integer.valueOf(valNum.substring(i,(i+1))));
        }
        System.out.println(list);
        Collections.sort(list);
        for (int j = 0; j < list.size()-1; j++) {
            if(list.get(j).equals(list.get(j+1))) {
               list.remove(j);
               j--;
            }
        }
        System.out.println(list);

    }
}
//List<String> list = new ArrayList<>();
//        list.add("New_York");
//        list.add("Bishkek");
//        list.add("Moscow");
//        list.add("Dallas");
//        list.add("Astana");
//
//        ArrayList<String> arrayList = new ArrayList<>(list);
//        arrayList.add(3,"Bangkok");
//        arrayList.remove("Moscow");
////        System.out.println(arrayList.contains("ASTANA"));
//        arrayList.addAll(list);
//
//        ListIterator<String> iterator = arrayList.listIterator();
//
////        while(iterator.hasNext()){
////            System.out.println(iterator.next());
////        }
//        LinkedList<String> linkedList= new LinkedList<>(arrayList);
//        linkedList.addFirst("Kant");
////        Iterator itr = linkedList.descendingIterator();
////        while (itr.hasNext()){
////            System.out.println(itr.next());
////        }
//        for (String s :linkedList
//             ) {
//            System.out.println(s);
//        }
//