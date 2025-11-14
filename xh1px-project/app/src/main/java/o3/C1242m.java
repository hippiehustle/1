package o3;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: o3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242m implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1243n f13465e;

    public /* synthetic */ C1242m(C1243n c1243n, int i4) {
        this.f13464d = i4;
        this.f13465e = c1243n;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13464d) {
            case 0:
                return this.f13465e.n();
            default:
                return new C0932r(this.f13465e.m(), 11);
        }
    }
}
