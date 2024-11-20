public class Dentist extends HealthProfessional {
    private boolean hasOrthodonticsCertification;

    public Dentist() {
        super();
        this.hasOrthodonticsCertification = false;
    }

    public Dentist(int id, String name, String specialization, boolean hasOrthodonticsCertification) {
        super(id, name, specialization);
        this.hasOrthodonticsCertification = hasOrthodonticsCertification;
    }

    @Override
    public void displayInfo() {
        System.out.println("The health professional details are:");
        super.displayInfo();
        System.out.println("Type: Dentist");
        System.out.println("Orthodontics Certification: " + (hasOrthodonticsCertification ? "Yes" : "No"));
    }

    public boolean hasOrthodonticsCertification() {
        return hasOrthodonticsCertification;
    }

    public void setHasOrthodonticsCertification(boolean hasOrthodonticsCertification) {
        this.hasOrthodonticsCertification = hasOrthodonticsCertification;
    }
}

