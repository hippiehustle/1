package x6;

import a6.AbstractC0434i;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* renamed from: x6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1813q extends x {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16266e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1813q(Field field, boolean z8, boolean z9) {
        super(field, r1, r7, new Type[]{field.getGenericType()});
        Class<?> cls;
        Class cls2 = Void.TYPE;
        o6.j.d(cls2, "TYPE");
        if (z9) {
            cls = field.getDeclaringClass();
        } else {
            cls = null;
        }
        this.f16266e = z8;
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
        field.set(obj, AbstractC0434i.c1(objArr));
        return Z5.y.f7506a;
    }

    @Override // x6.x
    public void e(Object[] objArr) {
        o6.j.e(objArr, "args");
        super.e(objArr);
        if (this.f16266e && AbstractC0434i.c1(objArr) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }
}
