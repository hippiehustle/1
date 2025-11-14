package Z3;

import t0.AbstractC1534b;

/* renamed from: Z3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378m extends AbstractC1534b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0378m f7389d = new Object();

    @Override // t0.AbstractC1534b
    public final boolean a(Object obj, Object obj2) {
        return true;
    }

    @Override // t0.AbstractC1534b
    public final boolean b(Object obj, Object obj2) {
        AbstractC0375j abstractC0375j = (AbstractC0375j) obj;
        AbstractC0375j abstractC0375j2 = (AbstractC0375j) obj2;
        if ((abstractC0375j instanceof C0373h) && (abstractC0375j2 instanceof C0373h)) {
            return ((C0373h) abstractC0375j).f7379a.equals(((C0373h) abstractC0375j2).f7379a);
        }
        if ((abstractC0375j instanceof C0374i) && (abstractC0375j2 instanceof C0374i)) {
            return o6.j.a(((C0374i) abstractC0375j).f7380a, ((C0374i) abstractC0375j2).f7380a);
        }
        return false;
    }
}
