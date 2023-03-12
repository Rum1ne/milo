package com.example.flexible_talk.activities_and_their_logics.adding;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncExecutor {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final Handler handler = new android.os.Handler(Looper.getMainLooper());

    public void execute(AsyncExecutable asyncexecutable) {
        executor.execute(() -> {
            asyncexecutable.doInBackground();
            handler.post(asyncexecutable::doInUiThread);
        });
    }

    public interface AsyncExecutable {
        void doInBackground();

        void doInUiThread();
    }
}
