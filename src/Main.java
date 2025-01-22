import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        int ss;
        int qq;
        int кк;


        String[] slovo = {"qwe","wer"};

    
Scanner scan = new Scanner(System.in);
String user = scan.nextLine();
        System.out.println(nearHundred(user));

        Conect.scan();



    }
    public static boolean nearHundred(String n) {
        if (n.length() > 5){
            return true;

        } else if (n.length() > 6) {
            return true;

        } else {
            return false;
        }




    }
}
