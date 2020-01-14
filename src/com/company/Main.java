package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
// a.tippel@micromata.de
        int Matchsticks = 10;
        int MatchsticksInt = 0;
        int Chose = 0;
        int difficulty;
        int OwnAmount;
        int max;
        int min;

        max = 3;
        min = 1;
        OwnAmount = 0;
        difficulty = 0;
        MatchsticksInt = 10;
        Scanner Input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("[!]THE MATCHSTICK GAME[!]");
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("[1] Start new Game");
        System.out.println("[2] How to play this Game");
        System.out.println("[3] Change difficulty");
        Chose = Input.nextInt();

        if (Chose == 1) {
            System.out.println("[1] Singleplayer");
            System.out.println("[2] Multiplayer");
            Chose = Input.nextInt();

            if (Chose == 1) {
                System.out.println("Which row do you want to play? (1,2,3,4,5)");
                Chose = Input.nextInt();
                int[] ReihenArray = {0,1,2,3,4,5};
                int[] StickArray = {0,1,2,3,4,5};
                System.out.println(ReihenArray[Chose]);
                System.out.println("You play in Row: " + ReihenArray[Chose] + " Only " + StickArray[Chose] + " Are Available");
                Chose = Input.nextInt();
                

                while (Matchsticks >= 1) {

                    System.out.println("[+]Player1: Choose an amount of Matchsticks(1-3):");
                    MatchsticksInt = Input.nextInt();
                    Matchsticks = Matchsticks - MatchsticksInt;
                    System.out.println("[+]You took: " + MatchsticksInt + " Matchsticks");
                    System.out.println("[+]There are: " + Matchsticks + " left!");
                    if (Matchsticks <= 0) {
                        System.out.println("[+]Round is over, Player 1 WINS");
                        return;
                    } else
                        System.out.println("[+] Bot: Choose an amount of Matchsticks(1-3):");
                    int randomNum = rand.nextInt((max - min) + 1) + min;
                    MatchsticksInt = randomNum;
                    Matchsticks = Matchsticks - MatchsticksInt;
                    System.out.println("[+]The Bot took: " + MatchsticksInt + " Matchsticks");
                    System.out.println("[+]There are: " + Matchsticks + " left!");
                    if (Matchsticks <= 0) {
                        System.out.println("[+]Round is over, Bot WINS");

                    }
                }
            } else if (Chose == 2) {
                while (Matchsticks >= 1) {


                    System.out.println("[+] Player1: Choose an amount of Matchsticks(1-3):");
                    MatchsticksInt = Input.nextInt();
                    Matchsticks = Matchsticks - MatchsticksInt;
                    System.out.println("[+]You took: " + MatchsticksInt + " Matchsticks");
                    System.out.println("[+]There are: " + Matchsticks + " left!");



                    if (Matchsticks <= 0) {
                        System.out.println("[+]Round is over, Player 1 WINS");
                        return;
                    } else

                        System.out.println("[+]Player2: Choose an amount of Matchsticks(1-3):");
                    MatchsticksInt = Input.nextInt();
                    Matchsticks = Matchsticks - MatchsticksInt;
                    System.out.println("[+]You took: " + MatchsticksInt + " Matchsticks");
                    System.out.println("[+]There are: " + Matchsticks + " left!");

                    if (Matchsticks <= 0) {
                        System.out.println("[+]Round is over, Player 2 WINS");
                        return;
                    }
                }
            }
        } else if (Chose == 2) {
            System.out.println("To win this Game, you have to be the last one who takes the last Matchsticks.");
            System.out.println("But note, that you can only take 3 Matchsticks out only out of the Same Row!");
        } else if (Chose == 3) {

            System.out.println("Which difficulty do you prefer?");
            System.out.println("[1] Easy (10 Sticks)");
            System.out.println("[2] Normal (20 Sticks|Beta version)");
            System.out.println("[3] Hard (30 Sticks|Beta version)");
            System.out.println("[4] Own amount of Sticks");


            Chose = Input.nextInt();

            if (Chose == 1) {
                difficulty = 1;
            } else if (Chose == 2) {
                difficulty = 2;
            } else if (Chose == 3) {
                difficulty = 3;
            } else if (Chose == 4) {
                difficulty = 4;
                System.out.println("How many Sticks would you like to have?");
                OwnAmount = Input.nextInt();
                if (OwnAmount <= 3) {
                    System.out.println("Error, your chose has to be higher than 3!");

                }
            }

        }
        System.out.println("[+] New Game");
        if (difficulty == 1) {
            Matchsticks = 10;
        } else if (difficulty == 2) {
            Matchsticks = 20;
        } else if (difficulty == 3) {
            Matchsticks = 30;
        } else if (difficulty == 4) {
            Matchsticks = OwnAmount;
        }
        while (Matchsticks >= 1) {
            //Only for "graphic" display
                        /*if (Matchsticks == 10) {
                            System.out.println("O O O O O O O O O O");
                            System.out.println("I I I I I I I I I I");
                        } else if (Matchsticks == 9) {
                            System.out.println("O O O O O O O O O ");
                            System.out.println("I I I I I I I I I ");
                        } else if (Matchsticks == 8) {
                            System.out.println("O O O O O O O O ");
                            System.out.println("I I I I I I I I ");
                        } else if (Matchsticks == 7) {
                            System.out.println("O O O O O O O ");
                            System.out.println("I I I I I I I ");
                        } else if (Matchsticks == 6) {
                            System.out.println("O O O O O O");
                            System.out.println("I I I I I I");
                        } else if (Matchsticks == 5) {
                            System.out.println("O O O O O ");
                            System.out.println("I I I I I ");
                        } else if (Matchsticks == 4) {
                            System.out.println("O O O O ");
                            System.out.println("I I I I ");
                        } else if (Matchsticks == 3) {
                            System.out.println("O O O");
                            System.out.println("I I I");
                        } else if (Matchsticks == 2) {
                            System.out.println("O O  ");
                            System.out.println("I I  ");
                        } else if (Matchsticks == 1) {
                            System.out.println("O ");
                            System.out.println("I");
                        }*/

            System.out.println("[+] Player1: Choose an amount of Matchsticks(1-3):");
            MatchsticksInt = Input.nextInt();
            Matchsticks = Matchsticks - MatchsticksInt;
            System.out.println("[+]You took: " + MatchsticksInt + " Matchsticks");
            System.out.println("[+]There are: " + Matchsticks + " left!");

            //Only for "graphic" display
            if (Matchsticks == 10) {
                System.out.println("O O O O O O O O O O");
                System.out.println("I I I I I I I I I I");
            } else if (Matchsticks == 9) {
                System.out.println("O O O O O O O O O ");
                System.out.println("I I I I I I I I I ");
            } else if (Matchsticks == 8) {
                System.out.println("O O O O O O O O ");
                System.out.println("I I I I I I I I ");
            } else if (Matchsticks == 7) {
                System.out.println("O O O O O O O ");
                System.out.println("I I I I I I I ");
            } else if (Matchsticks == 6) {
                System.out.println("O O O O O O");
                System.out.println("I I I I I I");
            } else if (Matchsticks == 5) {
                System.out.println("O O O O O ");
                System.out.println("I I I I I ");
            } else if (Matchsticks == 4) {
                System.out.println("O O O O ");
                System.out.println("I I I I ");
            } else if (Matchsticks == 3) {
                System.out.println("O O O");
                System.out.println("I I I");
            } else if (Matchsticks == 2) {
                System.out.println("O O  ");
                System.out.println("I I  ");
            } else if (Matchsticks == 1) {
                System.out.println("O ");
                System.out.println("I");
            }

            if (Matchsticks <= 0) {
                System.out.println("[+]Round is over, Player 1 WINS");
                return;
            } else

                System.out.println("[+]Player2: Choose an amount of Matchsticks(1-3):");
            MatchsticksInt = Input.nextInt();
            Matchsticks = Matchsticks - MatchsticksInt;
            System.out.println("[+]You took: " + MatchsticksInt + " Matchsticks");
            System.out.println("[+]There are: " + Matchsticks + " left!");

            if (Matchsticks <= 0) {
                System.out.println("[+]Round is over, Player 2 WINS");
                return;

            }

        }
    }
}
