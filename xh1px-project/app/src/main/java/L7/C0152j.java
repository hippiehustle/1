package L7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: L7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152j extends Z {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3221h;

    /* renamed from: i, reason: collision with root package name */
    public final C0150h f3222i;

    public /* synthetic */ C0152j(C0150h c0150h, int i4) {
        this.f3221h = i4;
        this.f3222i = c0150h;
    }

    @Override // L7.Z
    public final boolean k() {
        switch (this.f3221h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // L7.Z
    public final void l(Throwable th) {
        switch (this.f3221h) {
            case 0:
                d0 j = j();
                C0150h c0150h = this.f3222i;
                Throwable t8 = c0150h.t(j);
                if (c0150h.y()) {
                    Q7.f fVar = (Q7.f) c0150h.f3217g;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q7.f.k;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        Q7.t tVar = Q7.b.f4933c;
                        if (o6.j.a(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, t8)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                                    break;
                                }
                            }
                            return;
                        } else {
                            if (obj instanceof Throwable) {
                                return;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0150h.p(t8);
                if (!c0150h.y()) {
                    c0150h.q();
                    return;
                }
                return;
            default:
                this.f3222i.k(Z5.y.f7506a);
                return;
        }
    }
}
