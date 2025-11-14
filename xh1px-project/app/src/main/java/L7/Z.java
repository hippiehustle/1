package L7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class Z extends Q7.j implements H, U {

    /* renamed from: g, reason: collision with root package name */
    public d0 f3197g;

    @Override // L7.U
    public final boolean a() {
        return true;
    }

    @Override // L7.H
    public final void b() {
        d0 j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d0.f3210d;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof Z) {
                if (obj == this) {
                    J j5 = AbstractC0166y.j;
                    while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, j5)) {
                        if (atomicReferenceFieldUpdater.get(j) != obj) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(obj instanceof U) || ((U) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Q7.j.f4950d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof Q7.o) {
                    Q7.j jVar = ((Q7.o) obj2).f4963a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                o6.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                Q7.j jVar2 = (Q7.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Q7.j.f4952f;
                Q7.o oVar = (Q7.o) atomicReferenceFieldUpdater3.get(jVar2);
                if (oVar == null) {
                    oVar = new Q7.o(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar2.f();
                return;
            }
        }
    }

    @Override // L7.U
    public final f0 d() {
        return null;
    }

    public X getParent() {
        return j();
    }

    public final d0 j() {
        d0 d0Var = this.f3197g;
        if (d0Var != null) {
            return d0Var;
        }
        o6.j.i("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // Q7.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0166y.l(this) + "[job@" + AbstractC0166y.l(j()) + ']';
    }
}
