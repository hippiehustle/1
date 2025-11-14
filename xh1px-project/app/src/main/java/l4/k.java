package l4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class k implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f12275e;

    public /* synthetic */ k(l lVar, int i4) {
        this.f12274d = i4;
        this.f12275e = lVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12274d) {
            case 0:
                return this.f12275e.n();
            default:
                return new C0932r(this.f12275e.m(), 7);
        }
    }
}
