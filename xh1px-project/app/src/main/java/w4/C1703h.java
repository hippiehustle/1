package w4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: w4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1703h implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1704i f15701e;

    public /* synthetic */ C1703h(C1704i c1704i, int i4) {
        this.f15700d = i4;
        this.f15701e = c1704i;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15700d) {
            case 0:
                return this.f15701e.f();
            default:
                return new C0932r(this.f15701e.j(), 23);
        }
    }
}
