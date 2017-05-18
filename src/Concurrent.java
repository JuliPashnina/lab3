/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccnb
 */
public class Concurrent  extends Thread{
    
    static int counter = 0; 

    public void run() { 
        Concurrent.counter++; 
    } 

    public static void main(String[] a) throws Exception { 

        new Concurrent().start(); 
        new Concurrent().start(); 

        System.out.println(counter); 
    } 
}
