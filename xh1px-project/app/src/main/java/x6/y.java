package x6;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends AbstractC1793A implements InterfaceC1802f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f16277d;

    public y(Method method, Object obj) {
        super(method, a6.s.f7766d);
        this.f16277d = obj;
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        o6.j.e(objArr, "args");
        e(objArr);
        return this.f16225a.invoke(this.f16277d, Arrays.copyOf(objArr, objArr.length));
    }
}
