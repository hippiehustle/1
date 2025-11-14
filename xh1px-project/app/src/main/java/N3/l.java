package N3;

import t0.AbstractC1534b;

/* loaded from: classes.dex */
public final class l extends AbstractC1534b {

    /* renamed from: d, reason: collision with root package name */
    public static final l f3758d = new Object();

    @Override // t0.AbstractC1534b
    public final boolean a(Object obj, Object obj2) {
        return ((g) obj).equals((g) obj2);
    }

    @Override // t0.AbstractC1534b
    public final boolean b(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        if ((gVar instanceof f) && (gVar2 instanceof f)) {
            return true;
        }
        if ((gVar instanceof e) && (gVar2 instanceof e)) {
            return o6.j.a(((e) gVar).f3748a.f10609d.getId(), ((e) gVar2).f3748a.f10609d.getId());
        }
        return false;
    }
}
