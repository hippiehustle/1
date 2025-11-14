package C0;

import G5.n;
import a6.AbstractC0436k;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.InterfaceC0508t;
import androidx.lifecycle.InterfaceC0510v;
import g0.AbstractComponentCallbacksC0755y;
import java.util.Iterator;
import n0.C1131i;
import o6.j;
import p0.C1299g;
import q0.C1350f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0508t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f552e;

    public /* synthetic */ a(int i4, Object obj) {
        this.f551d = i4;
        this.f552e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        switch (this.f551d) {
            case 0:
                b bVar = (b) this.f552e;
                if (enumC0503n == EnumC0503n.ON_START) {
                    bVar.f560h = true;
                    return;
                } else {
                    if (enumC0503n == EnumC0503n.ON_STOP) {
                        bVar.f560h = false;
                        return;
                    }
                    return;
                }
            case 1:
                C1299g c1299g = (C1299g) this.f552e;
                if (enumC0503n == EnumC0503n.ON_DESTROY) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) interfaceC0510v;
                    Object obj = null;
                    for (Object obj2 : (Iterable) c1299g.b().f12772f.f4088d.f()) {
                        if (j.a(((C1131i) obj2).f12763i, abstractComponentCallbacksC0755y.f11088D)) {
                            obj = obj2;
                        }
                    }
                    C1131i c1131i = (C1131i) obj;
                    if (c1131i != null) {
                        if (C1299g.n()) {
                            c1131i.toString();
                            interfaceC0510v.toString();
                        }
                        c1299g.b().c(c1131i);
                        return;
                    }
                    return;
                }
                return;
            default:
                C1350f c1350f = (C1350f) this.f552e;
                c1350f.f13896p = enumC0503n.a();
                if (c1350f.f13885c != null) {
                    Iterator it = AbstractC0436k.S0(c1350f.f13888f).iterator();
                    while (it.hasNext()) {
                        C1131i c1131i2 = (C1131i) it.next();
                        c1131i2.getClass();
                        n nVar = c1131i2.k;
                        nVar.getClass();
                        ((C1131i) nVar.f1807c).f12761g = enumC0503n.a();
                        nVar.f1810f = enumC0503n.a();
                        nVar.d();
                    }
                    return;
                }
                return;
        }
    }
}
