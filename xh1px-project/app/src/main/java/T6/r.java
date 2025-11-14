package T6;

import f7.C0725e;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final C0725e f5885a;

    /* renamed from: b, reason: collision with root package name */
    public final I6.o f5886b;

    public r(C0725e c0725e, I6.o oVar) {
        o6.j.e(c0725e, "name");
        this.f5885a = c0725e;
        this.f5886b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (o6.j.a(this.f5885a, ((r) obj).f5885a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5885a.hashCode();
    }
}
