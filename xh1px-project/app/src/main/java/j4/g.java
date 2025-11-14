package j4;

import f4.C0708a;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final C0708a f11929a;

    public g(C0708a c0708a) {
        this.f11929a = c0708a;
    }

    @Override // j4.i
    public final AbstractC1492c a() {
        return this.f11929a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && o6.j.a(this.f11929a, ((g) obj).f11929a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11929a.hashCode();
    }

    public final String toString() {
        return "Image(uiCondition=" + this.f11929a + ")";
    }
}
