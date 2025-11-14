package s2;

import f6.AbstractC0713c;
import g0.b0;
import java.util.Iterator;
import k2.AbstractC0951a;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0951a f14451g;

    /* renamed from: h, reason: collision with root package name */
    public k f14452h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f14453i;
    public int j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0 f14454l;

    /* renamed from: m, reason: collision with root package name */
    public int f14455m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1481b(b0 b0Var, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f14454l = b0Var;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f14455m |= Integer.MIN_VALUE;
        return this.f14454l.b(null, null, this);
    }
}
