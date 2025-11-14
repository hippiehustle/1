package j3;

import n6.InterfaceC1162a;

/* renamed from: j3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931q implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0934t f11885e;

    public /* synthetic */ C0931q(C0934t c0934t, int i4) {
        this.f11884d = i4;
        this.f11885e = c0934t;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f11884d) {
            case 0:
                return this.f11885e.n();
            default:
                return new C0932r(this.f11885e.m(), 0);
        }
    }
}
