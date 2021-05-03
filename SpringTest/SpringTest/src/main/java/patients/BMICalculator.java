package patients;

public class BMICalculator {
	
	private Patient[] patients;

	public Patient[] getPatients() {
		return patients;
	}

	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}
	
	double calculateBMI(double weight, double height) {
		
		double bmi = (weight/(height*height))*703;
		return bmi;
		
		
	}
}
