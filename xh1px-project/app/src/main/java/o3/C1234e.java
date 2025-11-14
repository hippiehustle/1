package o3;

import Z5.y;
import androidx.lifecycle.U;
import b6.C0541i;
import k0.AbstractC0948c;
import k2.AbstractC0951a;
import k2.C0952b;
import n0.AbstractC1143u;
import n0.C1144v;
import n6.InterfaceC1163b;
import p0.C1299g;
import q0.C1346b;
import q4.X;
import u0.C1610a;

/* renamed from: o3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1234e implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13450d;

    public /* synthetic */ C1234e(int i4) {
        this.f13450d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f13450d) {
            case 0:
                o6.j.e((p2.d) obj, "it");
                return y.f7506a;
            case 1:
                Z5.j jVar = (Z5.j) obj;
                o6.j.e(jVar, "it");
                return (String) jVar.f7485d;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e((AbstractC0948c) obj, "$this$initializer");
                return new C1299g.a();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0948c abstractC0948c = (AbstractC0948c) obj;
                o6.j.e(abstractC0948c, "$this$initializer");
                return new C1346b(U.c(abstractC0948c));
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                AbstractC1143u abstractC1143u = (AbstractC1143u) obj;
                o6.j.e(abstractC1143u, "destination");
                C1144v c1144v = abstractC1143u.f12814f;
                if (c1144v == null || c1144v.j.f4113a != abstractC1143u.f12813e.f13342a) {
                    return null;
                }
                return c1144v;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                AbstractC1143u abstractC1143u2 = (AbstractC1143u) obj;
                o6.j.e(abstractC1143u2, "destination");
                C1144v c1144v2 = abstractC1143u2.f12814f;
                if (c1144v2 == null || c1144v2.j.f4113a != abstractC1143u2.f12813e.f13342a) {
                    return null;
                }
                return c1144v2;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC1143u abstractC1143u3 = (AbstractC1143u) obj;
                o6.j.e(abstractC1143u3, "it");
                return Integer.valueOf(abstractC1143u3.f12813e.f13342a);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                o6.j.e((p2.d) obj, "it");
                return y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0951a abstractC0951a = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a, "oldValue");
                return AbstractC0951a.f(abstractC0951a, null, 0, !abstractC0951a.j(), 111);
            case 9:
                AbstractC0951a abstractC0951a2 = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a2, "oldValue");
                if (abstractC0951a2 instanceof C0952b) {
                    return C0952b.m((C0952b) abstractC0951a2, null, null, null, 0, null, null, false, 0, !r1.f11967i, 255);
                }
                return abstractC0951a2;
            case 10:
                o6.j.e((C1610a) obj, "config");
                throw new Z5.i();
            case 11:
                D0.c cVar = (D0.c) obj;
                o6.j.e(cVar, "it");
                return Boolean.valueOf(cVar.H());
            default:
                D0.c cVar2 = (D0.c) obj;
                o6.j.e(cVar2, "statement");
                C0541i c0541i = new C0541i();
                while (cVar2.H()) {
                    c0541i.add(Integer.valueOf((int) cVar2.getLong(0)));
                }
                return X.j(c0541i);
        }
    }
}
