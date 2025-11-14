package N7;

import L7.AbstractC0166y;
import L7.C0150h;
import L7.InterfaceC0149g;
import L7.s0;
import Z5.y;
import a6.AbstractC0437l;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class h implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3810e = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3811f = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3812g = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3813h = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3814i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3815l = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3816m = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f3817d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public h(int i4) {
        long j5;
        this.f3817d = i4;
        if (i4 >= 0) {
            p pVar = j.f3819a;
            if (i4 != 0) {
                if (i4 != Integer.MAX_VALUE) {
                    j5 = i4;
                } else {
                    j5 = Long.MAX_VALUE;
                }
            } else {
                j5 = 0;
            }
            this.bufferEnd$volatile = j5;
            this.completedExpandBuffersAndPauseFlag$volatile = f3812g.get(this);
            p pVar2 = new p(0L, null, this, 3);
            this.sendSegment$volatile = pVar2;
            this.receiveSegment$volatile = pVar2;
            if (y()) {
                pVar2 = j.f3819a;
                o6.j.c(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = pVar2;
            this._closeCause$volatile = j.f3835s;
            return;
        }
        throw new IllegalArgumentException(A.j.j(i4, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object B(h hVar, AbstractC0713c abstractC0713c) {
        f fVar;
        int i4;
        p pVar;
        if (abstractC0713c instanceof f) {
            fVar = (f) abstractC0713c;
            int i8 = fVar.f3806i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f3806i = i8 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.f3804g;
                i4 = fVar2.f3806i;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                        return ((o) obj).f3841a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                p pVar2 = (p) j.get(hVar);
                while (!hVar.w()) {
                    long andIncrement = f3811f.getAndIncrement(hVar);
                    long j5 = j.f3820b;
                    long j8 = andIncrement / j5;
                    int i9 = (int) (andIncrement % j5);
                    if (pVar2.f4966f != j8) {
                        p p8 = hVar.p(j8, pVar2);
                        if (p8 == null) {
                            continue;
                        } else {
                            pVar = p8;
                        }
                    } else {
                        pVar = pVar2;
                    }
                    h hVar2 = hVar;
                    Object G8 = hVar2.G(pVar, i9, andIncrement, null);
                    if (G8 != j.f3829m) {
                        if (G8 == j.f3831o) {
                            if (andIncrement < hVar2.t()) {
                                pVar.a();
                            }
                            pVar2 = pVar;
                            hVar = hVar2;
                        } else {
                            if (G8 == j.f3830n) {
                                fVar2.f3806i = 1;
                                Object C8 = hVar2.C(pVar, i9, andIncrement, fVar2);
                                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                                if (C8 == enumC0646a) {
                                    return enumC0646a;
                                }
                                return C8;
                            }
                            pVar.a();
                            return G8;
                        }
                    } else {
                        throw new IllegalStateException("unexpected");
                    }
                }
                return new m(hVar.q());
            }
        }
        fVar = new f(hVar, abstractC0713c);
        f fVar22 = fVar;
        Object obj2 = fVar22.f3804g;
        i4 = fVar22.f3806i;
        if (i4 == 0) {
        }
    }

    public static final p a(h hVar, long j5, p pVar) {
        Object b4;
        h hVar2;
        p pVar2 = j.f3819a;
        i iVar = i.f3818l;
        loop0: while (true) {
            b4 = Q7.b.b(pVar, j5, iVar);
            if (!Q7.b.e(b4)) {
                Q7.r c6 = Q7.b.c(b4);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3814i;
                    Q7.r rVar = (Q7.r) atomicReferenceFieldUpdater.get(hVar);
                    if (rVar.f4966f >= c6.f4966f) {
                        break loop0;
                    }
                    if (!c6.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, rVar, c6)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != rVar) {
                            if (c6.f()) {
                                c6.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean e9 = Q7.b.e(b4);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3811f;
        if (e9) {
            hVar.k();
            if (pVar.f4966f * j.f3820b < atomicLongFieldUpdater.get(hVar)) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) Q7.b.c(b4);
            long j8 = pVar3.f4966f;
            if (j8 > j5) {
                long j9 = j.f3820b * j8;
                while (true) {
                    long j10 = f3810e.get(hVar);
                    long j11 = 1152921504606846975L & j10;
                    if (j11 >= j9) {
                        hVar2 = hVar;
                        break;
                    }
                    hVar2 = hVar;
                    if (f3810e.compareAndSet(hVar2, j10, (((int) (j10 >> 60)) << 60) + j11)) {
                        break;
                    }
                    hVar = hVar2;
                }
                if (j8 * j.f3820b < atomicLongFieldUpdater.get(hVar2)) {
                    pVar3.a();
                }
            } else {
                return pVar3;
            }
        }
        return null;
    }

    public static final void e(h hVar, Object obj, C0150h c0150h) {
        c0150h.k(Z5.a.b(hVar.s()));
    }

    public static final int f(h hVar, p pVar, int i4, Object obj, long j5, Object obj2, boolean z8) {
        pVar.n(i4, obj);
        if (z8) {
            return hVar.H(pVar, i4, obj, j5, obj2, z8);
        }
        Object l6 = pVar.l(i4);
        if (l6 == null) {
            if (hVar.g(j5)) {
                if (pVar.k(null, i4, j.f3822d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(null, i4, obj2)) {
                    return 2;
                }
            }
        } else if (l6 instanceof s0) {
            pVar.n(i4, null);
            if (hVar.E(l6, obj)) {
                pVar.o(i4, j.f3827i);
                return 0;
            }
            Q7.t tVar = j.k;
            if (pVar.f3843i.getAndSet((i4 * 2) + 1, tVar) != tVar) {
                pVar.m(i4, true);
                return 5;
            }
            return 5;
        }
        return hVar.H(pVar, i4, obj, j5, obj2, z8);
    }

    public static void u(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3813h;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0);
    }

    public final Object A(InterfaceC0617c interfaceC0617c, Object obj) {
        C0150h c0150h = new C0150h(1, E2.c.d0(interfaceC0617c));
        c0150h.v();
        c0150h.k(Z5.a.b(s()));
        Object u8 = c0150h.u();
        if (u8 == EnumC0646a.f10656d) {
            return u8;
        }
        return y.f7506a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(p pVar, int i4, long j5, AbstractC0713c abstractC0713c) {
        g gVar;
        int i8;
        p pVar2;
        if (abstractC0713c instanceof g) {
            gVar = (g) abstractC0713c;
            int i9 = gVar.f3809i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.f3809i = i9 - Integer.MIN_VALUE;
                Object obj = gVar.f3807g;
                i8 = gVar.f3809i;
                if (i8 == 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    gVar.f3809i = 1;
                    C0150h m6 = AbstractC0166y.m(E2.c.d0(gVar));
                    try {
                        t tVar = new t(m6);
                        Object G8 = G(pVar, i4, j5, tVar);
                        if (G8 == j.f3829m) {
                            tVar.a(pVar, i4);
                        } else if (G8 == j.f3831o) {
                            if (j5 < t()) {
                                pVar.a();
                            }
                            p pVar3 = (p) j.get(this);
                            while (true) {
                                if (w()) {
                                    m6.k(new o(new m(q())));
                                    break;
                                }
                                long andIncrement = f3811f.getAndIncrement(this);
                                long j8 = j.f3820b;
                                long j9 = andIncrement / j8;
                                int i10 = (int) (andIncrement % j8);
                                if (pVar3.f4966f != j9) {
                                    p p8 = p(j9, pVar3);
                                    if (p8 != null) {
                                        pVar2 = p8;
                                    }
                                } else {
                                    pVar2 = pVar3;
                                }
                                Object G9 = G(pVar2, i10, andIncrement, tVar);
                                p pVar4 = pVar2;
                                if (G9 == j.f3829m) {
                                    tVar.a(pVar4, i10);
                                    break;
                                }
                                if (G9 == j.f3831o) {
                                    if (andIncrement < t()) {
                                        pVar4.a();
                                    }
                                    pVar3 = pVar4;
                                } else if (G9 != j.f3830n) {
                                    pVar4.a();
                                    m6.f(new o(G9), null);
                                } else {
                                    throw new IllegalStateException("unexpected");
                                }
                            }
                        } else {
                            pVar.a();
                            m6.f(new o(G8), null);
                        }
                        obj = m6.u();
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (obj == enumC0646a) {
                            return enumC0646a;
                        }
                    } catch (Throwable th) {
                        m6.B();
                        throw th;
                    }
                }
                return ((o) obj).f3841a;
            }
        }
        gVar = new g(this, abstractC0713c);
        Object obj2 = gVar.f3807g;
        i8 = gVar.f3809i;
        if (i8 == 0) {
        }
        return ((o) obj2).f3841a;
    }

    public final void D(s0 s0Var, boolean z8) {
        Throwable s8;
        if (s0Var instanceof InterfaceC0149g) {
            InterfaceC0617c interfaceC0617c = (InterfaceC0617c) s0Var;
            if (z8) {
                s8 = r();
            } else {
                s8 = s();
            }
            interfaceC0617c.k(Z5.a.b(s8));
            return;
        }
        if (s0Var instanceof t) {
            ((t) s0Var).f3846d.k(new o(new m(q())));
            return;
        }
        if (s0Var instanceof c) {
            c cVar = (c) s0Var;
            C0150h c0150h = cVar.f3800e;
            o6.j.b(c0150h);
            cVar.f3800e = null;
            cVar.f3799d = j.f3828l;
            Throwable q6 = cVar.f3801f.q();
            if (q6 == null) {
                c0150h.k(Boolean.FALSE);
                return;
            } else {
                c0150h.k(Z5.a.b(q6));
                return;
            }
        }
        if (s0Var instanceof T7.f) {
            ((T7.e) ((T7.f) s0Var)).g(this, j.f3828l);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + s0Var).toString());
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof T7.f) {
            if (((T7.e) ((T7.f) obj)).g(this, obj2) == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof t) {
            o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return j.a(((t) obj).f3846d, new o(obj2), null);
        }
        if (obj instanceof c) {
            o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            c cVar = (c) obj;
            C0150h c0150h = cVar.f3800e;
            o6.j.b(c0150h);
            cVar.f3800e = null;
            cVar.f3799d = obj2;
            return j.a(c0150h, Boolean.TRUE, null);
        }
        if (obj instanceof InterfaceC0149g) {
            o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            return j.a((InterfaceC0149g) obj, obj2, null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final boolean F(Object obj, p pVar, int i4) {
        T7.i iVar;
        boolean z8 = obj instanceof InterfaceC0149g;
        y yVar = y.f7506a;
        if (z8) {
            o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return j.a((InterfaceC0149g) obj, yVar, null);
        }
        if (obj instanceof T7.f) {
            o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            int g8 = ((T7.e) obj).g(this, yVar);
            T7.i iVar2 = T7.i.f5932d;
            T7.i iVar3 = T7.i.f5933e;
            if (g8 != 0) {
                if (g8 != 1) {
                    if (g8 != 2) {
                        if (g8 == 3) {
                            iVar = T7.i.f5935g;
                        } else {
                            throw new IllegalStateException(("Unexpected internal result: " + g8).toString());
                        }
                    } else {
                        iVar = T7.i.f5934f;
                    }
                } else {
                    iVar = iVar3;
                }
            } else {
                iVar = iVar2;
            }
            if (iVar == iVar3) {
                pVar.n(i4, null);
            }
            if (iVar == iVar2) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object G(p pVar, int i4, long j5, Object obj) {
        Object l6 = pVar.l(i4);
        AtomicReferenceArray atomicReferenceArray = pVar.f3843i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3810e;
        if (l6 == null) {
            if (j5 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f3830n;
                }
                if (pVar.k(l6, i4, obj)) {
                    o();
                    return j.f3829m;
                }
            }
        } else if (l6 == j.f3822d && pVar.k(l6, i4, j.f3827i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i4 * 2);
            pVar.n(i4, null);
            return obj2;
        }
        while (true) {
            Object l8 = pVar.l(i4);
            if (l8 != null && l8 != j.f3823e) {
                if (l8 == j.f3822d) {
                    if (pVar.k(l8, i4, j.f3827i)) {
                        o();
                        Object obj3 = atomicReferenceArray.get(i4 * 2);
                        pVar.n(i4, null);
                        return obj3;
                    }
                } else {
                    Q7.t tVar = j.j;
                    if (l8 == tVar) {
                        return j.f3831o;
                    }
                    if (l8 == j.f3826h) {
                        return j.f3831o;
                    }
                    if (l8 == j.f3828l) {
                        o();
                        return j.f3831o;
                    }
                    if (l8 != j.f3825g && pVar.k(l8, i4, j.f3824f)) {
                        boolean z8 = l8 instanceof w;
                        if (z8) {
                            l8 = ((w) l8).f3847a;
                        }
                        if (F(l8, pVar, i4)) {
                            pVar.o(i4, j.f3827i);
                            o();
                            Object obj4 = atomicReferenceArray.get(i4 * 2);
                            pVar.n(i4, null);
                            return obj4;
                        }
                        pVar.o(i4, tVar);
                        pVar.i();
                        if (z8) {
                            o();
                        }
                        return j.f3831o;
                    }
                }
            } else if (j5 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (pVar.k(l8, i4, j.f3826h)) {
                    o();
                    return j.f3831o;
                }
            } else {
                if (obj == null) {
                    return j.f3830n;
                }
                if (pVar.k(l8, i4, obj)) {
                    o();
                    return j.f3829m;
                }
            }
        }
    }

    public final int H(p pVar, int i4, Object obj, long j5, Object obj2, boolean z8) {
        while (true) {
            Object l6 = pVar.l(i4);
            if (l6 == null) {
                if (g(j5) && !z8) {
                    if (pVar.k(null, i4, j.f3822d)) {
                        break;
                    }
                } else if (z8) {
                    if (pVar.k(null, i4, j.j)) {
                        pVar.i();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (pVar.k(null, i4, obj2)) {
                        return 2;
                    }
                }
            } else if (l6 == j.f3823e) {
                if (pVar.k(l6, i4, j.f3822d)) {
                    break;
                }
            } else {
                Q7.t tVar = j.k;
                if (l6 == tVar) {
                    pVar.n(i4, null);
                    return 5;
                }
                if (l6 == j.f3826h) {
                    pVar.n(i4, null);
                    return 5;
                }
                if (l6 == j.f3828l) {
                    pVar.n(i4, null);
                    k();
                    return 4;
                }
                pVar.n(i4, null);
                if (l6 instanceof w) {
                    l6 = ((w) l6).f3847a;
                }
                if (E(l6, obj)) {
                    pVar.o(i4, j.f3827i);
                    return 0;
                }
                if (pVar.f3843i.getAndSet((i4 * 2) + 1, tVar) != tVar) {
                    pVar.m(i4, true);
                }
                return 5;
            }
        }
        return 1;
    }

    public final void I(long j5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z8;
        h hVar = this;
        if (!hVar.y()) {
            while (true) {
                atomicLongFieldUpdater = f3812g;
                if (atomicLongFieldUpdater.get(hVar) > j5) {
                    break;
                } else {
                    hVar = this;
                }
            }
            int i4 = j.f3821c;
            int i8 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3813h;
                if (i8 < i4) {
                    long j8 = atomicLongFieldUpdater.get(hVar);
                    if (j8 != (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) || j8 != atomicLongFieldUpdater.get(hVar)) {
                        i8++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j9 = atomicLongFieldUpdater2.get(hVar);
                        if (atomicLongFieldUpdater2.compareAndSet(hVar, j9, (j9 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        } else {
                            hVar = this;
                        }
                    }
                    while (true) {
                        long j10 = atomicLongFieldUpdater.get(hVar);
                        long j11 = atomicLongFieldUpdater2.get(hVar);
                        long j12 = j11 & 4611686018427387903L;
                        if ((j11 & 4611686018427387904L) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (j10 == j12 && j10 == atomicLongFieldUpdater.get(hVar)) {
                            break;
                        }
                        if (!z8) {
                            hVar = this;
                            atomicLongFieldUpdater2.compareAndSet(hVar, j11, 4611686018427387904L + j12);
                        } else {
                            hVar = this;
                        }
                    }
                    while (true) {
                        long j13 = atomicLongFieldUpdater2.get(hVar);
                        if (atomicLongFieldUpdater2.compareAndSet(hVar, j13, j13 & 4611686018427387903L)) {
                            return;
                        } else {
                            hVar = this;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        e(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // N7.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(InterfaceC0617c interfaceC0617c, Object obj) {
        Object u8;
        Object obj2;
        h hVar;
        p pVar;
        int i4;
        h hVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3814i;
        p pVar2 = (p) atomicReferenceFieldUpdater.get(hVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3810e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(hVar2);
            long j5 = andIncrement & 1152921504606846975L;
            boolean v8 = hVar2.v(andIncrement, false);
            int i8 = j.f3820b;
            long j8 = i8;
            long j9 = j5 / j8;
            int i9 = (int) (j5 % j8);
            long j10 = pVar2.f4966f;
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            y yVar = y.f7506a;
            if (j10 != j9) {
                p a3 = a(hVar2, j9, pVar2);
                if (a3 == null) {
                    if (v8) {
                        Object A2 = A(interfaceC0617c, obj);
                        if (A2 == enumC0646a) {
                            return A2;
                        }
                    }
                } else {
                    pVar2 = a3;
                }
            }
            int f8 = f(hVar2, pVar2, i9, obj, j5, null, v8);
            if (f8 != 0) {
                if (f8 == 1) {
                    break;
                }
                if (f8 != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3811f;
                    if (f8 != 3) {
                        if (f8 != 4) {
                            if (f8 == 5) {
                                pVar2.a();
                            }
                        } else {
                            if (j5 < atomicLongFieldUpdater2.get(hVar2)) {
                                pVar2.a();
                            }
                            Object A8 = A(interfaceC0617c, obj);
                            if (A8 == enumC0646a) {
                                return A8;
                            }
                        }
                    } else {
                        C0150h m6 = AbstractC0166y.m(E2.c.d0(interfaceC0617c));
                        Object obj3 = obj;
                        try {
                            int f9 = f(hVar2, pVar2, i9, obj3, j5, m6, false);
                            try {
                                if (f9 != 0) {
                                    if (f9 != 1) {
                                        if (f9 != 2) {
                                            if (f9 != 4) {
                                                String str = "unexpected";
                                                if (f9 == 5) {
                                                    pVar2.a();
                                                    p pVar3 = (p) atomicReferenceFieldUpdater.get(hVar2);
                                                    while (true) {
                                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hVar2);
                                                        long j11 = andIncrement2 & 1152921504606846975L;
                                                        boolean v9 = hVar2.v(andIncrement2, false);
                                                        int i10 = j.f3820b;
                                                        long j12 = i10;
                                                        String str2 = str;
                                                        long j13 = j11 / j12;
                                                        int i11 = (int) (j11 % j12);
                                                        if (pVar3.f4966f != j13) {
                                                            p a4 = a(hVar2, j13, pVar3);
                                                            if (a4 == null) {
                                                                if (v9) {
                                                                    break;
                                                                }
                                                                str = str2;
                                                            } else {
                                                                i4 = i10;
                                                                pVar = a4;
                                                            }
                                                        } else {
                                                            pVar = pVar3;
                                                            i4 = i10;
                                                        }
                                                        int f10 = f(hVar2, pVar, i11, obj3, j11, m6, v9);
                                                        Object obj4 = obj3;
                                                        hVar = hVar2;
                                                        p pVar4 = pVar;
                                                        obj2 = obj4;
                                                        if (f10 != 0) {
                                                            if (f10 == 1) {
                                                                break;
                                                            }
                                                            if (f10 != 2) {
                                                                if (f10 != 3) {
                                                                    if (f10 != 4) {
                                                                        if (f10 == 5) {
                                                                            pVar4.a();
                                                                        }
                                                                        pVar3 = pVar4;
                                                                        hVar2 = hVar;
                                                                        str = str2;
                                                                        obj3 = obj2;
                                                                    } else if (j11 < atomicLongFieldUpdater2.get(hVar)) {
                                                                        pVar4.a();
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException(str2);
                                                                }
                                                            } else if (v9) {
                                                                pVar4.i();
                                                            } else {
                                                                m6.a(pVar4, i11 + i4);
                                                            }
                                                        } else {
                                                            pVar4.a();
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            } else {
                                                obj2 = obj3;
                                                hVar = hVar2;
                                                if (j5 < atomicLongFieldUpdater2.get(hVar)) {
                                                    pVar2.a();
                                                }
                                            }
                                            e(hVar, obj2, m6);
                                        } else {
                                            m6.a(pVar2, i9 + i8);
                                        }
                                    } else {
                                        m6.k(yVar);
                                    }
                                    u8 = m6.u();
                                    if (u8 != enumC0646a) {
                                        u8 = yVar;
                                    }
                                    if (u8 != enumC0646a) {
                                        return u8;
                                    }
                                } else {
                                    pVar2.a();
                                }
                                m6.k(yVar);
                                u8 = m6.u();
                                if (u8 != enumC0646a) {
                                }
                                if (u8 != enumC0646a) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                m6.B();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } else if (v8) {
                    pVar2.i();
                    Object A9 = A(interfaceC0617c, obj);
                    if (A9 == enumC0646a) {
                        return A9;
                    }
                }
            } else {
                pVar2.a();
                return yVar;
            }
        }
    }

    @Override // N7.u
    public final Object c(P7.r rVar) {
        return B(this, rVar);
    }

    @Override // N7.u
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    public final boolean g(long j5) {
        if (j5 >= f3812g.get(this) && j5 >= f3811f.get(this) + this.f3817d) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r13) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r14 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = N7.h.f3816m;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = N7.j.f3833q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        o6.y.c(1, r14);
        ((n6.InterfaceC1163b) r14).m(q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = N7.j.f3834r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r13 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = N7.j.f3819a;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = N7.j.f3835s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = N7.h.f3815l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Throwable th, boolean z8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3810e;
    }

    @Override // N7.u
    public final R3.r i() {
        o6.y.c(3, d.f3802l);
        o6.y.c(3, e.f3803l);
        return new R3.r(this, (b) null);
    }

    @Override // N7.u
    public final c iterator() {
        return new c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (N7.p) ((Q7.c) Q7.c.f4939e.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p j(long j5) {
        Object obj;
        long j8;
        Object obj2 = k.get(this);
        p pVar = (p) f3814i.get(this);
        if (pVar.f4966f > ((p) obj2).f4966f) {
            obj2 = pVar;
        }
        p pVar2 = (p) j.get(this);
        if (pVar2.f4966f > ((p) obj2).f4966f) {
            obj2 = pVar2;
        }
        Q7.c cVar = (Q7.c) obj2;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q7.c.f4938d;
            Object obj3 = atomicReferenceFieldUpdater.get(cVar);
            Q7.t tVar = Q7.b.f4931a;
            obj = null;
            if (obj3 == tVar) {
                break;
            }
            Q7.c cVar2 = (Q7.c) obj3;
            if (cVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, tVar)) {
                    if (atomicReferenceFieldUpdater.get(cVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            cVar = cVar2;
        }
        p pVar3 = (p) cVar;
        if (x()) {
            p pVar4 = pVar3;
            loop2: do {
                int i4 = j.f3820b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    j8 = (pVar4.f4966f * j.f3820b) + i4;
                    if (j8 < f3811f.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object l6 = pVar4.l(i4);
                        if (l6 != null && l6 != j.f3823e) {
                            if (l6 == j.f3822d) {
                                break loop2;
                            }
                        } else if (pVar4.k(l6, i4, j.f3828l)) {
                            pVar4.i();
                            break;
                        }
                    }
                    i4--;
                }
            } while (pVar4 != null);
            j8 = -1;
            if (j8 != -1) {
                n(j8);
            }
        }
        loop5: for (p pVar5 = pVar3; pVar5 != null; pVar5 = (p) ((Q7.c) Q7.c.f4939e.get(pVar5))) {
            for (int i8 = j.f3820b - 1; -1 < i8; i8--) {
                if ((pVar5.f4966f * j.f3820b) + i8 < j5) {
                    break loop5;
                }
                while (true) {
                    Object l8 = pVar5.l(i8);
                    if (l8 != null && l8 != j.f3823e) {
                        if (l8 instanceof w) {
                            if (pVar5.k(l8, i8, j.f3828l)) {
                                obj = Q7.b.f(obj, ((w) l8).f3847a);
                                pVar5.m(i8, true);
                                break;
                            }
                        } else {
                            if (!(l8 instanceof s0)) {
                                break;
                            }
                            if (pVar5.k(l8, i8, j.f3828l)) {
                                obj = Q7.b.f(obj, l8);
                                pVar5.m(i8, true);
                                break;
                            }
                        }
                    } else if (pVar5.k(l8, i8, j.f3828l)) {
                        pVar5.i();
                        break;
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                D((s0) obj, true);
                return pVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                D((s0) arrayList.get(size), true);
            }
        }
        return pVar3;
    }

    public final void k() {
        v(f3810e.get(this), false);
    }

    @Override // N7.u
    public final Object l() {
        p pVar;
        s0 s0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3811f;
        long j5 = atomicLongFieldUpdater.get(this);
        long j8 = f3810e.get(this);
        if (v(j8, true)) {
            return new m(q());
        }
        long j9 = j8 & 1152921504606846975L;
        n nVar = o.f3840b;
        if (j5 >= j9) {
            return nVar;
        }
        Object obj = j.k;
        p pVar2 = (p) j.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = j.f3820b;
            long j11 = andIncrement / j10;
            int i4 = (int) (andIncrement % j10);
            if (pVar2.f4966f != j11) {
                p p8 = p(j11, pVar2);
                if (p8 == null) {
                    continue;
                } else {
                    pVar = p8;
                }
            } else {
                pVar = pVar2;
            }
            Object G8 = G(pVar, i4, andIncrement, obj);
            p pVar3 = pVar;
            if (G8 == j.f3829m) {
                if (obj instanceof s0) {
                    s0Var = (s0) obj;
                } else {
                    s0Var = null;
                }
                if (s0Var != null) {
                    s0Var.a(pVar3, i4);
                }
                I(andIncrement);
                pVar3.i();
                return nVar;
            }
            if (G8 == j.f3831o) {
                if (andIncrement < t()) {
                    pVar3.a();
                }
                pVar2 = pVar3;
            } else {
                if (G8 != j.f3830n) {
                    pVar3.a();
                    return G8;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        return new m(q());
    }

    @Override // N7.v
    public Object m(Object obj) {
        boolean z8;
        s0 s0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3810e;
        long j5 = atomicLongFieldUpdater.get(this);
        boolean z9 = false;
        long j8 = 1152921504606846975L;
        if (v(j5, false)) {
            z8 = false;
        } else {
            z8 = !g(j5 & 1152921504606846975L);
        }
        n nVar = o.f3840b;
        if (z8) {
            return nVar;
        }
        Object obj2 = j.j;
        p pVar = (p) f3814i.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = andIncrement & j8;
            boolean v8 = v(andIncrement, z9);
            int i4 = j.f3820b;
            long j10 = i4;
            long j11 = j9 / j10;
            int i8 = (int) (j9 % j10);
            if (pVar.f4966f != j11) {
                p a3 = a(this, j11, pVar);
                if (a3 == null) {
                    if (v8) {
                        return new m(s());
                    }
                    z9 = false;
                    j8 = 1152921504606846975L;
                } else {
                    pVar = a3;
                }
            }
            int f8 = f(this, pVar, i8, obj, j9, obj2, v8);
            y yVar = y.f7506a;
            if (f8 != 0) {
                if (f8 != 1) {
                    if (f8 != 2) {
                        if (f8 != 3) {
                            if (f8 != 4) {
                                if (f8 == 5) {
                                    pVar.a();
                                }
                                z9 = false;
                                j8 = 1152921504606846975L;
                            } else {
                                if (j9 < f3811f.get(this)) {
                                    pVar.a();
                                }
                                return new m(s());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else {
                        if (v8) {
                            pVar.i();
                            return new m(s());
                        }
                        if (obj2 instanceof s0) {
                            s0Var = (s0) obj2;
                        } else {
                            s0Var = null;
                        }
                        if (s0Var != null) {
                            s0Var.a(pVar, i8 + i4);
                        }
                        pVar.i();
                        return nVar;
                    }
                } else {
                    return yVar;
                }
            } else {
                pVar.a();
                return yVar;
            }
        }
    }

    public final void n(long j5) {
        p pVar = (p) j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3811f;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j5 < Math.max(this.f3817d + j8, f3812g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, 1 + j8)) {
                long j9 = j.f3820b;
                long j10 = j8 / j9;
                int i4 = (int) (j8 % j9);
                if (pVar.f4966f != j10) {
                    p p8 = p(j10, pVar);
                    if (p8 != null) {
                        pVar = p8;
                    }
                }
                p pVar2 = pVar;
                if (G(pVar2, i4, j8, null) == j.f3831o) {
                    if (j8 < t()) {
                        pVar2.a();
                    }
                } else {
                    pVar2.a();
                }
                pVar = pVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bd, code lost:
    
        if ((r0.addAndGet(r15, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c6, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        Object b4;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f3812g.getAndIncrement(this);
            long j5 = andIncrement / j.f3820b;
            if (t() <= andIncrement) {
                if (pVar.f4966f < j5 && pVar.c() != null) {
                    z(j5, pVar);
                }
                u(this);
                return;
            }
            if (pVar.f4966f != j5) {
                i iVar = i.f3818l;
                while (true) {
                    b4 = Q7.b.b(pVar, j5, iVar);
                    if (!Q7.b.e(b4)) {
                        Q7.r c6 = Q7.b.c(b4);
                        while (true) {
                            Q7.r rVar = (Q7.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f4966f >= c6.f4966f) {
                                break;
                            }
                            if (!c6.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c6)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c6.f()) {
                                        c6.e();
                                    }
                                }
                            }
                            if (rVar.f()) {
                                rVar.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                p pVar2 = null;
                if (Q7.b.e(b4)) {
                    k();
                    z(j5, pVar);
                    u(this);
                } else {
                    p pVar3 = (p) Q7.b.c(b4);
                    long j8 = pVar3.f4966f;
                    if (j8 > j5) {
                        long j9 = j8 * j.f3820b;
                        if (f3812g.compareAndSet(this, 1 + andIncrement, j9)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f3813h;
                        } else {
                            u(this);
                        }
                    } else {
                        pVar2 = pVar3;
                    }
                }
                if (pVar2 == null) {
                    continue;
                } else {
                    pVar = pVar2;
                }
            }
            int i4 = (int) (andIncrement % j.f3820b);
            Object l6 = pVar.l(i4);
            boolean z8 = l6 instanceof s0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3811f;
            if (!z8 || andIncrement < atomicLongFieldUpdater2.get(this) || !pVar.k(l6, i4, j.f3825g)) {
                while (true) {
                    Object l8 = pVar.l(i4);
                    if (l8 instanceof s0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (pVar.k(l8, i4, new w((s0) l8))) {
                                break loop0;
                            }
                        } else if (pVar.k(l8, i4, j.f3825g)) {
                            if (F(l8, pVar, i4)) {
                                pVar.o(i4, j.f3822d);
                                break;
                            } else {
                                pVar.o(i4, j.j);
                                pVar.i();
                            }
                        }
                    } else if (l8 != j.j) {
                        if (l8 == null) {
                            if (pVar.k(l8, i4, j.f3823e)) {
                                break loop0;
                            }
                        } else {
                            if (l8 == j.f3822d || l8 == j.f3826h || l8 == j.f3827i || l8 == j.k || l8 == j.f3828l) {
                                break loop0;
                            }
                            if (l8 != j.f3824f) {
                                throw new IllegalStateException(("Unexpected cell state: " + l8).toString());
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else if (F(l6, pVar, i4)) {
                pVar.o(i4, j.f3822d);
                break;
            } else {
                pVar.o(i4, j.j);
                pVar.i();
                u(this);
            }
        }
        u(this);
    }

    public final p p(long j5, p pVar) {
        Object b4;
        long j8;
        p pVar2 = j.f3819a;
        i iVar = i.f3818l;
        loop0: while (true) {
            b4 = Q7.b.b(pVar, j5, iVar);
            if (!Q7.b.e(b4)) {
                Q7.r c6 = Q7.b.c(b4);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    Q7.r rVar = (Q7.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f4966f >= c6.f4966f) {
                        break loop0;
                    }
                    if (!c6.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c6)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c6.f()) {
                                c6.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (Q7.b.e(b4)) {
            k();
            if (pVar.f4966f * j.f3820b < t()) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) Q7.b.c(b4);
            long j9 = pVar3.f4966f;
            if (!y() && j5 <= f3812g.get(this) / j.f3820b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                    Q7.r rVar2 = (Q7.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f4966f >= j9) {
                        break;
                    }
                    if (!pVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, pVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (pVar3.f()) {
                                pVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j9 > j5) {
                long j10 = j9 * j.f3820b;
                do {
                    j8 = f3811f.get(this);
                    if (j8 >= j10) {
                        break;
                    }
                } while (!f3811f.compareAndSet(this, j8, j10));
                if (j9 * j.f3820b < t()) {
                    pVar3.a();
                }
            } else {
                return pVar3;
            }
        }
        return null;
    }

    public final Throwable q() {
        return (Throwable) f3815l.get(this);
    }

    public final Throwable r() {
        Throwable q6 = q();
        if (q6 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return q6;
    }

    public final Throwable s() {
        Throwable q6 = q();
        if (q6 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return q6;
    }

    public final long t() {
        return f3810e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        r16 = r7;
        r3 = (N7.p) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z8;
        String str;
        StringBuilder sb = new StringBuilder();
        int i4 = (int) (f3810e.get(this) >> 60);
        if (i4 != 2) {
            if (i4 == 3) {
                sb.append("cancelled,");
            }
        } else {
            sb.append("closed,");
        }
        sb.append("capacity=" + this.f3817d + ',');
        sb.append("data=[");
        int i8 = 0;
        boolean z9 = true;
        List X8 = AbstractC0437l.X(j.get(this), f3814i.get(this), k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : X8) {
            if (((p) obj) != j.f3819a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j5 = ((p) next).f4966f;
                do {
                    Object next2 = it.next();
                    long j8 = ((p) next2).f4966f;
                    if (j5 > j8) {
                        next = next2;
                        j5 = j8;
                    }
                } while (it.hasNext());
            }
            p pVar = (p) next;
            long j9 = f3811f.get(this);
            long t8 = t();
            loop2: while (true) {
                int i9 = j.f3820b;
                int i10 = i8;
                while (true) {
                    if (i10 >= i9) {
                        break;
                    }
                    long j10 = (pVar.f4966f * j.f3820b) + i10;
                    if (j10 >= t8 && j10 >= j9) {
                        break loop2;
                    }
                    Object l6 = pVar.l(i10);
                    boolean z10 = z9;
                    Object obj2 = pVar.f3843i.get(i10 * 2);
                    if (l6 instanceof InterfaceC0149g) {
                        if (j10 < j9 && j10 >= t8) {
                            str = "receive";
                        } else if (j10 < t8 && j10 >= j9) {
                            str = "send";
                        } else {
                            str = "cont";
                        }
                    } else if (l6 instanceof T7.f) {
                        if (j10 < j9 && j10 >= t8) {
                            str = "onReceive";
                        } else if (j10 < t8 && j10 >= j9) {
                            str = "onSend";
                        } else {
                            str = "select";
                        }
                    } else if (l6 instanceof t) {
                        str = "receiveCatching";
                    } else if (l6 instanceof w) {
                        str = "EB(" + l6 + ')';
                    } else if (!o6.j.a(l6, j.f3824f) && !o6.j.a(l6, j.f3825g)) {
                        if (l6 != null && !l6.equals(j.f3823e) && !l6.equals(j.f3827i) && !l6.equals(j.f3826h) && !l6.equals(j.k) && !l6.equals(j.j) && !l6.equals(j.f3828l)) {
                            str = l6.toString();
                        }
                        i10++;
                        z9 = z10;
                    } else {
                        str = "resuming_sender";
                    }
                    if (obj2 != null) {
                        sb.append("(" + str + ',' + obj2 + "),");
                    } else {
                        sb.append(str + ',');
                    }
                    i10++;
                    z9 = z10;
                }
                z9 = z8;
                i8 = 0;
            }
            if (I7.m.k0(sb) == ',') {
                o6.j.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
            }
            sb.append("]");
            return sb.toString();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (N7.p) ((Q7.c) Q7.c.f4939e.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(long j5, boolean z8) {
        s0 s0Var;
        int i4 = (int) (j5 >> 60);
        if (i4 != 0 && i4 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3811f;
            if (i4 != 2) {
                if (i4 == 3) {
                    p j8 = j(1152921504606846975L & j5);
                    Object obj = null;
                    loop0: do {
                        int i8 = j.f3820b - 1;
                        while (true) {
                            if (-1 >= i8) {
                                break;
                            }
                            long j9 = (j8.f4966f * j.f3820b) + i8;
                            while (true) {
                                Object l6 = j8.l(i8);
                                if (l6 == j.f3827i) {
                                    break loop0;
                                }
                                if (l6 == j.f3822d) {
                                    if (j9 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    if (j8.k(l6, i8, j.f3828l)) {
                                        j8.n(i8, null);
                                        j8.i();
                                        break;
                                    }
                                } else if (l6 != j.f3823e && l6 != null) {
                                    if (!(l6 instanceof s0) && !(l6 instanceof w)) {
                                        Q7.t tVar = j.f3825g;
                                        if (l6 == tVar || l6 == j.f3824f) {
                                            break loop0;
                                        }
                                        if (l6 != tVar) {
                                            break;
                                        }
                                    } else {
                                        if (j9 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        if (l6 instanceof w) {
                                            s0Var = ((w) l6).f3847a;
                                        } else {
                                            s0Var = (s0) l6;
                                        }
                                        if (j8.k(l6, i8, j.f3828l)) {
                                            obj = Q7.b.f(obj, s0Var);
                                            j8.n(i8, null);
                                            j8.i();
                                            break;
                                        }
                                    }
                                } else if (j8.k(l6, i8, j.f3828l)) {
                                    j8.i();
                                    break;
                                }
                            }
                            i8--;
                        }
                    } while (j8 != null);
                    if (obj != null) {
                        if (!(obj instanceof ArrayList)) {
                            D((s0) obj, false);
                        } else {
                            ArrayList arrayList = (ArrayList) obj;
                            for (int size = arrayList.size() - 1; -1 < size; size--) {
                                D((s0) arrayList.get(size), false);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(A.j.l("unexpected close status: ", i4).toString());
                }
            } else {
                j(1152921504606846975L & j5);
                if (z8) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                        p pVar = (p) atomicReferenceFieldUpdater.get(this);
                        long j10 = atomicLongFieldUpdater.get(this);
                        if (t() <= j10) {
                            break;
                        }
                        long j11 = j.f3820b;
                        long j12 = j10 / j11;
                        if (pVar.f4966f != j12 && (pVar = p(j12, pVar)) == null) {
                            if (((p) atomicReferenceFieldUpdater.get(this)).f4966f < j12) {
                                break;
                            }
                        } else {
                            pVar.a();
                            int i9 = (int) (j10 % j11);
                            while (true) {
                                Object l8 = pVar.l(i9);
                                if (l8 != null && l8 != j.f3823e) {
                                    if (l8 == j.f3822d) {
                                        break;
                                    }
                                    if (l8 != j.j) {
                                        if (l8 != j.f3828l) {
                                            if (l8 != j.f3827i) {
                                                if (l8 != j.f3826h) {
                                                    if (l8 == j.f3825g) {
                                                        break;
                                                    }
                                                    if (l8 != j.f3824f && j10 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (pVar.k(l8, i9, j.f3826h)) {
                                    o();
                                    break;
                                }
                            }
                            f3811f.compareAndSet(this, j10, j10 + 1);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean w() {
        return v(f3810e.get(this), true);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j5 = f3812g.get(this);
        if (j5 != 0 && j5 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(long j5, p pVar) {
        p pVar2;
        p pVar3;
        while (pVar.f4966f < j5 && (pVar3 = (p) pVar.c()) != null) {
            pVar = pVar3;
        }
        while (true) {
            if (!pVar.d() || (pVar2 = (p) pVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                    Q7.r rVar = (Q7.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f4966f < pVar.f4966f) {
                        if (!pVar.j()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, pVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (pVar.f()) {
                                    pVar.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            pVar = pVar2;
        }
    }
}
