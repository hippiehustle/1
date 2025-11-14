package w6;

import C6.AbstractC0015p;
import C6.InterfaceC0004e;
import C6.InterfaceC0019u;
import F6.AbstractC0054n;
import F6.C0050j;
import a6.AbstractC0434i;
import f6.AbstractC0713c;
import h6.AbstractC0837b;
import h7.AbstractC0842e;
import h7.C0845h;
import i.AbstractC0862a;
import i7.AbstractC0890e;
import i7.AbstractC0892g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import o6.C1283b;
import u6.InterfaceC1645f;
import w7.AbstractC1759v;
import x6.C1804h;
import x6.C1805i;
import x6.C1816t;
import x6.C1818v;
import x6.InterfaceC1803g;

/* loaded from: classes.dex */
public final class H extends AbstractC1731s implements o6.h, InterfaceC1645f, InterfaceC1718e {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15794l = {o6.v.f13643a.f(new o6.p(H.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public final F f15795f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15796g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f15797h;

    /* renamed from: i, reason: collision with root package name */
    public final s0 f15798i;
    public final Object j;
    public final Object k;

    public H(F f8, String str, String str2, InterfaceC0019u interfaceC0019u, Object obj) {
        this.f15795f = f8;
        this.f15796g = str2;
        this.f15797h = obj;
        this.f15798i = AbstractC0862a.l(interfaceC0019u, new B6.f(this, 14, str));
        G g8 = new G(this, 0);
        Z5.h hVar = Z5.h.f7482d;
        this.j = Z5.a.c(hVar, g8);
        this.k = Z5.a.c(hVar, new G(this, 1));
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        return g(new Object[0]);
    }

    @Override // n6.InterfaceC1167f
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0713c abstractC0713c) {
        return g(obj, obj2, obj3, obj4, abstractC0713c);
    }

    @Override // o6.h
    public final int d() {
        return AbstractC0837b.i(h());
    }

    public final boolean equals(Object obj) {
        H b4 = y0.b(obj);
        if (b4 == null || !o6.j.a(this.f15795f, b4.f15795f) || !getName().equals(b4.getName()) || !o6.j.a(this.f15796g, b4.f15796g) || !o6.j.a(this.f15797h, b4.f15797h)) {
            return false;
        }
        return true;
    }

    @Override // u6.InterfaceC1641b
    public final String getName() {
        String b4 = ((AbstractC0054n) o()).getName().b();
        o6.j.d(b4, "asString(...)");
        return b4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.AbstractC1731s
    public final InterfaceC1803g h() {
        return (InterfaceC1803g) this.j.getValue();
    }

    public final int hashCode() {
        return this.f15796g.hashCode() + ((getName().hashCode() + (this.f15795f.hashCode() * 31)) * 31);
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        return g(obj, obj2, obj3);
    }

    @Override // w6.AbstractC1731s
    public final F k() {
        return this.f15795f;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return g(obj, obj2);
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        return g(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.AbstractC1731s
    public final InterfaceC1803g n() {
        return (InterfaceC1803g) this.k.getValue();
    }

    @Override // u6.InterfaceC1641b
    public final boolean p() {
        return o().p();
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, obj3, obj4);
    }

    @Override // w6.AbstractC1731s
    public final boolean t() {
        if (this.f15797h != C1283b.f13627d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C0845h c0845h = v0.f15919a;
        return v0.b(o());
    }

    public final x6.x u(Constructor constructor, InterfaceC0019u interfaceC0019u, boolean z8) {
        C0050j c0050j;
        Object[] objArr;
        Object obj = this.f15797h;
        Class<?> cls = null;
        if (!z8) {
            if (interfaceC0019u instanceof C0050j) {
                c0050j = (C0050j) interfaceC0019u;
            } else {
                c0050j = null;
            }
            if (c0050j != null) {
                C0050j c0050j2 = c0050j;
                if (!AbstractC0015p.e(c0050j2.d())) {
                    InterfaceC0004e J6 = c0050j.J();
                    o6.j.d(J6, "getConstructedClass(...)");
                    if (!AbstractC0892g.f(J6) && !AbstractC0890e.p(c0050j.J())) {
                        List z02 = c0050j2.z0();
                        o6.j.d(z02, "getValueParameters(...)");
                        if (!z02.isEmpty()) {
                            Iterator it = z02.iterator();
                            while (it.hasNext()) {
                                AbstractC1759v b4 = ((F6.U) it.next()).b();
                                o6.j.d(b4, "getType(...)");
                                if (AbstractC0842e.x(b4)) {
                                    if (t()) {
                                        return new C1804h(constructor, AbstractC0842e.e(obj, o()), 0);
                                    }
                                    o6.j.e(constructor, "constructor");
                                    Class declaringClass = constructor.getDeclaringClass();
                                    o6.j.d(declaringClass, "getDeclaringClass(...)");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    o6.j.d(genericParameterTypes, "getGenericParameterTypes(...)");
                                    if (genericParameterTypes.length <= 1) {
                                        objArr = new Type[0];
                                    } else {
                                        objArr = AbstractC0434i.T0(genericParameterTypes, 0, genericParameterTypes.length - 1);
                                    }
                                    return new C1805i(constructor, declaringClass, null, (Type[]) objArr, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (t()) {
            return new C1804h(constructor, AbstractC0842e.e(obj, o()), 1);
        }
        o6.j.e(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        o6.j.d(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        o6.j.d(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new C1805i(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1.isInterface() == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x6.w v(Method method, boolean z8) {
        if (t()) {
            F6.w A2 = o().A();
            Object obj = this.f15797h;
            if (A2 != null && AbstractC0892g.c(A2.b())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                o6.j.d(parameterTypes, "getParameterTypes(...)");
                Class cls = (Class) AbstractC0434i.X0(parameterTypes);
                if (cls != null) {
                }
            }
            obj = AbstractC0842e.e(obj, o());
            return new C1816t(method, z8, obj);
        }
        return new C1818v(2, method);
    }

    @Override // w6.AbstractC1731s
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0019u o() {
        u6.s sVar = f15794l[0];
        Object a3 = this.f15798i.a();
        o6.j.d(a3, "getValue(...)");
        return (InterfaceC0019u) a3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H(F f8, InterfaceC0019u interfaceC0019u) {
        this(f8, r3, w0.c(interfaceC0019u).b(), interfaceC0019u, C1283b.f13627d);
        o6.j.e(interfaceC0019u, "descriptor");
        String b4 = ((AbstractC0054n) interfaceC0019u).getName().b();
        o6.j.d(b4, "asString(...)");
    }
}
