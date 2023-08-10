package day07;

public class string {

    public static void main(String[] args) {

        String s= "purr";

        s.toUpperCase();
        System.out.println(s.length());

        s.trim();
        System.out.println(s.length());

        s.substring(1,3);
        System.out.println(s.length());
        System.out.println();

        s+=" two"; //en basta bir bosluk var

        System.out.println(s.length());


    }
}
