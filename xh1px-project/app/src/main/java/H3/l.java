package H3;

import f6.AbstractC0713c;
import java.util.List;
import l2.C1001a;

/* loaded from: classes.dex */
public final class l extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f1938g;

    /* renamed from: h, reason: collision with root package name */
    public C3.e f1939h;

    /* renamed from: i, reason: collision with root package name */
    public C1001a f1940i;
    public List j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f1941l;

    /* renamed from: m, reason: collision with root package name */
    public int f1942m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f1941l = nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f1942m |= Integer.MIN_VALUE;
        return this.f1941l.e(0L, this);
    }
}
