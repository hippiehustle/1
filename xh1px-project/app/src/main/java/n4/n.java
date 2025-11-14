package n4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class n implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f12955e;

    public /* synthetic */ n(o oVar, int i4) {
        this.f12954d = i4;
        this.f12955e = oVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12954d) {
            case 0:
                return this.f12955e.n();
            default:
                return new C0932r(this.f12955e.m(), 10);
        }
    }
}
