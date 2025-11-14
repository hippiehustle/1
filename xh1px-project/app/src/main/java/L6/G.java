package L6;

/* loaded from: classes.dex */
public final class G extends C {

    /* renamed from: a, reason: collision with root package name */
    public final byte f3053a;

    public G(byte b4) {
        this.f3053a = b4;
    }

    @Override // L6.C
    public final Object a() {
        return new Z5.p(this.f3053a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof G) && this.f3053a == ((G) obj).f3053a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f3053a);
    }
}
