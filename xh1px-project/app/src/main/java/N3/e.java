package N3;

import e4.C0643a;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final C0643a f3748a;

    public e(C0643a c0643a) {
        this.f3748a = c0643a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && o6.j.a(this.f3748a, ((e) obj).f3748a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3748a.hashCode();
    }

    public final String toString() {
        return "ActionItem(uiAction=" + this.f3748a + ")";
    }
}
