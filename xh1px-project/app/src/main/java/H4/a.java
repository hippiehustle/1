package H4;

import Z5.y;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public final class a extends AbstractC0720j implements InterfaceC1167f {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f2001h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Boolean f2002i;
    public /* synthetic */ int j;
    public /* synthetic */ int k;

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, H4.a] */
    @Override // n6.InterfaceC1167f
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0713c abstractC0713c) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj3).intValue();
        int intValue2 = ((Number) obj4).intValue();
        ?? abstractC0720j = new AbstractC0720j(5, abstractC0713c);
        abstractC0720j.f2001h = booleanValue;
        abstractC0720j.f2002i = (Boolean) obj2;
        abstractC0720j.j = intValue;
        abstractC0720j.k = intValue2;
        return abstractC0720j.v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8 = this.f2001h;
        Boolean bool = this.f2002i;
        int i4 = this.j;
        int i8 = this.k;
        Z5.a.d(obj);
        return new G4.b(z8, bool, i4, i8);
    }
}
