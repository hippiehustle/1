package x6;

import h6.AbstractC0837b;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import n1.AbstractC1149a;

/* renamed from: x6.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1793A implements InterfaceC1803g {

    /* renamed from: a, reason: collision with root package name */
    public final Method f16225a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16226b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f16227c;

    public AbstractC1793A(Method method, List list) {
        this.f16225a = method;
        this.f16226b = list;
        Class<?> returnType = method.getReturnType();
        o6.j.d(returnType, "getReturnType(...)");
        this.f16227c = returnType;
    }

    @Override // x6.InterfaceC1803g
    public final List a() {
        return this.f16226b;
    }

    @Override // x6.InterfaceC1803g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // x6.InterfaceC1803g
    public final boolean c() {
        return false;
    }

    public final void e(Object[] objArr) {
        o6.j.e(objArr, "args");
        if (AbstractC0837b.i(this) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(AbstractC0837b.i(this));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(AbstractC1149a.h(sb, objArr.length, " were provided."));
    }

    @Override // x6.InterfaceC1803g
    public final Type r() {
        return this.f16227c;
    }
}
