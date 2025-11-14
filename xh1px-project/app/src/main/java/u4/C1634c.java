package u4;

import Z5.y;
import n6.InterfaceC1162a;
import r2.C1429a;
import r4.C1466f;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1634c implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f15324e;

    public /* synthetic */ C1634c(k kVar, int i4) {
        this.f15323d = i4;
        this.f15324e = kVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15323d) {
            case 0:
                k kVar = this.f15324e;
                kVar.i().o().d(kVar.h(), new C1466f(false, new C1429a(4, kVar)), false);
                break;
            default:
                k kVar2 = this.f15324e;
                kVar2.u(kVar2.t().e(kVar2.h(), null));
                break;
        }
        return y.f7506a;
    }
}
