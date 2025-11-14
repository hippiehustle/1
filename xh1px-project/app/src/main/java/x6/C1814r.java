package x6;

import java.lang.reflect.Method;

/* renamed from: x6.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1814r extends w implements InterfaceC1802f {

    /* renamed from: f, reason: collision with root package name */
    public final Object f16267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814r(Method method, Object obj) {
        super(method, false, 4);
        o6.j.e(method, "method");
        this.f16267f = obj;
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        o6.j.e(objArr, "args");
        e(objArr);
        return g(this.f16267f, objArr);
    }
}
