package t3;

import android.content.ComponentName;
import i.AbstractC0862a;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1563a extends AbstractC0862a {

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f15049b;

    public C1563a(ComponentName componentName) {
        o6.j.e(componentName, "componentName");
        this.f15049b = componentName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1563a) && o6.j.a(this.f15049b, ((C1563a) obj).f15049b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15049b.hashCode();
    }

    public final String toString() {
        return "Activity(componentName=" + this.f15049b + ")";
    }
}
