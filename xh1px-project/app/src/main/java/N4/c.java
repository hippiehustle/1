package N4;

import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3767a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f3768b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3769c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3770d;

    public c(boolean z8, Boolean bool, int i4, int i8) {
        this.f3767a = z8;
        this.f3768b = bool;
        this.f3769c = i4;
        this.f3770d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3767a == cVar.f3767a && j.a(this.f3768b, cVar.f3768b) && this.f3769c == cVar.f3769c && this.f3770d == cVar.f3770d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.f3767a) * 31;
        Boolean bool = this.f3768b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return Integer.hashCode(this.f3770d) + AbstractC1149a.b(this.f3769c, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        return "TutorialGameState(isStarted=" + this.f3767a + ", isWon=" + this.f3768b + ", timeLeft=" + this.f3769c + ", score=" + this.f3770d + ")";
    }
}
