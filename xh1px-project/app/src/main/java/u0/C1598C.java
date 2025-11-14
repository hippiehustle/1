package u0;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: u0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1598C extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public P7.l f15151g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f15152h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15153i;
    public final /* synthetic */ P7.l j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598C(P7.l lVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.j = lVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15153i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
