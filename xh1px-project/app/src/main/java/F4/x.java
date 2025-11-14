package F4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f1434a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1435b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f1436c;

    /* renamed from: d, reason: collision with root package name */
    public final w1.e f1437d;

    public x(int i4, boolean z8, Boolean bool, w1.e eVar) {
        this.f1434a = i4;
        this.f1435b = z8;
        this.f1436c = bool;
        this.f1437d = eVar;
    }

    public static x a(x xVar, Boolean bool, int i4) {
        boolean z8;
        int i8 = xVar.f1434a;
        if ((i4 & 2) != 0) {
            z8 = xVar.f1435b;
        } else {
            z8 = true;
        }
        if ((i4 & 4) != 0) {
            bool = xVar.f1436c;
        }
        return new x(i8, z8, bool, xVar.f1437d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f1434a == xVar.f1434a && this.f1435b == xVar.f1435b && o6.j.a(this.f1436c, xVar.f1436c) && o6.j.a(this.f1437d, xVar.f1437d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c6 = AbstractC1149a.c(Integer.hashCode(this.f1434a) * 31, 31, this.f1435b);
        int i4 = 0;
        Boolean bool = this.f1436c;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i8 = (c6 + hashCode) * 31;
        w1.e eVar = this.f1437d;
        if (eVar != null) {
            i4 = eVar.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        return "TutorialStepState(index=" + this.f1434a + ", isMonitoredViewClicked=" + this.f1435b + ", isGameWon=" + this.f1436c + ", stepStartStackTop=" + this.f1437d + ")";
    }
}
