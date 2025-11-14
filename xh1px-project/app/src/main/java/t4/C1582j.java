package t4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: t4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1582j implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1583k f15080e;

    public /* synthetic */ C1582j(C1583k c1583k, int i4) {
        this.f15079d = i4;
        this.f15080e = c1583k;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15079d) {
            case 0:
                return this.f15080e.f();
            default:
                return new C0932r(this.f15080e.j(), 20);
        }
    }
}
