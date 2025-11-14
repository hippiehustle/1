package Q2;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f implements P2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f4790a;

    public f(Drawable drawable) {
        this.f4790a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && o6.j.a(this.f4790a, ((f) obj).f4790a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f4790a;
        if (drawable == null) {
            return 0;
        }
        return drawable.hashCode();
    }

    public final String toString() {
        return "DefaultDescription(icon=" + this.f4790a + ")";
    }
}
