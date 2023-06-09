package lv.belyaeva.oxana.medical.management.system.oodp.creational.factory;

public class PatientAdultFactory implements PatientFactory {

    @Override
    public Patient createPatient() {
        return new PatientAdult();
    }
}
