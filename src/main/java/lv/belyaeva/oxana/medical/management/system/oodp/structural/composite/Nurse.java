package lv.belyaeva.oxana.medical.management.system.oodp.structural.composite;

public class Nurse implements MedicalWorker {
    @Override
    public void treatPatient() {
        System.out.println("A nurse helps the doctor to treat the patient.");

    }
}
