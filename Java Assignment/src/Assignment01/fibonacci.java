/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment01;

/**
 *
 * @author Asus
 */
public class fibonacci {
    public int fib(int x){
        if(x==1||x==2)
            return 1;
        else
            return (fib(x-1)+fib(x-2));
    }
}
