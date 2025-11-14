package s2;

import f6.AbstractC0713c;
import g0.b0;

/* renamed from: s2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f14459h;

    /* renamed from: i, reason: collision with root package name */
    public int f14460i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1483d(b0 b0Var, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f14459h = b0Var;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14458g = obj;
        this.f14460i |= Integer.MIN_VALUE;
        return this.f14459h.d(null, this);
    }
}
