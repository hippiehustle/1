package x6;

import L6.Q;
import a6.AbstractC0434i;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: x6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816t extends w implements InterfaceC1802f {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16268f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16269g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1816t(Method method, boolean z8, Object obj) {
        super(method, false, (Type[]) r0);
        Object T02;
        o6.j.e(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        o6.j.d(genericParameterTypes, "getGenericParameterTypes(...)");
        if (genericParameterTypes.length <= 1) {
            T02 = new Type[0];
        } else {
            T02 = AbstractC0434i.T0(genericParameterTypes, 1, genericParameterTypes.length);
        }
        this.f16268f = z8;
        this.f16269g = obj;
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        o6.j.e(objArr, "args");
        e(objArr);
        Q q6 = new Q(2);
        q6.a(this.f16269g);
        q6.b(objArr);
        ArrayList arrayList = q6.f3079a;
        return g(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
