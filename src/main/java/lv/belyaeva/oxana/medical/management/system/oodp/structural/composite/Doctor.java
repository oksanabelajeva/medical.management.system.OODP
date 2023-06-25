package lv.belyaeva.oxana.medical.management.system.oodp.structural.composite;

public class Doctor implements MedicalWorker {
    @Override
    public void treatPatient() {
        System.out.println("A doctor treats the patient.");
    }
}
