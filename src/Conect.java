import java.util.Scanner;

public class Conect {


    public static Scanner scan(){
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        System.out.println("вы ввели: " + user);


       return scan;
    }

}
