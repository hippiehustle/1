package y2;

import a0.C0407b;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C0407b f16460g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f16461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f16462i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f16462i = cVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16461h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f16462i.a(null, this);
    }
}
