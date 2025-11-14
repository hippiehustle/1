package G4;

import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1742a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f1743b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1744c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1745d;

    public b(boolean z8, Boolean bool, int i4, int i8) {
        this.f1742a = z8;
        this.f1743b = bool;
        this.f1744c = i4;
        this.f1745d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1742a == bVar.f1742a && j.a(this.f1743b, bVar.f1743b) && this.f1744c == bVar.f1744c && this.f1745d == bVar.f1745d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.f1742a) * 31;
        Boolean bool = this.f1743b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return Integer.hashCode(this.f1745d) + AbstractC1149a.b(this.f1744c, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        return "TutorialGameStateData(isStarted=" + this.f1742a + ", isWon=" + this.f1743b + ", timeLeft=" + this.f1744c + ", score=" + this.f1745d + ")";
    }
}
