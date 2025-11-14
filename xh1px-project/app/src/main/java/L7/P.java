package L7;

import a6.C0433h;

/* loaded from: classes.dex */
public abstract class P extends AbstractC0160s {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3187i = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f3188f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3189g;

    /* renamed from: h, reason: collision with root package name */
    public C0433h f3190h;

    @Override // L7.AbstractC0160s
    public final AbstractC0160s Q(int i4) {
        Q7.b.a(i4);
        return this;
    }

    public final void R(boolean z8) {
        long j;
        long j5 = this.f3188f;
        if (z8) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j8 = j5 - j;
        this.f3188f = j8;
        if (j8 <= 0 && this.f3189g) {
            shutdown();
        }
    }

    public final void S(D d2) {
        C0433h c0433h = this.f3190h;
        if (c0433h == null) {
            c0433h = new C0433h();
            this.f3190h = c0433h;
        }
        c0433h.addLast(d2);
    }

    public abstract Thread T();

    public final void U(boolean z8) {
        long j;
        long j5 = this.f3188f;
        if (z8) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.f3188f = j + j5;
        if (!z8) {
            this.f3189g = true;
        }
    }

    public abstract long V();

    public final boolean W() {
        Object removeFirst;
        C0433h c0433h = this.f3190h;
        if (c0433h == null) {
            return false;
        }
        if (c0433h.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = c0433h.removeFirst();
        }
        D d2 = (D) removeFirst;
        if (d2 == null) {
            return false;
        }
        d2.run();
        return true;
    }

    public void X(long j, M m6) {
        RunnableC0167z.f3262m.c0(j, m6);
    }

    public abstract void shutdown();
}
