package s3;

import C1.g;
import L7.AbstractC0166y;
import Q7.d;
import T4.e;
import T4.k;
import Z5.y;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1163b;
import o6.C1282a;
import o6.j;
import t3.AbstractC1571i;
import t3.C1565c;
import t3.C1566d;
import t3.C1567e;
import t3.C1568f;
import t3.C1569g;
import t3.C1570h;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1490a extends C1282a implements InterfaceC1163b {
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        AbstractC1571i abstractC1571i = (AbstractC1571i) obj;
        j.e(abstractC1571i, "p0");
        T4.c cVar = (T4.c) this.f13621d;
        j.e(cVar, "<this>");
        k kVar = cVar.f5761a;
        g gVar = kVar.f5775b;
        d dVar = kVar.k;
        if (abstractC1571i.equals(C1568f.f15054a)) {
            AbstractC0166y.q(dVar, null, null, new e(kVar, null), 3);
        } else if (abstractC1571i.equals(C1567e.f15053a)) {
            AbstractC0166y.q(dVar, null, null, new T4.d(kVar, null), 3);
        } else if (abstractC1571i.equals(C1569g.f15055a)) {
            gVar.g();
        } else if (abstractC1571i.equals(C1566d.f15052a)) {
            gVar.b();
        } else if (abstractC1571i.equals(C1570h.f15056a)) {
            kVar.c();
        } else if (!abstractC1571i.equals(C1565c.f15051a)) {
            throw new NoWhenBranchMatchedException();
        }
        return y.f7506a;
    }
}
