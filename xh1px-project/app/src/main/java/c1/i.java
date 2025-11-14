package c1;

import M1.l;
import P1.w;
import Q4.t;
import V4.q;
import W4.x;
import a5.C0423g;
import android.content.Context;
import b2.r;
import b3.n;
import c5.C0581a;
import h4.C0831e;
import i1.C0879a;
import j1.AbstractC0900a;
import o2.C1229a;
import x3.C1787d;
import y3.C1838g;

/* loaded from: classes.dex */
public final class i implements Y5.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f9492a;

    /* renamed from: b, reason: collision with root package name */
    public final C0562c f9493b;

    /* renamed from: c, reason: collision with root package name */
    public final j f9494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9495d;

    public i(h hVar, C0562c c0562c, j jVar, int i4) {
        this.f9492a = hVar;
        this.f9493b = c0562c;
        this.f9494c = jVar;
        this.f9495d = i4;
    }

    @Override // Y5.c
    public final Object get() {
        C0562c c0562c = this.f9493b;
        h hVar = this.f9492a;
        int i4 = this.f9495d;
        switch (i4) {
            case 0:
                return new c3.j((n) hVar.f9459N.get(), (Y1.d) hVar.f9471d.get());
            case 1:
                return new b5.h((Context) hVar.f9468a.f6634e, AbstractC0900a.b(), (r) hVar.f9449C.get());
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new l((J1.e) c0562c.f9440d.get());
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1838g(AbstractC0900a.b(), (C1787d) hVar.f9461P.get(), (J1.e) c0562c.f9440d.get(), (r) hVar.f9449C.get(), (C1229a) hVar.f9478m.get(), (x2.f) hVar.f9489x.get(), (C0879a) hVar.f9450D.get());
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new C0831e(AbstractC0900a.b(), (v2.h) hVar.f9452F.get(), (x2.f) hVar.f9489x.get());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new Y4.i(AbstractC0900a.a(), AbstractC0900a.b(), (r) hVar.f9449C.get(), (C1229a) hVar.f9478m.get());
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new q((Context) hVar.f9468a.f6634e, (A3.a) hVar.f9457L.get(), (r) hVar.f9449C.get(), (C1229a) hVar.f9478m.get(), (Y1.d) hVar.f9471d.get());
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                h hVar2 = this.f9494c.f9496a;
                return new x(new A4.a((Context) hVar2.f9468a.f6634e, (C1229a) hVar2.f9478m.get(), (C0423g) hVar2.f9462Q.get(), (x2.f) hVar2.f9489x.get(), (r) hVar2.f9449C.get()), (C0423g) hVar.f9462Q.get(), (q1.e) hVar.f9475h.get(), (r) hVar.f9449C.get(), (C1229a) hVar.f9478m.get());
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new C0581a((Context) hVar.f9468a.f6634e, (A3.a) hVar.f9457L.get(), (w) hVar.f9465T.get(), (J1.e) c0562c.f9440d.get(), (x2.f) hVar.f9489x.get(), (C0879a) hVar.f9450D.get());
            case 9:
                return new d5.r((w) hVar.f9465T.get(), (A3.a) hVar.f9457L.get(), (x2.f) hVar.f9489x.get());
            case 10:
                return new t((L4.j) hVar.f9456J.get());
            case 11:
                return new R4.i((L4.j) hVar.f9456J.get());
            case 12:
                return new O4.l((v2.h) hVar.f9452F.get(), (L4.j) hVar.f9456J.get());
            default:
                throw new AssertionError(i4);
        }
    }
}
