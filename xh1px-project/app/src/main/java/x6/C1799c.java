package x6;

import I6.AbstractC0065d;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import h6.AbstractC0837b;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.AbstractC1149a;
import u6.InterfaceC1642c;

/* renamed from: x6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1799c implements InterfaceC1803g {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16246a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16247b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1797a f16248c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16249d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f16250e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f16251f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16252g;

    public C1799c(Class cls, ArrayList arrayList, EnumC1797a enumC1797a, EnumC1798b enumC1798b, List list) {
        o6.j.e(cls, "jClass");
        o6.j.e(list, "methods");
        this.f16246a = cls;
        this.f16247b = arrayList;
        this.f16248c = enumC1797a;
        this.f16249d = list;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f16250e = arrayList2;
        List list2 = this.f16249d;
        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            o6.j.b(returnType);
            List list3 = AbstractC0065d.f2192a;
            Class<?> cls2 = (Class) AbstractC0065d.f2194c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f16251f = arrayList3;
        List list4 = this.f16249d;
        ArrayList arrayList4 = new ArrayList(AbstractC0438m.d0(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f16252g = arrayList4;
        if (this.f16248c == EnumC1797a.f16241e && enumC1798b == EnumC1798b.f16243d) {
            ArrayList arrayList5 = this.f16247b;
            o6.j.e(arrayList5, "<this>");
            ArrayList arrayList6 = new ArrayList(AbstractC0438m.d0(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            boolean z8 = false;
            while (it4.hasNext()) {
                Object next = it4.next();
                boolean z9 = true;
                if (!z8 && o6.j.a(next, "value")) {
                    z8 = true;
                    z9 = false;
                }
                if (z9) {
                    arrayList6.add(next);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // x6.InterfaceC1803g
    public final List a() {
        return this.f16250e;
    }

    @Override // x6.InterfaceC1803g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // x6.InterfaceC1803g
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r11.isInstance(r8) != false) goto L32;
     */
    @Override // x6.InterfaceC1803g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object[] objArr) {
        InterfaceC1642c n3;
        String a3;
        o6.j.e(objArr, "args");
        if (AbstractC0837b.i(this) == objArr.length) {
            ArrayList arrayList = new ArrayList(objArr.length);
            int length = objArr.length;
            int i4 = 0;
            int i8 = 0;
            while (true) {
                ArrayList arrayList2 = this.f16247b;
                if (i4 < length) {
                    Object obj = objArr[i4];
                    int i9 = i8 + 1;
                    ArrayList arrayList3 = this.f16251f;
                    if (obj == null && this.f16248c == EnumC1797a.f16240d) {
                        obj = this.f16252g.get(i8);
                    } else {
                        Class cls = (Class) arrayList3.get(i8);
                        if (!(obj instanceof Class)) {
                            if (obj instanceof InterfaceC1642c) {
                                obj = h2.a.k((InterfaceC1642c) obj);
                            } else if (obj instanceof Object[]) {
                                Object[] objArr2 = (Object[]) obj;
                                if (!(objArr2 instanceof Class[])) {
                                    if (objArr2 instanceof InterfaceC1642c[]) {
                                        o6.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                                        InterfaceC1642c[] interfaceC1642cArr = (InterfaceC1642c[]) obj;
                                        ArrayList arrayList4 = new ArrayList(interfaceC1642cArr.length);
                                        for (InterfaceC1642c interfaceC1642c : interfaceC1642cArr) {
                                            arrayList4.add(h2.a.k(interfaceC1642c));
                                        }
                                        obj = arrayList4.toArray(new Class[0]);
                                    } else {
                                        obj = objArr2;
                                    }
                                }
                            }
                        }
                        obj = null;
                    }
                    if (obj == null) {
                        String str = (String) arrayList2.get(i8);
                        Class cls2 = (Class) arrayList3.get(i8);
                        if (o6.j.a(cls2, Class.class)) {
                            n3 = o6.v.f13643a.b(InterfaceC1642c.class);
                        } else if (cls2.isArray() && o6.j.a(cls2.getComponentType(), Class.class)) {
                            n3 = o6.v.f13643a.b(InterfaceC1642c[].class);
                        } else {
                            n3 = h2.a.n(cls2);
                        }
                        if (o6.j.a(n3.a(), o6.v.f13643a.b(Object[].class).a())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(n3.a());
                            sb.append('<');
                            Class<?> componentType = h2.a.k(n3).getComponentType();
                            o6.j.d(componentType, "getComponentType(...)");
                            sb.append(h2.a.n(componentType).a());
                            sb.append('>');
                            a3 = sb.toString();
                        } else {
                            a3 = n3.a();
                        }
                        throw new IllegalArgumentException("Argument #" + i8 + ' ' + str + " is not of the required type " + a3);
                    }
                    arrayList.add(obj);
                    i4++;
                    i8 = i9;
                } else {
                    return h4.g.f(this.f16246a, a6.x.R0(AbstractC0436k.X0(arrayList2, arrayList)), this.f16249d);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Callable expects ");
            sb2.append(AbstractC0837b.i(this));
            sb2.append(" arguments, but ");
            throw new IllegalArgumentException(AbstractC1149a.h(sb2, objArr.length, " were provided."));
        }
    }

    @Override // x6.InterfaceC1803g
    public final Type r() {
        return this.f16246a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1799c(Class cls, ArrayList arrayList, EnumC1797a enumC1797a) {
        this(cls, arrayList, enumC1797a, EnumC1798b.f16244e, r5);
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
    }
}
