package lv.belyaeva.oxana.medical.management.system.oodp.creational.factory;

public class PatientApplication {

    public static void main(String[] args) {
        PatientFactory patientFactory = createPatientByAge(150);
        Patient patient = patientFactory.createPatient();
        patient.informAboutMedicineDose();
    }

    static PatientFactory createPatientByAge(int age) {
        if (age >= 0 && age < 18) {
            return new PatientChildFactory();
        } else if (age >= 18 && age < 150){
            return new PatientAdultFactory();
        } else {
            throw new RuntimeException("You entered age: " + age
                    + ". Please enter age equals or more than 0 and less than 150 years.");
        }
    }
}
