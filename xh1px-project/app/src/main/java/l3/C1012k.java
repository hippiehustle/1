package l3;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: l3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012k implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1013l f12218e;

    public /* synthetic */ C1012k(C1013l c1013l, int i4) {
        this.f12217d = i4;
        this.f12218e = c1013l;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12217d) {
            case 0:
                return this.f12218e.n();
            default:
                return new C0932r(this.f12218e.m(), 6);
        }
    }
}
