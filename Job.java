public class Job {
    
    private String title;
    private double pay;
    
    //Constructor
    public Job(String title){
        this.title = title;
    }
    
    //Getter (Title)
    public String getTitle(){
        return title;
    }
    
    //Setter (Title)
    public void setTitle(String title){
        this.title = title;
    }
    
    //Getter (pay)
    public double getPay(){
        if (title.equals("Toy Maker")){
            pay = 15.75;
        }
        else if (title.equals("Gift Wrapper")){
            pay = 12.25;
        }
        else if (title.equals("Sack Packer")){
            pay = 10.0;
        }
        else{
            pay = 15.50;
        }
        return pay;
    }
}