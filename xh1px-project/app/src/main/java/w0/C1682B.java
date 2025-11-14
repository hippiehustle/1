package w0;

import L7.AbstractC0143a;
import L7.AbstractC0166y;
import L7.C0156n;
import L7.C0158p;
import L7.EnumC0164w;
import L7.F;
import L7.InterfaceC0163v;
import L7.U;
import L7.d0;
import d6.C0618d;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0619e;
import d6.InterfaceC0620f;
import d6.InterfaceC0622h;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: w0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1682B extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f15568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1682B(InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15568i = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1682B) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1682B c1682b = new C1682B(this.f15568i, interfaceC0617c);
        c1682b.f15567h = obj;
        return c1682b;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        InterfaceC0622h p8 = ((InterfaceC0163v) this.f15567h).p();
        C0618d c0618d = C0618d.f10447d;
        InterfaceC0620f B8 = p8.B(c0618d);
        o6.j.b(B8);
        InterfaceC0619e interfaceC0619e = (InterfaceC0619e) B8;
        C0156n a3 = AbstractC0166y.a();
        z zVar = new z(a3, this.f15568i, null);
        InterfaceC0622h j = AbstractC0166y.j(C0623i.f10448d, interfaceC0619e, true);
        S7.e eVar = F.f3175a;
        if (j != eVar && j.B(c0618d) == null) {
            j = j.D(eVar);
        }
        AbstractC0143a abstractC0143a = new AbstractC0143a(j, true);
        abstractC0143a.g0(EnumC0164w.f3251g, abstractC0143a, zVar);
        while (!a3.P()) {
            try {
                return AbstractC0166y.t(interfaceC0619e, new C1681A(a3, null));
            } catch (InterruptedException unused) {
            }
        }
        Object obj2 = d0.f3210d.get(a3);
        if (!(obj2 instanceof U)) {
            if (!(obj2 instanceof C0158p)) {
                return AbstractC0166y.y(obj2);
            }
            throw ((C0158p) obj2).f3235a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }
}
