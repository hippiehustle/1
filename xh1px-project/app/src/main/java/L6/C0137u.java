package L6;

/* renamed from: L6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137u extends C {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3165a;

    public C0137u(boolean z8) {
        this.f3165a = z8;
    }

    @Override // L6.C
    public final Object a() {
        return Boolean.valueOf(this.f3165a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0137u) && this.f3165a == ((C0137u) obj).f3165a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3165a);
    }
}
