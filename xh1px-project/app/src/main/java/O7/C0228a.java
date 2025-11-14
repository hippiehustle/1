package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public P7.y f4119g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4120h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W0.d f4121i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228a(W0.d dVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4121i = dVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4120h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f4121i.x(null, this);
    }
}
