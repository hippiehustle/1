package n1;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152d extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f12841a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12843c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12844d;

    public C1152d(int i4, int i8, String str, String str2) {
        boolean z8;
        if ((i8 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f12841a = str;
        this.f12842b = z8;
        this.f12843c = str2;
        this.f12844d = i4;
    }

    @Override // n1.i
    public final String a() {
        return this.f12841a;
    }

    @Override // n1.i
    public final String b() {
        return "INTEGER";
    }

    @Override // n1.i
    public final boolean c() {
        return this.f12842b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1152d) {
                C1152d c1152d = (C1152d) obj;
                if (!this.f12841a.equals(c1152d.f12841a) || this.f12842b != c1152d.f12842b || !this.f12843c.equals(c1152d.f12843c) || this.f12844d != c1152d.f12844d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12844d) + AbstractC1149a.b(1, (((this.f12843c.hashCode() + AbstractC1149a.c(this.f12841a.hashCode() * 31, 31, this.f12842b)) * 31) + 3355) * 31, 31);
    }

    public final String toString() {
        return "ForeignKey(name=" + this.f12841a + ", isNotNull=" + this.f12842b + ", referencedTable=" + this.f12843c + ", referencedColumn=id, updateAction=1, deleteAction=" + this.f12844d + ")";
    }
}
