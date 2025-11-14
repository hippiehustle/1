package b2;

import f6.AbstractC0713c;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public boolean f9082g;

    /* renamed from: h, reason: collision with root package name */
    public o6.r f9083h;

    /* renamed from: i, reason: collision with root package name */
    public Map f9084i;
    public Iterator j;
    public T1.r k;

    /* renamed from: l, reason: collision with root package name */
    public String f9085l;

    /* renamed from: m, reason: collision with root package name */
    public int f9086m;

    /* renamed from: n, reason: collision with root package name */
    public int f9087n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f9088o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f9089p;

    /* renamed from: q, reason: collision with root package name */
    public int f9090q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9089p = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9088o = obj;
        this.f9090q |= Integer.MIN_VALUE;
        return this.f9089p.j(false, this);
    }
}
