public class Hollo12 {  //page.118

    public static void main(String[] args) {
        for (int i = 3; i >0; i--) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (int i = 1; i < 3; i++) {
                for (int j = 0; j < 2- i; j++) {
                    System.out.print(" ");  //공백
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
