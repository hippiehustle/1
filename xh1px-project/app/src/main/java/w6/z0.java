package w6;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f15937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15938b;

    public z0(ClassLoader classLoader) {
        this.f15937a = new WeakReference(classLoader);
        this.f15938b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z0) && this.f15937a.get() == ((z0) obj).f15937a.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15938b;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.f15937a.get();
        if (classLoader != null && (obj = classLoader.toString()) != null) {
            return obj;
        }
        return "<null>";
    }
}
