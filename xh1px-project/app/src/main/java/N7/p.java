package N7;

import L7.s0;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class p extends Q7.r {

    /* renamed from: h, reason: collision with root package name */
    public final h f3842h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3843i;

    public p(long j, p pVar, h hVar, int i4) {
        super(j, pVar, i4);
        this.f3842h = hVar;
        this.f3843i = new AtomicReferenceArray(j.f3820b * 2);
    }

    @Override // Q7.r
    public final int g() {
        return j.f3820b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        o6.j.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // Q7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i4, InterfaceC0622h interfaceC0622h) {
        boolean z8;
        Q7.t tVar;
        int i8 = j.f3820b;
        if (i4 >= i8) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i4 -= i8;
        }
        this.f3843i.get(i4 * 2);
        while (true) {
            Object l6 = l(i4);
            boolean z9 = l6 instanceof s0;
            h hVar = this.f3842h;
            if (!z9 && !(l6 instanceof w)) {
                if (l6 == j.j || l6 == j.k) {
                    break;
                }
                if (l6 != j.f3825g && l6 != j.f3824f) {
                    if (l6 != j.f3827i && l6 != j.f3822d && l6 != j.f3828l) {
                        throw new IllegalStateException(("unexpected state: " + l6).toString());
                    }
                    return;
                }
            } else {
                if (z8) {
                    tVar = j.j;
                } else {
                    tVar = j.k;
                }
                if (k(l6, i4, tVar)) {
                    n(i4, null);
                    m(i4, !z8);
                    if (z8) {
                        o6.j.b(hVar);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final boolean k(Object obj, int i4, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i8 = (i4 * 2) + 1;
        do {
            atomicReferenceArray = this.f3843i;
            if (atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i8) == obj);
        return false;
    }

    public final Object l(int i4) {
        return this.f3843i.get((i4 * 2) + 1);
    }

    public final void m(int i4, boolean z8) {
        if (z8) {
            h hVar = this.f3842h;
            o6.j.b(hVar);
            hVar.I((this.f4966f * j.f3820b) + i4);
        }
        i();
    }

    public final void n(int i4, Object obj) {
        this.f3843i.set(i4 * 2, obj);
    }

    public final void o(int i4, Object obj) {
        this.f3843i.set((i4 * 2) + 1, obj);
    }
}
