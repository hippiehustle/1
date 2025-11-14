package p7;

import C6.InterfaceC0001b;
import C6.M;
import F6.N;
import f7.C0725e;
import n6.InterfaceC1163b;

/* renamed from: p7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330l implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1330l f13836e = new C1330l(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C1330l f13837f = new C1330l(1);

    /* renamed from: g, reason: collision with root package name */
    public static final C1330l f13838g = new C1330l(2);

    /* renamed from: h, reason: collision with root package name */
    public static final C1330l f13839h = new C1330l(3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13840d;

    public /* synthetic */ C1330l(int i4) {
        this.f13840d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f13840d) {
            case 0:
                o6.j.e((C0725e) obj, "it");
                return Boolean.TRUE;
            case 1:
                N n3 = (N) obj;
                o6.j.e(n3, "$this$selectMostSpecificInEachOverridableGroup");
                return n3;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                M m6 = (M) obj;
                o6.j.e(m6, "$this$selectMostSpecificInEachOverridableGroup");
                return m6;
            default:
                InterfaceC0001b interfaceC0001b = (InterfaceC0001b) obj;
                o6.j.e(interfaceC0001b, "$this$selectMostSpecificInEachOverridableGroup");
                return interfaceC0001b;
        }
    }
}
