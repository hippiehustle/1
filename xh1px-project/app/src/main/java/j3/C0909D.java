package j3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: j3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909D extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11827g;

    /* renamed from: h, reason: collision with root package name */
    public int f11828h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f11829i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0909D(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11829i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11827g = obj;
        this.f11828h |= Integer.MIN_VALUE;
        return this.f11829i.n(null, this);
    }
}
