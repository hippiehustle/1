package w6;

import a6.AbstractC0434i;
import a6.AbstractC0436k;
import java.util.Arrays;
import java.util.List;

/* renamed from: w6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1720g extends h4.g {

    /* renamed from: b, reason: collision with root package name */
    public final List f15854b;

    public C1720g(Class cls) {
        o6.j.e(cls, "jClass");
        Object[] declaredMethods = cls.getDeclaredMethods();
        o6.j.d(declaredMethods, "getDeclaredMethods(...)");
        C1719f c1719f = new C1719f(0);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            o6.j.d(declaredMethods, "copyOf(...)");
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c1719f);
            }
        }
        this.f15854b = AbstractC0434i.K0(declaredMethods);
    }

    @Override // h4.g
    public final String b() {
        return AbstractC0436k.v0(this.f15854b, "", "<init>(", ")V", C1715b.f15838g, 24);
    }
}
