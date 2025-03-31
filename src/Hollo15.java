public class Hollo15 {  //page.118

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j == i ? " *" : " ");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------------- ");

        for (int i = 1; i < 6; i++) {
            for(int j=6; j>0; j--){
                System.out.print(j == i ? "*": " ");
        }
        System.out.println(" ");
    }

        System.out.println("-------------------------------");
        
}}