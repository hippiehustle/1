package n0;

import android.os.Bundle;
import u6.AbstractC1638C;

/* renamed from: n0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128f {

    /* renamed from: a, reason: collision with root package name */
    public final int f12749a;

    /* renamed from: b, reason: collision with root package name */
    public C1148z f12750b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f12751c = null;

    public C1128f(int i4) {
        this.f12749a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1128f)) {
            return false;
        }
        C1128f c1128f = (C1128f) obj;
        if (this.f12749a != c1128f.f12749a || !o6.j.a(this.f12750b, c1128f.f12750b)) {
            return false;
        }
        Bundle bundle = this.f12751c;
        Bundle bundle2 = c1128f.f12751c;
        if (o6.j.a(bundle, bundle2)) {
            return true;
        }
        if (bundle != null && bundle2 != null && AbstractC1638C.m(bundle, bundle2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = Integer.hashCode(this.f12749a) * 31;
        C1148z c1148z = this.f12750b;
        if (c1148z != null) {
            i4 = c1148z.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = hashCode + i4;
        Bundle bundle = this.f12751c;
        if (bundle != null) {
            return AbstractC1638C.n(bundle) + (i8 * 31);
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1128f.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f12749a));
        sb.append(")");
        if (this.f12750b != null) {
            sb.append(" navOptions=");
            sb.append(this.f12750b);
        }
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }
}
