package L6;

/* renamed from: L6.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142z extends C {

    /* renamed from: a, reason: collision with root package name */
    public final float f3171a;

    public C0142z(float f8) {
        this.f3171a = f8;
    }

    @Override // L6.C
    public final Object a() {
        return Float.valueOf(this.f3171a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0142z) && Float.compare(this.f3171a, ((C0142z) obj).f3171a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3171a);
    }
}
