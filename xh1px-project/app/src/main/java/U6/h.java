package U6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import I7.m;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import h7.C0844g;
import h7.C0845h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o6.j;
import p7.InterfaceC1333o;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.G;
import w7.M;
import w7.W;
import w7.z;
import x7.C1824f;
import x7.InterfaceC1822d;

/* loaded from: classes.dex */
public final class h extends AbstractC1754p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, z zVar2) {
        super(zVar, zVar2);
        j.e(zVar, "lowerBound");
        j.e(zVar2, "upperBound");
        InterfaceC1822d.f16280a.b(zVar, zVar2);
    }

    public static final ArrayList N0(C0845h c0845h, AbstractC1759v abstractC1759v) {
        List<M> r02 = abstractC1759v.r0();
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(r02, 10));
        for (M m6 : r02) {
            j.e(m6, "typeProjection");
            StringBuilder sb = new StringBuilder();
            AbstractC0436k.u0(E2.d.y(m6), sb, ", ", null, null, new C0844g(c0845h, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String O0(String str, String str2) {
        if (!m.c0(str, '<')) {
            return str;
        }
        return m.u0(str, '<') + '<' + str2 + '>' + m.t0('>', str, str);
    }

    @Override // w7.AbstractC1759v
    public final AbstractC1759v G0(C1824f c1824f) {
        j.e(c1824f, "kotlinTypeRefiner");
        z zVar = this.f16006e;
        j.e(zVar, "type");
        z zVar2 = this.f16007f;
        j.e(zVar2, "type");
        return new AbstractC1754p(zVar, zVar2);
    }

    @Override // w7.W
    public final W I0(boolean z8) {
        return new h(this.f16006e.I0(z8), this.f16007f.I0(z8));
    }

    @Override // w7.W
    /* renamed from: J0 */
    public final W G0(C1824f c1824f) {
        j.e(c1824f, "kotlinTypeRefiner");
        z zVar = this.f16006e;
        j.e(zVar, "type");
        z zVar2 = this.f16007f;
        j.e(zVar2, "type");
        return new AbstractC1754p(zVar, zVar2);
    }

    @Override // w7.W
    public final W K0(G g8) {
        j.e(g8, "newAttributes");
        return new h(this.f16006e.K0(g8), this.f16007f.K0(g8));
    }

    @Override // w7.AbstractC1754p
    public final z L0() {
        return this.f16006e;
    }

    @Override // w7.AbstractC1754p
    public final String M0(C0845h c0845h, C0845h c0845h2) {
        z zVar = this.f16006e;
        String V6 = c0845h.V(zVar);
        z zVar2 = this.f16007f;
        String V8 = c0845h.V(zVar2);
        if (c0845h2.f11449a.l()) {
            return "raw (" + V6 + ".." + V8 + ')';
        }
        if (zVar2.r0().isEmpty()) {
            return c0845h.D(V6, V8, AbstractC0405a.A(this));
        }
        ArrayList N02 = N0(c0845h, zVar);
        ArrayList N03 = N0(c0845h, zVar2);
        String v02 = AbstractC0436k.v0(N02, ", ", null, null, g.f6189d, 30);
        ArrayList X02 = AbstractC0436k.X0(N02, N03);
        if (!X02.isEmpty()) {
            Iterator it = X02.iterator();
            while (it.hasNext()) {
                Z5.j jVar = (Z5.j) it.next();
                String str = (String) jVar.f7485d;
                String str2 = (String) jVar.f7486e;
                if (!j.a(str, m.o0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        }
        V8 = O0(V8, v02);
        String O02 = O0(V6, v02);
        if (j.a(O02, V8)) {
            return O02;
        }
        return c0845h.D(O02, V8, AbstractC0405a.A(this));
    }

    @Override // w7.AbstractC1754p, w7.AbstractC1759v
    public final InterfaceC1333o w0() {
        InterfaceC0004e interfaceC0004e;
        InterfaceC0007h c6 = B0().c();
        if (c6 instanceof InterfaceC0004e) {
            interfaceC0004e = (InterfaceC0004e) c6;
        } else {
            interfaceC0004e = null;
        }
        if (interfaceC0004e != null) {
            InterfaceC1333o Y = interfaceC0004e.Y(new f());
            j.d(Y, "getMemberScope(...)");
            return Y;
        }
        throw new IllegalStateException(("Incorrect classifier: " + B0().c()).toString());
    }
}
