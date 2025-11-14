package N7;

import L7.s0;
import Z5.y;
import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: n, reason: collision with root package name */
    public final a f3844n;

    public q(int i4, a aVar) {
        super(i4);
        this.f3844n = aVar;
        if (aVar != a.f3795d) {
            if (i4 >= 1) {
            } else {
                throw new IllegalArgumentException(A.j.j(i4, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + o6.v.f13643a.b(h.class).c() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(Object obj, boolean z8) {
        s0 s0Var;
        a aVar = this.f3844n;
        a aVar2 = a.f3797f;
        y yVar = y.f7506a;
        if (aVar == aVar2) {
            Object m6 = super.m(obj);
            if ((m6 instanceof n) && !(m6 instanceof m)) {
                return yVar;
            }
            return m6;
        }
        Object obj2 = j.f3822d;
        p pVar = (p) h.f3814i.get(this);
        while (true) {
            long andIncrement = h.f3810e.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean v8 = v(andIncrement, false);
            int i4 = j.f3820b;
            long j5 = i4;
            long j8 = j / j5;
            int i8 = (int) (j % j5);
            if (pVar.f4966f != j8) {
                p a3 = h.a(this, j8, pVar);
                if (a3 == null) {
                    if (v8) {
                        return new m(s());
                    }
                } else {
                    pVar = a3;
                }
            }
            int f8 = h.f(this, pVar, i8, obj, j, obj2, v8);
            if (f8 != 0) {
                if (f8 == 1) {
                    break;
                }
                if (f8 != 2) {
                    if (f8 != 3) {
                        if (f8 != 4) {
                            if (f8 == 5) {
                                pVar.a();
                            }
                        } else {
                            if (j < h.f3811f.get(this)) {
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
                    n((pVar.f4966f * j5) + i8);
                }
            } else {
                pVar.a();
                return yVar;
            }
        }
    }

    @Override // N7.h, N7.v
    public final Object b(InterfaceC0617c interfaceC0617c, Object obj) {
        if (!(J(obj, true) instanceof m)) {
            return y.f7506a;
        }
        throw s();
    }

    @Override // N7.h, N7.v
    public final Object m(Object obj) {
        return J(obj, false);
    }

    @Override // N7.h
    public final boolean x() {
        if (this.f3844n == a.f3796e) {
            return true;
        }
        return false;
    }
}
