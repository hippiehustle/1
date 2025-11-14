package Q7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4938d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4939e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void a() {
        f4939e.set(this, null);
    }

    public final c c() {
        Object obj = f4938d.get(this);
        if (obj == b.f4931a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean d();

    public final void e() {
        c cVar;
        c c6;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4939e;
            c cVar2 = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar2 != null && cVar2.d()) {
                cVar2 = (c) atomicReferenceFieldUpdater.get(cVar2);
            }
            c c9 = c();
            o6.j.b(c9);
            while (c9.d() && (c6 = c9.c()) != null) {
                c9 = c6;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c9);
                if (((c) obj) == null) {
                    cVar = null;
                } else {
                    cVar = cVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c9, obj, cVar)) {
                    if (atomicReferenceFieldUpdater.get(c9) != obj) {
                        break;
                    }
                }
            }
            if (cVar2 != null) {
                f4938d.set(cVar2, c9);
            }
            if (!c9.d() || c9.c() == null) {
                if (cVar2 == null || !cVar2.d()) {
                    return;
                }
            }
        }
    }
}
