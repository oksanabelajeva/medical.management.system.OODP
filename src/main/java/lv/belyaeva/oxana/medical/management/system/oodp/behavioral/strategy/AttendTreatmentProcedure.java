package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.strategy;

public class AttendTreatmentProcedure implements PatientActivity {
    @Override
    public void activity() {
        System.out.println("The patient attends a treatment procedure.");
    }
}
