package creational.objectPool.javaTPoint;

public class ExportingTask implements Runnable {

    private ObjectPool<ExportingProcess> pool;
    private int threadNo;

    ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;

    }

    @Override
    public void run() {
        // get an object from the pool
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread " + threadNo + ":Object with process no:" + exportingProcess.getProcessNo() + " was borrowed");

        pool.returnObject(exportingProcess);
        System.out.println("Thread " + threadNo + ":Object with process no." + exportingProcess.getProcessNo() + " was returned.");

    }


}
