package u6;

import kotlin.NoWhenBranchMatchedException;
import w6.o0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f15372c = new v(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final w f15373a;

    /* renamed from: b, reason: collision with root package name */
    public final o6.k f15374b;

    public v(w wVar, o0 o0Var) {
        boolean z8;
        String str;
        this.f15373a = wVar;
        this.f15374b = o0Var;
        if (wVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 == (o0Var == null)) {
            return;
        }
        if (wVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + wVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f15373a == vVar.f15373a && o6.j.a(this.f15374b, vVar.f15374b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        w wVar = this.f15373a;
        if (wVar == null) {
            hashCode = 0;
        } else {
            hashCode = wVar.hashCode();
        }
        int i8 = hashCode * 31;
        o6.k kVar = this.f15374b;
        if (kVar != null) {
            i4 = kVar.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        int i4;
        w wVar = this.f15373a;
        if (wVar == null) {
            i4 = -1;
        } else {
            i4 = u.f15371a[wVar.ordinal()];
        }
        if (i4 != -1) {
            o6.k kVar = this.f15374b;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return "out " + kVar;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "in " + kVar;
            }
            return String.valueOf(kVar);
        }
        return "*";
    }
}
