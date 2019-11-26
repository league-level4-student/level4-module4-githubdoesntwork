package _04_hospital;

public class Patient {
boolean pulse=false;
boolean hasDoctor=false;
public void checkPulse() {
	pulse=true;
}
public boolean feelsCaredFor() {
	return pulse;
}
public void getDoctor() {
	hasDoctor=true;
}
}
