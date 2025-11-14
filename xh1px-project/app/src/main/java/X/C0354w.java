package X;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: X.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354w extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public H f6781g;

    /* renamed from: h, reason: collision with root package name */
    public c0 f6782h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6783i;
    public /* synthetic */ Object j;
    public final /* synthetic */ H k;

    /* renamed from: l, reason: collision with root package name */
    public int f6784l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0354w(H h8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.k = h8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f6784l |= Integer.MIN_VALUE;
        return H.e(this.k, false, this);
    }
}
