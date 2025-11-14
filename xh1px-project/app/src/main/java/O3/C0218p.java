package O3;

import n6.InterfaceC1162a;

/* renamed from: O3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218p implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0219q f3988e;

    public /* synthetic */ C0218p(C0219q c0219q, int i4) {
        this.f3987d = i4;
        this.f3988e = c0219q;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f3987d) {
            case 0:
                return this.f3988e.i().n();
            default:
                return new D4.y(this.f3988e.i().m(), 11);
        }
    }
}
