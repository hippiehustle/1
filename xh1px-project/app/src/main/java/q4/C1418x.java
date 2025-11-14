package q4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: q4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418x implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1419y f14138e;

    public /* synthetic */ C1418x(C1419y c1419y, int i4) {
        this.f14137d = i4;
        this.f14138e = c1419y;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f14137d) {
            case 0:
                return this.f14138e.n();
            default:
                return new C0932r(this.f14138e.m(), 16);
        }
    }
}
