package r3;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: r3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1449m implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1450n f14339e;

    public /* synthetic */ C1449m(C1450n c1450n, int i4) {
        this.f14338d = i4;
        this.f14339e = c1450n;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f14338d) {
            case 0:
                return this.f14339e.f();
            default:
                return new C0932r(this.f14339e.j(), 17);
        }
    }
}
