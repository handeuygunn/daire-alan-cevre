import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //değişken oluştur
        int r ;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yari capini giriniz:");
        r = input.nextInt();


        double cevre =2*(3.14)*r;
        double alan = (3.14)*(r*r);

        System.out.print("dairenin cevresi:");
        System.out.println(cevre);

        System.out.print("dairenin alani:");
        System.out.println(alan);






    }
}
