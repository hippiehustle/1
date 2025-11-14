package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383H extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14031g;

    /* renamed from: h, reason: collision with root package name */
    public int f14032h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f14033i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383H(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14033i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14031g = obj;
        this.f14032h |= Integer.MIN_VALUE;
        return this.f14033i.n(null, this);
    }
}
