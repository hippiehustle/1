package w0;

import f6.AbstractC0713c;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class n extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public p f15609g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1162a f15610h;

    /* renamed from: i, reason: collision with root package name */
    public o6.u f15611i;
    public long j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f15612l;

    /* renamed from: m, reason: collision with root package name */
    public int f15613m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f15612l = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f15613m |= Integer.MIN_VALUE;
        return this.f15612l.b(0L, null, this);
    }
}
