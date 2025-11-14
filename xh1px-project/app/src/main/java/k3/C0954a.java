package k3;

import t0.AbstractC1534b;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954a extends AbstractC1534b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0954a f11975d = new Object();

    @Override // t0.AbstractC1534b
    public final boolean a(Object obj, Object obj2) {
        return ((AbstractC0961h) obj).equals((AbstractC0961h) obj2);
    }

    @Override // t0.AbstractC1534b
    public final boolean b(Object obj, Object obj2) {
        AbstractC0961h abstractC0961h = (AbstractC0961h) obj;
        AbstractC0961h abstractC0961h2 = (AbstractC0961h) obj2;
        if ((abstractC0961h instanceof C0960g) && (abstractC0961h2 instanceof C0960g)) {
            return true;
        }
        if ((abstractC0961h instanceof C0959f) && (abstractC0961h2 instanceof C0959f)) {
            return o6.j.a(((C0959f) abstractC0961h).f11988a.f12003f.getId(), ((C0959f) abstractC0961h2).f11988a.f12003f.getId());
        }
        return false;
    }
}
