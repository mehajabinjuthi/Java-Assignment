
package Assignment01;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class fibomain {
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        fibonacci fibo=new fibonacci();
        for(int i=1;i<=n;i++){
            System.out.print(fibo.fib(i)+" ");
        }
        
    }
}
