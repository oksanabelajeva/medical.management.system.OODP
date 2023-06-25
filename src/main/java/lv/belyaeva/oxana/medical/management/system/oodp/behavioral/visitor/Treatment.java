package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.visitor;

import java.util.List;

public class Treatment implements TreatmentElement {

    TreatmentElement[] treatmentElementList;

    public Treatment() {
        this.treatmentElementList = new TreatmentElement[]{
                new DiseaseHistory(),
                new BloodTestsHistory(),
                new AssignedTreatment()
        };
    }

    @Override
    public void treatPatient(MedicalWorker medicalWorker) {
        for (TreatmentElement treatmentElement : treatmentElementList) {
            treatmentElement.treatPatient(medicalWorker);
        }
    }
}
