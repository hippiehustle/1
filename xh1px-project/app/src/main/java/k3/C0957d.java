package k3;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: k3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0958e f11981e;

    public /* synthetic */ C0957d(C0958e c0958e, int i4) {
        this.f11980d = i4;
        this.f11981e = c0958e;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f11980d) {
            case 0:
                return this.f11981e.n();
            default:
                return new C0932r(this.f11981e.m(), 2);
        }
    }
}
