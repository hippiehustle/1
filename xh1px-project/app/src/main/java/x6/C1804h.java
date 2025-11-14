package x6;

import L6.Q;
import a6.AbstractC0434i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: x6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1804h extends x implements InterfaceC1802f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16259e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16260f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1804h(Constructor constructor, Object obj, int i4) {
        super(constructor, r6, null, (Type[]) r0);
        Object T02;
        this.f16259e = i4;
        switch (i4) {
            case 1:
                o6.j.e(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                o6.j.d(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                o6.j.d(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f16260f = obj;
                return;
            default:
                o6.j.e(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                o6.j.d(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                o6.j.d(genericParameterTypes2, "getGenericParameterTypes(...)");
                if (genericParameterTypes2.length <= 2) {
                    T02 = new Type[0];
                } else {
                    T02 = AbstractC0434i.T0(genericParameterTypes2, 1, genericParameterTypes2.length - 1);
                }
                this.f16260f = obj;
                return;
        }
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        switch (this.f16259e) {
            case 0:
                o6.j.e(objArr, "args");
                e(objArr);
                Constructor constructor = (Constructor) this.f16273a;
                Q q6 = new Q(3);
                q6.a(this.f16260f);
                q6.b(objArr);
                q6.a(null);
                ArrayList arrayList = q6.f3079a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                o6.j.e(objArr, "args");
                e(objArr);
                Constructor constructor2 = (Constructor) this.f16273a;
                Q q8 = new Q(2);
                q8.a(this.f16260f);
                q8.b(objArr);
                ArrayList arrayList2 = q8.f3079a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
