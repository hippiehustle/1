package D4;

import L3.S;
import Z3.C0376k;
import android.content.Context;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import c1.C0564e;
import d4.C0604j;
import f3.InterfaceC0707a;
import h3.C0826n;
import q2.C1365k;

/* loaded from: classes.dex */
public final class y implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0564e f999b;

    public /* synthetic */ y(C0564e c0564e, int i4) {
        this.f998a = i4;
        this.f999b = c0564e;
    }

    @Override // androidx.lifecycle.b0
    public final Z b(Class cls) {
        switch (this.f998a) {
            case 0:
                o6.j.e(cls, "modelClass");
                Object p8 = D2.f.p(this.f999b, B4.a.class);
                o6.j.d(p8, "get(...)");
                return new s((v2.h) ((C0564e) ((B4.a) p8)).f9443a.f9452F.get());
            case 1:
                o6.j.e(cls, "modelClass");
                Object p9 = D2.f.p(this.f999b, B4.a.class);
                o6.j.d(p9, "get(...)");
                return new P((v2.h) ((C0564e) ((B4.a) p9)).f9443a.f9452F.get());
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(cls, "modelClass");
                Object p10 = D2.f.p(this.f999b, B4.a.class);
                o6.j.d(p10, "get(...)");
                c1.h hVar = ((C0564e) ((B4.a) p10)).f9443a;
                return new E4.n((C4.f) hVar.f9458M.get(), (q1.e) hVar.f9475h.get());
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(cls, "modelClass");
                Object p11 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p11, "get(...)");
                c1.h hVar2 = ((C0564e) ((G3.a) p11)).f9443a;
                return new J3.H((v2.h) hVar2.f9452F.get(), (H3.n) hVar2.K.get(), (L4.j) hVar2.f9456J.get(), (A3.a) hVar2.f9457L.get(), (J2.b) hVar2.j.get(), (C4.f) hVar2.f9458M.get());
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(cls, "modelClass");
                Object p12 = D2.f.p(this.f999b, B4.a.class);
                o6.j.d(p12, "get(...)");
                c1.h hVar3 = ((C0564e) ((B4.a) p12)).f9443a;
                return new C0028d((Context) hVar3.f9468a.f6634e, (C4.f) hVar3.f9458M.get());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e(cls, "modelClass");
                Object p13 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p13, "get(...)");
                return ((C0564e) ((G3.a) p13)).b();
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                o6.j.e(cls, "modelClass");
                Object p14 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p14, "get(...)");
                return ((C0564e) ((G3.a) p14)).b();
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                o6.j.e(cls, "modelClass");
                Object p15 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p15, "get(...)");
                return new S((H3.n) ((C0564e) ((G3.a) p15)).f9443a.K.get());
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                o6.j.e(cls, "modelClass");
                Object p16 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p16, "get(...)");
                c1.h hVar4 = ((C0564e) ((G3.a) p16)).f9443a;
                return new M3.Z((Context) hVar4.f9468a.f6634e, (q1.e) hVar4.f9475h.get(), (H3.n) hVar4.K.get(), (J2.b) hVar4.j.get());
            case 9:
                o6.j.e(cls, "modelClass");
                Object p17 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p17, "get(...)");
                c1.h hVar5 = ((C0564e) ((G3.a) p17)).f9443a;
                return new M3.H((q1.e) hVar5.f9475h.get(), (H3.n) hVar5.K.get(), (Y1.d) hVar5.f9471d.get());
            case 10:
                o6.j.e(cls, "modelClass");
                Object p18 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p18, "get(...)");
                c1.h hVar6 = ((C0564e) ((G3.a) p18)).f9443a;
                return new N3.j((Context) hVar6.f9468a.f6634e, (H3.n) hVar6.K.get());
            case 11:
                o6.j.e(cls, "modelClass");
                Object p19 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p19, "get(...)");
                return ((C0564e) ((G3.a) p19)).a();
            case 12:
                o6.j.e(cls, "modelClass");
                Object p20 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p20, "get(...)");
                return ((C0564e) ((G3.a) p20)).a();
            case 13:
                o6.j.e(cls, "modelClass");
                Object p21 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p21, "get(...)");
                return ((C0564e) ((G3.a) p21)).a();
            case 14:
                o6.j.e(cls, "modelClass");
                Object p22 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p22, "get(...)");
                return new P3.g((Context) ((C0564e) ((G3.a) p22)).f9443a.f9468a.f6634e);
            case 15:
                o6.j.e(cls, "modelClass");
                Object p23 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p23, "get(...)");
                return new Q3.h((Context) ((C0564e) ((G3.a) p23)).f9443a.f9468a.f6634e);
            case 16:
                o6.j.e(cls, "modelClass");
                Object p24 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p24, "get(...)");
                return new R3.w((H3.n) ((C0564e) ((G3.a) p24)).f9443a.K.get());
            case 17:
                o6.j.e(cls, "modelClass");
                Object p25 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p25, "get(...)");
                return new S3.j();
            case 18:
                o6.j.e(cls, "modelClass");
                Object p26 = D2.f.p(this.f999b, K4.a.class);
                o6.j.d(p26, "get(...)");
                c1.h hVar7 = ((C0564e) ((K4.a) p26)).f9443a;
                return new S4.k((J2.b) hVar7.j.get(), (L4.j) hVar7.f9456J.get(), (Y1.d) hVar7.f9471d.get());
            case 19:
                o6.j.e(cls, "modelClass");
                Object p27 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p27, "get(...)");
                return new T3.H((H3.n) ((C0564e) ((G3.a) p27)).f9443a.K.get());
            case 20:
                o6.j.e(cls, "modelClass");
                Object p28 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p28, "get(...)");
                c1.h hVar8 = ((C0564e) ((G3.a) p28)).f9443a;
                return new U3.A((Context) hVar8.f9468a.f6634e, (H3.n) hVar8.K.get());
            case 21:
                o6.j.e(cls, "modelClass");
                Object p29 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p29, "get(...)");
                return new V3.n((J2.b) ((C0564e) ((G3.a) p29)).f9443a.j.get());
            case 22:
                o6.j.e(cls, "modelClass");
                Object p30 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p30, "get(...)");
                return new W3.z((H3.n) ((C0564e) ((G3.a) p30)).f9443a.K.get());
            case 23:
                o6.j.e(cls, "modelClass");
                Object p31 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p31, "get(...)");
                c1.h hVar9 = ((C0564e) ((G3.a) p31)).f9443a;
                return new X3.C((Context) hVar9.f9468a.f6634e, (H3.n) hVar9.K.get());
            case 24:
                o6.j.e(cls, "modelClass");
                Object p32 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p32, "get(...)");
                return new Y3.A((H3.n) ((C0564e) ((G3.a) p32)).f9443a.K.get());
            case 25:
                o6.j.e(cls, "modelClass");
                Object p33 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p33, "get(...)");
                c1.h hVar10 = ((C0564e) ((G3.a) p33)).f9443a;
                return new C0376k((Context) hVar10.f9468a.f6634e, (H3.n) hVar10.K.get());
            case 26:
                o6.j.e(cls, "modelClass");
                Object p34 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p34, "get(...)");
                c1.h hVar11 = ((C0564e) ((G3.a) p34)).f9443a;
                return new Z3.N((Context) hVar11.f9468a.f6634e, (H3.n) hVar11.K.get());
            case 27:
                o6.j.e(cls, "modelClass");
                Object p35 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p35, "get(...)");
                return new c4.h((H3.n) ((C0564e) ((G3.a) p35)).f9443a.K.get());
            case 28:
                o6.j.e(cls, "modelClass");
                Object p36 = D2.f.p(this.f999b, G3.a.class);
                o6.j.d(p36, "get(...)");
                return new C0604j();
            default:
                o6.j.e(cls, "modelClass");
                Object p37 = D2.f.p(this.f999b, InterfaceC0707a.class);
                o6.j.d(p37, "get(...)");
                c1.h hVar12 = ((C0564e) ((InterfaceC0707a) p37)).f9443a;
                return new C0826n((g3.e) hVar12.f9479n.get(), (C1365k) hVar12.f9490y.get(), (L4.j) hVar12.f9456J.get());
        }
    }
}
