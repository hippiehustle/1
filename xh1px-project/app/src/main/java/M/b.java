package M;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f3264a;

    /* renamed from: b, reason: collision with root package name */
    public String f3265b;

    /* renamed from: c, reason: collision with root package name */
    public List f3266c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f3264a, bVar.f3264a) && Objects.equals(this.f3265b, bVar.f3265b) && Objects.equals(this.f3266c, bVar.f3266c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3264a, this.f3265b, this.f3266c);
    }
}
