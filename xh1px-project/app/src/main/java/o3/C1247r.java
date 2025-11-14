package o3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import l3.C1018q;

/* renamed from: o3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13480g;

    /* renamed from: h, reason: collision with root package name */
    public int f13481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1018q f13482i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247r(C1018q c1018q, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13482i = c1018q;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13480g = obj;
        this.f13481h |= Integer.MIN_VALUE;
        return this.f13482i.n(null, this);
    }
}
