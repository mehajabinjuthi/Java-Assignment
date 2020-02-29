/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
