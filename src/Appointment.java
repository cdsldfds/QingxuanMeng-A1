public class Appointment {
    
    private String patientName;
    private String patientMobile;

    // Instance variable for the preferred time slot
    private String timeSlot;

    
    private HealthProfessional doctor;

    // Default constructor
    public  Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "Unknown";
        this.timeSlot = "Unknown";
        this.doctor = null;  // No doctor selected by default
    }

    
    public   Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Method to print all instance variables
    public void displayAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        
        if (doctor != null) {
            System.out.println("Doctor Details:");
            doctor.displayInfo();  // Display doctor details
        } else {
            System.out.println("Doctor: Not assigned");
        }
    }

    // Getters and setters (optional, depending on project requirements)
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}
