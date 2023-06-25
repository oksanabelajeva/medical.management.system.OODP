package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.visitor;

public interface MedicalWorker {

    void analyze(DiseaseHistory diseaseHistory);
    void analyze(BloodTestsHistory bloodTestsHistory);
    void analyze(AssignedTreatment assignedTreatment);
}
