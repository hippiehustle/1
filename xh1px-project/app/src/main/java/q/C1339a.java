package q;

import java.util.HashMap;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339a extends C1344f {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f13855h = new HashMap();

    @Override // q.C1344f
    public final C1341c g(Object obj) {
        return (C1341c) this.f13855h.get(obj);
    }

    @Override // q.C1344f
    public final Object h(Object obj) {
        Object h8 = super.h(obj);
        this.f13855h.remove(obj);
        return h8;
    }
}
