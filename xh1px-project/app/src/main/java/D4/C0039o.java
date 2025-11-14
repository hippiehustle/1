package D4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: D4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039o extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f975g;

    /* renamed from: h, reason: collision with root package name */
    public int f976h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0039o(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f977i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f975g = obj;
        this.f976h |= Integer.MIN_VALUE;
        return this.f977i.n(null, this);
    }
}
