public class VirtualPet {
    public String name;
    public int age;
    public  int vcount = 0;
    private int hunger = 30;
    private int thirst = 25;
    private int vigilance = 20;
    private int fatigue = 10;
    private int huntDesire = 20;


// getters


    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getVigilance() {
        return vigilance;
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getHuntDesire() {
        return huntDesire;
    }



    //setters. Two setters for the user, who will provide the name of the cat, and the cat's age.

    //the age of the cat will determine all other instance variables.
    //other setters will change variables in the main game loop

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

        if (age >= 100) {
            System.out.print("Wow! Not too shabby.");
            hunger = 6;
            thirst = 20;
            vigilance = 5;
            fatigue = 25;
            huntDesire = 0;


        } else if (age >= 50) {
            System.out.print("Middle-age. A tragic time.");
            hunger = 10;
            thirst = 15;
            vigilance = 15;
            fatigue = 15;
            huntDesire = 5;


        } else if (age >= 10) {
            System.out.print("An age of wisdom in a cat.");
            hunger = 10;
            thirst = 15;
            vigilance = 15;
            fatigue = 10;
            huntDesire = 10;


        } else if (age >= 4) {
            System.out.print("Still healthy. A good choice.");
            hunger = 15;
            thirst = 15;
            vigilance = 20;
            fatigue = 10;
            huntDesire = 15;


        } else {
            System.out.print("Young! You'll have your work cut out for you.");
            hunger = 20;
            thirst = 20;
            vigilance = 15;
            fatigue = 0;
            huntDesire = 20;

        }
    }

        public void addHunger(int i) {
            hunger += i;
        }
        public void addFatigue(int i){
            fatigue += i;
        }
        public void addThirst(int i) {
            thirst += i;
        }





    // the display of the cat's vital stats

    public void showPet() throws InterruptedException {
        System.out.println();
        System.out.println("hunger : " + hunger);
        System.out.println("thirst : " + thirst);
        System.out.println("vigilance : " + vigilance);
        System.out.println("fatigue : " + fatigue);
        System.out.println("Desire to Hunt : " + huntDesire);
        System.out.println();
        if (hunger > 25){
            System.out.println(name + " is about to starve!");
            angryCat();
        } else if (hunger > 15){
            System.out.println((name + " is looking a little hungry and frustrated."));
            angryCat();
        } else if (hunger < 5) {
            System.out.println(name + " just yarfed a lot of food.");
            vomit();
            vcount ++;
        } else {
            happyCat();
        }

    }

    // Things user will need to do for the pet
    // basic feeding, which affects the variables for hunger, fatigue, thirst, and vigilance.
    // feed either wet food, dry food, or a treat. Each of these call the feeding method
    //


    public void feed(int i) {
        hunger = hunger - i;
        vigilance -= (3 * i);
        fatigue += i;
    }

    public void feedDryFood(int i) {
        feed(i);
        thirst += 2;
    }

    public void feedWetFood(int i) {
        feed(i * 3);
        thirst -=5;
    }

    public void feedTreat(int i) {
        feed(i * 2);
        vigilance -= 10;
    }

    public void stroke() {
        vigilance -= 15;
    }



    public void hunt() {
        if (age > 10){
            System.out.println(name + " is getting a bit old for this!");
            hunger -= 5;
            fatigue += 10;
        } else if (age > 5) {
            hunger -= 10;
            huntDesire -= 10;
        } else {
            hunger -=20;
            huntDesire -= 25;
            vigilance -= 10;
            fatigue += 10;
        }


    }

    public void play() {
        if (age > 10) {
            System.out.println( name + " isn't as into this as a few years ago, but ok.");
            fatigue += 10;
            vigilance -= 10;
            huntDesire -= 5;

        } else if (age > 5) {
            fatigue += 5;
            vigilance -= 15;
            huntDesire -= 10;

        } else {
            System.out.println("Wise choice for a young one!");
            fatigue += 10;
            vigilance -= 10;
            huntDesire -= 10;
        }
    }


    public void vomit() throws InterruptedException {
        hunger += 10;
        fatigue += 10;
        vigilance -= 10;
        barfingCat();
    }
    public void sleep() {
        hunger += 5;
        fatigue -= 10;
    }

    public void vacuumFear(){
        vigilance += 30;

    }


    public void happyCat() {

        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' (O)               (O)  '              ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("               -      Y            (''''')       ");
        System.out.println("                '___________'    |     |       ");
        System.out.println("                 {         }     /     /        ");
        System.out.println("                   --   --             ;        ");
        System.out.println("               /      --               ;        ");
        System.out.println("             /                        ;         ");
        System.out.println("            |                        /          ");
        System.out.println("             ;                     ;            ");
        System.out.println("          (''''')          (''''')              ");
    }

    public void angryCat(){

        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' \\\\\\\\           //////  '          ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("                                                ");
        System.out.println("                '    XX     '                   ");
        System.out.println("                    v^v^v                       ");
        System.out.println("                  --     --                     ");
        System.out.println("               /           \\                   ");
        System.out.println("                |           |                   ");
        System.out.println("                 |         |                    ");
        System.out.println("             ;               ;                  ");
        System.out.println("          (|'|'|'|')    (|'|'|'|')              ");

    }

    public void barfingCat() throws InterruptedException {


        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' \\\\\\\\           //////  '          ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("                                                ");
        System.out.println("                '    XX     '                   ");
        System.out.println("                    v^v^v                       ");
        System.out.println("                  --     --                     ");
        System.out.println("               /           \\                   ");
        System.out.println("                |           |                   ");
        System.out.println("                 |         |                    ");
        System.out.println("             ;               ;                  ");
        System.out.println("          (|'|'|'|')    (|'|'|'|')              ");

        Thread.sleep(3000);

        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' \\\\\\\\           //////  '          ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("                                                ");
        System.out.println("                '    XX     '                   ");
        System.out.println("                    v^v^v                       ");
        System.out.println("                 v^v^vv^v^v                     ");
        System.out.println("               /           \\                   ");
        System.out.println("                |           |                   ");
        System.out.println("                 |         |                    ");
        System.out.println("             ;               ;                  ");
        System.out.println("          (|'|'|'|')    (|'|'|'|')              ");

        Thread.sleep(400);
        System.out.println();

        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' \\\\\\\\           //////  '          ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("                                                ");
        System.out.println("                '    XX     '                   ");
        System.out.println("                    v^v^v                       ");
        System.out.println("                 v^v^vv^v^v                     ");
        System.out.println("             v^v^v v^v^v v^v^v                  ");
        System.out.println("                |           |                   ");
        System.out.println("                 |         |                    ");
        System.out.println("             ;               ;                  ");
        System.out.println("          (|'|'|'|')    (|'|'|'|')              ");

        Thread.sleep(100);

        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' \\\\\\\\           //////  '          ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("                                                ");
        System.out.println("                '    XX     '                   ");
        System.out.println("                    v^v^v                       ");
        System.out.println("                 v^v^vv^v^v                     ");
        System.out.println("             v^v^v v^v^v v^v^v                  ");
        System.out.println("           v^v^vv^v^v v^v^vv^v^v                ");
        System.out.println("                 |         |                    ");
        System.out.println("             ;               ;                  ");
        System.out.println("          (|'|'|'|')    (|'|'|'|')              ");

        Thread.sleep(100);

        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' \\\\\\\\           //////  '          ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("                                                ");
        System.out.println("                '    XX     '                   ");
        System.out.println("                    v^v^v                       ");
        System.out.println("                 v^v^vv^v^v                     ");
        System.out.println("             ^v^v v^v^v v^v^v                   ");
        System.out.println("           v^v^vv^v^v v^v^vv^v^v                ");
        System.out.println("         v^v^v v^v^v v^v^vv^v^v v^v^            ");
        System.out.println("             ;               ;                  ");
        System.out.println("          (|'|'|'|')    (|'|'|'|')              ");

        Thread.sleep(100);

        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' \\\\\\\\           //////  '          ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("                                                ");
        System.out.println("                '    XX     '                   ");
        System.out.println("                    v^v^v                       ");
        System.out.println("                 v^v^vv^v^v                     ");
        System.out.println("             ^v^v v^v^v v^v^v                   ");
        System.out.println("           v^v^vv^v^v v^v^vv^v^v                ");
        System.out.println("         v^v^v v^v^v v^v^vv^v^v v^v^            ");
        System.out.println("       ^v^v v^v^v v^v^v ^v^v v^v^v v^v^v        ");
        System.out.println("          (|'|'|'|')    (|'|'|'|')              ");

        Thread.sleep(100);

        System.out.println("                                                ");
        System.out.println("           ^                 ^                  ");
        System.out.println("          / \\               / \\               ");
        System.out.println("         /  '' .-   ''''  -.   \\               ");
        System.out.println("        ;                        ;              ");
        System.out.println("           _                 _                  ");
        System.out.println("        ' \\\\\\\\\\\\     ////////  '          ");
        System.out.println("         ;                       ;              ");
        System.out.println("             =              =                   ");
        System.out.println("                                                ");
        System.out.println("                '    XX     '                   ");
        System.out.println("                    v^v^v                       ");
        System.out.println("                 v^v^vv^v^v                     ");
        System.out.println("             ^v^v v^v^v v^v^v                   ");
        System.out.println("           v^v^vv^v^v v^v^vv^v^v                ");
        System.out.println("         v^v^v v^v^v v^v^vv^v^v v^v^            ");
        System.out.println("       ^v^v v^v^v v^v^v ^v^v v^v^v v^v^v        ");
        System.out.println("     ^v^v^v v^v^v v^v^v ^v^v v^v^v v^v^v^v^v    ");
    }

}
