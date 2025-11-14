package N7;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final n f3840b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f3841a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (!o6.j.a(this.f3841a, ((o) obj).f3841a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3841a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3841a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
