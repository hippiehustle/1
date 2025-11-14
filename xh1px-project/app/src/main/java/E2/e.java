package E2;

import D4.B;
import o6.j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1189a;

    /* renamed from: b, reason: collision with root package name */
    public final B f1190b;

    /* renamed from: c, reason: collision with root package name */
    public final B f1191c;

    public /* synthetic */ e(B b4, B b9, int i4) {
        this((i4 & 1) != 0 ? null : "%", (i4 & 2) != 0 ? null : b4, (i4 & 4) != 0 ? null : b9);
    }

    public static e a(e eVar, B b4, B b9, int i4) {
        String str;
        if ((i4 & 1) != 0) {
            str = eVar.f1189a;
        } else {
            str = "%";
        }
        if ((i4 & 2) != 0) {
            b4 = eVar.f1190b;
        }
        if ((i4 & 4) != 0) {
            b9 = eVar.f1191c;
        }
        return new e(str, b4, b9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.f1189a, eVar.f1189a) && j.a(this.f1190b, eVar.f1190b) && j.a(this.f1191c, eVar.f1191c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        String str = this.f1189a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = hashCode * 31;
        B b4 = this.f1190b;
        if (b4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b4.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        B b9 = this.f1191c;
        if (b9 != null) {
            i4 = b9.hashCode();
        }
        return i9 + i4;
    }

    public final String toString() {
        return "SliderState(valuePrefix=" + this.f1189a + ", valueListener=" + this.f1190b + ", clientListener=" + this.f1191c + ")";
    }

    public e(String str, B b4, B b9) {
        this.f1189a = str;
        this.f1190b = b4;
        this.f1191c = b9;
    }
}
