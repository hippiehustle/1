package k4;

import L7.AbstractC0166y;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import j3.C0933s;

/* renamed from: k4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982n extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final W4.i f12108I;

    /* renamed from: J, reason: collision with root package name */
    public final A4.d f12109J;
    public L2.e K;

    public C0982n(W4.i iVar) {
        super(3);
        this.f12108I = iVar;
        this.f12109J = new A4.d(o6.v.f13643a.b(C0985q.class), new C0981m(this, 0), new C0981m(this, 1), new C0933s(4, this));
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        this.K = new L2.e(k(), l());
        FrameLayout frameLayout = F3.l.a(layoutInflater).f1368e;
        o6.j.d(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // E1.c
    public final View J() {
        L2.e eVar = this.K;
        if (eVar != null) {
            return eVar;
        }
        o6.j.i("selectorView");
        throw null;
    }

    @Override // E1.c
    public final void K(int i4) {
        if (i4 == R.id.btn_confirm) {
            L2.e eVar = this.K;
            if (eVar != null) {
                this.f12108I.m(eVar.getSelection());
                a();
                return;
            }
            o6.j.i("selectorView");
            throw null;
        }
        if (i4 == R.id.btn_cancel) {
            a();
        }
    }

    @Override // w1.e
    public final void v() {
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new C0980l(this, null), 3);
    }
}
