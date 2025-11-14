package a2;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public U7.c f7693g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7694h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f7695i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f7695i = hVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7694h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f7695i.a(this);
    }
}
