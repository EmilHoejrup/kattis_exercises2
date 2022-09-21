import java.util.Scanner;

public class Faktor {
    int alder;
    public Faktor(int alder){
        this.alder = alder;
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int I = in.nextInt();
        int bribe = A * (I-1);
        System.out.println(bribe+1);
    }
}
