package lv.belyaeva.oxana.medical.management.system.oodp.behavioral.strategy;

public class PatientActivityRunner {
    public static void main(String[] args) {
        Patient patient = new Patient();

        patient.setPatientActivity(new GetTestedForTreatment());
        patient.executeActivity();

        patient.setPatientActivity(new AttendTreatmentProcedure());
        patient.executeActivity();

        patient.setPatientActivity(new Sleep());
        patient.executeActivity();
    }
}
