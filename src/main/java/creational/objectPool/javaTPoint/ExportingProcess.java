package creational.objectPool.javaTPoint;

public class ExportingProcess {
    private long processNo;

    ExportingProcess(long processNo) {
        this.processNo = processNo;
        System.out.println("Object with process no." + processNo + " was created.");
    }
    public long getProcessNo(){
        return processNo;
    }
}
