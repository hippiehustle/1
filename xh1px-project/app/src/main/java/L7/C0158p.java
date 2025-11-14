package L7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: L7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0158p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3234b = AtomicIntegerFieldUpdater.newUpdater(C0158p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3235a;

    public C0158p(Throwable th, boolean z8) {
        this.f3235a = th;
        this._handled$volatile = z8 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3235a + ']';
    }
}
