package w0;

import f6.AbstractC0713c;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class v extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Object f15638g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f15639h;

    /* renamed from: i, reason: collision with root package name */
    public int f15640i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x k;

    /* renamed from: l, reason: collision with root package name */
    public int f15641l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f15641l |= Integer.MIN_VALUE;
        return this.k.g(null, null, this);
    }
}
