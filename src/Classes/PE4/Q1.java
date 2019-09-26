package Classes.PE4;

import java.util.*;

public class Q1 {
    public static void find(){
        List<String> li = new ArrayList<String >();

        li.add("Apple");
        li.add("Grape");
        li.add("Melon");
        li.add("Berry");

        for(String itr:li){
            System.out.print(itr+" ");
        }

        System.out.println("");
      //  li.set(0,"Kiwi");

        //Or we can do this -


        ListIterator<String >  iter = li.listIterator();

        while (iter.hasNext()){

            if(iter.next().equals("Apple")){
                iter.set("Kiwi");
            }

        }


        for(String itr1:li){
            System.out.print(itr1+" ");
        }


    }



}
