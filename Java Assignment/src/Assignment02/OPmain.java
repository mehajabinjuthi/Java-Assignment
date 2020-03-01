/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment02;

/**
 *
 * @author Asus
 */
public class OPmain {
    public static void main(String[] args) {
        objectpassing ob1 = new objectpassing();          // Passing Object: 01
        objectpassing ob2 = new objectpassing(6, 4);      // Passing Object: 02
        objectpassing ob3 = new objectpassing(12, 9);     // Passing Object: 03
        objectpassing ob4 = new objectpassing(ob2);       // Passing Object: 04
        System.out.println("Object01 == Object02? " + ob1.check(ob2));
        System.out.println("Object01 == Object03? " + ob1.check(ob3));
        System.out.println("Object02 == Object04? " + ob2.check(ob4));
        System.out.println("Object03 == Object04? " + ob3.check(ob4));
        objectpassing ob5 = new objectpassing();
        ob5 = ob5.adding(ob2, ob3);                 // Passing Object: 05
        System.out.println(ob5.a+" "+ob5.b);
    }
}
