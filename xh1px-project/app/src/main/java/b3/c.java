package b3;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f9124a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f9125b;

    public c(Integer num, Integer num2) {
        this.f9124a = num;
        this.f9125b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (o6.j.a(this.f9124a, cVar.f9124a) && o6.j.a(this.f9125b, cVar.f9125b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Integer num = this.f9124a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i8 = hashCode * 31;
        Integer num2 = this.f9125b;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        return "Loading(progress=" + this.f9124a + ", maxProgress=" + this.f9125b + ")";
    }
}
