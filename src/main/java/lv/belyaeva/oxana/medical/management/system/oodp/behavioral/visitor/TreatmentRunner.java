package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.visitor;

public class TreatmentRunner {
    public static void main(String[] args) {
        Treatment treatment = new Treatment();

        MedicalWorker intern = new Intern();
        MedicalWorker doctor = new Doctor();

        System.out.println("Intern:");
        treatment.treatPatient(intern);
        System.out.println();

        System.out.println("Doctor:");
        treatment.treatPatient(doctor);
    }
}
