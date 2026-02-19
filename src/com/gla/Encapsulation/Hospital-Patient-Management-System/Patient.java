 /**
 * Abstract base class representing a patient.
 */
abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive medical data (encapsulated)
    private String diagnosis;

    public Patient(int patientId, String name, int age) {
        setPatientId(patientId);
        setName(name);
        setAge(age);
    }

    // -------- Encapsulation with validation --------

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        if (patientId <= 0)
            throw new IllegalArgumentException("Invalid patient ID");
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Invalid name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0)
            throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    // -------- Abstract behaviour --------
    public abstract double calculateBill();

    // -------- Concrete behaviour --------
    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }
}