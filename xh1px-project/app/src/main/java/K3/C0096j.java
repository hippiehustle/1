package K3;

import a6.AbstractC0436k;
import j2.C0902b;
import java.util.ArrayList;
import java.util.List;
import n6.InterfaceC1163b;
import o3.C1243n;

/* renamed from: K3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0096j implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G1.f f2690f;

    public /* synthetic */ C0096j(int i4, G1.f fVar, int i8) {
        this.f2688d = i8;
        this.f2689e = i4;
        this.f2690f = fVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        List d2;
        List list;
        switch (this.f2688d) {
            case 0:
                s sVar = (s) this.f2690f;
                int intValue = ((Integer) obj).intValue() - 1;
                int i4 = this.f2689e;
                if (intValue != i4) {
                    H3.n nVar = sVar.h0().f2642d;
                    if (i4 != intValue && (d2 = nVar.f1950e.d()) != null) {
                        ArrayList S02 = AbstractC0436k.S0(d2);
                        if (S02.size() > 1 && i4 >= 0 && i4 < S02.size() && intValue >= 0 && intValue < S02.size()) {
                            S02.add(intValue, (f2.a) S02.remove(i4));
                            nVar.i(S02);
                        }
                    }
                }
                return Z5.y.f7506a;
            case 1:
                l4.l lVar = (l4.l) this.f2690f;
                int intValue2 = ((Integer) obj).intValue() - 1;
                int i8 = this.f2689e;
                if (intValue2 != i8) {
                    H3.n nVar2 = lVar.h0().f12288c;
                    List e9 = nVar2.f1950e.e();
                    if (e9 != null) {
                        ArrayList S03 = AbstractC0436k.S0(e9);
                        S03.add(intValue2, (C0902b) S03.remove(i8));
                        nVar2.n(S03);
                    }
                }
                return Z5.y.f7506a;
            default:
                C1243n c1243n = (C1243n) this.f2690f;
                int intValue3 = ((Integer) obj).intValue() - 1;
                int i9 = this.f2689e;
                if (intValue3 != i9) {
                    g3.e eVar = c1243n.h0().f13490c;
                    p2.e eVar2 = (p2.e) eVar.f11150c.f();
                    if (eVar2 != null && (list = eVar2.f13701c) != null) {
                        ArrayList S04 = AbstractC0436k.S0(list);
                        S04.add(intValue3, (p2.d) S04.remove(i9));
                        eVar.f(S04);
                    }
                }
                return Z5.y.f7506a;
        }
    }
}
