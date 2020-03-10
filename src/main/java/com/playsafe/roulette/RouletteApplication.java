package com.playsafe.roulette;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SpringBootApplication
public class RouletteApplication {

    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(RouletteApplication.class, args);
        File myObj = new File("source/data.out");

        //Input Scanner
        Scanner myReader = new Scanner(myObj);
        System.out.println("\n\nList of Players:");
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            //Show players on menu
            System.out.println(line);
        }
        myReader.close();


    }
}
