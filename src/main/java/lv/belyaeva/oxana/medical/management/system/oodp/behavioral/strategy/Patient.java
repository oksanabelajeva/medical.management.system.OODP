package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.strategy;

public class Patient {

    PatientActivity patientActivity;

    public void setPatientActivity(PatientActivity patientActivity) {
        this.patientActivity = patientActivity;
    }

    public void executeActivity(){
        patientActivity.activity();
    }
}
