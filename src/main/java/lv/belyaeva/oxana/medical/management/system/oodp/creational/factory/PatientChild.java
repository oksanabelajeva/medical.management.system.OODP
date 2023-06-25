package lv.belyaeva.oxana.medical.management.system.oodp.creational.factory;

public class PatientChild implements Patient {

    @Override
    public void informAboutMedicineDose() {
        System.out.println("A child should take a half of a standard dose of the medicine.");
    }
}
