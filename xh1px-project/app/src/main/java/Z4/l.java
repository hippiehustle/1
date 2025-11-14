package Z4;

/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7451g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(boolean z8) {
        super(r0, r4, new m(r2, true, z8), 41);
        int i4;
        m mVar = new m(6, 0, true, false);
        m mVar2 = new m(6, 0, true, false);
        if (z8) {
            i4 = 255;
        } else {
            i4 = 127;
        }
        this.f7451g = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f7451g == ((l) obj).f7451g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7451g);
    }

    public final String toString() {
        return "Export(canExport=" + this.f7451g + ")";
    }
}
