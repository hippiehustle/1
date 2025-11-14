package N7;

import L7.AbstractC0166y;
import L7.C0150h;
import L7.s0;
import O7.C0236i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c implements s0 {

    /* renamed from: d, reason: collision with root package name */
    public Object f3799d = j.f3832p;

    /* renamed from: e, reason: collision with root package name */
    public C0150h f3800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f3801f;

    public c(h hVar) {
        this.f3801f = hVar;
    }

    @Override // L7.s0
    public final void a(Q7.r rVar, int i4) {
        C0150h c0150h = this.f3800e;
        if (c0150h != null) {
            c0150h.a(rVar, i4);
        }
    }

    public final Object b(C0236i c0236i) {
        p pVar;
        Boolean bool;
        p pVar2;
        Object obj = this.f3799d;
        boolean z8 = true;
        if (obj == j.f3832p || obj == j.f3828l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.j;
            h hVar = this.f3801f;
            p pVar3 = (p) atomicReferenceFieldUpdater.get(hVar);
            while (!hVar.w()) {
                long andIncrement = h.f3811f.getAndIncrement(hVar);
                long j = j.f3820b;
                long j5 = andIncrement / j;
                int i4 = (int) (andIncrement % j);
                if (pVar3.f4966f != j5) {
                    p p8 = hVar.p(j5, pVar3);
                    if (p8 == null) {
                        continue;
                    } else {
                        pVar = p8;
                    }
                } else {
                    pVar = pVar3;
                }
                Object G8 = hVar.G(pVar, i4, andIncrement, null);
                Q7.t tVar = j.f3829m;
                if (G8 != tVar) {
                    Q7.t tVar2 = j.f3831o;
                    if (G8 == tVar2) {
                        if (andIncrement < hVar.t()) {
                            pVar.a();
                        }
                        pVar3 = pVar;
                    } else {
                        if (G8 == j.f3830n) {
                            C0150h m6 = AbstractC0166y.m(E2.c.d0(c0236i));
                            try {
                                this.f3800e = m6;
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                Object G9 = hVar.G(pVar, i4, andIncrement, this);
                                if (G9 == tVar) {
                                    a(pVar, i4);
                                } else {
                                    if (G9 == tVar2) {
                                        if (andIncrement < hVar.t()) {
                                            pVar.a();
                                        }
                                        p pVar4 = (p) h.j.get(hVar);
                                        while (true) {
                                            if (hVar.w()) {
                                                C0150h c0150h = this.f3800e;
                                                o6.j.b(c0150h);
                                                this.f3800e = null;
                                                this.f3799d = j.f3828l;
                                                Throwable q6 = hVar.q();
                                                if (q6 == null) {
                                                    c0150h.k(Boolean.FALSE);
                                                } else {
                                                    c0150h.k(Z5.a.b(q6));
                                                }
                                            } else {
                                                long andIncrement2 = h.f3811f.getAndIncrement(hVar);
                                                long j8 = j.f3820b;
                                                long j9 = andIncrement2 / j8;
                                                int i8 = (int) (andIncrement2 % j8);
                                                if (pVar4.f4966f != j9) {
                                                    p p9 = hVar.p(j9, pVar4);
                                                    if (p9 != null) {
                                                        pVar2 = p9;
                                                    }
                                                } else {
                                                    pVar2 = pVar4;
                                                }
                                                Object G10 = hVar.G(pVar2, i8, andIncrement2, this);
                                                p pVar5 = pVar2;
                                                if (G10 == j.f3829m) {
                                                    a(pVar5, i8);
                                                    break;
                                                }
                                                if (G10 == j.f3831o) {
                                                    if (andIncrement2 < hVar.t()) {
                                                        pVar5.a();
                                                    }
                                                    pVar4 = pVar5;
                                                } else if (G10 != j.f3830n) {
                                                    pVar5.a();
                                                    this.f3799d = G10;
                                                    this.f3800e = null;
                                                    bool = Boolean.TRUE;
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        pVar.a();
                                        this.f3799d = G9;
                                        this.f3800e = null;
                                        bool = Boolean.TRUE;
                                    }
                                    m6.f(bool, null);
                                }
                                return m6.u();
                            } catch (Throwable th2) {
                                th = th2;
                                m6.B();
                                throw th;
                            }
                        }
                        pVar.a();
                        this.f3799d = G8;
                        return Boolean.valueOf(z8);
                    }
                } else {
                    throw new IllegalStateException("unreachable");
                }
            }
            this.f3799d = j.f3828l;
            Throwable q8 = hVar.q();
            if (q8 == null) {
                z8 = false;
            } else {
                int i9 = Q7.s.f4967a;
                throw q8;
            }
        }
        return Boolean.valueOf(z8);
    }
}
