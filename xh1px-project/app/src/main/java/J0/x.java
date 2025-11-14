package J0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public final View f2345b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2344a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2346c = new ArrayList();

    public x(View view) {
        this.f2345b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f2345b == xVar.f2345b && this.f2344a.equals(xVar.f2344a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2344a.hashCode() + (this.f2345b.hashCode() * 31);
    }

    public final String toString() {
        String g8 = AbstractC1149a.g(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2345b + "\n", "    values:");
        HashMap hashMap = this.f2344a;
        for (String str : hashMap.keySet()) {
            g8 = g8 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return g8;
    }
}
