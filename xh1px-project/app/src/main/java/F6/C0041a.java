package F6;

import java.util.List;
import n6.InterfaceC1162a;
import p7.C1327i;
import p7.InterfaceC1333o;
import w7.AbstractC1741c;

/* renamed from: F6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0042b f1518e;

    public /* synthetic */ C0041a(AbstractC0042b abstractC0042b, int i4) {
        this.f1517d = i4;
        this.f1518e = abstractC0042b;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        int i4 = this.f1517d;
        AbstractC0042b abstractC0042b = this.f1518e;
        switch (i4) {
            case 0:
                InterfaceC1333o t02 = abstractC0042b.t0();
                B6.n nVar = new B6.n(1, this);
                y7.i iVar = w7.U.f15977a;
                if (y7.l.f(abstractC0042b)) {
                    return y7.l.c(y7.k.UNABLE_TO_SUBSTITUTE_TYPE, abstractC0042b.toString());
                }
                w7.J B8 = abstractC0042b.B();
                if (B8 != null) {
                    if (t02 != null) {
                        List d2 = w7.U.d(B8.e());
                        w7.G.f15953e.getClass();
                        return AbstractC1741c.v(w7.G.f15954f, B8, d2, false, t02, nVar);
                    }
                    w7.U.a(13);
                    throw null;
                }
                w7.U.a(12);
                throw null;
            case 1:
                return new C1327i(abstractC0042b.t0());
            default:
                return new w(abstractC0042b);
        }
    }
}
