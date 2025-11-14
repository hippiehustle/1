package L7;

import d6.AbstractC0615a;
import f6.AbstractC0713c;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class g0 extends AbstractC0615a implements X {

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f3215e = new AbstractC0615a(C0161t.f3244e);

    @Override // L7.X
    public final InterfaceC0153k I(d0 d0Var) {
        return h0.f3219d;
    }

    @Override // L7.X
    public final boolean a() {
        return true;
    }

    @Override // L7.X
    public final H e(boolean z8, boolean z9, A1.e eVar) {
        return h0.f3219d;
    }

    @Override // L7.X
    public final H j(X.W w8) {
        return h0.f3219d;
    }

    @Override // L7.X
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // L7.X
    public final Object v(AbstractC0713c abstractC0713c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // L7.X
    public final CancellationException z() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // L7.X
    public final void d(CancellationException cancellationException) {
    }
}
