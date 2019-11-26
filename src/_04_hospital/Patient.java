package _04_hospital;

public class Patient {
boolean pulse=false;
public void checkPulse() {
	pulse=true;
}
public boolean feelsCaredFor() {
	return pulse;
}
}
