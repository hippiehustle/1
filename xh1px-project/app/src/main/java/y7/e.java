package y7;

import C6.A;
import C6.C0024z;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import C6.J;
import Z5.n;
import a6.s;
import f7.C0723c;
import f7.C0725e;
import java.util.Collection;
import java.util.List;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class e implements A {

    /* renamed from: d, reason: collision with root package name */
    public static final e f16517d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final C0725e f16518e = C0725e.g("<Error module>");

    /* renamed from: f, reason: collision with root package name */
    public static final s f16519f = s.f7766d;

    /* renamed from: g, reason: collision with root package name */
    public static final n f16520g = new n(d.f16516d);

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return null;
    }

    @Override // C6.A
    public final J U(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // C6.A
    public final List a0() {
        return f16519f;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        return D6.i.f1043a;
    }

    @Override // C6.InterfaceC0010k
    public final C0725e getName() {
        return f16518e;
    }

    @Override // C6.A
    public final Object m0(C0024z c0024z) {
        o6.j.e(c0024z, "capability");
        return null;
    }

    @Override // C6.A
    public final Collection n(C0723c c0723c, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c0723c, "fqName");
        return s.f7766d;
    }

    @Override // C6.A
    public final z6.h o() {
        return (z6.h) f16520g.getValue();
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        return null;
    }

    @Override // C6.A
    public final boolean u(A a3) {
        o6.j.e(a3, "targetModule");
        return false;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k a() {
        return this;
    }
}
