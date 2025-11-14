package s2;

import f6.AbstractC0713c;
import j2.AbstractC0901a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public int f14475g;

    /* renamed from: h, reason: collision with root package name */
    public Iterator f14476h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0901a f14477i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n k;

    /* renamed from: l, reason: collision with root package name */
    public int f14478l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f14478l |= Integer.MIN_VALUE;
        return this.k.d(0, null, this);
    }
}
