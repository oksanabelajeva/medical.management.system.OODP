package lv.belyaeva.oxana.medical.management.system.oodp.structural.composite;

public class Hospital {
    public static void main(String[] args) {
        MedicalWorkersTeam medicalWorkersTeam = new MedicalWorkersTeam();

        MedicalWorker surgeon = new Doctor();
        MedicalWorker therapist = new Doctor();
        MedicalWorker nurse = new Nurse();

        medicalWorkersTeam.addDoctor(surgeon);
        medicalWorkersTeam.addDoctor(therapist);
        medicalWorkersTeam.addDoctor(nurse);

        medicalWorkersTeam.treatPatient();

        medicalWorkersTeam.deleteDoctor(therapist);
        medicalWorkersTeam.treatPatient();
    }
}
