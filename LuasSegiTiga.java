import java.util.Scanner;
public class LuasSegiTiga {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    float alas = scan.nextFloat();
    float tinggi = scan.nextFloat();
    float luas = alas * tinggi / 2;
    System.out.printf("%.2f\n",luas);
}
}
