package i;

import java.util.concurrent.Executor;

/* renamed from: i.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0876o implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
