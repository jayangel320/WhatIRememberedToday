package com.company.today;

import java.io.*;
import java.util.Scanner;

/**
 * Created by jaybob320 on 2/2/16.
 */
public class Feb2_2 extends Feb2 implements Serializable {

    public Feb2_2(String fruit, int numberOfFruit, int numberOfVegetables) {
        super(fruit, numberOfFruit, numberOfVegetables);
    }

    //Uses Vegies enum
    public int enumTest(Vegies veg) {
        switch (veg) {
            case CUCUMBER:
                return 1;
            case LETTUCE:
                return 2;
            case CARROTS:
                return 3;
            case SALAD:
                return 4;
        }
        return 0;
    }

    //Memory test for user inputs
    public String[] userInput(){
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        String[] answers = new String[2];
        try {
            System.out.printf("%nAnswer me!: ");
            answers[0] = bR.readLine();
            System.out.printf("%nAnswer me again!: ");
            answers[1] = scan.nextLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answers;
    }



    //Memory test for serialization
    //this saves everything as text
    public void save(String fileName){
        try {
            BufferedWriter bW = new BufferedWriter(new FileWriter(fileName));
            bW.write(this.getFruit());
            bW.newLine();
            bW.write(Integer.toString(this.getNumberOfFruit()));
            bW.newLine();
            bW.write(Integer.toString(this.getNumberOfVegetables()));
            bW.newLine();
            bW.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //This reads text files instead of read .ser object files
    public  static Feb2_2 read(String fileName){
        Feb2_2 today = new Feb2_2(" ", 0, 0);

        try {
            BufferedReader bR = new BufferedReader(new FileReader(fileName));
            today.setFruit(bR.readLine());
            today.setNumberOfFruit(Integer.parseInt(bR.readLine()));
            today.setNumberOfVegetables(Integer.parseInt(bR.readLine()));
            bR.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NullPointerException npe){
            npe.printStackTrace();
        }


        return today;
    }



}
