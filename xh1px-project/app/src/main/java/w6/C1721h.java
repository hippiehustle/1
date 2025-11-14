package w6;

import a6.AbstractC0434i;
import java.lang.reflect.Constructor;

/* renamed from: w6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721h extends h4.g {

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f15857b;

    public C1721h(Constructor constructor) {
        o6.j.e(constructor, "constructor");
        this.f15857b = constructor;
    }

    @Override // h4.g
    public final String b() {
        Class<?>[] parameterTypes = this.f15857b.getParameterTypes();
        o6.j.d(parameterTypes, "getParameterTypes(...)");
        return AbstractC0434i.b1(parameterTypes, "", "<init>(", ")V", C1715b.f15839h, 24);
    }
}
