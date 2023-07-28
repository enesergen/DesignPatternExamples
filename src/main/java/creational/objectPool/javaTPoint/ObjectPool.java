package creational.objectPool.javaTPoint;

import java.util.concurrent.*;

public abstract class ObjectPool<T> {
    private ConcurrentLinkedQueue<T> pool;
    private ScheduledExecutorService executorService;

    ObjectPool(final int minObjects) {
        initialize(minObjects);
    }

    ObjectPool(final int minObjects, final int maxObjects, final long validationInterval) {
        initialize(minObjects);
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                int size = pool.size();
                if (size < minObjects) {
                    int sizeToBeAdded = minObjects + size;
                    for (int i = 0; i < sizeToBeAdded; i++) {
                        pool.add(createObject());
                    }

                } else if (size > maxObjects) {
                    int sizeToBeRemoved = size - maxObjects;
                    for (int i = 0; i < sizeToBeRemoved; i++) {
                        pool.poll();
                    }

                }
            }
        }, validationInterval, validationInterval, TimeUnit.SECONDS);
    }

    public T borrowObject() {//return and remove ->pool function
        T object;
        if ((object = pool.poll()) == null) {
            object = createObject();
        }
        return object;
    }

    //Returns object back to the pool.
    public void returnObject(T object) {
        if (object == null) {
            return;
        }
        this.pool.offer(object);
    }

    //Shutdown this pool.
    public void shutDown() {
        if (executorService != null) {
            executorService.shutdown();
        }
    }


    protected abstract T createObject();

    private void initialize(final int minObjects) {
        pool = new ConcurrentLinkedQueue<T>();
        for (int i = 0; i < minObjects; i++) {
            pool.add(createObject());
        }
    }
}
