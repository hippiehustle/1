package O3;

import t0.AbstractC1534b;

/* loaded from: classes.dex */
public final class r extends AbstractC1534b {

    /* renamed from: d, reason: collision with root package name */
    public static final r f3992d = new Object();

    @Override // t0.AbstractC1534b
    public final boolean a(Object obj, Object obj2) {
        return ((AbstractC0223v) obj).equals((AbstractC0223v) obj2);
    }

    @Override // t0.AbstractC1534b
    public final boolean b(Object obj, Object obj2) {
        AbstractC0223v abstractC0223v = (AbstractC0223v) obj;
        AbstractC0223v abstractC0223v2 = (AbstractC0223v) obj2;
        if ((abstractC0223v instanceof C0221t) && (abstractC0223v2 instanceof C0221t)) {
            return true;
        }
        if ((abstractC0223v instanceof C0222u) && (abstractC0223v2 instanceof C0222u)) {
            return ((C0222u) abstractC0223v).f3997b.equals(((C0222u) abstractC0223v2).f3997b);
        }
        return false;
    }
}
