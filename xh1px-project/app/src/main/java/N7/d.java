package N7;

import L7.s0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends o6.i implements InterfaceC1165d {

    /* renamed from: l, reason: collision with root package name */
    public static final d f3802l = new o6.i(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return Z5.y.f7506a;
     */
    @Override // n6.InterfaceC1165d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, Object obj2, Object obj3) {
        p pVar;
        s0 s0Var;
        h hVar = (h) obj;
        T7.f fVar = (T7.f) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f3810e;
        hVar.getClass();
        p pVar2 = (p) h.j.get(hVar);
        while (true) {
            if (hVar.w()) {
                ((T7.e) fVar).f5925h = j.f3828l;
                break;
            }
            long andIncrement = h.f3811f.getAndIncrement(hVar);
            long j = j.f3820b;
            long j5 = andIncrement / j;
            int i4 = (int) (andIncrement % j);
            if (pVar2.f4966f != j5) {
                p p8 = hVar.p(j5, pVar2);
                if (p8 == null) {
                    continue;
                } else {
                    pVar = p8;
                }
            } else {
                pVar = pVar2;
            }
            Object G8 = hVar.G(pVar, i4, andIncrement, fVar);
            p pVar3 = pVar;
            if (G8 == j.f3829m) {
                if (fVar instanceof s0) {
                    s0Var = (s0) fVar;
                } else {
                    s0Var = null;
                }
                if (s0Var != null) {
                    s0Var.a(pVar3, i4);
                }
            } else if (G8 == j.f3831o) {
                if (andIncrement < hVar.t()) {
                    pVar3.a();
                }
                pVar2 = pVar3;
            } else if (G8 != j.f3830n) {
                pVar3.a();
                ((T7.e) fVar).f5925h = G8;
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
    }
}
