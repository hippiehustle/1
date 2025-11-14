package L6;

import java.util.ArrayList;

/* renamed from: L6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136t extends K {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3164a;

    public C0136t(ArrayList arrayList) {
        this.f3164a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0136t) || !this.f3164a.equals(((C0136t) obj).f3164a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3164a.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.f3164a + ')';
    }
}
