package g3;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f11140h;

    /* renamed from: i, reason: collision with root package name */
    public int f11141i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f11140h = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11139g = obj;
        this.f11141i |= Integer.MIN_VALUE;
        return this.f11140h.c(this);
    }
}
