package lv.belyaeva.oxana.medical.management.system.oodp.structural.adapter;

public class AdapterPatientToDatabase extends PatientApplication implements Database {
    @Override
    public void insert() {
        savePatient();
    }

    @Override
    public void update() {
        updatePatient();
    }

    @Override
    public void load() {
        loadPatient();
    }

    @Override
    public void delete() {
        deletePatient();
    }
}
