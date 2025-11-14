package s2;

import f6.AbstractC0713c;
import j2.C0902b;
import u2.C1630a;
import v2.InterfaceC1661a;

/* loaded from: classes.dex */
public final class m extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C0902b f14479g;

    /* renamed from: h, reason: collision with root package name */
    public C1630a f14480h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1661a f14481i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n k;

    /* renamed from: l, reason: collision with root package name */
    public int f14482l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f14482l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
