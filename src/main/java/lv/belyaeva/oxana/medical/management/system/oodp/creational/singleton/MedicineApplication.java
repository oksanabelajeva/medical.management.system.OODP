package lv.belyaeva.oxana.medical.management.system.oodp.creational.singleton;

public class MedicineApplication {

    public static void main(String[] args) {
        MedicineLogger.getMedicineLogger().addLogInfo("First log about medicine for a child.");
        System.out.println(MedicineLogger.getMedicineLogger().toString());
        MedicineLogger.getMedicineLogger().addLogInfo("Second log about medicine for an adult.");
        System.out.println(MedicineLogger.getMedicineLogger().toString());

        MedicineLogger.getMedicineLogger().showLogFile();
    }
}
