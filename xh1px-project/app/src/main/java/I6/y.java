package I6;

import f7.C0723c;
import java.util.Collection;

/* loaded from: classes.dex */
public final class y extends s implements W6.b {

    /* renamed from: a, reason: collision with root package name */
    public final C0723c f2217a;

    public y(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        this.f2217a = c0723c;
    }

    @Override // W6.b
    public final C0066e a(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            if (o6.j.a(this.f2217a, ((y) obj).f2217a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // W6.b
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return a6.s.f7766d;
    }

    public final int hashCode() {
        return this.f2217a.hashCode();
    }

    public final String toString() {
        return y.class.getName() + ": " + this.f2217a;
    }
}
