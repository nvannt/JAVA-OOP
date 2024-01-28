import java.util.Scanner;
public class KiemTraChanle {
    public static void main(String[] args){
     int a;
     Scanner scanner = new Scanner(System.in);
     System.out.println("Nhập vào 1 số: ");
     a = scanner.nextInt();
     if ( a % 2 == 0)
    {
       System.out.println(" a là số chẵn: ");
    }
    else{
        System.out.println(" a là số lẻ: ");
    }
}
}