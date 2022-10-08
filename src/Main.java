import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        a(sc.nextLine(),sc.nextLine(),sc.nextLine());
    }static void a(String name,String surname,String otchestvo){
        String na=name.toUpperCase();
        char n=na.charAt(0);
        String su=surname.toUpperCase();
        char s=su.charAt(0);
        String ot=otchestvo.toUpperCase();
        char o=otchestvo.charAt(0);
        System.out.println(n+"."+s+"."+o);


    }

}


