package L3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class v implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f2883e;

    public /* synthetic */ v(w wVar, int i4) {
        this.f2882d = i4;
        this.f2883e = wVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f2882d) {
            case 0:
                return this.f2883e.n();
            default:
                return new D4.y(this.f2883e.m(), 7);
        }
    }
}
