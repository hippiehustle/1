package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1390O extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14051g;

    /* renamed from: h, reason: collision with root package name */
    public int f14052h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M3.V f14053i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390O(M3.V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14053i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14051g = obj;
        this.f14052h |= Integer.MIN_VALUE;
        return this.f14053i.n(null, this);
    }
}
