package r4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: r4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465e implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1466f f14387e;

    public /* synthetic */ C1465e(C1466f c1466f, int i4) {
        this.f14386d = i4;
        this.f14387e = c1466f;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f14386d) {
            case 0:
                return this.f14387e.n();
            default:
                return new C0932r(this.f14387e.m(), 18);
        }
    }
}
