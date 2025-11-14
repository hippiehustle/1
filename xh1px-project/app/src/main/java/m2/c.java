package m2;

import f6.AbstractC0713c;
import n2.s;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public s f12384g;

    /* renamed from: h, reason: collision with root package name */
    public long f12385h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12386i;
    public final /* synthetic */ l j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = lVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12386i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, null, this);
    }
}
