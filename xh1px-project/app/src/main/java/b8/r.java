package b8;

import Z7.g0;
import Z7.j0;
import Z7.m0;
import Z7.p0;
import a6.AbstractC0434i;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f9287a = AbstractC0434i.l1(new X7.f[]{j0.f7610b, m0.f7620b, g0.f7602b, p0.f7629b});

    public static final boolean a(X7.f fVar) {
        o6.j.e(fVar, "<this>");
        if (fVar.g() && f9287a.contains(fVar)) {
            return true;
        }
        return false;
    }
}
