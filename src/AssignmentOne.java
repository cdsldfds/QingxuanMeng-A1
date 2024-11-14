import java.util.ArrayList;

public class AssignmentOne {

    // Collection of appointments (final because the reference will not change)
    private static final ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3  Using classes and objects");

        // Create instances of GeneralPractitioner and Dentist
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John Smith", "General Practitioner", "Downtown Clinic");
        Dentist dentist1 = new Dentist(2, "Dr. Sarah White", "Dentist", true);

        // Create appointments and add them to the appointments list
        createAppointment("Alice Johnson", "1234", "08:00", gp1);
        createAppointment("Bob Williams", "5678", "10:30", gp1);
        createAppointment("Carol Adams", "7890", "14:00", dentist1);
        createAppointment("David Brown", "2468", "16:30", dentist1);

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5  Collection of appointments");

        
        printExistingAppointments();
        System.out.println("------------------------------");

        // Cancel one of the existing appointments
        cancelBooking("555-1234");

        System.out.println("------------------------------");

        // Print existing appointments again to show the updated list
        printExistingAppointments();
    }

    // Method to create a new appointment and add it to the collection
    public static void createAppointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        // Validate that all necessary fields are provided
        if (patientName != null && !patientName.isEmpty() && patientMobile != null && !patientMobile.isEmpty() 
                && timeSlot != null && !timeSlot.isEmpty() && doctor != null) {
            Appointment appointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
            appointments.add(appointment);
            System.out.println("Appointment created successfully for " + patientName + " with " + doctor.getClass().getSimpleName());
        } else {
            System.out.println("Error: All appointment details are required to create a new appointment.");
        }
    }

    // Method to print existing appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment appointment : appointments) {
                appointment.displayAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Method to cancel an appointment by patient's mobile phone
    public static void cancelBooking(String patientMobile) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointments.remove(appointment);
                System.out.println("Appointment for mobile " + patientMobile + " has been canceled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found for mobile " + patientMobile + ".");
        }
    }
}
