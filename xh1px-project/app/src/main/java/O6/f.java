package O6;

import java.util.ArrayList;
import o6.j;
import o6.v;

/* loaded from: classes.dex */
public final class f implements N6.g {

    /* renamed from: c, reason: collision with root package name */
    public static final N6.d f4049c = new N6.d(v.f13643a.b(f.class));

    /* renamed from: a, reason: collision with root package name */
    public boolean f4050a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4051b = new ArrayList();

    @Override // N6.c
    public final N6.d b() {
        return f4049c;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (f.class.equals(cls)) {
                j.c(obj, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
                f fVar = (f) obj;
                if (this.f4050a != fVar.f4050a || !j.a(this.f4051b, fVar.f4051b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4051b.hashCode() + (Boolean.hashCode(this.f4050a) * 31);
    }
}
