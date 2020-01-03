package Animals;

public class dogs extends animals {
	String type = "dogs";
	
	
	dogs(){
		
		
		
		
	}
	
	
	dogs(String type , int legs , int eyes , int ears){
		
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
		return "dogs [type=" + type + ", legs=" + legs + ", eyes=" + eyes + ", ears=" + ears + "]";
	}

    
	
	

   	
			
			
			
	
	

}
