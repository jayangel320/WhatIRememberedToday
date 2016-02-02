package com.company.today;
import java.io.*;

/**
 * Created by jaybob320 on 2/1/16.
 */

//I want to be able to write to a file and read from a file so I will implement the the Serializable interface

//Java includes a concept called interfaces. A Java interface is a bit like a class, except a Java interface
//  can only contain method signatures and fields. An Java interface cannot contain an implementation of the methods,
//  only the signature (name, parameters and exceptions) of the method.

public class Feb1 implements Serializable{

//All of the fields in the class must be serializable.
// If a field is not serializable, it must be marked transient
// ex. "public transient int bubbles = 5;"



    //------Access level modifiers on Member Variables--------//

        //private - can only be accessed within class
        private String mFirstName = "Jay";

        /*
        public - can be accessed outside of class
        final:
           member variables: constant can also be applied to functions and classes
           functions: can't be overwritten
           classes: can't created a child class and methods are inherently final as well
        static: can be accessed with out creating an instance of the class goes
          */
        final public static int mAge = 25;

        //protected - can only be accessed within class and within child class
        protected String mLastName = "Angel";


    public static String mColor;


        //Constructor assigning member variables
        public Feb1(String firstName, String lastName)
        {
            mFirstName = firstName;
            mLastName = lastName;
        }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

  public String getColor() {
        return mColor;
    }

    //Uses string method equals() which checks value equality instead of reference equality like "=="
     public void setColor(String color) throws IllegalArgumentException {
         if(color.equals("red"))
         {
             throw new IllegalArgumentException("Color can't be red!");
         }
        mColor = color;
    }



    //This type of save actually saves the object to a .ser file
    //TODO: make a save that just saves the member variables as text
    public static void save(Feb1 today)
    {

        try {
            FileOutputStream fileOut = new FileOutputStream("file.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(today);
            out.close();
            fileOut.close();
            System.out.println("Object Saved!");
        }catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }

    }


    public static Feb1 read()
    {
        Feb1 tmp = null;
        try {
            FileInputStream fileIn = new FileInputStream("file.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //casting read object to Feb1
            tmp = (Feb1) in.readObject();
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    return tmp;

    }


}
