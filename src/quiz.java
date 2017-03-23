
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SALAMA HAMIDAN
 */
public class quiz {
    static String QUESTIONS[] = {"what is the capital of nigeria?","where was the first islamic university located?","what is the name of the president of USA?","who was the first person to drive car in africa?","which was the first airline in nigeria?","who was the first scienties in the world?","where is baze university located?","who invented newton law of motion?","how old is nigeria?","which year was indomie invented?"};
    static String answers[] = {"ABUJA","TIMBUKTU","DONALD TRUMP","RANSOME-KUTI'S","NIGERIA AIRWAYS","ROBERT BROWN","ABUJA","ISAAC NWETON","57","1970"};
    static Random myRandom = new Random ();
    static Scanner myInput = new Scanner (System.in);
    private static int userchoice;
    private static int answer;
    
             public static void main(String [] args){
                 userchoice = myInput.nextInt(10);
                 if(userchoice > 0)
                 {
                     System.out.println(QUESTIONS[userchoice]);
                     answer = myInput.nextInt(10);
                     
                 } if (answer.equals(answers[userchoice]))
                
                 {
                     System.out.println("incorrect");
                 }    
                 else
                 {
                     System.out.println("1 mark");
                 }    
              
                 
                 
                 
             }
    
}
