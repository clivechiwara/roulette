package com.playsafe.roulette;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class RouletteApplication {


    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(RouletteApplication.class, args);

        //Players list
        List<String> players = new ArrayList<>();


        List<String> betData = new ArrayList<>();

        int count = 1;
        File myObj = new File("source/data.out");

        //Input Scanner
        Scanner myReader = new Scanner(myObj);

        System.out.println("\n\nList of Players:");
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            //Show players on menu
            System.out.println(count + ". " + line);
            //Add players to list
            players.add(line);
            //Increment
            count++;
        }
        myReader.close();


        for (String player : players) {
            //Bets
            List<String> betDetails = new ArrayList<>();
            try {
                //Scanner
                Scanner scan = new Scanner(System.in);
                System.out.println("\n" + player + " Enter Bet (number between 1-36 or type EVEN or ODD : ");
                String bet = String.valueOf(scan.nextLine());
                System.out.println("\n" + player + " Enter Amount : ");
                double amount = scan.nextInt();

                betDetails.add(bet);
                betDetails.add(String.valueOf(amount));
                betDetails.add(player);
                betData.add(betDetails.toString());

            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("You have entered an invalid input, kindly retry");
            }
        }

    }

}