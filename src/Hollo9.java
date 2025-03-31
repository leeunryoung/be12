public class Hollo9 {  //page.118

    public static void main(String[] args) {
        for (int i = 0; i<= 6; i++) {
            for (int j =7; j>i; j--) {//공백을 늘려라
                System.out.print(" ");
            }
            for(int j=1; i>j; j++){
            System.out.print("*");
        }
            System.out.println();
    }
}}