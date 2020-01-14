package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        Welcome();
    }
    public static void Welcome()
    {
        System.out.println("Welcome to the Matchstick GAME");
        System.out.println("Would you like to start?");
        System.out.println("[1] Yes [2] No");
        Chose();
    }

    public static void StartGame()
    {
        //main Settings
        int[] ReihenArray = {0,1,2,3,4,5};
        int[] StickArray = {0,1,2,3,4,5};
        int[] EmptyArray = {0,0,0,0,0,0};
        int Chose = 0;
        int Chose1 = 0;
        int Chose2 = 0;
        int sum = 15;
        int sum2 = 0;
        int i = 0;
        int round=0;


        Scanner Input = new Scanner(System.in);
        Random rand = new Random();



        while(sum >= 3) {

            if(Arrays.equals(StickArray, EmptyArray))
            {

            }

            if((round % 2) == 0) {
                if(Arrays.equals(StickArray, EmptyArray))
                {
                    End2();
                    break;
                }
                //System.out.println("Player 2 Wins!"); (Optional)
                System.out.println("Player 1, your turn!");
            } else {
                if(Arrays.equals(StickArray, EmptyArray))
                {
                    End1();
                    break;
                }
                //System.out.println("Player one wins"); (Optional)
                System.out.println("Player 2, your turn!");
            }

            for (i = 0; i != 6; i++) {
                sum2 = sum += StickArray[i];
                System.out.println(StickArray[i]);
            }



            System.out.println("Which row do you want to play? (1,2,3,4,5)");
            Chose1 = Input.nextInt();
            Chose2 = StickArray[Chose1];

            System.out.println("You play in Row: " + ReihenArray[Chose1] + ". Only " + ReihenArray[Chose2] + " Are Available");
            System.out.println("How many would you like to take?");
            if (ReihenArray[Chose2] > 3) {
                System.out.println("Note: YOU CAN ONLY TAKE A MAXIMUM OF 3!");
            }
            Chose2 = Input.nextInt();

            if (Chose2 >= 4) {
                System.out.println("Can you read?!");
                System.out.println("Quitting...");
                Welcome();
            }
            StickArray[Chose1] -= Chose2;
            System.out.println("In row " + Chose1 + " are now " + StickArray[Chose1] + " left!");

            round++;
        }

    }

    public static void Chose()
    {
        int Chose = 0;
        Scanner Input = new Scanner(System.in);
        Chose = Input.nextInt();

        if(Chose == 1 )
        {
            PlayerCount();
        }else if(Chose == 2)
        {
            Welcome();
        }else if(Chose == 3)
        {
            StartSingleplayerGame();
        }else if(Chose == 4)
        {
            StartGame();
        }else if(Chose == 5)
        {
            BotGame();
        }
    }

    public static void Player1()
    {
        System.out.println("Player 1, your turn");
        StartGame();
    }
    public static void Player2()
    {
        System.out.println("Player 2, your turn");
        StartGame();
    }
    public static void PlayerCount()
    {
        System.out.println("Choose one GAMEMODE:");
        System.out.println("[3] Singleplayer");
        System.out.println("[4] Multiplayer");
        System.out.println("[5] Watch 2 Bots play against each other :D (Buggy)");
        Chose();
    }
    public static void StartSingleplayerGame()
    {

    }

    public static void End1()
    {
        System.out.println("Game is over Player 1 Wins");
        System.out.println("Congrats");
    }

    public static void End2()
    {
        System.out.println("Game is over Player 2 Wins");
        System.out.println("Congrats");
    }
    public static void BotGame()
    {
        //main Settings
        int[] ReihenArray = {0,1,2,3,4,5};
        int[] StickArray = {0,1,2,3,4,5};
        int[] EmptyArray = {0,0,0,0,0,0};
        int Chose = 0;
        int Chose1 = 0;
        int Chose2 = 0;
        int sum = 15;
        int sum2 = 0;
        int i = 0;
        int round=0;
        int max1 =5;
        int max2 =3;
        int min = 1;


        Scanner Input = new Scanner(System.in);
        Random rand = new Random();
        Random rand2 = new Random();
        int randomNum = rand.nextInt((max1 - min) + 1) + min;
        int randomNum2 = rand2.nextInt((max2 - min)+1)+ min;


        while(sum >= 3) {

            if(Arrays.equals(StickArray, EmptyArray))
            {

            }

            if((round % 2) == 0) {
                if(Arrays.equals(StickArray, EmptyArray))
                {
                    End2();
                    break;
                }
                //System.out.println("Player 2 Wins!"); (Optional)
                System.out.println("Bot 1, your turn!");
            } else {
                if(Arrays.equals(StickArray, EmptyArray))
                {
                    End1();
                    break;
                }
                //System.out.println("Player one wins"); (Optional)
                System.out.println("Bot 2, your turn!");
            }

            for (i = 0; i != 6; i++) {
                sum2 = sum += StickArray[i];
                System.out.println(StickArray[i]);
            }



            System.out.println("Which row do you want to play? (1,2,3,4,5)");
            Chose1 = randomNum;
            Chose2 = StickArray[Chose1];

            System.out.println("You play in Row: " + ReihenArray[Chose1] + ". Only " + ReihenArray[Chose2] + " Are Available");
            System.out.println("How many would you like to take?");
            if (ReihenArray[Chose2] > 3) {
                System.out.println("Note: YOU CAN ONLY TAKE A MAXIMUM OF 3!");
            }
            Chose2 = randomNum2;

            if (Chose2 >= 4) {
                System.out.println("Can you read?!");
                System.out.println("Quitting...");
                Welcome();
            }
            StickArray[Chose1] -= Chose2;
            System.out.println("In row " + Chose1 + " are now " + StickArray[Chose1] + " left!");

            round++;
        }
    }


}
