package O;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3851d;

    public d(int i4) {
        super(i4);
        this.f3851d = new Object();
    }

    @Override // O.c
    public final Object a() {
        Object a3;
        synchronized (this.f3851d) {
            a3 = super.a();
        }
        return a3;
    }

    @Override // O.c
    public final boolean c(Object obj) {
        boolean c6;
        synchronized (this.f3851d) {
            c6 = super.c(obj);
        }
        return c6;
    }
}
