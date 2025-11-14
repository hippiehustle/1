package K7;

import a.AbstractC0405a;
import java.io.Serializable;
import o6.j;

/* loaded from: classes.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f2737f = new a(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public final long f2738d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2739e;

    public a(long j, long j5) {
        this.f2738d = j;
        this.f2739e = j5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        j.e(aVar, "other");
        long j = aVar.f2738d;
        long j5 = this.f2738d;
        if (j5 != j) {
            return Long.compare(j5 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f2739e ^ Long.MIN_VALUE, aVar.f2739e ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2738d == aVar.f2738d && this.f2739e == aVar.f2739e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2738d ^ this.f2739e);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC0405a.y(this.f2738d, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC0405a.y(this.f2738d, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC0405a.y(this.f2738d, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC0405a.y(this.f2739e, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC0405a.y(this.f2739e, bArr, 24, 2, 8);
        return new String(bArr, I7.a.f2219a);
    }
}
