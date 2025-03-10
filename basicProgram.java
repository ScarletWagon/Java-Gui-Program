//Gurpreet singh  8/28/2021 block 5
import java.util.*; 
import java.io.*;
import javax.swing.JOptionPane;

public class basicProgram
{ 
   public static int ans2;
   public static String name;
   public static int ans3;
   public static int ans4;
   public static String run;
   public static String answer2;
   public static void main(String[] args)
   {
         JOptionPane.showMessageDialog(null, "This is a simple program that asks you 2 questions, press Ok to continue!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
      Scanner input = new Scanner(System.in);
           String name2 = JOptionPane.showInputDialog("Enter your name"); //new way with a popup window.
          name = String.valueOf(name2);
       /*System.out.println("Enter your name");     //older way of getting the name.
      name = input.next(); */
      pipeline();
       
      while(run.equals("1"))
      {pipeline();}
             
   
   }
   
   public static void pipeline()
   {
      core();
      while(ans2 == 2)
      {core();}
      second();
      while(ans3 == 2)
      {second();} 
      third();
      while(ans4 == 2)
      {third();}
   
   }
   public static void core()
   {
         //int answer;
      Scanner input = new Scanner(System.in);
      JOptionPane.showMessageDialog(null, "Alright " +name+" here comes the first question", "First Question", JOptionPane.INFORMATION_MESSAGE);
      String answer = JOptionPane.showInputDialog("What is 2 + 2, Put your Answer below");
            if(answer.equals("4"))
      {ans2= 1;
         JOptionPane.showMessageDialog(null, "You got it Right!", "Hooray", JOptionPane.INFORMATION_MESSAGE);
      }
      else 
         if (!answer.equals("4"))
         {ans2 = 2;
            JOptionPane.showMessageDialog(null, "Noo, you got it wrong! Try again!", "Wrong answer", JOptionPane.INFORMATION_MESSAGE);

         }
        }
   
   public static void second() 
   {
      Scanner input = new Scanner(System.in);
      JOptionPane.showMessageDialog(null, "Alright " +name+" here comes the Second question", "Second Question", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "What are 2 numbers that when multiplied give 20 and when added give -12", "Ready?", JOptionPane.INFORMATION_MESSAGE);

     String tester = JOptionPane.showInputDialog("Write the first number(can be either one of the 2 numbers)");      
      answer2 = tester;
      
      if (answer2.equals("-2") || answer2.equals("-10"))
      { JOptionPane.showMessageDialog(null, "You got it Right!", "Hooray", JOptionPane.INFORMATION_MESSAGE);
         ans3 = 1; } 
         
      else 
         if (!answer2.equals("-2") || !answer2.equals("-10"))
         { JOptionPane.showMessageDialog(null, "Noo, you got it wrong! Try again!", "Wrong answer", JOptionPane.INFORMATION_MESSAGE);
            ans3 = 2;
            
         }
         }
         public static void third()
         {
          Scanner input = new Scanner(System.in);
          String answer3;
          answer3 = "null";
         //int answer3;
      //answer3 = 0;
      if(answer2.equals("-2") || answer2.equals("-10"))
      {answer3 = JOptionPane.showInputDialog("Write the Second number(cannot be the same as the first one)");}
    
      if(answer3.equals(answer2))
      {JOptionPane.showMessageDialog(null, "The second number can't be the same as the first one, try again", "Wrong answer", JOptionPane.INFORMATION_MESSAGE);
         ans4 = 2;}
      else 
         
         if(answer3.equals("-2") || answer3.equals("-10"))
         {  JOptionPane.showMessageDialog(null, "You got it Right!", "Hooray", JOptionPane.INFORMATION_MESSAGE);
            ans4 = 1;
         }
         
         else 
         
            if(!answer3.equals("-2") || !answer3.equals("-10"))
            {JOptionPane.showMessageDialog(null, "Noo, you got it wrong! Try again!", "Wrong answer", JOptionPane.INFORMATION_MESSAGE);
                                         ans4= 2; }
         
      if(ans4 == 1)
      { run = JOptionPane.showInputDialog("Good job! you got both of the questions right! Enter 1 to Restart the whole program or 2 to end It!"); }
         
   }     
         
   
}