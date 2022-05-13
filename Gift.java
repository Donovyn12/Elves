public class Gift {
    
    private String type;
    private boolean wrapped;
    private boolean inBag;
    private static int numGifts = 0;
    private static int bikeNum = 0;
    private static int dollNum = 0;
    private static int nerfNum = 0;
    
    //Constructor
    public Gift(String type){
        this.type = type;
        wrapped = true;
        inBag = true;
        numGifts++;
        
        if (type.equals("Bike")){
            bikeNum++;
        }
        else if(type.equals("Doll")){
            dollNum++;
        }
        else{
            nerfNum++;
        }
    }
    
    //Set Type
    public void setType(String type){
        this.type = type;}
        
    // get Type
    public String getType(){
        return type;
    }
    
    //set wrapped
    public void setWrapped(boolean wrapped){
        this.wrapped = wrapped;
    }
    
    //get Wrapped
    public boolean getWrapped(){
        return wrapped;
    }
    
    //set inBag
    public void setInBag(boolean inBag){
        this.inBag = inBag;
    }
    
    //get inBag
    public boolean getInBag(){
        return inBag;
    }
    
    //Get numGifts
    public static int getNumGifts(){
        return numGifts;
    }
    
    //Get bikeNum
    public static int getBikeNum(){
        return bikeNum;
    }
    
    //get dollNum
    public static int getDollNum(){
        return dollNum;
    }
    
    //get nerf gun amount
    public static int getNerfNum(){
        return nerfNum;
    }
    
    //Print Gift
    public String toString(){
        return "A " + type + " has been wrapped and put in Santa's bag.";
    }
}