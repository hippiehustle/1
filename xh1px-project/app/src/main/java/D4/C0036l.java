package D4;

import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.List;
import n6.InterfaceC1165d;

/* renamed from: D4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036l extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f968h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f969i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0036l(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f968h = i8;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f968h) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                C0036l c0036l = new C0036l(3, (InterfaceC0617c) obj3, 0);
                c0036l.j = (List) obj;
                c0036l.f969i = booleanValue;
                return c0036l.v(Z5.y.f7506a);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                C0036l c0036l2 = new C0036l(3, (InterfaceC0617c) obj3, 1);
                c0036l2.j = (N4.a) obj;
                c0036l2.f969i = booleanValue2;
                return c0036l2.v(Z5.y.f7506a);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                C0036l c0036l3 = new C0036l(3, (InterfaceC0617c) obj3, 2);
                c0036l3.f969i = booleanValue3;
                c0036l3.j = (v2.i) obj2;
                return c0036l3.v(Z5.y.f7506a);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                C0036l c0036l4 = new C0036l(3, (InterfaceC0617c) obj3, 3);
                c0036l4.j = (V4.a) obj;
                c0036l4.f969i = booleanValue4;
                return c0036l4.v(Z5.y.f7506a);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                C0036l c0036l5 = new C0036l(3, (InterfaceC0617c) obj3, 4);
                c0036l5.f969i = booleanValue5;
                c0036l5.j = (p2.e) obj2;
                return c0036l5.v(Z5.y.f7506a);
            default:
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                C0036l c0036l6 = new C0036l(3, (InterfaceC0617c) obj3, 5);
                c0036l6.j = (I3.a) obj;
                c0036l6.f969i = booleanValue6;
                return c0036l6.v(Z5.y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f968h) {
            case 0:
                List list = (List) this.j;
                boolean z12 = this.f969i;
                Z5.a.d(obj);
                if (!z12) {
                    return a6.s.f7766d;
                }
                return list;
            case 1:
                N4.a aVar = (N4.a) this.j;
                boolean z13 = this.f969i;
                Z5.a.d(obj);
                if (aVar != null && !z13) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                boolean z14 = this.f969i;
                v2.i iVar = (v2.i) this.j;
                Z5.a.d(obj);
                if (!z14 && iVar != v2.i.f15512f) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                V4.a aVar2 = (V4.a) this.j;
                boolean z15 = this.f969i;
                Z5.a.d(obj);
                if (aVar2 == V4.a.f6371e && !z15) {
                    return V4.a.f6370d;
                }
                return aVar2;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                boolean z16 = this.f969i;
                p2.e eVar = (p2.e) this.j;
                Z5.a.d(obj);
                if (z16 && eVar != null && eVar.f13700b.length() > 0 && !eVar.f13701c.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                I3.a aVar3 = (I3.a) this.j;
                boolean z17 = this.f969i;
                Z5.a.d(obj);
                if (aVar3.f2088c && z17) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
    }
}
