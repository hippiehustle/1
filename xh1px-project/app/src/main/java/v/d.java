package v;

import h4.AbstractC0832f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0832f {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15468b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15469c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15470d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15471e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15472f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f15468b = atomicReferenceFieldUpdater;
        this.f15469c = atomicReferenceFieldUpdater2;
        this.f15470d = atomicReferenceFieldUpdater3;
        this.f15471e = atomicReferenceFieldUpdater4;
        this.f15472f = atomicReferenceFieldUpdater5;
    }

    @Override // h4.AbstractC0832f
    public final boolean a(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15471e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, c.f15466b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // h4.AbstractC0832f
    public final boolean b(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15472f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // h4.AbstractC0832f
    public final boolean c(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15470d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // h4.AbstractC0832f
    public final void v(f fVar, f fVar2) {
        this.f15469c.lazySet(fVar, fVar2);
    }

    @Override // h4.AbstractC0832f
    public final void w(f fVar, Thread thread) {
        this.f15468b.lazySet(fVar, thread);
    }
}
