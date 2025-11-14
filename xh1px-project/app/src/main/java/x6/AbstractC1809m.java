package x6;

import a6.AbstractC0434i;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* renamed from: x6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1809m extends x {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1809m(Field field, boolean z8) {
        super(field, r0, r4, new Type[0]);
        Class<?> cls;
        Type genericType = field.getGenericType();
        o6.j.d(genericType, "getGenericType(...)");
        if (z8) {
            cls = field.getDeclaringClass();
        } else {
            cls = null;
        }
    }

    @Override // x6.InterfaceC1803g
    public Object d(Object[] objArr) {
        Object obj;
        o6.j.e(objArr, "args");
        e(objArr);
        Field field = (Field) this.f16273a;
        if (this.f16275c != null) {
            obj = AbstractC0434i.W0(objArr);
        } else {
            obj = null;
        }
        return field.get(obj);
    }
}
