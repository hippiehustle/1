package X;

import L7.C0156n;
import f6.AbstractC0713c;

/* renamed from: X.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Object f6769g;

    /* renamed from: h, reason: collision with root package name */
    public H f6770h;

    /* renamed from: i, reason: collision with root package name */
    public C0156n f6771i;
    public /* synthetic */ Object j;
    public final /* synthetic */ H k;

    /* renamed from: l, reason: collision with root package name */
    public int f6772l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0350s(H h8, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = h8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f6772l |= Integer.MIN_VALUE;
        return H.b(this.k, null, this);
    }
}
