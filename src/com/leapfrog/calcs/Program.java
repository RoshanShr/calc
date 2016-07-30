/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calcs;
import com.leapfrog.calcs.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author Sagar
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner input=new Scanner(System.in);
        
        while (true){
        System.out.println("Welcome to Roshan's Calculator, Please begin your calcualtion!!"); 
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Power");
        System.out.println("6. Table");
        System.out.println("7. Exit");
        
        System.out.println("Enter your choice[1-5]");
        int ch=input.nextInt();
        System.out.println("Enter the value of x:");
        int x=input.nextInt();
        
        System.out.println("Enter the value of y:");
        int y=input.nextInt();
        
        
        
        Calculator c=new Calculator(x,y);
        
        if (ch==1)
        {
            System.out.println(c.add());
        }
        
        else if (ch==2)
        {
            System.out.println(c.sub());
        }
        
        else if (ch==3)
        {
            System.out.println(c.mul());
        }
        
        else if (ch==4)
        {
            System.out.println(c.div());
        }
         
        else if (ch==5)
        {
            System.out.println(c.power());
        } 
        
//        else if (ch==6)
//        {
//            System.out.println(c.table());
//        } 
        else
        {
            System.out.println("Thank you for using our calcualtor!!");
            System.exit(0);   
        }
        
        

        System.out.println("Do u want to continue:Y/N");
        String choice=input.next();
        if (choice.equalsIgnoreCase("n")){
            System.exit(0);
        }
                
    }
    }
    
}
