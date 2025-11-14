package P;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: P.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f4276a;

    public C0261i(DisplayCutout displayCutout) {
        this.f4276a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0261i.class == obj.getClass()) {
            return Objects.equals(this.f4276a, ((C0261i) obj).f4276a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f4276a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4276a + "}";
    }
}
