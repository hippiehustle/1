package s4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: s4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1501i implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1502j f14541e;

    public /* synthetic */ C1501i(C1502j c1502j, int i4) {
        this.f14540d = i4;
        this.f14541e = c1502j;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f14540d) {
            case 0:
                return this.f14541e.n();
            default:
                return new C0932r(this.f14541e.m(), 19);
        }
    }
}
