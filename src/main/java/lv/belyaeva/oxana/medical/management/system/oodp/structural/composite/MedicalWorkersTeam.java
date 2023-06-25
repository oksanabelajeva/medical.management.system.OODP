package lv.belyaeva.oxana.medical.management.system.oodp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MedicalWorkersTeam {
    private List<MedicalWorker> medicalWorkersTeam = new ArrayList<>();

    public void addDoctor(MedicalWorker medicalWorker) {
        medicalWorkersTeam.add(medicalWorker);
    }

    public void deleteDoctor(MedicalWorker medicalWorker) {
        medicalWorkersTeam.remove(medicalWorker);
    }

    public void treatPatient() {
        System.out.println("All team of medical workers treats the patient.");
        for (MedicalWorker medicalWorker : medicalWorkersTeam
        ) {
            medicalWorker.treatPatient();
        }
    }
}
