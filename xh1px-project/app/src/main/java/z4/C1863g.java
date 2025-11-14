package z4;

import f6.AbstractC0713c;

/* renamed from: z4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1863g extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public U7.c f16650g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f16651h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1866j f16652i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863g(C1866j c1866j, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f16652i = c1866j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16651h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f16652i.c(this);
    }
}
