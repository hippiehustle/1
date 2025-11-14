package w4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* renamed from: w4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15705g;

    /* renamed from: h, reason: collision with root package name */
    public int f15706h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f15707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705j(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f15707i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15705g = obj;
        this.f15706h |= Integer.MIN_VALUE;
        return this.f15707i.n(null, this);
    }
}
