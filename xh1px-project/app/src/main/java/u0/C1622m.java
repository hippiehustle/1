package u0;

import e6.EnumC0646a;
import f6.AbstractC0713c;

/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1622m extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1.f f15248h;

    /* renamed from: i, reason: collision with root package name */
    public int f15249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1622m(C1.f fVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f15248h = fVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15247g = obj;
        this.f15249i |= Integer.MIN_VALUE;
        this.f15248h.a(null, this);
        return EnumC0646a.f10656d;
    }
}
