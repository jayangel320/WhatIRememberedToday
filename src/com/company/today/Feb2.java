package com.company.today;

import java.io.*;

/**
 * Created by jaybob320 on 2/2/16.
 */

//using the interface I created called fruit
public class Feb2 implements Serializable, Fruit {
    //simple member variables
    private String mFruit;
    private int mNumberOfFruit;
    private transient int mNumberOfVegetables = -1;


    public Feb2(String fruit, int numberOfFruit, int numberOfVegetables) {
        mFruit = fruit;
        mNumberOfFruit = numberOfFruit;
        mNumberOfVegetables = numberOfVegetables;
    }


    //Declaring method from fruit interface
    public int getAmountOfFruit()
    {
        return Fruit.numberOfFruit;
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

    public void setFruit(String fruit) {
        mFruit = fruit;
    }

    public void setNumberOfFruit(int numberOfFruit) {
        mNumberOfFruit = numberOfFruit;
    }

    public void setNumberOfVegetables(int numberOfVegetables) {
        mNumberOfVegetables = numberOfVegetables;
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
