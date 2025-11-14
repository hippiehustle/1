package o3;

import Z5.y;
import n6.InterfaceC1162a;

/* renamed from: o3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1233d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1243n f13449e;

    public /* synthetic */ C1233d(C1243n c1243n, int i4) {
        this.f13448d = i4;
        this.f13449e = c1243n;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13448d) {
            case 0:
                C1243n c1243n = this.f13449e;
                C1250u h02 = c1243n.h0();
                return h02.f13490c.f11153f.v(c1243n.k());
            default:
                this.f13449e.i0(false);
                return y.f7506a;
        }
    }
}
