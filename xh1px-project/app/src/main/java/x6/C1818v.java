package x6;

import a6.AbstractC0434i;
import java.lang.reflect.Method;

/* renamed from: x6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1818v extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818v(int i4, Method method) {
        super(method, false, 6);
        this.f16271f = i4;
        switch (i4) {
            case 1:
                o6.j.e(method, "method");
                super(method, true, 4);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(method, "method");
                super(method, false, 6);
                return;
            default:
                o6.j.e(method, "method");
                return;
        }
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        Object[] T02;
        Object[] T03;
        switch (this.f16271f) {
            case 0:
                o6.j.e(objArr, "args");
                e(objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    T02 = new Object[0];
                } else {
                    T02 = AbstractC0434i.T0(objArr, 1, objArr.length);
                }
                return g(obj, T02);
            case 1:
                o6.j.e(objArr, "args");
                e(objArr);
                f(AbstractC0434i.X0(objArr));
                if (objArr.length <= 1) {
                    T03 = new Object[0];
                } else {
                    T03 = AbstractC0434i.T0(objArr, 1, objArr.length);
                }
                return g(null, T03);
            default:
                o6.j.e(objArr, "args");
                e(objArr);
                return g(null, objArr);
        }
    }
}
