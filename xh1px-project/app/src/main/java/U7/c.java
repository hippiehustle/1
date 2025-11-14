package U7;

import L7.AbstractC0166y;
import L7.C0150h;
import Q7.t;
import Z5.y;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c extends g implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f6192a;
    }

    @Override // U7.a
    public final void a(Object obj) {
        while (Math.max(g.j.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = d.f6192a;
            if (obj2 != tVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                c();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r2 = r0.f6191e;
        U7.c.k.set(r2, null);
        r3 = r0.f6190d;
        r3.C(r1, r3.f3174f, new D2.e(1, new A1.h(r2, r0)));
     */
    @Override // U7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC0713c abstractC0713c) {
        boolean e9 = e();
        y yVar = y.f7506a;
        if (!e9) {
            C0150h m6 = AbstractC0166y.m(E2.c.d0(abstractC0713c));
            try {
                b bVar = new b(this, m6);
                while (true) {
                    int andDecrement = g.j.getAndDecrement(this);
                    if (andDecrement <= this.f6199d) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (b(bVar)) {
                            break;
                        }
                    }
                }
                Object u8 = m6.u();
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (u8 != enumC0646a) {
                    u8 = yVar;
                }
                if (u8 == enumC0646a) {
                    return u8;
                }
            } catch (Throwable th) {
                m6.B();
                throw th;
            }
        }
        return yVar;
    }

    public final boolean e() {
        int i4;
        char c6;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.j;
            int i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = this.f6199d;
            if (i8 > i9) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 > i9) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, i9));
            } else {
                if (i8 <= 0) {
                    c6 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    k.set(this, null);
                    c6 = 0;
                    break;
                }
            }
        }
        if (c6 == 0) {
            return true;
        }
        if (c6 == 1) {
            return false;
        }
        if (c6 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0166y.l(this));
        sb.append("[isLocked=");
        boolean z8 = false;
        if (Math.max(g.j.get(this), 0) == 0) {
            z8 = true;
        }
        sb.append(z8);
        sb.append(",owner=");
        sb.append(k.get(this));
        sb.append(']');
        return sb.toString();
    }
}
