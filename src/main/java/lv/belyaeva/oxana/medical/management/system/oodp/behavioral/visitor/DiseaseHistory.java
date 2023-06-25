package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.visitor;

public class DiseaseHistory implements TreatmentElement {

    @Override
    public void treatPatient(MedicalWorker medicalWorker) {
        medicalWorker.analyze(this);
    }
}
