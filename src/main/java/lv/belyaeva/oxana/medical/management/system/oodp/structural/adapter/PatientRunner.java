package lv.belyaeva.oxana.medical.management.system.oodp.structural.adapter;

public class PatientRunner {
    public static void main(String[] args) {
        Database database = new AdapterPatientToDatabase();

        database.insert();
        database.update();
        database.load();
        database.delete();
    }
}
