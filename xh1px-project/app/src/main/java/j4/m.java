package j4;

import t0.AbstractC1534b;

/* loaded from: classes.dex */
public final class m extends AbstractC1534b {

    /* renamed from: d, reason: collision with root package name */
    public static final m f11935d = new Object();

    @Override // t0.AbstractC1534b
    public final boolean a(Object obj, Object obj2) {
        return ((k) obj).equals((k) obj2);
    }

    @Override // t0.AbstractC1534b
    public final boolean b(Object obj, Object obj2) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        if ((kVar instanceof j) && (kVar2 instanceof j)) {
            return true;
        }
        if ((kVar instanceof i) && (kVar2 instanceof i)) {
            return o6.j.a(((i) kVar).a().p().getId(), ((i) kVar2).a().p().getId());
        }
        return false;
    }
}
