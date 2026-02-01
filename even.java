//odd or even
import java.util.Scanner;;
public class even {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        int num =scan.nextInt();
        if(num%2 ==0)
        {
            System.out.println("the given number is even");

        }
        else if (num%2 !=0)
        {
            System.out.println("the given number is odd");
        }
       scan.close();
    }
}
