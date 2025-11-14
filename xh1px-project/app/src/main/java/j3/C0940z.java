package j3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: j3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940z extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11909g;

    /* renamed from: h, reason: collision with root package name */
    public int f11910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f11911i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0940z(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11911i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11909g = obj;
        this.f11910h |= Integer.MIN_VALUE;
        return this.f11911i.n(null, this);
    }
}
