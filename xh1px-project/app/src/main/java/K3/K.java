package K3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class K implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f2663e;

    public /* synthetic */ K(L l6, int i4) {
        this.f2662d = i4;
        this.f2663e = l6;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f2662d) {
            case 0:
                return this.f2663e.n();
            default:
                return new D4.y(this.f2663e.m(), 6);
        }
    }
}
