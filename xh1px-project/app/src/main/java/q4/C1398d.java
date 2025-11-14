package q4;

import k2.C0952b;
import l2.C1001a;
import n6.InterfaceC1162a;

/* renamed from: q4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1398d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1419y f14098e;

    public /* synthetic */ C1398d(C1419y c1419y, int i4) {
        this.f14097d = i4;
        this.f14098e = c1419y;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        C0952b c0952b;
        switch (this.f14097d) {
            case 0:
                C1419y c1419y = this.f14098e;
                c1419y.h(new C1398d(c1419y, 5));
                return Z5.y.f7506a;
            case 1:
                C1419y c1419y2 = this.f14098e;
                c1419y2.h(new C1398d(c1419y2, 2));
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C1419y c1419y3 = this.f14098e;
                H3.n nVar = c1419y3.K().f14066c;
                C1001a g8 = nVar.f1950e.g();
                Z5.j jVar = null;
                if (g8 != null && (c0952b = (C0952b) nVar.f1950e.c()) != null) {
                    jVar = new Z5.j(g8, c0952b);
                }
                if (jVar != null) {
                    c1419y3.o().d(c1419y3.k(), new D4.A((C1001a) jVar.f7485d, (C0952b) jVar.f7486e), true);
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C1419y c1419y4 = this.f14098e;
                c1419y4.o().d(c1419y4.k(), new m4.i(), false);
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                C1419y.H(this.f14098e);
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                C1419y c1419y5 = this.f14098e;
                c1419y5.o().d(c1419y5.k(), new l4.l(0), true);
                return Z5.y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f14098e.L(0);
                return Z5.y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                C1419y c1419y6 = this.f14098e;
                c1419y6.h(new C1398d(c1419y6, 3));
                return Z5.y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                C1419y c1419y7 = this.f14098e;
                c1419y7.h(new C1398d(c1419y7, 6));
                return Z5.y.f7506a;
            default:
                C1419y.G(this.f14098e);
                return Z5.y.f7506a;
        }
    }
}
