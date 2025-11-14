package A0;

import I7.o;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f214a;

    /* renamed from: b, reason: collision with root package name */
    public final String f215b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f216c;

    /* renamed from: d, reason: collision with root package name */
    public final int f217d;

    /* renamed from: e, reason: collision with root package name */
    public final String f218e;

    /* renamed from: f, reason: collision with root package name */
    public final int f219f;

    /* renamed from: g, reason: collision with root package name */
    public final int f220g;

    public j(String str, String str2, boolean z8, int i4, String str3, int i8) {
        int i9;
        o6.j.e(str, "name");
        o6.j.e(str2, "type");
        this.f214a = str;
        this.f215b = str2;
        this.f216c = z8;
        this.f217d = i4;
        this.f218e = str3;
        this.f219f = i8;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        o6.j.d(upperCase, "toUpperCase(...)");
        if (I7.m.b0(upperCase, "INT", false)) {
            i9 = 3;
        } else if (!I7.m.b0(upperCase, "CHAR", false) && !I7.m.b0(upperCase, "CLOB", false) && !I7.m.b0(upperCase, "TEXT", false)) {
            if (I7.m.b0(upperCase, "BLOB", false)) {
                i9 = 5;
            } else if (!I7.m.b0(upperCase, "REAL", false) && !I7.m.b0(upperCase, "FLOA", false) && !I7.m.b0(upperCase, "DOUB", false)) {
                i9 = 1;
            } else {
                i9 = 4;
            }
        } else {
            i9 = 2;
        }
        this.f220g = i9;
    }

    public final boolean equals(Object obj) {
        boolean z8;
        boolean z9;
        if (this != obj) {
            if (obj instanceof j) {
                if (this.f217d > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                j jVar = (j) obj;
                if (jVar.f217d > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i4 = jVar.f219f;
                if (z8 == z9 && o6.j.a(this.f214a, jVar.f214a) && this.f216c == jVar.f216c) {
                    String str = jVar.f218e;
                    int i8 = this.f219f;
                    String str2 = this.f218e;
                    if ((i8 != 1 || i4 != 2 || str2 == null || E2.b.n(str2, str)) && ((i8 != 2 || i4 != 1 || str == null || E2.b.n(str, str2)) && ((i8 == 0 || i8 != i4 || (str2 == null ? str == null : E2.b.n(str2, str))) && this.f220g == jVar.f220g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = ((this.f214a.hashCode() * 31) + this.f220g) * 31;
        if (this.f216c) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((hashCode + i4) * 31) + this.f217d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f214a);
        sb.append("',\n            |   type = '");
        sb.append(this.f215b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f220g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f216c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f217d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f218e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return o.P(o.R(sb.toString()));
    }
}
