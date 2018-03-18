
public class CalculatingMass {
	private double mass;
	
// constructor
	public CalculatingMass(double earthWeight) {
		mass = earthWeight/9.8;
	}
//getter
	public double getMass() {
		return mass;
	}
//setter
	public void setMass(double mass) {
		this.mass = mass;
	}
	
}
