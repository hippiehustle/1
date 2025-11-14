package p;

import i.AbstractC0863b;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1290b extends AbstractC0863b {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1290b f13645b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExecutorC1289a f13646c = new ExecutorC1289a(0);

    /* renamed from: a, reason: collision with root package name */
    public final C1292d f13647a = new C1292d();

    public static C1290b u() {
        if (f13645b != null) {
            return f13645b;
        }
        synchronized (C1290b.class) {
            try {
                if (f13645b == null) {
                    f13645b = new C1290b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13645b;
    }
}
