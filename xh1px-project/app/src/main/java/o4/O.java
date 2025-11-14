package o4;

import O7.InterfaceC0233f;
import O7.P;
import O7.V;
import a6.AbstractC0437l;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import com.buzbuz.smartautoclicker.R;
import e2.AbstractC0640c;
import j2.C0905e;
import java.util.List;

/* loaded from: classes.dex */
public final class O extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f13540b;

    /* renamed from: c, reason: collision with root package name */
    public final D2.d f13541c;

    /* renamed from: d, reason: collision with root package name */
    public final D2.d f13542d;

    /* renamed from: e, reason: collision with root package name */
    public final D2.d f13543e;

    /* renamed from: f, reason: collision with root package name */
    public final D2.d f13544f;

    /* renamed from: g, reason: collision with root package name */
    public final D2.d f13545g;

    /* renamed from: h, reason: collision with root package name */
    public final P f13546h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0233f f13547i;
    public final C4.e j;
    public final C1258G k;

    /* renamed from: l, reason: collision with root package name */
    public final C4.e f13548l;

    /* renamed from: m, reason: collision with root package name */
    public final C1258G f13549m;

    /* renamed from: n, reason: collision with root package name */
    public final C1256E f13550n;

    /* renamed from: o, reason: collision with root package name */
    public final C4.e f13551o;

    /* renamed from: p, reason: collision with root package name */
    public final C4.e f13552p;

    /* renamed from: q, reason: collision with root package name */
    public final List f13553q;

    /* renamed from: r, reason: collision with root package name */
    public final R3.r f13554r;

    /* renamed from: s, reason: collision with root package name */
    public final Y3.z f13555s;

    public O(H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f13540b = nVar;
        D2.d dVar = new D2.d(R.string.dropdown_comparison_operator_item_greater, 6, null);
        this.f13541c = dVar;
        D2.d dVar2 = new D2.d(R.string.dropdown_comparison_operator_item_greater_or_equals, 6, null);
        this.f13542d = dVar2;
        D2.d dVar3 = new D2.d(R.string.dropdown_comparison_operator_item_equals, 6, null);
        this.f13543e = dVar3;
        D2.d dVar4 = new D2.d(R.string.dropdown_comparison_operator_item_lower_or_equals, 6, null);
        this.f13544f = dVar4;
        D2.d dVar5 = new D2.d(R.string.dropdown_comparison_operator_item_lower, 6, null);
        this.f13545g = dVar5;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.k;
        g0.L l6 = new g0.L(11, new Y3.z(nVar2, 8));
        this.f13546h = V.t(new C1254C(nVar2, 0), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f13547i = V.j(V.k(nVar.f1954i));
        this.j = new C4.e(new C1256E(l6, 0), 12);
        this.k = new C1258G(l6, 0);
        this.f13548l = new C4.e(new C1256E(l6, 1), 12);
        this.f13549m = new C1258G(l6, 1);
        int i4 = 2;
        this.f13550n = new C1256E(l6, i4);
        this.f13551o = new C4.e(new g0.L(13, new W5.a(23, new C1258G(l6, i4))), 12);
        this.f13552p = new C4.e(new W5.a(24, new g0.L(12, new C1258G(l6, 3))), 12);
        this.f13553q = AbstractC0437l.X(dVar, dVar2, dVar3, dVar4, dVar5);
        this.f13554r = new R3.r(l6, 25, this);
        this.f13555s = new Y3.z(yVar.k, 7);
    }

    public final void e(String str) {
        o6.j.e(str, "counterName");
        H3.n nVar = this.f13540b;
        C0905e c0905e = (C0905e) nVar.f1950e.b();
        if (c0905e != null) {
            nVar.k(C0905e.i(c0905e, null, null, null, str, null, null, 55));
        }
    }

    public final void f(AbstractC0640c abstractC0640c) {
        H3.n nVar = this.f13540b;
        C0905e c0905e = (C0905e) nVar.f1950e.b();
        if (c0905e != null) {
            nVar.k(C0905e.i(c0905e, null, null, null, null, null, abstractC0640c, 31));
        }
    }
}
