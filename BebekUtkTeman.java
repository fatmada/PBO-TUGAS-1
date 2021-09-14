import java.util.Scanner;
public class BebekUtkTeman {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a= scan.nextInt();
        int b = scan.nextInt();
        int bagi = a/b;
        int sisa = a%b;

        System.out.println("masing-masing " + bagi);
        System.out.println("bersisa " + sisa);
    }
}
