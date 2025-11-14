package p3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import o4.z;

/* renamed from: p3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1311g extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13722g;

    /* renamed from: h, reason: collision with root package name */
    public int f13723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13724i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1311g(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13724i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13722g = obj;
        this.f13723h |= Integer.MIN_VALUE;
        return this.f13724i.n(null, this);
    }
}
