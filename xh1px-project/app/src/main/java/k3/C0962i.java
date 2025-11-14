package k3;

import b2.p;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: k3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962i extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11990g;

    /* renamed from: h, reason: collision with root package name */
    public int f11991h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11992i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0962i(p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11992i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11990g = obj;
        this.f11991h |= Integer.MIN_VALUE;
        return this.f11992i.n(null, this);
    }
}
