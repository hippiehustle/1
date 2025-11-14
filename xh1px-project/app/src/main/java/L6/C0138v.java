package L6;

/* renamed from: L6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138v extends C {

    /* renamed from: a, reason: collision with root package name */
    public final byte f3166a;

    public C0138v(byte b4) {
        this.f3166a = b4;
    }

    @Override // L6.C
    public final Object a() {
        return Byte.valueOf(this.f3166a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0138v) && this.f3166a == ((C0138v) obj).f3166a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f3166a);
    }
}
