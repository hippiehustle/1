package l4;

import Z5.y;
import j2.AbstractC0901a;
import j2.C0902b;
import n6.InterfaceC1163b;

/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1022b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f12257e;

    public /* synthetic */ C1022b(l lVar, int i4) {
        this.f12256d = i4;
        this.f12257e = lVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        C0902b c0902b;
        switch (this.f12256d) {
            case 0:
                C0902b c0902b2 = (C0902b) obj;
                o6.j.e(c0902b2, "capturedCondition");
                this.f12257e.i0(c0902b2);
                return y.f7506a;
            case 1:
                AbstractC0901a abstractC0901a = (AbstractC0901a) obj;
                o6.j.e(abstractC0901a, "conditionSelected");
                if (abstractC0901a instanceof C0902b) {
                    l lVar = this.f12257e;
                    H3.b bVar = lVar.h0().f12288c.f1949d;
                    lVar.i0(bVar.d((C0902b) abstractC0901a, bVar.h()));
                }
                return y.f7506a;
            default:
                int intValue = ((Integer) obj).intValue();
                p h02 = this.f12257e.h0();
                Z5.j jVar = (Z5.j) h02.f12291f.f4088d.f();
                if (jVar != null && (c0902b = (C0902b) jVar.f7485d) != null && c0902b.f11795g != intValue) {
                    H3.n nVar = h02.f12288c;
                    nVar.d(c0902b);
                    nVar.k(C0902b.i(c0902b, null, null, null, 0, null, intValue, 0, false, null, 959));
                    nVar.o();
                    nVar.g();
                }
                return y.f7506a;
        }
    }
}
