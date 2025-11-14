package X4;

import t0.AbstractC1534b;

/* loaded from: classes.dex */
public final class f extends AbstractC1534b {

    /* renamed from: e, reason: collision with root package name */
    public static final f f6957e = new f(0);

    /* renamed from: f, reason: collision with root package name */
    public static final f f6958f = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6959d;

    public /* synthetic */ f(int i4) {
        this.f6959d = i4;
    }

    @Override // t0.AbstractC1534b
    public final boolean a(Object obj, Object obj2) {
        switch (this.f6959d) {
            case 0:
                return ((Z4.f) obj).equals((Z4.f) obj2);
            default:
                Z4.k kVar = (Z4.k) obj;
                Z4.k kVar2 = (Z4.k) obj2;
                if ((kVar instanceof Z4.j) && (kVar2 instanceof Z4.j)) {
                    return true;
                }
                return kVar.equals(kVar2);
        }
    }

    @Override // t0.AbstractC1534b
    public final boolean b(Object obj, Object obj2) {
        switch (this.f6959d) {
            case 0:
                if (((Z4.f) obj).f7433a == ((Z4.f) obj2).f7433a) {
                    return true;
                }
                return false;
            default:
                Z4.k kVar = (Z4.k) obj;
                Z4.k kVar2 = (Z4.k) obj2;
                if ((kVar instanceof Z4.b) && (kVar2 instanceof Z4.b)) {
                    return o6.j.a(((Z4.b) kVar).f7418b.f13699a, ((Z4.b) kVar2).f7418b.f13699a);
                }
                if ((kVar instanceof Z4.c) && (kVar2 instanceof Z4.c)) {
                    return o6.j.a(((Z4.c) kVar).f7421b.f12190a, ((Z4.c) kVar2).f7421b.f12190a);
                }
                if ((kVar instanceof Z4.e) && (kVar2 instanceof Z4.e)) {
                    return o6.j.a(((Z4.e) kVar).f7424b.f13699a, ((Z4.e) kVar2).f7424b.f13699a);
                }
                if ((kVar instanceof Z4.g) && (kVar2 instanceof Z4.g)) {
                    return o6.j.a(((Z4.g) kVar).f7438b.f12190a, ((Z4.g) kVar2).f7438b.f12190a);
                }
                if ((kVar instanceof Z4.j) && (kVar2 instanceof Z4.j)) {
                    return true;
                }
                return false;
        }
    }
}
