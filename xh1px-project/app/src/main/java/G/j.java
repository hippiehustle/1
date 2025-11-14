package G;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f1668a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1669b;

    public j(Resources resources, Resources.Theme theme) {
        this.f1668a = resources;
        this.f1669b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f1668a.equals(jVar.f1668a) && Objects.equals(this.f1669b, jVar.f1669b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1668a, this.f1669b);
    }
}
