package x6;

import a6.AbstractC0434i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends AbstractC1793A {
    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        Object[] T02;
        o6.j.e(objArr, "args");
        e(objArr);
        Object obj = objArr[0];
        if (objArr.length <= 1) {
            T02 = new Object[0];
        } else {
            T02 = AbstractC0434i.T0(objArr, 1, objArr.length);
        }
        return this.f16225a.invoke(obj, Arrays.copyOf(T02, T02.length));
    }
}
