import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        System.out.println("1 - Laczenie z baza MySQL");
        System.out.println("2 - Laczenie z baza MsSQL");
        Scanner s = new Scanner(System.in);
        int choose = 0;
        choose = s.nextInt();
        switch(choose){
            case 1:
                MySQL MY = new MySQL();
                MY.MySQLconnect();
            break;
            case 2:
                MsSQL MS = new MsSQL();
                MS.MsSQLconnect();
            break;
            default:
                System.out.println("Bledny wybor");
        }
    }
}