package Animals;

public class cats extends animals {

	String type = "cats";
	
	cats(){
		
		
	
	}
	
	cats(String type){
		this.type=type;
		
		
	}
	
	
	
	cats(int legs , int eyes , int ears , String type){
		
		super(legs,eyes,ears);
		this.type=type;
		
	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "cats [type=" + type + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	
	
	
}
