package C3;

import O7.L;
import O7.V;
import O7.i0;
import P7.n;
import b6.C0535c;
import d6.InterfaceC0617c;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f594a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f595b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f596c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f597d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.c f598e;

    /* renamed from: f, reason: collision with root package name */
    public final E3.b f599f;

    /* renamed from: g, reason: collision with root package name */
    public final E3.c f600g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f601h;

    /* renamed from: i, reason: collision with root package name */
    public final A4.c f602i;
    public final n j;
    public final L k;

    /* renamed from: l, reason: collision with root package name */
    public final L f603l;

    /* JADX WARN: Type inference failed for: r13v0, types: [E3.a, E3.b, D3.d] */
    /* JADX WARN: Type inference failed for: r14v0, types: [E3.a, E3.c, D3.d] */
    public e() {
        InterfaceC0617c interfaceC0617c = null;
        i0 c6 = V.c(null);
        this.f594a = c6;
        i0 c9 = V.c(null);
        this.f595b = c9;
        i0 c10 = V.c(null);
        this.f596c = c10;
        this.f597d = c9;
        int i4 = 3;
        this.f598e = new A4.c(c6, c9, new c(i4, interfaceC0617c, 0), 27);
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        ?? aVar = new E3.a(new A1.e(i9, this, e.class, "deleteAllReferencesToEvent", "deleteAllReferencesToEvent(Lcom/buzbuz/smartautoclicker/core/domain/model/event/Event;)V", i10, i8, 3), c9);
        this.f599f = aVar;
        ?? aVar2 = new E3.a(new A1.e(i9, this, e.class, "deleteAllReferencesToEvent", "deleteAllReferencesToEvent(Lcom/buzbuz/smartautoclicker/core/domain/model/event/Event;)V", i10, i8, 4), c9);
        this.f600g = aVar2;
        this.f601h = c10;
        this.f602i = new A4.c(aVar.j, aVar2.j, new b(i4, interfaceC0617c, 0), 27);
        this.j = V.u(c10, new d(i4, interfaceC0617c, 0));
        this.k = aVar.f891e;
        this.f603l = aVar2.f891e;
    }

    public final C0535c a() {
        C0535c i4 = E2.d.i();
        List list = (List) this.f599f.f890d.f();
        if (list != null) {
            i4.addAll(list);
        }
        List list2 = (List) this.f600g.f890d.f();
        if (list2 != null) {
            i4.addAll(list2);
        }
        return E2.d.f(i4);
    }
}
