package T6;

import C6.M;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class x implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5896d;

    /* renamed from: e, reason: collision with root package name */
    public final A f5897e;

    /* renamed from: f, reason: collision with root package name */
    public final I6.u f5898f;

    /* renamed from: g, reason: collision with root package name */
    public final o6.u f5899g;

    public /* synthetic */ x(A a3, I6.u uVar, o6.u uVar2, int i4) {
        this.f5896d = i4;
        this.f5897e = a3;
        this.f5898f = uVar;
        this.f5899g = uVar2;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5896d) {
            case 0:
                A a3 = this.f5897e;
                v7.n nVar = ((S6.a) a3.f5793b.f280e).f5398a;
                x xVar = new x(a3, this.f5898f, this.f5899g, 1);
                v7.k kVar = (v7.k) nVar;
                kVar.getClass();
                return new v7.h(kVar, xVar);
            default:
                Q6.h hVar = ((S6.a) this.f5897e.f5793b.f280e).f5405h;
                M m6 = (M) this.f5899g.f13642d;
                hVar.getClass();
                o6.j.e(this.f5898f, "field");
                o6.j.e(m6, "descriptor");
                return null;
        }
    }
}
