package codecool.com;

import java.util.Arrays;
import java.util.List;
import java.util.logging.StreamHandler;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
       
        List<String> cs = myList.stream().filter(a -> a.charAt(0) == 'c').
                map(b -> b.substring(0, 1).toUpperCase() + b.substring(1)).sorted()
                .collect(Collectors.toList());
        cs.forEach(System.out::println);
    }


    /*
    cs ami tartalmazza az összes c vel kezdődő elemet
     */



    /*
    Legyen minden betű nagybetű a cs listában
    */



    /*
    cs lista elemeit írjátok ki
     */

}
