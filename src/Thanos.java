import java.util.Scanner;

public class Thanos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long p = in.nextInt();
            long r = in.nextInt();
            long f = in.nextInt();
            long counter = 0;
            while(p <= f){
                counter++;
                p *= r;
            }
            System.out.println(counter);
        }
        in.close();
    }
}