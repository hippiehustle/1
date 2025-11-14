package J7;

import o6.j;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2520a = 1;

    /* renamed from: b, reason: collision with root package name */
    public String f2521b;

    /* renamed from: c, reason: collision with root package name */
    public String f2522c;

    public /* synthetic */ g() {
    }

    public boolean equals(Object obj) {
        switch (this.f2520a) {
            case 1:
                if (!(obj instanceof O.b)) {
                    return false;
                }
                ((O.b) obj).getClass();
                if (this.f2521b == null) {
                    if (this.f2522c == null) {
                        return true;
                    }
                    throw null;
                }
                throw null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        int hashCode;
        switch (this.f2520a) {
            case 1:
                String str = this.f2521b;
                int i4 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                String str2 = this.f2522c;
                if (str2 != null) {
                    i4 = str2.hashCode();
                }
                return hashCode ^ i4;
            default:
                return super.hashCode();
        }
    }

    @Override // J7.i
    public d toInstant() {
        throw new e(this.f2521b + " when parsing an Instant from \"" + f.n(this.f2522c, 64) + '\"');
    }

    public String toString() {
        switch (this.f2520a) {
            case 1:
                return "Pair{" + ((Object) this.f2521b) + " " + ((Object) this.f2522c) + "}";
            default:
                return super.toString();
        }
    }

    public g(String str, String str2) {
        j.e(str, "error");
        this.f2521b = str;
        this.f2522c = str2;
    }
}
