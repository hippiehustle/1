package c0;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class n extends E2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E2.d f9400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f9401f;

    public n(E2.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        super(24);
        this.f9400e = dVar;
        this.f9401f = threadPoolExecutor;
    }

    @Override // E2.d
    public final void A(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f9401f;
        try {
            this.f9400e.A(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // E2.d
    public final void B(A4.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f9401f;
        try {
            this.f9400e.B(aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
