package y7;

import C6.AbstractC0015p;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import C6.InterfaceC0011l;
import C6.O;
import F6.C0050j;
import F6.C0052l;
import a6.s;
import f7.C0725e;
import java.util.List;
import p7.InterfaceC1333o;
import q4.X;
import v7.C1679b;
import w7.Q;
import x7.C1824f;

/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1842a extends C0052l {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1842a(C0725e c0725e) {
        super(r2, c0725e, r4, r5, r6, r7);
        l lVar = l.f16567a;
        e eVar = l.f16568b;
        C1679b c1679b = v7.k.f15560e;
        EnumC0023y enumC0023y = EnumC0023y.f780g;
        EnumC0005f enumC0005f = EnumC0005f.f741d;
        List list = s.f7766d;
        C0050j c0050j = new C0050j(this, null, D6.i.f1043a, true, 1, O.f726a);
        c0050j.a1(list, AbstractC0015p.f757d);
        g b4 = l.b(h.f16527i, c0050j.getName().f10804d, "");
        k kVar = k.ERROR_CLASS;
        c0050j.k = new i(l.d(kVar, new String[0]), b4, kVar, list, false, new String[0]);
        r0(b4, X.T(c0050j), c0050j);
    }

    @Override // F6.AbstractC0042b
    /* renamed from: X */
    public final InterfaceC0004e f(Q q6) {
        o6.j.e(q6, "substitutor");
        return this;
    }

    @Override // F6.AbstractC0042b, C6.Q
    public final InterfaceC0011l f(Q q6) {
        o6.j.e(q6, "substitutor");
        return this;
    }

    @Override // F6.AbstractC0042b, F6.A
    public final InterfaceC1333o k(w7.O o7, C1824f c1824f) {
        return l.b(h.f16527i, getName().f10804d, o7.toString());
    }

    @Override // F6.C0052l
    public final String toString() {
        String b4 = getName().b();
        o6.j.d(b4, "asString(...)");
        return b4;
    }
}
