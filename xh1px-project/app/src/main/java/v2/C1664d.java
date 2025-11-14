package v2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* renamed from: v2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1664d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15488g;

    /* renamed from: h, reason: collision with root package name */
    public int f15489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f15490i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1664d(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f15490i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15488g = obj;
        this.f15489h |= Integer.MIN_VALUE;
        return this.f15490i.n(null, this);
    }
}
