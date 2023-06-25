package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.visitor;

public class Doctor implements MedicalWorker {
    @Override
    public void analyze(DiseaseHistory diseaseHistory) {
        System.out.println("The doctor is analyzing disease history answering the intern's questions.");
    }

    @Override
    public void analyze(BloodTestsHistory bloodTestsHistory) {
        System.out.println("The doctor is analyzing blood tests history explaining the mistakes to the intern.");
    }

    @Override
    public void analyze(AssignedTreatment assignedTreatment) {
        System.out.println("The doctor is analyzing an assigned treatment.");
    }
}
