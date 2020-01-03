package Animals;

public class animals {
	
	int legs = 4;
	int eyes = 2;
	int ears = 2;
	
	animals(){
		
		
		
	}
	
	animals(int legs , int eyes , int ears){
		
		this.legs=legs;
		this.eyes=eyes;
		this.ears=ears;
			
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getEars() {
		return ears;
	}

	public void setEars(int ears) {
		this.ears = ears;
	}

	
	@Override
	public String toString() {
		return "animals [legs=" + legs + ", eyes=" + eyes + ", ears=" + ears + "]";
	}
	
	
	
	
	
	
	
	
	

}
