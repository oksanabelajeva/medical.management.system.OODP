package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.visitor;

public class BloodTestsHistory implements TreatmentElement {

    @Override
    public void treatPatient(MedicalWorker medicalWorker) {
        medicalWorker.analyze(this);
    }
}
