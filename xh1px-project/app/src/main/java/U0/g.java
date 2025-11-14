package U0;

import N0.C0202j;
import N0.x;
import N0.y;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f5968a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5969b;

    public g(String str, int i4, boolean z8) {
        this.f5968a = i4;
        this.f5969b = z8;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        if (!((HashSet) xVar.f3683o.f6489e).contains(y.f3695d)) {
            Z0.c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new P0.m(this);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i4 = this.f5968a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            str = "null";
                        } else {
                            str = "EXCLUDE_INTERSECTIONS";
                        }
                    } else {
                        str = "INTERSECT";
                    }
                } else {
                    str = "SUBTRACT";
                }
            } else {
                str = "ADD";
            }
        } else {
            str = "MERGE";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
