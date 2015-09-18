package springAOP.Tutorials;

public class PerformerImpl implements Performer{
	
	public void doSmth() { 
        System.out.println(print()); 
    } 
    public String print(){ 
        return "Performer is working..."; 
    } 
}
