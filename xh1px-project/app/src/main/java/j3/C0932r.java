package j3;

import android.content.Context;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import c1.C0564e;
import f3.InterfaceC0707a;
import i1.C0879a;
import j1.AbstractC0900a;
import k3.C0964k;
import k4.C0977i;
import k4.C0985q;
import k4.X;
import l3.C1020s;
import m3.C1060E;
import o3.C1250u;
import o4.O;
import p3.C1312h;
import q2.C1365k;
import q4.U;
import r3.C1460x;
import s4.C1504l;
import v4.C1676k;
import w4.C1706k;

/* renamed from: j3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932r implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0564e f11887b;

    public /* synthetic */ C0932r(C0564e c0564e, int i4) {
        this.f11886a = i4;
        this.f11887b = c0564e;
    }

    @Override // androidx.lifecycle.b0
    public final Z b(Class cls) {
        switch (this.f11886a) {
            case 0:
                o6.j.e(cls, "modelClass");
                Object p8 = D2.f.p(this.f11887b, InterfaceC0707a.class);
                o6.j.d(p8, "get(...)");
                return new C0914I((Context) ((C0564e) ((InterfaceC0707a) p8)).f9443a.f9468a.f6634e);
            case 1:
                o6.j.e(cls, "modelClass");
                Object p9 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p9, "get(...)");
                c1.h hVar = ((C0564e) ((G3.a) p9)).f9443a;
                return new j4.l((Context) hVar.f9468a.f6634e, (q1.e) hVar.f9475h.get(), (H3.n) hVar.K.get());
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(cls, "modelClass");
                Object p10 = D2.f.p(this.f11887b, InterfaceC0707a.class);
                o6.j.d(p10, "get(...)");
                c1.h hVar2 = ((C0564e) ((InterfaceC0707a) p10)).f9443a;
                return new C0964k((Context) hVar2.f9468a.f6634e, (g3.e) hVar2.f9479n.get());
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(cls, "modelClass");
                Object p11 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p11, "get(...)");
                c1.h hVar3 = ((C0564e) ((G3.a) p11)).f9443a;
                return new C0977i((a2.h) hVar3.f9476i.get(), (H3.n) hVar3.K.get(), (J2.b) hVar3.j.get());
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(cls, "modelClass");
                Object p12 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p12, "get(...)");
                return new C0985q((H3.n) ((C0564e) ((G3.a) p12)).f9443a.K.get());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e(cls, "modelClass");
                Object p13 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p13, "get(...)");
                c1.h hVar4 = ((C0564e) ((G3.a) p13)).f9443a;
                return new X((Context) hVar4.f9468a.f6634e, (q1.e) hVar4.f9475h.get(), (H3.n) hVar4.K.get(), (J2.b) hVar4.j.get());
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                o6.j.e(cls, "modelClass");
                Object p14 = D2.f.p(this.f11887b, InterfaceC0707a.class);
                o6.j.d(p14, "get(...)");
                return new C1020s();
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                o6.j.e(cls, "modelClass");
                Object p15 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p15, "get(...)");
                c1.h hVar5 = ((C0564e) ((G3.a) p15)).f9443a;
                return new l4.p((Context) hVar5.f9468a.f6634e, AbstractC0900a.b(), (Y1.d) hVar5.f9471d.get(), (b2.r) hVar5.f9449C.get(), (q1.e) hVar5.f9475h.get(), (H3.n) hVar5.K.get(), (J2.b) hVar5.j.get());
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                o6.j.e(cls, "modelClass");
                Object p16 = D2.f.p(this.f11887b, InterfaceC0707a.class);
                o6.j.d(p16, "get(...)");
                return new C1060E((Context) ((C0564e) ((InterfaceC0707a) p16)).f9443a.f9468a.f6634e);
            case 9:
                o6.j.e(cls, "modelClass");
                Object p17 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p17, "get(...)");
                c1.h hVar6 = ((C0564e) ((G3.a) p17)).f9443a;
                return new m4.k((Context) hVar6.f9468a.f6634e, (H3.n) hVar6.K.get());
            case 10:
                o6.j.e(cls, "modelClass");
                Object p18 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p18, "get(...)");
                return new n4.z((H3.n) ((C0564e) ((G3.a) p18)).f9443a.K.get());
            case 11:
                o6.j.e(cls, "modelClass");
                Object p19 = D2.f.p(this.f11887b, InterfaceC0707a.class);
                o6.j.d(p19, "get(...)");
                c1.h hVar7 = ((C0564e) ((InterfaceC0707a) p19)).f9443a;
                return new C1250u((Context) hVar7.f9468a.f6634e, AbstractC0900a.a(), (g3.e) hVar7.f9479n.get(), (C1365k) hVar7.f9490y.get());
            case 12:
                o6.j.e(cls, "modelClass");
                Object p20 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p20, "get(...)");
                return new O((H3.n) ((C0564e) ((G3.a) p20)).f9443a.K.get());
            case 13:
                o6.j.e(cls, "modelClass");
                Object p21 = D2.f.p(this.f11887b, InterfaceC0707a.class);
                o6.j.d(p21, "get(...)");
                return new C1312h((g3.e) ((C0564e) ((InterfaceC0707a) p21)).f9443a.f9479n.get());
            case 14:
                o6.j.e(cls, "modelClass");
                Object p22 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p22, "get(...)");
                return new p4.B((H3.n) ((C0564e) ((G3.a) p22)).f9443a.K.get());
            case 15:
                o6.j.e(cls, "modelClass");
                Object p23 = D2.f.p(this.f11887b, InterfaceC0707a.class);
                o6.j.d(p23, "get(...)");
                c1.h hVar8 = ((C0564e) ((InterfaceC0707a) p23)).f9443a;
                return new q3.m((Context) hVar8.f9468a.f6634e, (g3.e) hVar8.f9479n.get());
            case 16:
                o6.j.e(cls, "modelClass");
                Object p24 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p24, "get(...)");
                c1.h hVar9 = ((C0564e) ((G3.a) p24)).f9443a;
                return new U((Context) hVar9.f9468a.f6634e, (q1.e) hVar9.f9475h.get(), (H3.n) hVar9.K.get(), (J2.b) hVar9.j.get(), (x2.f) hVar9.f9489x.get());
            case 17:
                o6.j.e(cls, "modelClass");
                Object p25 = D2.f.p(this.f11887b, InterfaceC0707a.class);
                o6.j.d(p25, "get(...)");
                return new C1460x((g3.e) ((C0564e) ((InterfaceC0707a) p25)).f9443a.f9479n.get());
            case 18:
                o6.j.e(cls, "modelClass");
                Object p26 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p26, "get(...)");
                return new r4.n((H3.n) ((C0564e) ((G3.a) p26)).f9443a.K.get());
            case 19:
                o6.j.e(cls, "modelClass");
                Object p27 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p27, "get(...)");
                c1.h hVar10 = ((C0564e) ((G3.a) p27)).f9443a;
                return new C1504l((H3.n) hVar10.K.get(), (J2.b) hVar10.j.get());
            case 20:
                o6.j.e(cls, "modelClass");
                Object p28 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p28, "get(...)");
                c1.h hVar11 = ((C0564e) ((G3.a) p28)).f9443a;
                return new t4.x((Context) hVar11.f9468a.f6634e, (Y1.d) hVar11.f9471d.get(), (H3.n) hVar11.K.get());
            case 21:
                o6.j.e(cls, "modelClass");
                Object p29 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p29, "get(...)");
                c1.h hVar12 = ((C0564e) ((G3.a) p29)).f9443a;
                return new u4.m((H3.n) hVar12.K.get(), (J2.b) hVar12.j.get());
            case 22:
                o6.j.e(cls, "modelClass");
                Object p30 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p30, "get(...)");
                c1.h hVar13 = ((C0564e) ((G3.a) p30)).f9443a;
                return new C1676k((Context) hVar13.f9468a.f6634e, (C0879a) hVar13.f9450D.get(), (C4.f) hVar13.f9458M.get());
            default:
                o6.j.e(cls, "modelClass");
                Object p31 = D2.f.p(this.f11887b, G3.a.class);
                o6.j.d(p31, "get(...)");
                return new C1706k((H3.n) ((C0564e) ((G3.a) p31)).f9443a.K.get());
        }
    }
}
