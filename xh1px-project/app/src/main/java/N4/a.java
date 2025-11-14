package N4;

import D4.C0040p;
import O7.g0;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3760a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3761b;

    /* renamed from: c, reason: collision with root package name */
    public final C0040p f3762c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f3763d;

    public a(int i4, int i8, C0040p c0040p, g0 g0Var) {
        j.e(g0Var, "targets");
        this.f3760a = i4;
        this.f3761b = i8;
        this.f3762c = c0040p;
        this.f3763d = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f3760a != aVar.f3760a || this.f3761b != aVar.f3761b || !this.f3762c.equals(aVar.f3762c) || !j.a(this.f3763d, aVar.f3763d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3763d.hashCode() + ((this.f3762c.hashCode() + AbstractC1149a.b(this.f3761b, Integer.hashCode(this.f3760a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "TutorialGame(instructionsResId=" + this.f3760a + ", highScore=" + this.f3761b + ", state=" + this.f3762c + ", targets=" + this.f3763d + ")";
    }
}
