package j3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: j3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912G extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11836g;

    /* renamed from: h, reason: collision with root package name */
    public int f11837h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f11838i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0912G(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11838i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11836g = obj;
        this.f11837h |= Integer.MIN_VALUE;
        return this.f11838i.n(null, this);
    }
}
