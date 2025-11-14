package w4;

import Z5.y;
import n6.InterfaceC1162a;
import r2.C1429a;
import r4.C1466f;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1697b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1704i f15689e;

    public /* synthetic */ C1697b(C1704i c1704i, int i4) {
        this.f15688d = i4;
        this.f15689e = c1704i;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15688d) {
            case 0:
                C1704i c1704i = this.f15689e;
                c1704i.i().o().d(c1704i.h(), new C1466f(true, new C1429a(5, c1704i)), false);
                break;
            default:
                C1704i c1704i2 = this.f15689e;
                c1704i2.u(c1704i2.t().e(c1704i2.h(), null));
                break;
        }
        return y.f7506a;
    }
}
