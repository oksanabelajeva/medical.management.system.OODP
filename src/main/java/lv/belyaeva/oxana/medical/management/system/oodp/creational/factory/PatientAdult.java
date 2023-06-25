package lv.belyaeva.oxana.medical.management.system.oodp.creational.factory;

public class PatientAdult implements Patient {

    @Override
    public void informAboutMedicineDose() {
        System.out.println("An adult should take a standard dose of the medicine.");
    }
}
