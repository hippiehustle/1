package L7;

/* loaded from: classes.dex */
public abstract class M implements Runnable, Comparable, H {
    private volatile Object _heap;

    /* renamed from: d, reason: collision with root package name */
    public long f3183d;

    /* renamed from: e, reason: collision with root package name */
    public int f3184e = -1;

    public M(long j) {
        this.f3183d = j;
    }

    public final int a(long j, N n3, O o7) {
        M m6;
        boolean z8;
        synchronized (this) {
            if (this._heap == AbstractC0166y.f3254b) {
                return 2;
            }
            synchronized (n3) {
                try {
                    M[] mArr = n3.f4976a;
                    if (mArr != null) {
                        m6 = mArr[0];
                    } else {
                        m6 = null;
                    }
                    if (O.f3186l.get(o7) == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        return 1;
                    }
                    if (m6 == null) {
                        n3.f3185c = j;
                    } else {
                        long j5 = m6.f3183d;
                        if (j5 - j < 0) {
                            j = j5;
                        }
                        if (j - n3.f3185c > 0) {
                            n3.f3185c = j;
                        }
                    }
                    long j8 = this.f3183d;
                    long j9 = n3.f3185c;
                    if (j8 - j9 < 0) {
                        this.f3183d = j9;
                    }
                    n3.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // L7.H
    public final void b() {
        N n3;
        synchronized (this) {
            try {
                Object obj = this._heap;
                Q7.t tVar = AbstractC0166y.f3254b;
                if (obj == tVar) {
                    return;
                }
                Q7.x xVar = null;
                if (obj instanceof N) {
                    n3 = (N) obj;
                } else {
                    n3 = null;
                }
                if (n3 != null) {
                    synchronized (n3) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof Q7.x) {
                            xVar = (Q7.x) obj2;
                        }
                        if (xVar != null) {
                            n3.b(this.f3184e);
                        }
                    }
                }
                this._heap = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f3183d - ((M) obj).f3183d;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(N n3) {
        if (this._heap != AbstractC0166y.f3254b) {
            this._heap = n3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f3183d + ']';
    }
}
