package M4;

import a.AbstractC0405a;
import o6.j;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final int f3489a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3490b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0405a f3491c;

    public f(int i4, d dVar, AbstractC0405a abstractC0405a) {
        this.f3489a = i4;
        this.f3490b = dVar;
        this.f3491c = abstractC0405a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f3489a != fVar.f3489a || !j.a(this.f3490b, fVar.f3490b) || !this.f3491c.equals(fVar.f3491c)) {
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
        int hashCode2 = Integer.hashCode(this.f3489a) * 31;
        d dVar = this.f3490b;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        return this.f3491c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "TutorialOverlay(tutorialInstructionsResId=" + this.f3489a + ", tutorialImage=" + this.f3490b + ", closeType=" + this.f3491c + ")";
    }
}
