package j3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: j3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936v extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11898g;

    /* renamed from: h, reason: collision with root package name */
    public int f11899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f11900i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0936v(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11900i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11898g = obj;
        this.f11899h |= Integer.MIN_VALUE;
        return this.f11900i.n(null, this);
    }
}
