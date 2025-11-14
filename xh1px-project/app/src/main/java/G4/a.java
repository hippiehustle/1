package G4;

import H4.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1740a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1741b;

    public a(int i4, c cVar) {
        this.f1740a = i4;
        this.f1741b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f1740a != aVar.f1740a || !this.f1741b.equals(aVar.f1741b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1741b.hashCode() + (Integer.hashCode(this.f1740a) * 31);
    }

    public final String toString() {
        return "TutorialGameData(instructionsResId=" + this.f1740a + ", gameRules=" + this.f1741b + ")";
    }
}
