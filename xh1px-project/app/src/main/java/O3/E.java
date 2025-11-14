package O3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class E implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f3867e;

    public /* synthetic */ E(F f8, int i4) {
        this.f3866d = i4;
        this.f3867e = f8;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f3866d) {
            case 0:
                return this.f3867e.n();
            default:
                return new D4.y(this.f3867e.m(), 12);
        }
    }
}
