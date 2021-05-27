package main;

import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args){
        Libro libro = new Libro("HP1", "JKR", "Fantasia");
        System.out.println(libro.toString());

        Fraccion f = new Fraccion(1,2);

        //String util
        int[] intArray = new int[]{1,2,3,4};
        String[] stringArray = new String[]{"1", "2", "3","4"};
        assert intArray.equals(StringUtil.toIntArray(stringArray));
        assert stringArray.equals(StringUtil.toStringArray(intArray));
        assert "AAAA500".equals(StringUtil.lpad(StringUtil.rpad("5", 2, '0'), 4, 'A'));
        assert "h o l a".equals(StringUtil.trim(" h o l a "));
        assert StringUtil.indexOfN("John|Paul|George|Ringo", '|', 2) == 9;
        System.out.println("Salio todo bien");

//        GregorianCalendar c = new GregorianCalendar(2017, 2, 54);
//        System.out.println(c.getTime().toString());
    }
}
