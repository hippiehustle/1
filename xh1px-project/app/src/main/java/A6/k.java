package A6;

import f7.C0723c;
import f7.C0725e;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final C0723c f403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f404b;

    public k(C0723c c0723c, String str) {
        o6.j.e(c0723c, "packageFqName");
        this.f403a = c0723c;
        this.f404b = str;
    }

    public final C0725e a(int i4) {
        return C0725e.e(this.f404b + i4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f403a);
        sb.append('.');
        return A.j.q(sb, this.f404b, 'N');
    }
}
