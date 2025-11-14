package r4;

import t0.AbstractC1534b;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461a extends AbstractC1534b {

    /* renamed from: d, reason: collision with root package name */
    public static final C1461a f14378d = new Object();

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
        if ((kVar instanceof AbstractC1469i) && (kVar2 instanceof AbstractC1469i)) {
            return o6.j.a(((AbstractC1469i) kVar).b().s().getId(), ((AbstractC1469i) kVar2).b().s().getId());
        }
        return false;
    }
}
