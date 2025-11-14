package n1;

/* loaded from: classes.dex */
public final class f extends AbstractC1151c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12848a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12849b;

    public f(String str, int i4) {
        boolean z8;
        if ((i4 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f12848a = str;
        this.f12849b = z8;
    }

    @Override // n1.i
    public final String a() {
        return this.f12848a;
    }

    @Override // n1.i
    public final String b() {
        return "INTEGER";
    }

    @Override // n1.i
    public final boolean c() {
        return this.f12849b;
    }

    @Override // n1.AbstractC1151c
    public final String d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!this.f12848a.equals(fVar.f12848a) || this.f12849b != fVar.f12849b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC1149a.c(this.f12848a.hashCode() * 31, 31, this.f12849b);
    }

    public final String toString() {
        return "Long(name=" + this.f12848a + ", isNotNull=" + this.f12849b + ", defaultValue=null)";
    }
}
