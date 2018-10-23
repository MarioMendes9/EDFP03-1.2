/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp03_1_2;

/**
 *
 * @author User
 */
public class EDFP03_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        LinkedStack<Integer> a=new LinkedStack<>();
////        System.out.println(a.isEmpty());
//        a.push(1);
//        a.push(2);
//        a.push(3);
//        System.out.println(a.toString());
//        System.out.println(a.peek());
//        a.push(4);
//        System.out.println(a.size());
//        System.out.println(a.toString());
////        System.out.println(a.isEmpty());
//        a.pop();
//        System.out.println(a.toString());

     CalculadoraPostFix c=new CalculadoraPostFix();
    System.out.println(c.calculate("3 4 + 2 *"));
    System.out.println(c.calculate("3 + + 2 *"));
    System.out.println(c.calculate("7 4 -3 * 1 5 + / *"));
    
    System.out.println(c.calculate("1 2 -"));
        System.out.println(c.calculate("1 2 /"));
    }
    
}
