package F6;

import f7.C0725e;
import n6.InterfaceC1163b;

/* renamed from: F6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056p implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f1549e;

    public /* synthetic */ C0056p(r rVar, int i4) {
        this.f1548d = i4;
        this.f1549e = rVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f1548d) {
            case 0:
                C0725e c0725e = (C0725e) obj;
                if (c0725e != null) {
                    r rVar = this.f1549e;
                    return rVar.j(c0725e, rVar.i().g(c0725e, K6.b.f2735i));
                }
                r.h(8);
                throw null;
            default:
                C0725e c0725e2 = (C0725e) obj;
                if (c0725e2 != null) {
                    r rVar2 = this.f1549e;
                    return rVar2.j(c0725e2, rVar2.i().f(c0725e2, K6.b.f2735i));
                }
                r.h(4);
                throw null;
        }
    }
}
