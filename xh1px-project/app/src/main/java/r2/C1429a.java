package r2;

import L7.AbstractC0166y;
import O7.i0;
import Z5.y;
import android.content.Context;
import android.text.Editable;
import androidx.lifecycle.U;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import l2.C1001a;
import n6.InterfaceC1163b;
import r4.C1462b;
import r4.C1466f;
import t4.C1583k;
import t4.C1585m;
import t4.x;
import u0.r;
import w4.C1704i;
import w4.C1706k;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1429a implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14267e;

    public /* synthetic */ C1429a(int i4, Object obj) {
        this.f14266d = i4;
        this.f14267e = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Q7.d dVar;
        C0953c c0953c;
        switch (this.f14266d) {
            case 0:
                j jVar = (j) this.f14267e;
                o6.j.e((Context) obj, "it");
                i0 i0Var = jVar.f14305o;
                if ((i0Var.f() == k.f14311g || i0Var.f() == k.f14310f) && (dVar = jVar.k) != null) {
                    AbstractC0166y.q(dVar, null, null, new C1431c(jVar, null), 3);
                }
                return y.f7506a;
            case 1:
                C1466f c1466f = (C1466f) this.f14267e;
                AbstractC0951a abstractC0951a = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a, "event");
                c1466f.h(new C1462b(c1466f, abstractC0951a, 0));
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C1583k c1583k = (C1583k) this.f14267e;
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                x t8 = c1583k.t();
                String obj2 = editable.toString();
                o6.j.e(obj2, "name");
                C1001a g8 = t8.f15114c.f1950e.g();
                if (g8 != null) {
                    AbstractC0166y.q(U.g(t8), null, null, new C1585m(t8, g8, obj2, null), 3);
                }
                return y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                r rVar = (r) this.f14267e;
                E0.a aVar = (E0.a) obj;
                o6.j.e(aVar, "db");
                rVar.f15257g = aVar;
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                u4.k kVar = (u4.k) this.f14267e;
                AbstractC0951a abstractC0951a2 = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a2, "event");
                kVar.u(kVar.t().e(kVar.h(), (C0952b) abstractC0951a2));
                return y.f7506a;
            default:
                C1704i c1704i = (C1704i) this.f14267e;
                AbstractC0951a abstractC0951a3 = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a3, "event");
                C1706k t9 = c1704i.t();
                Context h8 = c1704i.h();
                if (abstractC0951a3 instanceof C0953c) {
                    c0953c = (C0953c) abstractC0951a3;
                } else {
                    c0953c = null;
                }
                c1704i.u(t9.e(h8, c0953c));
                return y.f7506a;
        }
    }
}
