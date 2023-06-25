package lv.belyaeva.oxana.medical.management.system.oodp.creational.singleton;

public class MedicineLogger {

    private static MedicineLogger medicineLogger;
    private static String log = "\nThis is a log file. \n\n";

    public static synchronized MedicineLogger getMedicineLogger() {
        if (medicineLogger == null) {
            medicineLogger = new MedicineLogger();
        }
        return medicineLogger;
    }

    public MedicineLogger() {
    }

    public void addLogInfo(String logInfo) {
        log += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(log);
    }
}
