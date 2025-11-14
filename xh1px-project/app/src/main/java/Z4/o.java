package Z4;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7456g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7457h;

    public o(boolean z8, boolean z9) {
        super(new m(6, 0, z8, false), new m(6, 0, false, false), new m(6, 0, false, false), new m(4, 0, true, true), new m(4, 0, z9, z9), new m(6, 0, true, false));
        this.f7456g = z8;
        this.f7457h = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f7456g == oVar.f7456g && this.f7457h == oVar.f7457h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7457h) + (Boolean.hashCode(this.f7456g) * 31);
    }

    public final String toString() {
        return "Selection(searchEnabled=" + this.f7456g + ", exportEnabled=" + this.f7457h + ")";
    }
}
