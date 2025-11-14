package s2;

import f6.AbstractC0713c;
import java.util.Iterator;
import k2.C0953c;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1165d f14507g;

    /* renamed from: h, reason: collision with root package name */
    public Iterator f14508h;

    /* renamed from: i, reason: collision with root package name */
    public C0953c f14509i;
    public k j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f14510l;

    /* renamed from: m, reason: collision with root package name */
    public int f14511m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n nVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f14510l = nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f14511m |= Integer.MIN_VALUE;
        return this.f14510l.c(null, null, this);
    }
}
