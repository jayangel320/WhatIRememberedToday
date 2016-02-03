package com.company;

import com.company.today.Feb1;
import com.company.today.Feb2;
import com.company.today.Feb2_2;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TODO: LinkedList vs ArrayList
//TODO:Maps
//TODO:Lists
//TODO:Sets
//TODO:Queues
//TODO:instanceof
//TODO:comparable interface
//TODO:generics
//TODO: simpledateclass
//TODO: bubble sort
//TODO: interview questions both sites

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

/*       Feb2 tests

        //Feb1.save(today);
       int error = 57;
        Feb2 today = new Feb2("apples", 10, 20);
        Feb2.save(today);
        Feb2 today2 = Feb2.read();

        if(today != null) {
            System.out.printf("Today is %s, %d, %d", today2.getFruit(), today2.getNumberOfFruit(),
                    (today2.getNumberOfVegetables() == -1) ? today2.getNumberOfVegetables() : error );
        }

        System.out.printf("%nthere are %d fruit", today2.getAmountOfFruit());

*/

        Feb2_2 today = new Feb2_2("oranges",57, 22);
        today.save("FEb2_2.txt");
        Feb2_2 yesterday = Feb2_2.read("FEb2_2.txt");
        if(yesterday != null) {
            System.out.printf("I have %d %s and %d vegetables",
                    yesterday.getNumberOfFruit(),
                    yesterday.getFruit(),
                    yesterday.getNumberOfVegetables());
            String[] now = yesterday.userInput();
            System.out.printf("%n%s and %s are your answers%n", now[0], now[1]);
        }

}








}

