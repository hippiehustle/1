package s7;

import C6.O;
import a7.T;
import f7.C0722b;
import n6.InterfaceC1163b;
import t7.C1593c;

/* renamed from: s7.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507A implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1507A f14559e = new C1507A();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14560d = 0;

    public /* synthetic */ C1507A() {
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f14560d) {
            case 0:
                T t8 = (T) obj;
                o6.j.e(t8, "it");
                return Integer.valueOf(t8.f7936g.size());
            default:
                o6.j.e((C0722b) obj, "it");
                return O.f726a;
        }
    }

    public C1507A(C1593c c1593c) {
    }
}
