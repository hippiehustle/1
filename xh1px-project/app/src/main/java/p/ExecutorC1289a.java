package p;

import java.util.concurrent.Executor;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1289a implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13644d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f13644d) {
            case 0:
                C1290b.u().f13647a.f13650b.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
