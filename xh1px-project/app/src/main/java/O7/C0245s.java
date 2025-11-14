package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4178g;

    /* renamed from: h, reason: collision with root package name */
    public int f4179h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.i f4180i;
    public A.i j;
    public InterfaceC0234g k;

    /* renamed from: l, reason: collision with root package name */
    public P7.y f4181l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245s(A.i iVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4180i = iVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4178g = obj;
        this.f4179h |= Integer.MIN_VALUE;
        return this.f4180i.x(null, this);
    }
}
