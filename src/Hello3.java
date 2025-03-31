import java.net.StandardSocketOptions;

public class Hello3 {

    public static void main(String[] args) {
        int x=11, y=20;
        int tmp=0;

        System.out.println("x:"+x+" y:"+y);

        tmp=x;  //11
        x=y;  //20
        y=tmp;  //11

        System.out.println("x:"+x+" y:"+y);


    }
}
