package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.visitor;

public class AssignedTreatment implements TreatmentElement {

    @Override
    public void treatPatient(MedicalWorker medicalWorker) {
        medicalWorker.analyze(this);
    }
}
