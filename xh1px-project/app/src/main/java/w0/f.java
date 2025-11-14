package w0;

import d6.InterfaceC0622h;
import f6.AbstractC0713c;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Object f15578g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f15579h;

    /* renamed from: i, reason: collision with root package name */
    public p f15580i;
    public o6.u j;
    public InterfaceC0622h k;

    /* renamed from: l, reason: collision with root package name */
    public o6.u f15581l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15582m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f15583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f15584o;

    /* renamed from: p, reason: collision with root package name */
    public int f15585p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f15584o = iVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15583n = obj;
        this.f15585p |= Integer.MIN_VALUE;
        return this.f15584o.s(false, null, this);
    }
}
