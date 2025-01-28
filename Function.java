import java.util.Scanner;
public class Function {
    static int a=50; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the value of a: ");
       // int a= sc.nextInt();
        //System.out.print("Enter the value of b: ");
        //int b= sc.nextInt();
        int c;
        //calculatesum();
        System.out.print(calculatesum(10,20,30));
       // System.out.println(c);
    }
    public static int calculatesum(int a, int b, int c){
        return a+b+c;
    }
    public static double calculatesum(double a, double b, double c){
        return a+b+c;
    }
}
