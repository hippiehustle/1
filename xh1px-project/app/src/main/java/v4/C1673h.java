package v4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: v4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1673h implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1674i f15531e;

    public /* synthetic */ C1673h(C1674i c1674i, int i4) {
        this.f15530d = i4;
        this.f15531e = c1674i;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15530d) {
            case 0:
                return this.f15531e.f();
            default:
                return new C0932r(this.f15531e.j(), 22);
        }
    }
}
