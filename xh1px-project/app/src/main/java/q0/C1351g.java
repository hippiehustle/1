package q0;

import n0.C1140r;
import n6.InterfaceC1163b;
import o6.j;

/* renamed from: q0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1351g implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1140r f13907e;

    public /* synthetic */ C1351g(C1140r c1140r, int i4) {
        this.f13906d = i4;
        this.f13907e = c1140r;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean contains;
        String str = (String) obj;
        switch (this.f13906d) {
            case 0:
                j.e(str, "key");
                contains = this.f13907e.b().contains(str);
                break;
            default:
                j.e(str, "key");
                contains = this.f13907e.b().contains(str);
                break;
        }
        return Boolean.valueOf(!contains);
    }
}
