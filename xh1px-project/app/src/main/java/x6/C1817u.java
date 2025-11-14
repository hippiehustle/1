package x6;

import L6.Q;
import a6.AbstractC0434i;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: x6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1817u extends w implements InterfaceC1802f {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f16270f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1817u(Method method, Object[] objArr) {
        super(method, false, (Type[]) r0.toArray(new Type[0]));
        Collection collection;
        o6.j.e(method, "method");
        o6.j.e(objArr, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        o6.j.d(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = objArr.length;
        if (length >= 0) {
            int length2 = genericParameterTypes.length - length;
            length2 = length2 < 0 ? 0 : length2;
            if (length2 >= 0) {
                if (length2 == 0) {
                    collection = a6.s.f7766d;
                } else {
                    int length3 = genericParameterTypes.length;
                    if (length2 >= length3) {
                        collection = AbstractC0434i.i1(genericParameterTypes);
                    } else if (length2 == 1) {
                        collection = E2.d.y(genericParameterTypes[length3 - 1]);
                    } else {
                        ArrayList arrayList = new ArrayList(length2);
                        for (int i4 = length3 - length2; i4 < length3; i4++) {
                            arrayList.add(genericParameterTypes[i4]);
                        }
                        collection = arrayList;
                    }
                }
                this.f16270f = objArr;
                return;
            }
            throw new IllegalArgumentException(A.j.j(length2, "Requested element count ", " is less than zero.").toString());
        }
        throw new IllegalArgumentException(A.j.j(length, "Requested element count ", " is less than zero.").toString());
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        o6.j.e(objArr, "args");
        e(objArr);
        Q q6 = new Q(2);
        q6.b(this.f16270f);
        q6.b(objArr);
        ArrayList arrayList = q6.f3079a;
        return g(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
