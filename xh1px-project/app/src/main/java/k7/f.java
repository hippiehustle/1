package k7;

import f7.C0722b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0722b f12142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12143b;

    public f(C0722b c0722b, int i4) {
        this.f12142a = c0722b;
        this.f12143b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (o6.j.a(this.f12142a, fVar.f12142a) && this.f12143b == fVar.f12143b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12143b) + (this.f12142a.hashCode() * 31);
    }

    public final String toString() {
        int i4;
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            i4 = this.f12143b;
            if (i8 >= i4) {
                break;
            }
            sb.append("kotlin/Array<");
            i8++;
        }
        sb.append(this.f12142a);
        for (int i9 = 0; i9 < i4; i9++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
