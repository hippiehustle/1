package c2;

import b6.C0535c;
import f6.AbstractC0713c;
import l2.C1001a;

/* loaded from: classes.dex */
public final class y extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C1001a f9597g;

    /* renamed from: h, reason: collision with root package name */
    public C0535c f9598h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9599i;
    public final /* synthetic */ z j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9599i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(null, null, null, this);
    }
}
