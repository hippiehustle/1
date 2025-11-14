package S4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f5394a;

    /* renamed from: b, reason: collision with root package name */
    public final l f5395b;

    /* renamed from: c, reason: collision with root package name */
    public final E2.d f5396c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5397d;

    public /* synthetic */ m(int i4, l lVar, int i8) {
        this(i4, (i8 & 2) != 0 ? null : lVar, (i8 & 4) == 0 ? b.f5364e : null, true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (this.f5394a != mVar.f5394a || !o6.j.a(this.f5395b, mVar.f5395b) || !o6.j.a(this.f5396c, mVar.f5396c) || this.f5397d != mVar.f5397d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f5394a) * 31;
        int i4 = 0;
        l lVar = this.f5395b;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        E2.d dVar = this.f5396c;
        if (dVar != null) {
            i4 = dVar.hashCode();
        }
        return Boolean.hashCode(this.f5397d) + ((i8 + i4) * 31);
    }

    public final String toString() {
        return "UiTutorialOverlayState(instructionsResId=" + this.f5394a + ", image=" + this.f5395b + ", exitButton=" + this.f5396c + ", isDisplayedInTopHalf=" + this.f5397d + ")";
    }

    public m(int i4, l lVar, E2.d dVar, boolean z8) {
        this.f5394a = i4;
        this.f5395b = lVar;
        this.f5396c = dVar;
        this.f5397d = z8;
    }
}
