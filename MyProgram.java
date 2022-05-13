import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        //create Scanner Object
        Scanner scanner = new Scanner(System.in);
        
        //create Job objects
        Job wrap = new Job("Gift Wrapper");
        Job make = new Job("Toy Maker");
        Job pack = new Job("Sack Packer");
        Job manager = new Job("Manager");
        
        //create Elf Objects
        Elf elf1 = new Elf("Elvis", wrap);
        Elf elf2 = new Elf("Thranduelf", manager);
        Elf elf3 = new Elf("Elfrond", make);
        Elf elf4 = new Elf("Casserole", pack);
        Elf elf5 = new Elf("Galadrielf", wrap);
        Elf elf6 = new Elf("Gandelf", make);
        Elf elf7 = new Elf("Bernard", pack);
        Elf elf8 = new Elf("Legolas", wrap);
        Elf elf9 = new Elf("Dobby", pack);
        Elf elf10 = new Elf("Elfis", make);
        
        //Introduction
        System.out.println("Santa has hired you to monitor his new hires.");
        System.out.println("Your job is to decide whether his new elves are fit for the job.");
        System.out.println("Here are the new guys:");
        System.out.println();
        
        //Introduce Elves
        System.out.println(elf1.toString());
        System.out.println(elf2.toString());
        System.out.println(elf3.toString());
        System.out.println(elf4.toString());
        System.out.println(elf5.toString());
        System.out.println(elf6.toString());
        System.out.println(elf7.toString());
        System.out.println(elf8.toString());
        System.out.println(elf9.toString());
        System.out.println(elf10.toString());
        System.out.println();
        scanner.nextLine();
        
        //Use random numbers to determine what gifts are
        int gfts = (int)(Math.random() * (150 - 50 + 1) + 50);
        while (Gift.getNumGifts() <= gfts){
            int gftType = (int)(Math.random() * (3 - 1 + 1) + 1);
            String type = "";
            if (gftType == 1){
                type = "Bike";
            }
            else if(gftType == 2){
                type = "Doll";
            }
            else{
                type = "Nerf Gun";
            }
            
            //Create certain Gift objects
            Gift gift = new Gift(type);
            System.out.println(gift.toString());
        }
        
        System.out.println();
        scanner.nextLine();
        
        //Print Gift Totals
        System.out.println("There was " + Gift.getNumGifts() + " gifts made today.");
        System.out.println("Bikes: " + Gift.getBikeNum());
        System.out.println("Dolls: " + Gift.getDollNum());
        System.out.println("Nerf Guns: " + Gift.getNerfNum());
        System.out.println();
        
        //User answers some questions
        System.out.println("Do you think that Santa made some good hires? (y/n)");
        String idk = scanner.nextLine();
        if (idk.equals("n")){
            System.out.println("What would you do differently?");
            String ohWell = scanner.nextLine();
            System.out.println("Your advice is noted.\nThank You!");
        }
        else{
            System.out.println("Thank You!");
        }
    }
}