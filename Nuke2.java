/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuke2;
import java.util.Scanner;

/**
 *
 * @author SamVanSandt
 */
public class Nuke2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String test;
        test = x.next();
        System.out.println(test);
        String result = deletecharat(test);
        System.out.println(result);
    }
    
    public static String deletecharat(String test){
    String newValue = test.substring(0,1)+test.substring(1+1);
    
    return newValue;
    }
    }
    

