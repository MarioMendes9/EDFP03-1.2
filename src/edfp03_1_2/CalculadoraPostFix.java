/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp03_1_2;

/**
 *
 * @author mario
 * @param <T>
 */
public class CalculadoraPostFix {
    
    private LinkedStack<Integer> a;

    public CalculadoraPostFix() {
        this.a = new LinkedStack<>();
    }

    
    public int calculate(String n){
        
        String[] parts=n.split(" ");
        
        for(int i=0;i<parts.length;i++){
            
            switch(parts[i]){
            case "+":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return 0;
                }
                else{
                int oper2=a.pop();
                int oper1=a.pop();
                a.push(oper2+oper1);
                }
                break;
            case "-":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return 0;
                }
                else{
                int oper2=a.pop();
                int oper1=a.pop();
                a.push(oper1-oper2);
                }
                break;
            case "/":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return 0;
                }
                else{
                int oper2=a.pop();
                int oper1=a.pop();
                a.push(oper1/oper2);
                }
                break;
            case "*":
                if(a.size()<2){
                    System.out.println("nao tem 2 elementos");
                    return 0;
                }
                else{
                int oper2=a.pop();
                int oper1=a.pop();
                a.push(oper2*oper1);
                }
                break;
            default :
                a.push(Integer.parseInt(parts[i]));
                
                
                break;
        }
            
        }
        
        
            
        return a.peek();
        
        
    }

    
    
}
