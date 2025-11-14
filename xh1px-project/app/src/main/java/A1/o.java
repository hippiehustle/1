package A1;

import L7.AbstractC0166y;
import L7.F;
import M3.Z;
import O7.i0;
import S1.C0297h;
import S1.w;
import W4.x;
import Z3.C0376k;
import Z5.y;
import a6.C0433h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.U;
import b2.r;
import d4.C0604j;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import h4.AbstractC0832f;
import j2.C0902b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l0.C0997a;
import l1.C0999a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import u0.u;

/* loaded from: classes.dex */
public final /* synthetic */ class o extends o6.i implements InterfaceC1164c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f268l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i4, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i4, obj, cls, str, str2, i8, i9);
        this.f268l = i10;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        int intValue;
        Object C8;
        Object C9;
        Object C10;
        Object C11;
        Object C12;
        Object C13;
        Object C14;
        Object C15;
        Object C16;
        Object C17;
        int i4 = this.f268l;
        final int i8 = 3;
        final int i9 = 4;
        final int i10 = 5;
        final int i11 = 6;
        final int i12 = 7;
        String str = null;
        final int i13 = 2;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        y yVar = y.f7506a;
        Object obj3 = this.f13629e;
        boolean z8 = true;
        char c6 = 1;
        char c9 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        final int i14 = 0;
        switch (i4) {
            case 0:
                g gVar = (g) obj;
                o6.j.e(gVar, "p0");
                ((p) obj3).G(gVar, (View) obj2);
                return yVar;
            case 1:
                Context context = (Context) obj;
                w1.e eVar = (w1.e) obj2;
                o6.j.e(context, "p0");
                o6.j.e(eVar, "p1");
                C1.g gVar2 = (C1.g) obj3;
                gVar2.getClass();
                eVar.hashCode();
                A4.c cVar = gVar2.f575d;
                cVar.j();
                if (((C0433h) cVar.f291e).isEmpty()) {
                    gVar2.f572a.f7102c.remove(gVar2.f574c);
                }
                gVar2.a(context);
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0902b c0902b = (C0902b) obj;
                InterfaceC1163b interfaceC1163b = (InterfaceC1163b) obj2;
                o6.j.e(c0902b, "p0");
                o6.j.e(interfaceC1163b, "p1");
                E4.n nVar = (E4.n) obj3;
                nVar.getClass();
                C0997a g8 = U.g(nVar);
                S7.e eVar2 = F.f3175a;
                return AbstractC0166y.q(g8, S7.d.f5456f, null, new E4.l(nVar, c0902b, interfaceC1163b, null), 2);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                ViewGroup viewGroup = (ViewGroup) obj;
                int intValue2 = ((Number) obj2).intValue();
                o6.j.e(viewGroup, "p0");
                return ((G1.f) obj3).V(viewGroup, intValue2);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                ((G1.f) obj3).U((View) obj2, ((Number) obj).intValue());
                return yVar;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                C0902b c0902b2 = (C0902b) obj;
                InterfaceC1163b interfaceC1163b2 = (InterfaceC1163b) obj2;
                o6.j.e(c0902b2, "p0");
                o6.j.e(interfaceC1163b2, "p1");
                Z z9 = (Z) obj3;
                z9.getClass();
                return AbstractC0832f.p(z9, z9.f3415b, c0902b2, interfaceC1163b2);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                int intValue3 = ((Number) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                i0 i0Var = ((S3.j) obj3).f5351c;
                if (booleanValue) {
                    intValue = intValue3 | ((Number) i0Var.f()).intValue();
                } else {
                    intValue = (~intValue3) & ((Number) i0Var.f()).intValue();
                }
                Integer valueOf = Integer.valueOf(intValue);
                i0Var.getClass();
                i0Var.h(null, valueOf);
                return yVar;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                C0902b c0902b3 = (C0902b) obj;
                InterfaceC1163b interfaceC1163b3 = (InterfaceC1163b) obj2;
                o6.j.e(c0902b3, "p0");
                o6.j.e(interfaceC1163b3, "p1");
                x xVar = (x) obj3;
                xVar.getClass();
                return AbstractC0832f.p(xVar, xVar.f6627d, c0902b3, interfaceC1163b3);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                C0999a c0999a = (C0999a) obj;
                f2.n nVar2 = (f2.n) obj2;
                o6.j.e(c0999a, "p0");
                C0376k c0376k = (C0376k) obj3;
                c0376k.getClass();
                i0 i0Var2 = c0376k.f7386c;
                LinkedHashMap T02 = a6.x.T0((Map) i0Var2.f());
                Z5.j jVar = (Z5.j) T02.get(c0999a);
                if (jVar != null) {
                    T02.put(c0999a, new Z5.j((C0999a) jVar.f7485d, nVar2));
                }
                i0Var2.h(null, T02);
                return yVar;
            case 9:
                return r.a((r) obj3, (List) obj, (InterfaceC0617c) obj2);
            case 10:
                return r.a((r) obj3, (List) obj, (InterfaceC0617c) obj2);
            case 11:
                return r.a((r) obj3, (List) obj, (InterfaceC0617c) obj2);
            case 12:
                return r.a((r) obj3, (List) obj, (InterfaceC0617c) obj2);
            case 13:
                X7.f fVar = (X7.f) obj;
                int intValue4 = ((Number) obj2).intValue();
                o6.j.e(fVar, "p0");
                b8.i iVar = (b8.i) obj3;
                iVar.getClass();
                if (fVar.k(intValue4) || !fVar.j(intValue4).h()) {
                    z8 = false;
                }
                iVar.f9265b = z8;
                return Boolean.valueOf(z8);
            case 14:
                final List list = (List) obj;
                InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj2;
                final C0297h c0297h = (C0297h) obj3;
                switch (c0297h.f5259a) {
                    case 0:
                        return D2.f.C(interfaceC0617c, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i10) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h.f5265g).m(aVar, list);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h.k).m(aVar, list);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h.f5262d).w(aVar, list);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h.f5267i).m(aVar, list);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h.f5264f).m(aVar, list);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h.f5261c).w(aVar, list);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h.f5263e).w(aVar, list);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h.j).m(aVar, list);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h.f5266h).m(aVar, list);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h.f5260b, false, true);
                    default:
                        return D2.f.C(interfaceC0617c, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i8) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h.j).m(aVar, list);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h.f5267i).m(aVar, list);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h.f5264f).m(aVar, list);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h.f5261c).w(aVar, list);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h.f5263e).w(aVar, list);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h.k).m(aVar, list);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h.f5262d).w(aVar, list);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h.f5265g).m(aVar, list);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h.f5266h).m(aVar, list);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h.f5260b, false, true);
                }
            case 15:
                final List list2 = (List) obj;
                InterfaceC0617c interfaceC0617c2 = (InterfaceC0617c) obj2;
                final C0297h c0297h2 = (C0297h) obj3;
                switch (c0297h2.f5259a) {
                    case 0:
                        C8 = D2.f.C(interfaceC0617c2, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i8) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h2.f5265g).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h2.k).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h2.f5262d).w(aVar, list2);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h2.f5267i).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h2.f5264f).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h2.f5261c).w(aVar, list2);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h2.f5263e).w(aVar, list2);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h2.j).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h2.f5266h).m(aVar, list2);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h2.f5260b, false, true);
                        if (C8 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        u uVar = c0297h2.f5260b;
                        final char c14 = c6 == true ? 1 : 0;
                        C8 = D2.f.C(interfaceC0617c2, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (c14) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h2.j).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h2.f5267i).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h2.f5264f).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h2.f5261c).w(aVar, list2);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h2.f5263e).w(aVar, list2);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h2.k).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h2.f5262d).w(aVar, list2);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h2.f5265g).m(aVar, list2);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h2.f5266h).m(aVar, list2);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, uVar, false, true);
                        if (C8 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C8;
            case 16:
                final List list3 = (List) obj;
                InterfaceC0617c interfaceC0617c3 = (InterfaceC0617c) obj2;
                final C0297h c0297h3 = (C0297h) obj3;
                switch (c0297h3.f5259a) {
                    case 0:
                        C9 = D2.f.C(interfaceC0617c3, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i9) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h3.f5265g).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h3.k).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h3.f5262d).w(aVar, list3);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h3.f5267i).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h3.f5264f).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h3.f5261c).w(aVar, list3);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h3.f5263e).w(aVar, list3);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h3.j).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h3.f5266h).m(aVar, list3);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h3.f5260b, false, true);
                        if (C9 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        C9 = D2.f.C(interfaceC0617c3, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i13) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h3.j).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h3.f5267i).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h3.f5264f).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h3.f5261c).w(aVar, list3);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h3.f5263e).w(aVar, list3);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h3.k).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h3.f5262d).w(aVar, list3);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h3.f5265g).m(aVar, list3);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h3.f5266h).m(aVar, list3);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h3.f5260b, false, true);
                        if (C9 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C9;
            case 17:
                final List list4 = (List) obj;
                InterfaceC0617c interfaceC0617c4 = (InterfaceC0617c) obj2;
                final S1.p pVar = (S1.p) obj3;
                switch (pVar.f5285a) {
                    case 0:
                        return D2.f.C(interfaceC0617c4, new InterfaceC1163b() { // from class: S1.m
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i13) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) pVar.f5288d).m(aVar, list4);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((o) pVar.f5289e).m(aVar, list4);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        return ((n) pVar.f5287c).w(aVar, list4);
                                }
                            }
                        }, pVar.f5286b, false, true);
                    default:
                        u uVar2 = pVar.f5286b;
                        final char c15 = c9 == true ? 1 : 0;
                        return D2.f.C(interfaceC0617c4, new InterfaceC1163b() { // from class: S1.q
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (c15) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) pVar.f5288d).m(aVar, list4);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        return ((n) pVar.f5287c).w(aVar, list4);
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((o) pVar.f5289e).m(aVar, list4);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, uVar2, false, true);
                }
            case 18:
                final List list5 = (List) obj;
                InterfaceC0617c interfaceC0617c5 = (InterfaceC0617c) obj2;
                final S1.p pVar2 = (S1.p) obj3;
                switch (pVar2.f5285a) {
                    case 0:
                        u uVar3 = pVar2.f5286b;
                        final char c16 = c10 == true ? 1 : 0;
                        C10 = D2.f.C(interfaceC0617c5, new InterfaceC1163b() { // from class: S1.m
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (c16) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) pVar2.f5288d).m(aVar, list5);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((o) pVar2.f5289e).m(aVar, list5);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        return ((n) pVar2.f5287c).w(aVar, list5);
                                }
                            }
                        }, uVar3, false, true);
                        if (C10 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        C10 = D2.f.C(interfaceC0617c5, new InterfaceC1163b() { // from class: S1.q
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i13) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) pVar2.f5288d).m(aVar, list5);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        return ((n) pVar2.f5287c).w(aVar, list5);
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((o) pVar2.f5289e).m(aVar, list5);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, pVar2.f5286b, false, true);
                        if (C10 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C10;
            case 19:
                final List list6 = (List) obj;
                InterfaceC0617c interfaceC0617c6 = (InterfaceC0617c) obj2;
                final S1.p pVar3 = (S1.p) obj3;
                switch (pVar3.f5285a) {
                    case 0:
                        C11 = D2.f.C(interfaceC0617c6, new InterfaceC1163b() { // from class: S1.m
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i14) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) pVar3.f5288d).m(aVar, list6);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((o) pVar3.f5289e).m(aVar, list6);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        return ((n) pVar3.f5287c).w(aVar, list6);
                                }
                            }
                        }, pVar3.f5286b, false, true);
                        if (C11 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        C11 = D2.f.C(interfaceC0617c6, new InterfaceC1163b() { // from class: S1.q
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i14) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) pVar3.f5288d).m(aVar, list6);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        return ((n) pVar3.f5287c).w(aVar, list6);
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((o) pVar3.f5289e).m(aVar, list6);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, pVar3.f5286b, false, true);
                        if (C11 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C11;
            case 20:
                final List list7 = (List) obj;
                InterfaceC0617c interfaceC0617c7 = (InterfaceC0617c) obj2;
                final C0297h c0297h4 = (C0297h) obj3;
                switch (c0297h4.f5259a) {
                    case 0:
                        return D2.f.C(interfaceC0617c7, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i11) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h4.f5265g).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h4.k).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h4.f5262d).w(aVar, list7);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h4.f5267i).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h4.f5264f).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h4.f5261c).w(aVar, list7);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h4.f5263e).w(aVar, list7);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h4.j).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h4.f5266h).m(aVar, list7);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h4.f5260b, false, true);
                    default:
                        return D2.f.C(interfaceC0617c7, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i9) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h4.j).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h4.f5267i).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h4.f5264f).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h4.f5261c).w(aVar, list7);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h4.f5263e).w(aVar, list7);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h4.k).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h4.f5262d).w(aVar, list7);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h4.f5265g).m(aVar, list7);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h4.f5266h).m(aVar, list7);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h4.f5260b, false, true);
                }
            case 21:
                final List list8 = (List) obj;
                InterfaceC0617c interfaceC0617c8 = (InterfaceC0617c) obj2;
                final C0297h c0297h5 = (C0297h) obj3;
                switch (c0297h5.f5259a) {
                    case 0:
                        u uVar4 = c0297h5.f5260b;
                        final char c17 = c11 == true ? 1 : 0;
                        C12 = D2.f.C(interfaceC0617c8, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (c17) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h5.f5265g).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h5.k).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h5.f5262d).w(aVar, list8);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h5.f5267i).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h5.f5264f).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h5.f5261c).w(aVar, list8);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h5.f5263e).w(aVar, list8);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h5.j).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h5.f5266h).m(aVar, list8);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, uVar4, false, true);
                        if (C12 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        C12 = D2.f.C(interfaceC0617c8, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i10) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h5.j).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h5.f5267i).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h5.f5264f).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h5.f5261c).w(aVar, list8);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h5.f5263e).w(aVar, list8);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h5.k).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h5.f5262d).w(aVar, list8);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h5.f5265g).m(aVar, list8);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h5.f5266h).m(aVar, list8);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h5.f5260b, false, true);
                        if (C12 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C12;
            case 22:
                final List list9 = (List) obj;
                InterfaceC0617c interfaceC0617c9 = (InterfaceC0617c) obj2;
                final C0297h c0297h6 = (C0297h) obj3;
                final int i15 = 8;
                switch (c0297h6.f5259a) {
                    case 0:
                        C13 = D2.f.C(interfaceC0617c9, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i15) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h6.f5265g).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h6.k).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h6.f5262d).w(aVar, list9);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h6.f5267i).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h6.f5264f).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h6.f5261c).w(aVar, list9);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h6.f5263e).w(aVar, list9);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h6.j).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h6.f5266h).m(aVar, list9);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h6.f5260b, false, true);
                        if (C13 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        C13 = D2.f.C(interfaceC0617c9, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i15) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h6.j).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h6.f5267i).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h6.f5264f).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h6.f5261c).w(aVar, list9);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h6.f5263e).w(aVar, list9);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h6.k).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h6.f5262d).w(aVar, list9);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h6.f5265g).m(aVar, list9);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h6.f5266h).m(aVar, list9);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h6.f5260b, false, true);
                        if (C13 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C13;
            case 23:
                final List list10 = (List) obj;
                InterfaceC0617c interfaceC0617c10 = (InterfaceC0617c) obj2;
                final w wVar = (w) obj3;
                switch (wVar.f5305a) {
                    case 0:
                        return D2.f.C(interfaceC0617c10, new InterfaceC1163b() { // from class: S1.s
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i13) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar.f5308d).m(aVar, list10);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar.f5309e).m(aVar, list10);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        return ((v) wVar.f5307c).w(aVar, list10);
                                }
                            }
                        }, wVar.f5306b, false, true);
                    default:
                        return D2.f.C(interfaceC0617c10, new InterfaceC1163b() { // from class: S1.y
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i14) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        return ((v) wVar.f5307c).w(aVar, list10);
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar.f5308d).m(aVar, list10);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar.f5309e).m(aVar, list10);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, wVar.f5306b, false, true);
                }
            case 24:
                final List list11 = (List) obj;
                InterfaceC0617c interfaceC0617c11 = (InterfaceC0617c) obj2;
                final w wVar2 = (w) obj3;
                switch (wVar2.f5305a) {
                    case 0:
                        u uVar5 = wVar2.f5306b;
                        final char c18 = c12 == true ? 1 : 0;
                        C14 = D2.f.C(interfaceC0617c11, new InterfaceC1163b() { // from class: S1.s
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (c18) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar2.f5308d).m(aVar, list11);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar2.f5309e).m(aVar, list11);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        return ((v) wVar2.f5307c).w(aVar, list11);
                                }
                            }
                        }, uVar5, false, true);
                        if (C14 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        C14 = D2.f.C(interfaceC0617c11, new InterfaceC1163b() { // from class: S1.y
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i13) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        return ((v) wVar2.f5307c).w(aVar, list11);
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar2.f5308d).m(aVar, list11);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar2.f5309e).m(aVar, list11);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, wVar2.f5306b, false, true);
                        if (C14 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C14;
            case 25:
                final List list12 = (List) obj;
                InterfaceC0617c interfaceC0617c12 = (InterfaceC0617c) obj2;
                final w wVar3 = (w) obj3;
                switch (wVar3.f5305a) {
                    case 0:
                        C15 = D2.f.C(interfaceC0617c12, new InterfaceC1163b() { // from class: S1.s
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i14) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar3.f5308d).m(aVar, list12);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar3.f5309e).m(aVar, list12);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        return ((v) wVar3.f5307c).w(aVar, list12);
                                }
                            }
                        }, wVar3.f5306b, false, true);
                        if (C15 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        u uVar6 = wVar3.f5306b;
                        final char c19 = c13 == true ? 1 : 0;
                        C15 = D2.f.C(interfaceC0617c12, new InterfaceC1163b() { // from class: S1.y
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (c19) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        return ((v) wVar3.f5307c).w(aVar, list12);
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar3.f5308d).m(aVar, list12);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) wVar3.f5309e).m(aVar, list12);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, uVar6, false, true);
                        if (C15 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C15;
            case 26:
                final List list13 = (List) obj;
                InterfaceC0617c interfaceC0617c13 = (InterfaceC0617c) obj2;
                final C0297h c0297h7 = (C0297h) obj3;
                switch (c0297h7.f5259a) {
                    case 0:
                        return D2.f.C(interfaceC0617c13, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i13) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h7.f5265g).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h7.k).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h7.f5262d).w(aVar, list13);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h7.f5267i).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h7.f5264f).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h7.f5261c).w(aVar, list13);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h7.f5263e).w(aVar, list13);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h7.j).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h7.f5266h).m(aVar, list13);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h7.f5260b, false, true);
                    default:
                        return D2.f.C(interfaceC0617c13, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i11) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h7.j).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h7.f5267i).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h7.f5264f).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h7.f5261c).w(aVar, list13);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h7.f5263e).w(aVar, list13);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h7.k).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h7.f5262d).w(aVar, list13);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h7.f5265g).m(aVar, list13);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h7.f5266h).m(aVar, list13);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h7.f5260b, false, true);
                }
            case 27:
                final List list14 = (List) obj;
                InterfaceC0617c interfaceC0617c14 = (InterfaceC0617c) obj2;
                final C0297h c0297h8 = (C0297h) obj3;
                switch (c0297h8.f5259a) {
                    case 0:
                        C16 = D2.f.C(interfaceC0617c14, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i12) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h8.f5265g).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h8.k).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h8.f5262d).w(aVar, list14);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h8.f5267i).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h8.f5264f).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h8.f5261c).w(aVar, list14);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h8.f5263e).w(aVar, list14);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h8.j).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h8.f5266h).m(aVar, list14);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h8.f5260b, false, true);
                        if (C16 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        C16 = D2.f.C(interfaceC0617c14, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i14) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h8.j).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h8.f5267i).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h8.f5264f).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h8.f5261c).w(aVar, list14);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h8.f5263e).w(aVar, list14);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h8.k).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h8.f5262d).w(aVar, list14);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h8.f5265g).m(aVar, list14);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h8.f5266h).m(aVar, list14);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h8.f5260b, false, true);
                        if (C16 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C16;
            case 28:
                final List list15 = (List) obj;
                InterfaceC0617c interfaceC0617c15 = (InterfaceC0617c) obj2;
                final C0297h c0297h9 = (C0297h) obj3;
                switch (c0297h9.f5259a) {
                    case 0:
                        C17 = D2.f.C(interfaceC0617c15, new InterfaceC1163b() { // from class: S1.b
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i14) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h9.f5265g).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h9.k).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h9.f5262d).w(aVar, list15);
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h9.f5267i).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h9.f5264f).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h9.f5261c).w(aVar, list15);
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0294e) c0297h9.f5263e).w(aVar, list15);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0296g) c0297h9.j).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h9.f5266h).m(aVar, list15);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h9.f5260b, false, true);
                        if (C17 != enumC0646a) {
                            return yVar;
                        }
                        break;
                    default:
                        C17 = D2.f.C(interfaceC0617c15, new InterfaceC1163b() { // from class: S1.i
                            @Override // n6.InterfaceC1163b
                            public final Object m(Object obj4) {
                                D0.a aVar = (D0.a) obj4;
                                switch (i12) {
                                    case 0:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h9.j).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    case 1:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h9.f5267i).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h9.f5264f).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h9.f5261c).w(aVar, list15);
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h9.f5263e).w(aVar, list15);
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0301l) c0297h9.k).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        o6.j.e(aVar, "_connection");
                                        return ((C0300k) c0297h9.f5262d).w(aVar, list15);
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h9.f5265g).m(aVar, list15);
                                        return Z5.y.f7506a;
                                    default:
                                        o6.j.e(aVar, "_connection");
                                        ((C0295f) c0297h9.f5266h).m(aVar, list15);
                                        return Z5.y.f7506a;
                                }
                            }
                        }, c0297h9.f5260b, false, true);
                        if (C17 != enumC0646a) {
                            return yVar;
                        }
                        break;
                }
                return C17;
            default:
                String str2 = (String) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                o6.j.e(str2, "p0");
                C0604j c0604j = (C0604j) obj3;
                c0604j.getClass();
                i0 i0Var3 = c0604j.f10389b;
                if (booleanValue2) {
                    str = str2;
                }
                i0Var3.g(str);
                return yVar;
        }
    }
}
