package z4;

import f6.AbstractC0713c;
import k2.C0952b;

/* renamed from: z4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1860d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C0952b f16639g;

    /* renamed from: h, reason: collision with root package name */
    public s2.k f16640h;

    /* renamed from: i, reason: collision with root package name */
    public U7.a f16641i;
    public int j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1866j f16642l;

    /* renamed from: m, reason: collision with root package name */
    public int f16643m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860d(C1866j c1866j, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f16642l = c1866j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f16643m |= Integer.MIN_VALUE;
        return this.f16642l.r(null, null, this);
    }
}
