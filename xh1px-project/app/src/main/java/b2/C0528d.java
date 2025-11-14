package b2;

import X3.t;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9064g;

    /* renamed from: h, reason: collision with root package name */
    public int f9065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f9066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0528d(t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f9066i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9064g = obj;
        this.f9065h |= Integer.MIN_VALUE;
        return this.f9066i.n(null, this);
    }
}
