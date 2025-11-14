package O3;

import n6.InterfaceC1162a;
import o6.C1282a;
import w4.C1706k;

/* renamed from: O3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0217o extends C1282a implements InterfaceC1162a {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0217o(int i4, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i4, obj, cls, str, str2, i8);
        this.k = i9;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        C3.a aVar;
        D3.d dVar;
        C3.a aVar2;
        D3.d dVar2;
        C3.a aVar3;
        D3.d dVar3;
        switch (this.k) {
            case 0:
                E3.a aVar4 = (E3.a) ((a0) this.f13621d).f3924b.f1948c.f601h.f();
                if (aVar4 != null && (aVar = aVar4.f1193m) != null && (dVar = aVar.k) != null) {
                    dVar.j();
                }
                return Z5.y.f7506a;
            case 1:
                E3.a aVar5 = (E3.a) ((a0) this.f13621d).f3924b.f1948c.f601h.f();
                if (aVar5 != null && (aVar2 = aVar5.f1193m) != null && (dVar2 = aVar2.k) != null) {
                    dVar2.a();
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                E3.a aVar6 = (E3.a) ((a0) this.f13621d).f3924b.f1948c.f601h.f();
                if (aVar6 != null && (aVar3 = aVar6.f1193m) != null && (dVar3 = aVar3.k) != null) {
                    dVar3.g();
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                E3.a aVar7 = (E3.a) ((u4.m) this.f13621d).f15345b.f1948c.f601h.f();
                if (aVar7 != null) {
                    aVar7.j();
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                E3.a aVar8 = (E3.a) ((u4.m) this.f13621d).f15345b.f1948c.f601h.f();
                if (aVar8 != null) {
                    aVar8.a();
                }
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                E3.a aVar9 = (E3.a) ((C1706k) this.f13621d).f15708b.f1948c.f601h.f();
                if (aVar9 != null) {
                    aVar9.j();
                }
                return Z5.y.f7506a;
            default:
                E3.a aVar10 = (E3.a) ((C1706k) this.f13621d).f15708b.f1948c.f601h.f();
                if (aVar10 != null) {
                    aVar10.a();
                }
                return Z5.y.f7506a;
        }
    }
}
