import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matha=sc.nextInt();
        int enga=sc.nextInt();
        int mathb=sc.nextInt();
        int engb=sc.nextInt();

        if(matha>mathb){
            System.out.println("A");
        }else if(matha==mathb){
            if(enga>engb){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }else{
            System.out.println("B");
        }
    }
}