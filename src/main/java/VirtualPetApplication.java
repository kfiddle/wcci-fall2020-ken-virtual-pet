import java.util.Scanner;

public class VirtualPetApplication {

    static void space(){
       for (int i = 0; i < 4; i++)
         System.out.println();
    }
    static void displayTime(int tick) {
        String[] times = new String[]{"noon", "2:00", "4:00", "6:00", "8:00", "10:00", "midnight"};
        System.out.println("                                " + times[tick]);

    }

    static int validInteger(Scanner input, int range) {
        int response = 0;
        while (!input.hasNextInt()) {
            System.out.println("come on now...just a number.");
            input = new Scanner(System.in);
        }
        response = input.nextInt();

        while (response > range) {
            System.out.println("nice try. That's not an option I can deal with.");
            response = input.nextInt();
        }
        return response;
    }


    static String capitalize(String name) {
        String firstLetter = name.substring(0, 1);
        String remainder = name.substring(1);

        String caps = firstLetter.toUpperCase();
        String remainderToLower = remainder.toLowerCase();
        String capitalizedName = caps + remainderToLower;

        return capitalizedName;
    }

    static String possessiveVersion(String name) {
        String possessive = "";
        if (name.charAt(name.length() - 1) != 's') {
            possessive = name + "'s";
        } else {
            possessive = name + "'";
        }
        return possessive;
    }

    public static void introAndVariableSet(VirtualPet pet) {

        Scanner input = new Scanner(System.in);

        space();
        System.out.println("Hello! I'm guessing you'd like to play a game. We begin on a random day, at noon. \n" +
                "You're an old cat lady, and although you live alone with your cat, you will be entertaining company\n" +
                "tonight. Your goal is to end the day at midnight, with your house intact, and your cat happy. First,\n" +
                "please offer a name for your cat.");
        space();
        String inputName = input.nextLine();
        String officialName = capitalize(inputName);
        pet.setName(officialName);
        String namePossessive = possessiveVersion(officialName);

        space();
        System.out.println("Thank you! I do hope " + pet.name + " will be content come midnight, when our day concludes.\n" +
                "In the meantime, I also need " + namePossessive + " age. As I'm sure you've noticed, cats of varying ages \n" +
                "have very, very different needs!");


        while (true) {
            if (!input.hasNextInt()) {
                System.out.println("Really? Just give me a number.");
                input = new Scanner(System.in);
            } else {
                int age = input.nextInt();
                if (age > 0) {
                    pet.setAge(age);
                    break;
                } else {
                    System.out.println("Funny. Try again.");
                }
            }
        }

        System.out.println(" Okey-dokey. We will revisit the situation with " + pet.name + " every two hours as the day \n" +
                "unfolds. You will be asked to make decisions which affect " + namePossessive + " well-being as you \n" +
                "prepare for your party. Good luck! Keep your eye on " + namePossessive + " vital \n" +
                "statistics. Don't let " + pet.name + " get too hungry, thirsty, or anxious. The game ends at midnight, \n" +
                "at which time I hope all is well. Shall we begin? 'yes' or 'no'?");
        input = new Scanner(System.in);

        while (true) {
            String reply = (input.nextLine().toLowerCase());

            if (reply.equals("yes")) {
                break;
            }
            if (reply.toLowerCase().equals("no")) {
                System.out.println("Too bad. Have it your way.");
                System.exit(0);
            } else {
                System.out.println("I didn't quite catch that. 'yes' or 'no' please.");
            }
        }
        System.out.println();
        System.out.println("moving on then.");
    }


    public static void displayStory(int tick, String name) {
        String[] storyLineMessages = new String[]

                {"And so we begin this afternoon. " +                                               //noon question
                        " Choose what " + name + " is to do. \n" +
                        " 1. eat. \n" +
                        " 2. let " + name + " sleep some more.\n" +
                        " 3. Play with a toy",
                        "You're probably getting nervous. After all, sooner or later,\n" +                   //2:00
                                "you'll have to start getting ready for the party. In the meantime,\n" +
                                " 1. feed " + name + ". \n" +
                                " 2. let " + name + " sleep some more.\n" +
                                " 3. Play with a toy",
                        "People will begin showing up shortly. Maybe you should consider vacuuming,\n" +      //4:00
                                "which cats hate of course. It's up to you.\n" +
                                " 1. feed " + name + ". \n" +
                                " 2. let " + name + " sleep some more.\n" +
                                " 3. Play with a toy\n" +
                                " 4. Let " + name + " outside for a minute or two to catch mice.\n" +
                                " 5. vacuum.",
                        "So far so good. The day gets busier. I hope you're ready for guests.\n" +            //6:00
                                " 1. eat food. \n" +
                                " 2. let " + name + " sleep some more.\n" +
                                " 3. Play with a toy\n" +
                                " 4. Let " + name + " outside for a minute or two to catch mice.\n" +
                                " 5. vacuum.\n" +
                                " 6. start drinking",
                        "And now, your first few guests arrive." + name + " hates crowds!\n" +                //8:00
                                " 1. feed " + name + ". \n" +
                                " 2. let " + name + " sleep some more.\n" +
                                " 3. Play with a toy\n" +
                                " 4. Let " + name + " outside for a minute or two to catch mice.\n" +
                                " 5. vacuum.\n" +
                                " 6. start drinking\n" +
                                " 7. pet " + name + ". ",
                        "I hope you're more sober than your guests; it's not classy to be otherwise.\n" +    //10:00
                                " Don't forget about " + name + ". You may now...\n" +
                                " 1. feed " + name + ". \n" +
                                " 2. let " + name + " sleep some more.\n" +
                                " 3. Play with a toy\n" +
                                " 4. Let " + name + " outside for a minute or two to catch mice.\n" +
                                " 5. Introduce " + name + " to your guests!\n" +
                                " 6. continue imbibing\n " +
                                " 7. Leave your guests momentarily to ease your cat's anxiety.",
                        "And now, your party concludes. Let's see how your cat has fared..."               //last story message
                 };
        System.out.println(storyLineMessages[tick]);

    }

    public static void feedPet(VirtualPet pet) {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to feed " + pet.name + "?\n" +
                "1. dry food\n" +
                "2. wet food\n" +
                "3. a treat\n"+
                "Be careful though. Cats tend to barf when they overeat.");
        int option = validInteger(input, 3);
        System.out.println("How many servings would you like to give? Let's not give more than ten.");
        int servings = validInteger(input, 10);

        if (option == 1) {
            pet.feedDryFood(servings);
        } else if (option == 2) {
            pet.feedWetFood(servings);
        } else {
            pet.feedTreat(servings);
        }

    }


    public static void menu(int tick, VirtualPet pet, int option) {

        if (option == 1) {
            feedPet(pet);
        } else if (option == 2) {
            pet.sleep();
        } else if (option == 3) {
            pet.play();
        } else if (option == 4) {
            pet.hunt();
        } else if (option == 5) {
            pet.vacuumFear();
        } else if (option == 6) {

            System.out.println(" Excellent choice. Of course, it doesn't help your cat");
        } else if (option == 7) {
            pet.stroke();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        VirtualPet pet = new VirtualPet();
        introAndVariableSet(pet);
        Scanner input = new Scanner(System.in);
        int tick = 0;

        //the main loop

        while (tick <= 6) {
            space();
            displayTime(tick);
            pet.showPet();
            displayStory(tick, pet.name);

            int option = 0;
            if (tick < 2) {
                option = validInteger(input, 3);
            } else if (tick < 6) {
                option = validInteger(input, 7);
            }
            menu(tick, pet, option);

            tick++;
            pet.addHunger(5);
            pet.addFatigue(5);
            pet.addThirst(5);

        }

        // the final statement to user after the game loop has ended

        String finalMessages[] = {"Excellent! Your guests might be bored, but you have a happy cat.",
                "Not bad!" + pet.name + " isn't thrilled, but you will survive tonight,",
                "Yikes. I'd suggest you not try to sleep in your own bed tonight."};


        if (pet.getHunger() + pet.getThirst() + pet.getVigilance() < 20 && pet.vcount == 0) {
            System.out.println(finalMessages[0]);
        } else if (pet.getHunger() + pet.getThirst() + pet.getVigilance() < 40 && pet.vcount == 0) {
            System.out.println(finalMessages[1]);
        } else if (pet.vcount > 0 || pet.getHunger() + pet.getThirst() + pet.getVigilance() > 41 ) {
            System.out.println(finalMessages[2]);
        }
    }

}

