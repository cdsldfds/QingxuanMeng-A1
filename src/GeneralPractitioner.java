public class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;

    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Unknown";
    }

    public GeneralPractitioner(int id, String name, String specialization, String clinicLocation) {
        super(id, name, specialization);
        this.clinicLocation = clinicLocation;
    }

    @Override
    public void displayInfo() {
        System.out.println("The health professional details are:");
        super.displayInfo();
        System.out.println("Type: General Practitioner");
        System.out.println("Clinic Location: " + clinicLocation);
    }

    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }
}

