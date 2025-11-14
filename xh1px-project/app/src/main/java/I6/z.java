package I6;

import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes.dex */
public final class z extends B implements W6.d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2218a;

    public z(Class cls) {
        this.f2218a = cls;
    }

    @Override // I6.B
    public final Type b() {
        return this.f2218a;
    }

    @Override // W6.b
    public final Collection getAnnotations() {
        return a6.s.f7766d;
    }
}
