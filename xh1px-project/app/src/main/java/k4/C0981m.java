package k4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: k4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981m implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0982n f12107e;

    public /* synthetic */ C0981m(C0982n c0982n, int i4) {
        this.f12106d = i4;
        this.f12107e = c0982n;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12106d) {
            case 0:
                return this.f12107e.n();
            default:
                return new C0932r(this.f12107e.m(), 4);
        }
    }
}
