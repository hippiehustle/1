package Q7;

import d6.C0623i;
import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class v implements InterfaceC0620f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f4971d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f4972e;

    /* renamed from: f, reason: collision with root package name */
    public final w f4973f;

    public v(Object obj, ThreadLocal threadLocal) {
        this.f4971d = obj;
        this.f4972e = threadLocal;
        this.f4973f = new w(threadLocal);
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        if (this.f4973f.equals(interfaceC0621g)) {
            return this;
        }
        return null;
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        return E2.d.C(this, interfaceC0622h);
    }

    public final void b(Object obj) {
        this.f4972e.set(obj);
    }

    public final Object c(InterfaceC0622h interfaceC0622h) {
        ThreadLocal threadLocal = this.f4972e;
        Object obj = threadLocal.get();
        threadLocal.set(this.f4971d);
        return obj;
    }

    @Override // d6.InterfaceC0620f
    public final InterfaceC0621g getKey() {
        return this.f4973f;
    }

    @Override // d6.InterfaceC0622h
    public final Object n(Object obj, InterfaceC1164c interfaceC1164c) {
        return interfaceC1164c.l(obj, this);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f4971d + ", threadLocal = " + this.f4972e + ')';
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        if (this.f4973f.equals(interfaceC0621g)) {
            return C0623i.f10448d;
        }
        return this;
    }
}
