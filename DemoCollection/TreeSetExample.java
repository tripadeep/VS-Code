package DemoCollection;

import java.util.TreeSet;

public  class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t=new TreeSet<>();
        t.add("A");
        t.add("D");
        t.add("C");
        t.add("B");
        System.out.println(t);
        System.out.println(t.first()); //method of sortted set.
        System.out.println(t.last());
        System.out.println(t.headSet("C"));
        System.out.println(t.tailSet("D",true));

    }
}