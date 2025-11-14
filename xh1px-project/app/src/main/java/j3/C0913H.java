package j3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: j3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913H extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11839g;

    /* renamed from: h, reason: collision with root package name */
    public int f11840h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f11841i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0913H(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11841i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11839g = obj;
        this.f11840h |= Integer.MIN_VALUE;
        return this.f11841i.n(null, this);
    }
}
