package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.visitor;

public class Intern implements MedicalWorker {
    @Override
    public void analyze(DiseaseHistory diseaseHistory) {
        System.out.println("Intern is analyzing disease history with many questions.");
    }

    @Override
    public void analyze(BloodTestsHistory bloodTestsHistory) {
        System.out.println("Intern is analyzing blood tests history with many mistakes.");
    }

    @Override
    public void analyze(AssignedTreatment assignedTreatment) {
        System.out.println("Intern is analyzing assigned treatment told by the doctor.");
    }
}
