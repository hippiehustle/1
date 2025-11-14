package u7;

import C6.InterfaceC0010k;
import C6.P;
import F6.AbstractC0043c;
import F6.B;
import a.AbstractC0405a;
import a6.AbstractC0438m;
import a7.T;
import a7.Y;
import c7.InterfaceC0588g;
import f7.C0725e;
import h7.AbstractC0842e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import o.p1;
import s7.C1518i;
import w7.X;

/* loaded from: classes.dex */
public final class t extends AbstractC0043c {

    /* renamed from: o, reason: collision with root package name */
    public final F3.m f15458o;

    /* renamed from: p, reason: collision with root package name */
    public final Y f15459p;

    /* renamed from: q, reason: collision with root package name */
    public final C1648a f15460q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(F3.m mVar, Y y4, int i4) {
        super(r2, r3, D6.i.f1043a, r5, r6, y4.f7989i, i4, P.f728f);
        X x8;
        C1518i c1518i = (C1518i) mVar.f1371d;
        v7.k kVar = c1518i.f14573a;
        InterfaceC0010k interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
        C0725e t8 = AbstractC0842e.t((InterfaceC0588g) mVar.f1372e, y4.f7988h);
        a7.X x9 = y4.j;
        o6.j.d(x9, "getVariance(...)");
        int ordinal = x9.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    x8 = X.INVARIANT;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                x8 = X.OUT_VARIANCE;
            }
        } else {
            x8 = X.IN_VARIANCE;
        }
        X x10 = x8;
        this.f15458o = mVar;
        this.f15459p = y4;
        this.f15460q = new C1648a(c1518i.f14573a, new B6.j(19, this));
    }

    @Override // F6.AbstractC0049i
    public final List N0() {
        F3.m mVar = this.f15458o;
        List K02 = AbstractC0405a.K0(this.f15459p, (B) mVar.f1374g);
        if (K02.isEmpty()) {
            return E2.d.y(AbstractC1098d.e(this).n());
        }
        p1 p1Var = (p1) mVar.k;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(K02, 10));
        Iterator it = K02.iterator();
        while (it.hasNext()) {
            arrayList.add(p1Var.i((T) it.next()));
        }
        return arrayList;
    }

    @Override // D6.b, D6.a
    public final D6.j getAnnotations() {
        return this.f15460q;
    }
}
