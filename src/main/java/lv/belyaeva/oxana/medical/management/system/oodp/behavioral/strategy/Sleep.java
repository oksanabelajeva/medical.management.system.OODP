package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.strategy;

public class Sleep implements PatientActivity {
    @Override
    public void activity() {
        System.out.println("The patient sleeps.");
    }
}
