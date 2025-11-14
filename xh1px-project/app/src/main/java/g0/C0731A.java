package g0;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.InterfaceC0510v;
import i.AbstractActivityC0870i;
import u6.AbstractC1638C;

/* renamed from: g0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731A extends AbstractC1638C implements androidx.lifecycle.f0, InterfaceC0510v, B0.f, X {

    /* renamed from: i, reason: collision with root package name */
    public final AbstractActivityC0870i f10844i;
    public final AbstractActivityC0870i j;
    public final Handler k;

    /* renamed from: l, reason: collision with root package name */
    public final T f10845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0870i f10846m;

    public C0731A(AbstractActivityC0870i abstractActivityC0870i) {
        this.f10846m = abstractActivityC0870i;
        Handler handler = new Handler();
        this.f10844i = abstractActivityC0870i;
        this.j = abstractActivityC0870i;
        this.k = handler;
        this.f10845l = new T();
    }

    @Override // u6.AbstractC1638C
    public final View E(int i4) {
        return this.f10846m.findViewById(i4);
    }

    @Override // u6.AbstractC1638C
    public final boolean F() {
        Window window = this.f10846m.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // B0.f
    public final A.i b() {
        return (A.i) this.f10846m.f9337h.f89f;
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.e0 f() {
        return this.f10846m.f();
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        return this.f10846m.f11712x;
    }

    @Override // g0.X
    public final void a(T t8, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
    }
}
