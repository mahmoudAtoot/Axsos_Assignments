import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an ID
    public Physician(Integer id) {
        this.id=id;
    }
    // TO DO: Implement HIPAACompliantUser!
	public boolean assignPin(int pin){
        if(String.valueOf(pin).matches("\\d{4}")){//(\\d{4})
            setPin(pin);
            return true;
        }
        return false;
    }

    public boolean accessAuthorized(Integer confirmedAuthID){
        if(getId() == confirmedAuthID){
            return true;
        }
        return false;
    }
    
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
}