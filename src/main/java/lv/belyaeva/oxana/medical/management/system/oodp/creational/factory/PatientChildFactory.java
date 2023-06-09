package lv.belyaeva.oxana.medical.management.system.oodp.creational.factory;

public class PatientChildFactory implements PatientFactory {

    @Override
    public Patient createPatient() {
        return new PatientChild();
    }
}
