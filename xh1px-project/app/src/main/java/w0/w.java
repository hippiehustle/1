package w0;

import f6.AbstractC0713c;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class w extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public x f15642g;

    /* renamed from: h, reason: collision with root package name */
    public String f15643h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1163b f15644i;
    public j j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f15645l;

    /* renamed from: m, reason: collision with root package name */
    public int f15646m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f15645l = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f15646m |= Integer.MIN_VALUE;
        return this.f15645l.a(null, null, this);
    }
}
