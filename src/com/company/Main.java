package com.company;

import com.company.today.Feb1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TODO: make interface
//TODO: make enum
//TODO: make new class serializable
//TODO: LinkedList vs ArrayList
public class Main {

    public static void main(String[] args) {
	// write your code here

//This ide has a hard time using java.io.Console so we will first use buffered reader then we will use scanner

        /*

        To let user pass some informations to process you can use standard input stream (stored in System.in).
        Unfortunately in is simple InputStream and since Streams purpose was to handle binary data it doesn't
        have methods which would let you easily read text (especially if encoding can be involved). That is why Readers
        and Writers ware added to Java.

        So to let application read data from user you can wrap standard input stream in one of the Readers which will
        let us read entire line, like BufferedReader which has readLine() method. Unfortunately this class doesn't
        accept Streams so we need a bridge (adapter) which will wrap InputStream, and will return Reader. That is why
        InputStreamReader exists (it lets us treat a stream of bytes as a stream of text).

         */

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Feb1 today = new Feb1("Jay", "Angel");

        String fullName = today.getFirstName() + " " + today.getLastName();


        //uses the String method indexOf which returns -1 if char is not found
        if(fullName.indexOf('Z') < 0);
        {
            System.out.println("You're name does not include z!");
        }


        System.out.printf("Enter your age: ");
        //Using method readLine from BufferedReader
        String sAge = null;
        try {
            sAge = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    //Uses the Integer method parseInt to change string into an int
    int iAge = Integer.parseInt(sAge);


    //Accesses the final public static variable of Feb1
    if (iAge == Feb1.mAge) {
        System.out.printf("You are %s!", Feb1.mAge);
    }



//Now I will use scanner to get User input

        Scanner scan = new Scanner(System.in);

        System.out.printf("%nEnter in the color you want: ");
     String color = scan.nextLine();





    //Accessing a static function of Feb1 and also has a try-catch block around setColor
    // since it can throw a IAE
    try {
        Feb1.setColor(color);
    } catch (IllegalArgumentException iae) {
        System.out.printf("%n%s", iae.getMessage());
        iae.getStackTrace();
    }


    System.out.printf("You chose a color of %s%n", today.getColor());

    //uses String method charAt() and length()
    for (int counter = 0; counter < fullName.length(); counter++) {
        System.out.printf("%c", fullName.charAt(counter));
    }

    int charCount = 0;
    String fullNameCopy = " ";
    //Example of new for-loop syntax and String methods toLowerCase() and toCharArray()
    for (char letter : fullName.toLowerCase().toCharArray()) {
        charCount++;
        fullNameCopy += letter;
    }


    System.out.printf("%n%d characters and the lowercase copy is: %s%n", charCount, fullNameCopy);
*/
        //Feb1.save(today);

        Feb1 today = Feb1.read();
        System.out.printf("Today is %s",today.getColor());



}








}
