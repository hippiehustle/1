package c2;

import f6.AbstractC0713c;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f9543g;

    /* renamed from: h, reason: collision with root package name */
    public List f9544h;

    /* renamed from: i, reason: collision with root package name */
    public R.g f9545i;
    public /* synthetic */ Object j;
    public final /* synthetic */ z k;

    /* renamed from: l, reason: collision with root package name */
    public int f9546l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f9546l |= Integer.MIN_VALUE;
        return this.k.g(0L, null, this);
    }
}
