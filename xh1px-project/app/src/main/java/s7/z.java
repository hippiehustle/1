package s7;

import C6.AbstractC0021w;
import C6.InterfaceC0007h;
import C6.S;
import a.AbstractC0405a;
import a7.T;
import c7.InterfaceC0588g;
import f7.C0722b;
import h7.AbstractC0842e;
import n6.InterfaceC1163b;
import o.p1;

/* loaded from: classes.dex */
public final class z implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14636d;

    /* renamed from: e, reason: collision with root package name */
    public final p1 f14637e;

    public /* synthetic */ z(int i4, p1 p1Var) {
        this.f14636d = i4;
        this.f14637e = p1Var;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f14636d) {
            case 0:
                int intValue = ((Number) obj).intValue();
                F3.m mVar = (F3.m) this.f14637e.f13349e;
                InterfaceC0588g interfaceC0588g = (InterfaceC0588g) mVar.f1372e;
                C1518i c1518i = (C1518i) mVar.f1371d;
                C0722b m6 = AbstractC0842e.m(interfaceC0588g, intValue);
                if (m6.f10795c) {
                    return c1518i.b(m6);
                }
                return AbstractC0021w.e(c1518i.f14574b, m6);
            case 1:
                int intValue2 = ((Number) obj).intValue();
                F3.m mVar2 = (F3.m) this.f14637e.f13349e;
                C0722b m8 = AbstractC0842e.m((InterfaceC0588g) mVar2.f1372e, intValue2);
                if (!m8.f10795c) {
                    C6.A a3 = ((C1518i) mVar2.f1371d).f14574b;
                    o6.j.e(a3, "<this>");
                    InterfaceC0007h e9 = AbstractC0021w.e(a3, m8);
                    if (e9 instanceof S) {
                        return (S) e9;
                    }
                }
                return null;
            default:
                T t8 = (T) obj;
                o6.j.e(t8, "it");
                return AbstractC0405a.h0(t8, (F6.B) ((F3.m) this.f14637e.f13349e).f1374g);
        }
    }
}
