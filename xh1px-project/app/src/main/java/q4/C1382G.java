package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382G extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14028g;

    /* renamed from: h, reason: collision with root package name */
    public int f14029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f14030i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1382G(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14030i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14028g = obj;
        this.f14029h |= Integer.MIN_VALUE;
        return this.f14030i.n(null, this);
    }
}
