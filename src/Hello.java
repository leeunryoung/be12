import javax.swing.*;
import java.sql.SQLOutput;

public class Hello {

    public static void main(String[] args) {
        char c1='a';
        int i = c1;
        System.out.println(i);

        char c2 = c1;

        char c3= ' ';
        int j = c1+1;

        c3 = (char)(c1+1);
        c2++;  //a=97  b=98  c=99
        c2++;
        System.out.println("j="+j);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);

    }
}
