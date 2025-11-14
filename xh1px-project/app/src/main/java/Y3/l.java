package Y3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class l implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f7137e;

    public /* synthetic */ l(m mVar, int i4) {
        this.f7136d = i4;
        this.f7137e = mVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f7136d) {
            case 0:
                return this.f7137e.n();
            default:
                return new D4.y(this.f7137e.m(), 24);
        }
    }
}
