package T7;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public e f5917g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5918h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5919i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f5919i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5918h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f5919i.d(this);
    }
}
