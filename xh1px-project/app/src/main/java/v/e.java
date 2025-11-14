package v;

import h4.AbstractC0832f;

/* loaded from: classes.dex */
public final class e extends AbstractC0832f {
    @Override // h4.AbstractC0832f
    public final boolean a(g gVar, c cVar) {
        c cVar2 = c.f15466b;
        synchronized (gVar) {
            try {
                if (gVar.f15480e == cVar) {
                    gVar.f15480e = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h4.AbstractC0832f
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f15479d == obj) {
                    gVar.f15479d = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h4.AbstractC0832f
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f15481f == fVar) {
                    gVar.f15481f = fVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h4.AbstractC0832f
    public final void v(f fVar, f fVar2) {
        fVar.f15475b = fVar2;
    }

    @Override // h4.AbstractC0832f
    public final void w(f fVar, Thread thread) {
        fVar.f15474a = thread;
    }
}
