package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381F extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14025g;

    /* renamed from: h, reason: collision with root package name */
    public int f14026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f14027i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1381F(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14027i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14025g = obj;
        this.f14026h |= Integer.MIN_VALUE;
        return this.f14027i.n(null, this);
    }
}
