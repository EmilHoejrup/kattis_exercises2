//hej fra terminalen

import java.util.Scanner;

    class TwoStones {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if(n % 2 != 0){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
        }

}
