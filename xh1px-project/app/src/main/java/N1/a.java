package N1;

import Z5.y;
import a0.C0407b;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class a extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public c f3703h;

    /* renamed from: i, reason: collision with root package name */
    public C0407b f3704i;
    public int j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f3705l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f3706m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(c cVar, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3705l = cVar;
        this.f3706m = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((a) p((InterfaceC0617c) obj2, (C0407b) obj)).v(y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        a aVar = new a(this.f3705l, this.f3706m, interfaceC0617c);
        aVar.k = obj;
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        c cVar;
        C0407b c0407b = (C0407b) this.k;
        int i4 = this.j;
        if (i4 != 0) {
            if (i4 == 1) {
                c0407b = this.f3704i;
                cVar = this.f3703h;
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            cVar = this.f3705l;
            d a3 = c.a(cVar, c0407b);
            this.k = null;
            this.f3703h = cVar;
            this.f3704i = c0407b;
            this.j = 1;
            obj = this.f3706m.l(a3, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        d dVar = (d) obj;
        cVar.getClass();
        c0407b.d(c.f3710b, Long.valueOf(dVar.f3715a));
        c0407b.d(c.f3711c, Long.valueOf(dVar.f3716b));
        c0407b.d(c.f3712d, Integer.valueOf(dVar.f3717c));
        c0407b.d(c.f3713e, Integer.valueOf(dVar.f3718d));
        return y.f7506a;
    }
}
