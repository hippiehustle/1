package b8;

import f6.AbstractC0711a;
import f6.AbstractC0713c;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Z5.b f9281g;

    /* renamed from: h, reason: collision with root package name */
    public M.i f9282h;

    /* renamed from: i, reason: collision with root package name */
    public LinkedHashMap f9283i;
    public String j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M.i f9285m;

    /* renamed from: n, reason: collision with root package name */
    public int f9286n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(M.i iVar, AbstractC0711a abstractC0711a) {
        super(abstractC0711a);
        this.f9285m = iVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9284l = obj;
        this.f9286n |= Integer.MIN_VALUE;
        return M.i.b(this.f9285m, null, this);
    }
}
