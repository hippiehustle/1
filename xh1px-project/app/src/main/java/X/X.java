package X;

import L7.AbstractC0166y;
import L7.C0150h;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n6.InterfaceC1164c;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class X extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public E f6703h;

    /* renamed from: i, reason: collision with root package name */
    public int f6704i;
    public final /* synthetic */ A4.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(A4.a aVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = aVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((X) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new X(this.j, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
    
        if (r2 == r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012e, code lost:
    
        if (r2 == N7.j.f3830n) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0130, code lost:
    
        r5.a();
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013d, code lost:
    
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x016e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x015f -> B:6:0x0160). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        A4.a aVar;
        Object obj2;
        E e9;
        A4.a aVar2;
        N7.h hVar;
        Object G8;
        Object obj3;
        InterfaceC1165d interfaceC1165d;
        N7.p pVar;
        int i4 = this.f6704i;
        int i8 = 1;
        A4.a aVar3 = this.j;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    aVar2 = aVar3;
                    if (((AtomicInteger) ((W0.c) aVar2.f283h).f6486e).decrementAndGet() != 0) {
                        return Z5.y.f7506a;
                    }
                    aVar3 = aVar2;
                    i8 = 1;
                    AbstractC0166y.i(((Q7.d) aVar3.f280e).f4940d);
                    e9 = (E) aVar3.f281f;
                    hVar = (N7.h) aVar3.f282g;
                    this.f6703h = e9;
                    this.f6704i = i8;
                    hVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = N7.h.f3811f;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N7.h.j;
                    N7.p pVar2 = (N7.p) atomicReferenceFieldUpdater.get(hVar);
                    while (!hVar.w()) {
                        long andIncrement = atomicLongFieldUpdater.getAndIncrement(hVar);
                        aVar = aVar3;
                        long j = N7.j.f3820b;
                        long j5 = andIncrement / j;
                        int i9 = (int) (andIncrement % j);
                        if (pVar2.f4966f != j5) {
                            N7.p p8 = hVar.p(j5, pVar2);
                            if (p8 == null) {
                                continue;
                                aVar3 = aVar;
                            } else {
                                pVar2 = p8;
                            }
                        }
                        obj2 = hVar.G(pVar2, i9, andIncrement, null);
                        Q7.t tVar = N7.j.f3829m;
                        if (obj2 != tVar) {
                            Q7.t tVar2 = N7.j.f3831o;
                            if (obj2 == tVar2) {
                                if (andIncrement < hVar.t()) {
                                    pVar2.a();
                                }
                                aVar3 = aVar;
                            } else if (obj2 == N7.j.f3830n) {
                                C0150h m6 = AbstractC0166y.m(E2.c.d0(this));
                                try {
                                    G8 = hVar.G(pVar2, i9, andIncrement, m6);
                                } catch (Throwable th) {
                                    m6.B();
                                    throw th;
                                }
                                if (G8 == tVar) {
                                    m6.a(pVar2, i9);
                                } else {
                                    if (G8 == tVar2) {
                                        if (andIncrement < hVar.t()) {
                                            pVar2.a();
                                        }
                                        N7.p pVar3 = (N7.p) atomicReferenceFieldUpdater.get(hVar);
                                        while (true) {
                                            if (hVar.w()) {
                                                m6.k(Z5.a.b(hVar.r()));
                                                break;
                                            }
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hVar);
                                            long j8 = N7.j.f3820b;
                                            long j9 = andIncrement2 / j8;
                                            int i10 = (int) (andIncrement2 % j8);
                                            if (pVar3.f4966f != j9) {
                                                N7.p p9 = hVar.p(j9, pVar3);
                                                if (p9 != null) {
                                                    pVar = p9;
                                                }
                                            } else {
                                                pVar = pVar3;
                                            }
                                            obj3 = hVar.G(pVar, i10, andIncrement2, m6);
                                            N7.p pVar4 = pVar;
                                            if (obj3 == N7.j.f3829m) {
                                                m6.a(pVar4, i10);
                                                break;
                                            }
                                            if (obj3 != N7.j.f3831o) {
                                                break;
                                            }
                                            if (andIncrement2 < hVar.t()) {
                                                pVar4.a();
                                            }
                                            pVar3 = pVar4;
                                        }
                                        m6.B();
                                        throw th;
                                    }
                                    obj3 = G8;
                                    pVar2.a();
                                    interfaceC1165d = null;
                                    m6.f(obj3, interfaceC1165d);
                                }
                                obj2 = m6.u();
                            } else {
                                pVar2.a();
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    }
                    Throwable r8 = hVar.r();
                    int i11 = Q7.s.f4967a;
                    throw r8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e9 = this.f6703h;
            Z5.a.d(obj);
            obj2 = obj;
            aVar = aVar3;
            this.f6703h = null;
            this.f6704i = 2;
            if (e9.l(obj2, this) != enumC0646a) {
                aVar2 = aVar;
                if (((AtomicInteger) ((W0.c) aVar2.f283h).f6486e).decrementAndGet() != 0) {
                }
            }
            return enumC0646a;
        }
        Z5.a.d(obj);
        if (((AtomicInteger) ((W0.c) aVar3.f283h).f6486e).get() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        AbstractC0166y.i(((Q7.d) aVar3.f280e).f4940d);
        e9 = (E) aVar3.f281f;
        hVar = (N7.h) aVar3.f282g;
        this.f6703h = e9;
        this.f6704i = i8;
        hVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = N7.h.f3811f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = N7.h.j;
        N7.p pVar22 = (N7.p) atomicReferenceFieldUpdater2.get(hVar);
        while (!hVar.w()) {
        }
        Throwable r82 = hVar.r();
        int i112 = Q7.s.f4967a;
        throw r82;
    }
}
