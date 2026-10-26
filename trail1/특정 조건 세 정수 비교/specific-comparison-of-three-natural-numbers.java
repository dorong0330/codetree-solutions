import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int min=0;

        if(a<=b&&a<=c){
            min=a;
        }else if(b<=a&&b<=c){
            min=b;
        }else{
            min=c;
        }
        if(min==a){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }
        if(a==b&&b==c){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}