package w6;

import java.util.HashSet;
import n6.InterfaceC1164c;

/* renamed from: w6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733u implements InterfaceC1164c {

    /* renamed from: e, reason: collision with root package name */
    public static final C1733u f15914e = new C1733u(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C1733u f15915f = new C1733u(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15916d;

    public /* synthetic */ C1733u(int i4) {
        this.f15916d = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        s7.s sVar = (s7.s) obj;
        a7.I i4 = (a7.I) obj2;
        switch (this.f15916d) {
            case 0:
                HashSet hashSet = C1710B.f15783g;
                o6.j.e(sVar, "$this$deserializeToDescriptor");
                o6.j.e(i4, "proto");
                return sVar.f(i4, true);
            default:
                int i8 = T.f15817g;
                o6.j.e(sVar, "$this$deserializeToDescriptor");
                o6.j.e(i4, "proto");
                return sVar.f(i4, true);
        }
    }
}
