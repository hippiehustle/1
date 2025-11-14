package C7;

import C6.A;
import C6.AbstractC0021w;
import C6.InterfaceC0004e;
import C6.T;
import F6.U;
import a6.AbstractC0436k;
import java.util.List;
import m7.AbstractC1098d;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.E;
import w7.G;
import w7.z;
import x7.InterfaceC1822d;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final l f809b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f810c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f811a;

    public /* synthetic */ l(int i4) {
        this.f811a = i4;
    }

    @Override // C7.e
    public final String a() {
        switch (this.f811a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }

    @Override // C7.e
    public final boolean b(R6.f fVar) {
        z s8;
        switch (this.f811a) {
            case 0:
                U u8 = (U) fVar.z0().get(1);
                z6.k kVar = z6.l.f16733d;
                o6.j.b(u8);
                A j = AbstractC1098d.j(u8);
                kVar.getClass();
                InterfaceC0004e d2 = AbstractC0021w.d(j, z6.m.f16754R);
                if (d2 == null) {
                    s8 = null;
                } else {
                    G.f15953e.getClass();
                    G g8 = G.f15954f;
                    List e9 = d2.B().e();
                    o6.j.d(e9, "getParameters(...)");
                    Object G02 = AbstractC0436k.G0(e9);
                    o6.j.d(G02, "single(...)");
                    s8 = AbstractC1741c.s(g8, d2, E2.d.y(new E((T) G02)));
                }
                if (s8 == null) {
                    return false;
                }
                AbstractC1759v b4 = u8.b();
                o6.j.d(b4, "getType(...)");
                return InterfaceC1822d.f16280a.b(s8, w7.U.g(b4, false));
            default:
                List<U> z02 = fVar.z0();
                o6.j.d(z02, "getValueParameters(...)");
                if (!z02.isEmpty()) {
                    for (U u9 : z02) {
                        o6.j.b(u9);
                        if (AbstractC1098d.a(u9) || u9.f1514n != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // C7.e
    public final String c(R6.f fVar) {
        switch (this.f811a) {
            case 0:
                return D2.f.v(this, fVar);
            default:
                return D2.f.v(this, fVar);
        }
    }
}
