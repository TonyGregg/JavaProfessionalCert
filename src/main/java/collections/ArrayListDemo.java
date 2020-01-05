package collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by anton on 6/22/2018 5:52 PM
 **/
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(2);

        ints.parallelStream().distinct().peek(System.out::println).count();


//        ArrayList<Integer> arrayList = new ArrayList<>(100);
//
//        for (int i = 0; i < 100; i++) {
//            arrayList.add(i);
//        }
//
//
//        for (int element: arrayList) {
//            System.out.println("Element : "+element);
//            // following code will result in concurrent modification exception
//            /*if(element == 50) {
//                arrayList.remove(50);
//            }*/
//
//            if(element == 5) {
//                arrayList.set(7,500);
//            }
//
//        }// end of for
//
//        Iterator<Integer> iterator = arrayList.iterator();
//
//        while(iterator.hasNext()) {
//            if(iterator.next()>50) {
//                iterator.remove();
//            }
//        }
//
//        for (Integer integer : arrayList) {
//            System.out.println(integer);
//        }


    }
}
