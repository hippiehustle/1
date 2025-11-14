package Q7;

import L7.AbstractC0166y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4950d = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4951e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4952f = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(j jVar, int i4) {
        while (true) {
            j f8 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4951e;
            if (f8 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f8 = (j) obj;
                    if (!f8.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f8);
                }
            }
            if (f8 instanceof h) {
                if ((((h) f8).f4949g & i4) == 0 && f8.e(jVar, i4)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(jVar, f8);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4950d;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f8, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(f8) != this) {
                    break;
                }
            }
            jVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((Q7.o) r6).f4963a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4951e;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4950d;
                    Object obj = atomicReferenceFieldUpdater2.get(jVar2);
                    if (obj == this) {
                        if (jVar == jVar2) {
                            return jVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, jVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != jVar) {
                                break;
                            }
                        }
                        return jVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (obj instanceof o) {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar2 = (j) atomicReferenceFieldUpdater.get(jVar2);
                    } else {
                        o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        jVar3 = jVar2;
                        jVar2 = (j) obj;
                    }
                }
                jVar2 = jVar3;
            }
        }
    }

    public final void g(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4951e;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f4950d.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (i()) {
                jVar.f();
                return;
            }
            return;
        }
    }

    public final j h() {
        o oVar;
        j jVar;
        Object obj = f4950d.get(this);
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar != null && (jVar = oVar.f4963a) != null) {
            return jVar;
        }
        o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean i() {
        return f4950d.get(this) instanceof o;
    }

    public String toString() {
        return new o6.q(this, AbstractC0166y.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0166y.l(this);
    }
}
