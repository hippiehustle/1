package T6;

import f7.C0725e;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class n implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5866d;

    /* renamed from: e, reason: collision with root package name */
    public final o f5867e;

    public /* synthetic */ n(o oVar, int i4) {
        this.f5866d = i4;
        this.f5867e = oVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        C0725e c0725e = (C0725e) obj;
        switch (this.f5866d) {
            case 0:
                o6.j.e(c0725e, "it");
                return this.f5867e.N(c0725e);
            default:
                o6.j.e(c0725e, "it");
                return this.f5867e.O(c0725e);
        }
    }
}
