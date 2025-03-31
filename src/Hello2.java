public class Hello2 {

    public static void main(String[] args) {
        char c1='a';
        int i = c1;
        System.out.println(i); //97

        char c2 = c1;  //97

        char c3= ' ';  // 초기화
        int j = c1+1; //98

        c3 = (char)(c1+1);  //"98"
        c2++;  //a=97 c=99 b=98
        c2++;
        System.out.println("j="+j);  //98
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);

    }
}
