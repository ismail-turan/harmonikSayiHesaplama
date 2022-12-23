import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int a=scanner.nextInt();
        double toplam=0;
        for (double i=1;i<=a;i++){
            toplam+=1/i;
        }
        System.out.print("Harmonik Toplam :"+toplam);
    }
}