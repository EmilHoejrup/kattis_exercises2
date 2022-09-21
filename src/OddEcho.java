import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 1;
        while (counter <= n){
            if (counter % 2 != 0){
                System.out.println(in.next());
            }
            else{
                in.next();
            }
            counter++;
        }
    }
}
