package lv.belyaeva.oxana.medical.management.system.oodp.creational.singleton;

public class MedicineApplication {

    public static void main(String[] args) {
        MedicineLogger.getMedicineLogger().addLogInfo("The first log about a medicine for a child.");
        System.out.println(MedicineLogger.getMedicineLogger().toString());
        MedicineLogger.getMedicineLogger().addLogInfo("The second log about a medicine for an adult.");
        System.out.println(MedicineLogger.getMedicineLogger().toString());

        MedicineLogger.getMedicineLogger().showLogFile();
    }
}
