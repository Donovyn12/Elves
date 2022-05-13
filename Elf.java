public class Elf {
    
    private String name;
    private Job job;
    private double money;
    private static int numElf = 0;
    
    //constructor
    public Elf(String name, Job job){
        this.name = name;
        this.job = job;
        money = 0;
        numElf++;
    }
    
    //set Job
    public void setJob(Job job){
        this.job = job;
    }
    
    //get Name
    public String getName(){
        return name;
    }
    
    //set name
    public void setName(String name){
        this.name = name;
    }
    
    //get money
    public double getMoney(){
        return money;
    }
    
    //set money
    public void moreMoney(int gifts){
        money = job.getPay() * Gift.getNumGifts();
    }
    
    //return numElf
    public static int getNumElf(){
        return numElf;
    }
    
    //Printing elf
    public String toString(){
        return name + " is a " + job.getTitle() + " and makes $" + job.getPay() + " per toy.";
    }
    
}