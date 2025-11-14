package N7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends o6.i implements InterfaceC1165d {

    /* renamed from: l, reason: collision with root package name */
    public static final e f3803l = new o6.i(3, h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f3810e;
        hVar.getClass();
        if (obj3 == j.f3828l) {
            obj3 = new m(hVar.q());
        }
        return new o(obj3);
    }
}
