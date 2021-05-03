package patients;

public class Patient {
	
	private int patientId;
	private String patientName;
	private double patientHeight;
	private double patientWeight;
	BMICalculator b;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public double getPatientHeight() {
		return patientHeight;
	}
	public void setPatientHeight(double patientHeight) {
		this.patientHeight = patientHeight;
	}
	public double getPatientWeight() {
		return patientWeight;
	}
	public void setPatientWeight(double patientweight) {
		this.patientWeight = patientweight;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(b.calculateBMI(patientHeight, patientHeight));;
		
	}
	
	
}
