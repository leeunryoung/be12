import java.util.SortedMap;

public class Hollo6 {

    public static void main(String[] args) {
   float pi=3.1415167f; //4byte  *10-45
   float shortPi=(int)(pi * 1000)/1000f; //float
        System.out.println(shortPi);

        double pl=3.141592;  //4byte *10-34  double
        double shortPl=(int)(pi * 1000+0.5)/1000.0;
        System.out.println(shortPl);

        double d=85.4;
        int score=(int)d;
        System.out.println("score="+score);
        System.out.println("d="+d);
    }
}
