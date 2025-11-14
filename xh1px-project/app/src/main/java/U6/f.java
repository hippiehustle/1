package U6;

import B6.n;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.T;
import Z5.j;
import a.AbstractC0405a;
import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.List;
import p7.InterfaceC1333o;
import t0.C1536c;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.E;
import w7.G;
import w7.J;
import w7.M;
import w7.O;
import w7.S;
import w7.X;
import w7.z;
import y7.k;
import y7.l;

/* loaded from: classes.dex */
public final class f extends O {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6186c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f6187d;

    /* renamed from: b, reason: collision with root package name */
    public final C1536c f6188b = new C1536c((e) new Object());

    static {
        S s8 = S.f15974e;
        f6186c = a.a(AbstractC0405a.D0(s8, false, null, 5), b.f6178f, false, null, null, 61);
        f6187d = a.a(AbstractC0405a.D0(s8, false, null, 5), b.f6177e, false, null, null, 61);
    }

    @Override // w7.O
    public final M d(AbstractC1759v abstractC1759v) {
        return new E(h(abstractC1759v, new a(S.f15974e, false, false, null, 62)));
    }

    public final j g(z zVar, InterfaceC0004e interfaceC0004e, a aVar) {
        if (zVar.B0().e().isEmpty()) {
            return new j(zVar, Boolean.FALSE);
        }
        if (z6.h.z(zVar)) {
            M m6 = (M) zVar.r0().get(0);
            X a3 = m6.a();
            AbstractC1759v b4 = m6.b();
            o6.j.d(b4, "getType(...)");
            return new j(AbstractC1741c.t(E2.d.y(new E(h(b4, aVar), a3)), zVar.y0(), zVar.B0(), zVar.E0()), Boolean.FALSE);
        }
        if (AbstractC1741c.j(zVar)) {
            return new j(l.c(k.ERROR_RAW_TYPE, zVar.B0().toString()), Boolean.FALSE);
        }
        InterfaceC1333o Y = interfaceC0004e.Y(this);
        o6.j.d(Y, "getMemberScope(...)");
        G y02 = zVar.y0();
        J B8 = interfaceC0004e.B();
        o6.j.d(B8, "getTypeConstructor(...)");
        List<T> e9 = interfaceC0004e.B().e();
        o6.j.d(e9, "getParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(e9, 10));
        for (T t8 : e9) {
            o6.j.b(t8);
            C1536c c1536c = this.f6188b;
            arrayList.add(e.a(t8, aVar, c1536c, c1536c.k(t8, aVar)));
        }
        return new j(AbstractC1741c.v(y02, B8, arrayList, zVar.E0(), Y, new n(interfaceC0004e, this, zVar, aVar)), Boolean.TRUE);
    }

    public final AbstractC1759v h(AbstractC1759v abstractC1759v, a aVar) {
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 instanceof T) {
            aVar.getClass();
            return h(this.f6188b.k((T) c6, a.a(aVar, null, true, null, null, 59)), aVar);
        }
        if (c6 instanceof InterfaceC0004e) {
            InterfaceC0007h c9 = AbstractC1741c.D(abstractC1759v).B0().c();
            if (c9 instanceof InterfaceC0004e) {
                j g8 = g(AbstractC1741c.l(abstractC1759v), (InterfaceC0004e) c6, f6186c);
                z zVar = (z) g8.f7485d;
                boolean booleanValue = ((Boolean) g8.f7486e).booleanValue();
                j g9 = g(AbstractC1741c.D(abstractC1759v), (InterfaceC0004e) c9, f6187d);
                z zVar2 = (z) g9.f7485d;
                boolean booleanValue2 = ((Boolean) g9.f7486e).booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return AbstractC1741c.e(zVar, zVar2);
                }
                return new h(zVar, zVar2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + c9 + "\" while for lower it's \"" + c6 + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + c6).toString());
    }
}
