package z4;

import f6.AbstractC0713c;

/* renamed from: z4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1864h extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public U7.a f16653g;

    /* renamed from: h, reason: collision with root package name */
    public int f16654h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f16655i;
    public final /* synthetic */ C1866j j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864h(C1866j c1866j, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = c1866j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16655i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.o(this);
    }
}
