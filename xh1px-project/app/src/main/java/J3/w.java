package J3;

import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1166e;

/* loaded from: classes.dex */
public final class w extends AbstractC0720j implements InterfaceC1166e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f2474h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f2475i;
    public /* synthetic */ boolean j;

    /* JADX WARN: Type inference failed for: r0v0, types: [J3.w, f6.j] */
    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        ?? abstractC0720j = new AbstractC0720j(4, (InterfaceC0617c) obj4);
        abstractC0720j.f2474h = booleanValue;
        abstractC0720j.f2475i = booleanValue2;
        abstractC0720j.j = booleanValue3;
        return abstractC0720j.v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        boolean z9 = this.f2474h;
        boolean z10 = this.f2475i;
        boolean z11 = this.j;
        Z5.a.d(obj);
        if ((z9 || !z11) && z10) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
