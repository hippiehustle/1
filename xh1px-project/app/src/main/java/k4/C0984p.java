package k4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: k4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984p extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12113g;

    /* renamed from: h, reason: collision with root package name */
    public int f12114h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f12115i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0984p(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12115i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12113g = obj;
        this.f12114h |= Integer.MIN_VALUE;
        return this.f12115i.n(null, this);
    }
}
