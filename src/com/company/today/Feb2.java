package com.company.today;

import java.io.*;

/**
 * Created by jaybob320 on 2/2/16.
 */
public class Feb2 implements Serializable {
    //simple member variables
    private String mFruit;
    private int mNumberOfFruit;
    private transient int mNumberOfVegetables = -1;


    public Feb2(String fruit, int numberOfFruit, int numberOfVegetables) {
        mFruit = fruit;
        mNumberOfFruit = numberOfFruit;
        mNumberOfVegetables = numberOfVegetables;
    }

    public String getFruit() {
        return mFruit;
    }

    public int getNumberOfFruit() {
        return mNumberOfFruit;
    }

    public int getNumberOfVegetables() {
        return mNumberOfVegetables;
    }



    //Error in save was just with file location!
    public static void save(Feb2 today)
    {
        try {
            FileOutputStream fileOut = new FileOutputStream("Feb2.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(today);
            System.out.println("Saved Object");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOE!");
            e.printStackTrace();
        }

    }



    public static Feb2 read()
    {

        try {
            FileInputStream fileIn = new FileInputStream("Feb2.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Feb2 today = (Feb2) in.readObject();
            System.out.println("Object Read");

            return today;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return null;
    }


}
