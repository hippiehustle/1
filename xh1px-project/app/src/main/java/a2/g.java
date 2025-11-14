package a2;

import f6.AbstractC0713c;
import n6.InterfaceC1164c;
import o6.r;

/* loaded from: classes.dex */
public final class g extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1164c f7714g;

    /* renamed from: h, reason: collision with root package name */
    public r f7715h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7716i;
    public final /* synthetic */ h j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = hVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7716i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(null, this);
    }
}
