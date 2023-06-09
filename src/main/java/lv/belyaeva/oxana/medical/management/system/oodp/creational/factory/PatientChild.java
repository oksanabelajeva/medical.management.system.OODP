package lv.belyaeva.oxana.medical.management.system.oodp.creational.factory;

public class PatientChild implements Patient {

    @Override
    public void informAboutMedicineDose() {
        System.out.println("Child should take a half of standard dose of the medicine.");
    }
}
