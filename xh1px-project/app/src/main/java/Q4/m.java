package Q4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f4882a;

    public m(int i4) {
        this.f4882a = i4;
    }

    public static final m fromBundle(Bundle bundle) {
        int i4;
        o6.j.e(bundle, "bundle");
        bundle.setClassLoader(m.class.getClassLoader());
        if (bundle.containsKey("gameIndex")) {
            i4 = bundle.getInt("gameIndex");
        } else {
            i4 = 0;
        }
        return new m(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f4882a == ((m) obj).f4882a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4882a);
    }

    public final String toString() {
        return A.j.j(this.f4882a, "TutorialGameFragmentArgs(gameIndex=", ")");
    }
}
