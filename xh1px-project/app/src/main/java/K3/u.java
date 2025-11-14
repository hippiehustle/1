package K3;

import b6.C0535c;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class u extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f2712h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f2713i;

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, K3.u] */
    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ?? abstractC0720j = new AbstractC0720j(3, (InterfaceC0617c) obj3);
        abstractC0720j.f2712h = booleanValue;
        abstractC0720j.f2713i = booleanValue2;
        return abstractC0720j.v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8 = this.f2712h;
        boolean z9 = this.f2713i;
        Z5.a.d(obj);
        C0535c i4 = E2.d.i();
        if (!z9 && z8) {
            i4.add(V3.c.f6358d);
        }
        i4.add(V3.b.f6357d);
        i4.add(V3.h.f6363d);
        i4.add(V3.f.f6361d);
        i4.add(V3.g.f6362d);
        i4.add(V3.i.f6364d);
        i4.add(V3.a.f6356d);
        i4.add(V3.j.f6365d);
        i4.add(V3.e.f6360d);
        i4.add(V3.d.f6359d);
        return E2.d.f(i4);
    }
}
