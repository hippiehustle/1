package P6;

import C6.InterfaceC0002c;
import C6.InterfaceC0019u;
import F6.N;
import F6.U;
import a6.AbstractC0436k;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;

/* renamed from: P6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281d implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0281d f4553e = new C0281d(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C0281d f4554f = new C0281d(1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0281d f4555g = new C0281d(2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0281d f4556h = new C0281d(3);

    /* renamed from: i, reason: collision with root package name */
    public static final C0281d f4557i = new C0281d(4);
    public static final C0281d j = new C0281d(5);
    public static final C0281d k = new C0281d(6);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4558d;

    public /* synthetic */ C0281d(int i4) {
        this.f4558d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        InterfaceC0002c b4;
        String f8;
        boolean z8 = false;
        switch (this.f4558d) {
            case 0:
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
                int i4 = AbstractC0282e.f4559l;
                o6.j.e(interfaceC0002c, "it");
                return Boolean.valueOf(AbstractC0436k.l0(F.f4539f, D2.f.f(interfaceC0002c)));
            case 1:
                InterfaceC0002c interfaceC0002c2 = (InterfaceC0002c) obj;
                int i8 = AbstractC0282e.f4559l;
                o6.j.e(interfaceC0002c2, "it");
                if ((interfaceC0002c2 instanceof InterfaceC0019u) && AbstractC0436k.l0(F.f4539f, D2.f.f(interfaceC0002c2))) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC0002c interfaceC0002c3 = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c3, "it");
                return Boolean.valueOf(E2.c.c0(interfaceC0002c3));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return ((U) obj).b();
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC0002c interfaceC0002c4 = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c4, "it");
                return Boolean.valueOf(E2.c.c0(AbstractC1098d.k(interfaceC0002c4)));
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0002c interfaceC0002c5 = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c5, "it");
                int i9 = AbstractC0280c.f4552l;
                N n3 = (N) interfaceC0002c5;
                if (z6.h.A(n3) && AbstractC1098d.b(n3, new B6.n(5, n3)) != null) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            default:
                InterfaceC0002c interfaceC0002c6 = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c6, "it");
                if (z6.h.A(interfaceC0002c6)) {
                    int i10 = AbstractC0282e.f4559l;
                    C c6 = null;
                    if (F.f4538e.contains(interfaceC0002c6.getName()) && (b4 = AbstractC1098d.b(interfaceC0002c6, f4554f)) != null && (f8 = D2.f.f(b4)) != null) {
                        c6 = F.f4535b.contains(f8) ? C.f4524d : ((E) a6.x.M0(F.f4537d, f8)) == E.NULL ? C.f4526f : C.f4525e;
                    }
                    if (c6 != null) {
                        z8 = true;
                    }
                }
                return Boolean.valueOf(z8);
        }
    }
}
