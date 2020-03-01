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
public class objectpassing {
    int a=6, b=4;
    
    public objectpassing(int i, int j) {
        a = i;
        b = j;
    }
    public objectpassing() {
        
    }
    
    public objectpassing(objectpassing op){
        a = op.a;
        b = op.b;
    }
    
    boolean check(objectpassing op){
        return (op.a==this.a && op.b == this.b);
    }
    
    objectpassing adding(objectpassing object1, objectpassing object2){
        objectpassing temp = new objectpassing();
        temp.a = object1.a + object2.a;
        temp.b = object1.b + object2.b;
        return temp;
    }
}