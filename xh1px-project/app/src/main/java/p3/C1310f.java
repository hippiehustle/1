package p3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import o4.z;

/* renamed from: p3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1310f extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13719g;

    /* renamed from: h, reason: collision with root package name */
    public int f13720h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13721i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310f(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13721i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13719g = obj;
        this.f13720h |= Integer.MIN_VALUE;
        return this.f13721i.n(null, this);
    }
}
