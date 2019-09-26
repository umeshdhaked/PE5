package Classes.PE4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2 {
    public static void find(){

    String str = "one,one,one___two,three,one,@three*one?two";

        Pattern p = Pattern.compile("[a-zA-Z]+");

        Matcher m = p.matcher(str);

















        List<String > lol = new ArrayList<>();


        while (m.find()){
            lol.add(m.group());
        }

        String[] arrString = new String[lol.size()];
        for (int i=0;i<arrString.length;i++)
            arrString[i]=lol.get(i);


        Map<String,Integer> var = new TreeMap<>();

        for (int i=0;i<arrString.length;i++){
            Integer n = var.get(arrString[i]);
            if(n==null)
                n=0;

            var.put(arrString[i],n+1);

        }




        Iterator<String> itr = var.keySet().iterator();
        Iterator<Integer> itr2 = var.values().iterator();


        while (itr.hasNext()){
            String kay=itr.next();
            // if(kay.equals(",")){
            // }
            // else {
            System.out.println(kay + "-" + itr2.next());
            // }
        }

















    }











}
