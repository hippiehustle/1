package w6;

import h6.AbstractC0837b;
import i.AbstractC0863b;
import java.lang.reflect.Method;

/* renamed from: w6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726m extends AbstractC0837b {

    /* renamed from: a, reason: collision with root package name */
    public final Method f15874a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f15875b;

    public C1726m(Method method, Method method2) {
        o6.j.e(method, "getterMethod");
        this.f15874a = method;
        this.f15875b = method2;
    }

    @Override // h6.AbstractC0837b
    public final String a() {
        return AbstractC0863b.a(this.f15874a);
    }
}
