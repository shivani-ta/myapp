/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.Random;

/**
 *
 * @author shivani tangellapally
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //string class
        System.out.println("******** String Class ********");
      String String1="    Welcome";
      String String2=" to ";
      String String3="   Applied  ";
      String String4=" Computer Science";
      String String5=" at   ";
      String String6=" Northwest ";
      String StringCon=String1.concat(String2).concat(String3).concat(String4).concat(String5).concat(String6);
       System.out.println(String1.concat(String2).concat(String3).concat(String4).concat(String5).concat(String6));
       System.out.println("The length of the concatenated string is: " +StringCon.length());  
      String Stringt="Welcome to Applied Computer Science at Northwest!";
       System.out.println(Stringt);
       System.out.println("Length of the above string is: "+Stringt.length());
      String Stringsub=Stringt.substring(19,35);
       System.out.println("Retrieved: " + Stringt.substring(19,35));
       System.out.println("Index of last e in 'computer science' is at: " +Stringsub.lastIndexOf('e'));
      String a="computer Applied science Applied Computer science  science Applied computer Applied computer Science Applied computer Applied";
       System.out.println("First occurrence of Computer is at: "+a.indexOf("Computer"));
      String lab = "lab activities are fun!";
       System.out.println(lab);
      String  replacestring =(lab.replaceAll(" ","_"));
       System.out.println(replacestring);
       System.out.println("because applied computer science is interesting \n");
        
      //math class
        System.out.println("******** Math Class ********");
      double value1 = 18;
      double value2 = 4;
       System.out.println("18 raised to the power of 4: "+Math.pow(value1, value2));
       System.out.println("sec (18): "+1/Math.cos(value1));
      double myNumber = 37.15;
        System.out.println("Square root of 37.15: "+Math.sqrt(myNumber));
        System.out.println("Ceil Value of 37.15: " +Math.ceil(myNumber));
        System.out.println("Floor Value of 37.15: " +Math.floor(myNumber));
        System.out.println("cos 60° cos 45° + sin 60° sin 45° = "+Math.cos(60-45));
      double ta = 90 ;
        System.out.println("Theoretical value of tan(90) is: "+Math.tan(ta));
        System.out.println("Cubic root of modulus value of tan(90) is: "+Math.abs(Math.cbrt(Math.tan(ta))));
      double r = 30;
      double s = 1/(Math.sin(r));
      double t = 1/(Math.cos(r));
        System.out.println("Cosecant of 30 is: "+s);
        System.out.println("Secant of 30 is: "+t);
        System.out.println("Minimum value in Cosec(30) and Sec(30) is: "+Math.min(s, t));
        System.out.println("Maximum value in Cosec(30) and Sec(30) is: "+Math.max(s, t));
      int myNumber1 = 45 ;
      int myNumber2 = 27;
      double cosi1= Math.cos(myNumber1);
      double tang1= Math.tan(myNumber1);
      double cosi2= Math.cos(myNumber2);
      double tang2= Math.tan(myNumber2);
        System.out.println("Rounded Value of cos 45: "+Math.round(cosi1));
        System.out.println("Rounded Value of cos 27: "+Math.round(cosi2));
        System.out.println("Rounded Value of tan 45: "+Math.round(tang1));
        System.out.println("Rounded Value of tan 27: "+Math.round(tang2));
      double num1 = Math.pow(Math.pow(4, 3)+(9*2*7*5),0.25);
      double num2 = Math.pow(Math.pow(4, 2)-Math.pow(2, 2),0.125);
      double num3 = Math.abs(6*(1/(Math.sin(myNumber1))));
      double num4 = num1/num2;
        System.out.println("The value of given equation is: " +num3*num4+"\n");
        
       //randomclass
        System.out.println("******** Random Class ********");
        System.out.println("4 pseudo-random integer values between 0 (inclusive) and 300 (exclusive)");
      Random ran= new Random();
      int ran1 =300;
      
        System.out.println("First random integer value is:"+ran.nextInt(ran1));
        System.out.println("Second random integer value is:"+ran.nextInt(ran1));
        System.out.println("Third random integer value is:"+ran.nextInt(ran1));
        System.out.println("Fourth random integer value is:"+ran.nextInt(ran1));
        System.out.println("3 pseudo-random integer values without seed value and bounds");
        System.out.println("Fifth random integer value is:"+ran.nextInt());
        System.out.println("Sixth random integer value is:"+ran.nextInt());
        System.out.println("Seventh random integer value is:"+ran.nextInt());
        System.out.println("i didn't get same results");
        System.out.println("4 pseudo-random values between 0 (inclusive) and 300 (exclusive)");
        
        
        Random ran3= new Random(30);
        int ran4 =300;
        ran3.setSeed(30);
        
        System.out.println("First random integer value is:" +ran3.nextInt(ran4));
        System.out.println("Second random integer value is:" +ran3.nextInt(ran4));
        System.out.println("Third random integer value is:" +ran3.nextInt(ran4));
        System.out.println("Fourth random integer value is:" +ran3.nextInt(ran4));
        System.out.println("3 pseudo-random values with seed value and without bounds");
        System.out.println("Fifth random integer value is: " +ran3.nextInt());
        System.out.println("Sixth random integer value is:" +ran3.nextInt());
        System.out.println("Seventh random integer value is:" +ran3.nextInt());
        System.out.println("i got same result everytime i run the program");
        System.out.println("in b the result changes everytime we run but in d the result doesn't change because we gave seed value");
        
       }}
           
