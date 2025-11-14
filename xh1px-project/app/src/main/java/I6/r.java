package I6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends w implements W6.e {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor f2212a;

    public r(Constructor constructor) {
        o6.j.e(constructor, "member");
        this.f2212a = constructor;
    }

    @Override // I6.w
    public final Member b() {
        return this.f2212a;
    }

    @Override // W6.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f2212a.getTypeParameters();
        o6.j.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C(typeVariable));
        }
        return arrayList;
    }
}
