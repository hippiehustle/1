package Z3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class C implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f7321e;

    public /* synthetic */ C(D d2, int i4) {
        this.f7320d = i4;
        this.f7321e = d2;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f7320d) {
            case 0:
                return this.f7321e.n();
            default:
                return new D4.y(this.f7321e.m(), 26);
        }
    }
}
