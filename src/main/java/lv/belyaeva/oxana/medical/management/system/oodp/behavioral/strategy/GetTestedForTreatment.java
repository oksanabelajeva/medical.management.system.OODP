package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.strategy;

public class GetTestedForTreatment implements PatientActivity {
    @Override
    public void activity() {
        System.out.println("The patient is got tested for a treatment.");
    }
}
