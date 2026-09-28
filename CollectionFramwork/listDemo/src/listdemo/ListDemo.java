package listdemo;

import java.util.*;

public class ListDemo {
    
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        
        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1, al2);
        al1.add(5, 70);
        
        al1.set(6, 100);

        //Iteration through a ArrayList
        //1.using foreach loop
        // for(Integer x:al1)
        // System.out.println(x);
        //2.using for loop
        //for(int i=0;i<al1.size();i++)
        // System.out.println(al1.get(i));
        ListIterator<Integer> it = al1.listIterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Lamda expresion in for each loop
//      al1.forEach(n->System.out.println(n));
//al1.forEach(System.out::println);
//al1.forEach(n->show(n));
//    }
//   static void show(int n){
//        if(n>60)
//            System.out.println(n);
    }
}
