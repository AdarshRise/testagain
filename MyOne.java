/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author adarsh
 */
public class MyOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        

        System.out.println("hello");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        while (!input.hasNextInt())
     {
        input.nextLine();
        System.out.print("Invalid integer; please enter an integer: ");
     }
        int i = input.nextInt();
  



// TODO code application logic here
    }
    
}
