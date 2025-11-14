package L3;

import D4.C0040p;
import O7.InterfaceC0233f;
import O7.V;
import a6.AbstractC0437l;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import com.buzbuz.smartautoclicker.R;
import e2.AbstractC0640c;
import java.util.List;

/* loaded from: classes.dex */
public final class S extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f2825b;

    /* renamed from: c, reason: collision with root package name */
    public final D2.d f2826c;

    /* renamed from: d, reason: collision with root package name */
    public final D2.d f2827d;

    /* renamed from: e, reason: collision with root package name */
    public final D2.d f2828e;

    /* renamed from: f, reason: collision with root package name */
    public final O7.P f2829f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0233f f2830g;

    /* renamed from: h, reason: collision with root package name */
    public final C4.e f2831h;

    /* renamed from: i, reason: collision with root package name */
    public final I f2832i;
    public final C4.e j;
    public final I k;

    /* renamed from: l, reason: collision with root package name */
    public final List f2833l;

    /* renamed from: m, reason: collision with root package name */
    public final A.i f2834m;

    /* renamed from: n, reason: collision with root package name */
    public final C f2835n;

    /* renamed from: o, reason: collision with root package name */
    public final C4.e f2836o;

    /* renamed from: p, reason: collision with root package name */
    public final C4.e f2837p;

    /* renamed from: q, reason: collision with root package name */
    public final C0040p f2838q;

    public S(H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f2825b = nVar;
        D2.d dVar = new D2.d(R.string.dropdown_counter_operation_item_add, 6, null);
        this.f2826c = dVar;
        D2.d dVar2 = new D2.d(R.string.dropdown_counter_operation_item_set, 6, null);
        this.f2827d = dVar2;
        D2.d dVar3 = new D2.d(R.string.dropdown_counter_operation_item_minus, 6, null);
        this.f2828e = dVar3;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1990m;
        W0.d dVar4 = new W0.d(10, new C4.e(nVar2, 6));
        this.f2829f = V.t(new C4.e(nVar2, 5), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f2830g = V.j(V.k(nVar.j));
        this.f2831h = new C4.e(new C(dVar4, 1), 12);
        this.f2832i = new I(dVar4, 0);
        this.j = new C4.e(new C(dVar4, 2), 12);
        this.k = new I(dVar4, 1);
        this.f2833l = AbstractC0437l.X(dVar, dVar2, dVar3);
        this.f2834m = new A.i(dVar4, 12, this);
        this.f2835n = new C(dVar4, 3);
        this.f2836o = new C4.e(new W0.c(9, new W0.c(8, new I(dVar4, 2))), 12);
        this.f2837p = new C4.e(new W0.d(12, new W0.d(11, new C(dVar4, 0))), 12);
        this.f2838q = new C0040p(yVar.f1990m, 6);
    }

    public final void e(String str) {
        o6.j.e(str, "counterName");
        H3.n nVar = this.f2825b;
        f2.c cVar = (f2.c) nVar.f1950e.a();
        if (cVar != null) {
            nVar.j(f2.c.i(cVar, null, null, null, 0, str, null, null, 111));
        }
    }

    public final void f(AbstractC0640c abstractC0640c) {
        H3.n nVar = this.f2825b;
        f2.c cVar = (f2.c) nVar.f1950e.a();
        if (cVar != null) {
            nVar.j(f2.c.i(cVar, null, null, null, 0, null, null, abstractC0640c, 63));
        }
    }
}
