package k4;

import android.content.Context;
import android.view.View;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import h4.AbstractC0832f;
import j2.C0902b;
import java.util.List;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import s3.C1491b;
import t3.C1572j;
import w7.AbstractC1759v;
import x7.C1828j;

/* loaded from: classes.dex */
public final /* synthetic */ class I extends o6.i implements InterfaceC1164c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12023l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i4, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i4, obj, cls, str, str2, i8, i9);
        this.f12023l = i10;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        boolean z8;
        switch (this.f12023l) {
            case 0:
                int intValue = ((Number) obj).intValue();
                View view = (View) obj2;
                J j = (J) this.f13629e;
                if (intValue != 0) {
                    j.getClass();
                } else {
                    J2.a aVar = J2.a.f2372n;
                    if (view != null) {
                        ((J2.b) j.f12026w.getValue()).a(aVar, view);
                    } else {
                        ((J2.b) j.f12026w.getValue()).b(aVar);
                    }
                }
                return Z5.y.f7506a;
            case 1:
                n2.j jVar = (n2.j) this.f13629e;
                return D2.f.C((InterfaceC0617c) obj2, new n2.g(jVar, (List) obj, 2), jVar.f12901a, false, true);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                n2.j jVar2 = (n2.j) this.f13629e;
                Object C8 = D2.f.C((InterfaceC0617c) obj2, new n2.g(jVar2, (List) obj, 0), jVar2.f12901a, false, true);
                if (C8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return C8;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                n2.j jVar3 = (n2.j) this.f13629e;
                Object C9 = D2.f.C((InterfaceC0617c) obj2, new n2.g(jVar3, (List) obj, 1), jVar3.f12901a, false, true);
                if (C9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return C9;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                C0902b c0902b = (C0902b) obj;
                InterfaceC1163b interfaceC1163b = (InterfaceC1163b) obj2;
                o6.j.e(c0902b, "p0");
                o6.j.e(interfaceC1163b, "p1");
                q4.U u8 = (q4.U) this.f13629e;
                u8.getClass();
                return AbstractC0832f.p(u8, u8.f14065b, c0902b, interfaceC1163b);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Context context = (Context) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                o6.j.e(context, "p0");
                C1491b c1491b = (C1491b) this.f13629e;
                C1572j c1572j = c1491b.f14517f;
                if (c1572j != null) {
                    c1491b.a(context, C1572j.a(c1572j, false, false, booleanValue, 7));
                }
                return Z5.y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                int intValue2 = ((Number) obj).intValue();
                View view2 = (View) obj2;
                u4.k kVar = (u4.k) this.f13629e;
                if (intValue2 != 0) {
                    kVar.getClass();
                } else {
                    J2.a aVar2 = J2.a.f2384z;
                    if (view2 != null) {
                        kVar.t().f15346c.a(aVar2, view2);
                    } else {
                        kVar.t().f15346c.b(aVar2);
                    }
                }
                return Z5.y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1759v abstractC1759v = (AbstractC1759v) obj;
                AbstractC1759v abstractC1759v2 = (AbstractC1759v) obj2;
                o6.j.e(abstractC1759v, "p0");
                o6.j.e(abstractC1759v2, "p1");
                ((x7.t) this.f13629e).getClass();
                x7.k.f16296b.getClass();
                x7.l lVar = C1828j.f16295b;
                if (lVar.b(abstractC1759v, abstractC1759v2) && !lVar.b(abstractC1759v2, abstractC1759v)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                AbstractC1759v abstractC1759v3 = (AbstractC1759v) obj;
                AbstractC1759v abstractC1759v4 = (AbstractC1759v) obj2;
                o6.j.e(abstractC1759v3, "p0");
                o6.j.e(abstractC1759v4, "p1");
                return Boolean.valueOf(((x7.l) this.f13629e).a(abstractC1759v3, abstractC1759v4));
        }
    }
}
