package x6;

import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import F6.U;
import L7.C0165x;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import b6.C0535c;
import e6.EnumC0646a;
import h4.AbstractC0832f;
import h6.AbstractC0837b;
import h7.AbstractC0842e;
import i7.AbstractC0892g;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import t6.C1586a;
import t6.C1587b;
import t6.C1588c;
import w6.y0;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.Q;
import w7.X;

/* renamed from: x6.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1796D implements InterfaceC1803g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16234a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1803g f16235b;

    /* renamed from: c, reason: collision with root package name */
    public final Member f16236c;

    /* renamed from: d, reason: collision with root package name */
    public final R.g f16237d;

    /* renamed from: e, reason: collision with root package name */
    public final C1588c[] f16238e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16239f;

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0138, code lost:
    
        if ((r12 instanceof x6.InterfaceC1802f) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (z6.h.G(r5) == true) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032a A[EDGE_INSN: B:80:0x032a->B:62:0x032a BREAK  A[LOOP:3: B:66:0x0306->B:75:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1796D(InterfaceC0002c interfaceC0002c, InterfaceC1803g interfaceC1803g, boolean z8) {
        Method declaredMethod;
        int i4;
        AbstractC1759v abstractC1759v;
        boolean z9;
        int i8;
        int i9;
        R.g gVar;
        boolean z10;
        List list;
        int i10;
        InterfaceC1803g interfaceC1803g2;
        int i11;
        int length;
        int i12;
        Iterable iterable;
        Iterator it;
        boolean z11;
        int i13;
        AbstractC1759v abstractC1759v2;
        AbstractC1759v abstractC1759v3;
        o6.j.e(interfaceC0002c, "descriptor");
        this.f16234a = z8;
        boolean z12 = false;
        if (interfaceC1803g instanceof C1816t) {
            F6.w M8 = interfaceC0002c.M();
            M8 = M8 == null ? interfaceC0002c.A() : M8;
            if (M8 != null) {
                abstractC1759v3 = M8.b();
            } else {
                abstractC1759v3 = null;
            }
            if (abstractC1759v3 != null && AbstractC0892g.h(abstractC1759v3)) {
                if (z8) {
                    List z02 = interfaceC0002c.z0();
                    o6.j.d(z02, "getValueParameters(...)");
                    if (!z02.isEmpty()) {
                        Iterator it2 = z02.iterator();
                        while (it2.hasNext()) {
                            if (((U) it2.next()).N0()) {
                            }
                        }
                    }
                }
                ArrayList r8 = AbstractC0842e.r(AbstractC1741c.b(abstractC1759v3));
                o6.j.b(r8);
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(r8, 10));
                Iterator it3 = r8.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((Method) it3.next()).invoke(((C1816t) interfaceC1803g).f16269g, null));
                }
                interfaceC1803g = new C1817u((Method) ((w) interfaceC1803g).f16273a, arrayList.toArray(new Object[0]));
            }
        }
        this.f16235b = interfaceC1803g;
        this.f16236c = interfaceC1803g.b();
        AbstractC1759v r9 = interfaceC0002c.r();
        o6.j.b(r9);
        boolean z13 = interfaceC0002c instanceof InterfaceC0019u;
        if (z13 && ((InterfaceC0019u) interfaceC0002c).p()) {
            w7.z i14 = AbstractC0892g.i(r9);
            if (i14 != null) {
                abstractC1759v2 = Q.d(r9).i(i14, X.INVARIANT);
            } else {
                abstractC1759v2 = null;
            }
            if (abstractC1759v2 != null) {
            }
        }
        Class B8 = AbstractC0842e.B(r9);
        if (B8 != null) {
            try {
                declaredMethod = B8.getDeclaredMethod("box-impl", AbstractC0842e.o(B8, interfaceC0002c).getReturnType());
                o6.j.b(declaredMethod);
                if (!AbstractC0892g.a(interfaceC0002c)) {
                    gVar = new R.g(C1588c.f15130g, new List[0], declaredMethod);
                } else {
                    int i15 = -1;
                    if ((!(interfaceC1803g instanceof C1816t) || ((C1816t) interfaceC1803g).f16268f) && !(interfaceC1803g instanceof C1817u)) {
                        if (!(interfaceC0002c instanceof InterfaceC0009j)) {
                            if (interfaceC0002c.A() != null && !(interfaceC1803g instanceof InterfaceC1802f)) {
                                InterfaceC0010k q6 = interfaceC0002c.q();
                                o6.j.d(q6, "getContainingDeclaration(...)");
                                if (!AbstractC0892g.f(q6)) {
                                    i15 = 1;
                                }
                            }
                            i15 = 0;
                        }
                    }
                    if (interfaceC1803g instanceof C1817u) {
                        i4 = -((C1817u) interfaceC1803g).f16270f.length;
                    } else {
                        i4 = i15;
                    }
                    Member b4 = interfaceC1803g.b();
                    ArrayList arrayList2 = new ArrayList();
                    F6.w M9 = interfaceC0002c.M();
                    if (M9 != null) {
                        abstractC1759v = M9.b();
                    } else {
                        abstractC1759v = null;
                    }
                    if (abstractC1759v != null) {
                        arrayList2.add(abstractC1759v);
                    } else if (interfaceC0002c instanceof InterfaceC0009j) {
                        InterfaceC0004e J6 = ((InterfaceC0009j) interfaceC0002c).J();
                        o6.j.d(J6, "getConstructedClass(...)");
                        if (J6.d0()) {
                            InterfaceC0010k q8 = J6.q();
                            o6.j.c(q8, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            arrayList2.add(((InterfaceC0004e) q8).l());
                        }
                    } else {
                        InterfaceC0010k q9 = interfaceC0002c.q();
                        o6.j.d(q9, "getContainingDeclaration(...)");
                        if (q9 instanceof InterfaceC0004e) {
                            InterfaceC0004e interfaceC0004e = (InterfaceC0004e) q9;
                            if (AbstractC0892g.f(interfaceC0004e)) {
                                if (b4 != null) {
                                    Class<?> declaringClass = b4.getDeclaringClass();
                                    if (declaringClass == null ? false : !h2.a.n(declaringClass).m()) {
                                        z9 = true;
                                        if (!z9) {
                                            w7.z l6 = interfaceC0004e.l();
                                            o6.j.d(l6, "getDefaultType(...)");
                                            arrayList2.add(AbstractC0405a.e0(l6));
                                        } else {
                                            arrayList2.add(interfaceC0004e.l());
                                        }
                                    }
                                }
                                z9 = false;
                                if (!z9) {
                                }
                            }
                        }
                    }
                    List z03 = interfaceC0002c.z0();
                    o6.j.d(z03, "getValueParameters(...)");
                    Iterator it4 = z03.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((U) it4.next()).b());
                    }
                    Iterator it5 = arrayList2.iterator();
                    int i16 = 0;
                    while (it5.hasNext()) {
                        ArrayList r10 = AbstractC0842e.r(AbstractC1741c.b((AbstractC1759v) it5.next()));
                        if (r10 != null) {
                            i10 = r10.size();
                        } else {
                            i10 = 1;
                        }
                        i16 += i10;
                    }
                    if (this.f16234a) {
                        i8 = ((i16 + 31) / 32) + 1;
                    } else {
                        i8 = 0;
                    }
                    if (z13 && ((InterfaceC0019u) interfaceC0002c).p()) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    int i17 = i16 + i4 + i8 + i9;
                    boolean z14 = this.f16234a;
                    if (AbstractC0837b.i(this) == i17) {
                        C1588c G8 = AbstractC0832f.G(Math.max(i15, 0), arrayList2.size() + i15);
                        List[] listArr = new List[i17];
                        for (int i18 = 0; i18 < i17; i18++) {
                            int i19 = G8.f15123d;
                            if (i18 <= G8.f15124e && i19 <= i18) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                w7.z b9 = AbstractC1741c.b((AbstractC1759v) arrayList2.get(i18 - i15));
                                list = AbstractC0842e.r(b9);
                                if (list == null) {
                                    Class B9 = AbstractC0842e.B(b9);
                                    if (B9 != null) {
                                        list = E2.d.y(AbstractC0842e.o(B9, interfaceC0002c));
                                    }
                                }
                                listArr[i18] = list;
                            }
                            list = null;
                            listArr[i18] = list;
                        }
                        gVar = new R.g(G8, listArr, declaredMethod);
                    } else {
                        throw new C0165x("Inconsistent number of parameters in the descriptor and Java reflection object: " + AbstractC0837b.i(this) + " != " + i17 + "\nCalling: " + interfaceC0002c + "\nParameter types: " + this.f16235b.a() + ")\nDefault: " + z14);
                    }
                }
                this.f16237d = gVar;
                C0535c i20 = E2.d.i();
                interfaceC1803g2 = this.f16235b;
                if (!(interfaceC1803g2 instanceof C1817u)) {
                    i11 = ((C1817u) interfaceC1803g2).f16270f.length;
                } else if (interfaceC1803g2 instanceof C1816t) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    i20.add(AbstractC0832f.G(0, i11));
                }
                List[] listArr2 = (List[]) gVar.f4988f;
                length = listArr2.length;
                i12 = 0;
                while (i12 < length) {
                    List list2 = listArr2[i12];
                    if (list2 != null) {
                        i13 = list2.size();
                    } else {
                        i13 = 1;
                    }
                    int i21 = i13 + i11;
                    i20.add(AbstractC0832f.G(i11, i21));
                    i12++;
                    i11 = i21;
                }
                this.f16238e = (C1588c[]) E2.d.f(i20).toArray(new C1588c[0]);
                iterable = (C1588c) this.f16237d.f4987e;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (true) {
                        if (((C1587b) it).f15128f) {
                            break;
                        }
                        List list3 = ((List[]) this.f16237d.f4988f)[((a6.w) it).nextInt()];
                        if (list3 == null || list3.size() <= 1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            z12 = true;
                            break;
                        }
                    }
                }
                this.f16239f = z12;
            } catch (NoSuchMethodException unused) {
                throw new C0165x("No box method found in inline class: " + B8 + " (calling " + interfaceC0002c + ')');
            }
        }
        declaredMethod = null;
        if (!AbstractC0892g.a(interfaceC0002c)) {
        }
        this.f16237d = gVar;
        C0535c i202 = E2.d.i();
        interfaceC1803g2 = this.f16235b;
        if (!(interfaceC1803g2 instanceof C1817u)) {
        }
        if (i11 > 0) {
        }
        List[] listArr22 = (List[]) gVar.f4988f;
        length = listArr22.length;
        i12 = 0;
        while (i12 < length) {
        }
        this.f16238e = (C1588c[]) E2.d.f(i202).toArray(new C1588c[0]);
        iterable = (C1588c) this.f16237d.f4987e;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (true) {
            if (((C1587b) it).f15128f) {
            }
        }
        this.f16239f = z12;
    }

    @Override // x6.InterfaceC1803g
    public final List a() {
        return this.f16235b.a();
    }

    @Override // x6.InterfaceC1803g
    public final Member b() {
        return this.f16236c;
    }

    @Override // x6.InterfaceC1803g
    public final boolean c() {
        return this.f16235b instanceof C1814r;
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        Object invoke;
        Object obj;
        Method method;
        Object e9;
        o6.j.e(objArr, "args");
        R.g gVar = this.f16237d;
        C1588c c1588c = (C1588c) gVar.f4987e;
        List[] listArr = (List[]) gVar.f4988f;
        Method method2 = (Method) gVar.f4989g;
        boolean isEmpty = c1588c.isEmpty();
        int i4 = c1588c.f15124e;
        int i8 = c1588c.f15123d;
        if (!isEmpty) {
            if (this.f16239f) {
                C0535c c0535c = new C0535c(objArr.length);
                for (int i9 = 0; i9 < i8; i9++) {
                    c0535c.add(objArr[i9]);
                }
                if (i8 <= i4) {
                    while (true) {
                        List<Method> list = listArr[i8];
                        Object obj2 = objArr[i8];
                        if (list != null) {
                            for (Method method3 : list) {
                                if (obj2 != null) {
                                    e9 = method3.invoke(obj2, null);
                                } else {
                                    Class<?> returnType = method3.getReturnType();
                                    o6.j.d(returnType, "getReturnType(...)");
                                    e9 = y0.e(returnType);
                                }
                                c0535c.add(e9);
                            }
                        } else {
                            c0535c.add(obj2);
                        }
                        if (i8 == i4) {
                            break;
                        }
                        i8++;
                    }
                }
                int i10 = i4 + 1;
                int length = objArr.length - 1;
                if (i10 <= length) {
                    while (true) {
                        c0535c.add(objArr[i10]);
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                objArr = E2.d.f(c0535c).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    if (i11 <= i4 && i8 <= i11) {
                        List list2 = listArr[i11];
                        if (list2 != null) {
                            method = (Method) AbstractC0436k.G0(list2);
                        } else {
                            method = null;
                        }
                        obj = objArr[i11];
                        if (method != null) {
                            if (obj != null) {
                                obj = method.invoke(obj, null);
                            } else {
                                Class<?> returnType2 = method.getReturnType();
                                o6.j.d(returnType2, "getReturnType(...)");
                                obj = y0.e(returnType2);
                            }
                        }
                    } else {
                        obj = objArr[i11];
                    }
                    objArr2[i11] = obj;
                }
                objArr = objArr2;
            }
        }
        Object d2 = this.f16235b.d(objArr);
        if (d2 != EnumC0646a.f10656d && method2 != null && (invoke = method2.invoke(null, d2)) != null) {
            return invoke;
        }
        return d2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [t6.a, t6.c] */
    /* JADX WARN: Type inference failed for: r4v2, types: [t6.a, t6.c] */
    public final C1588c e(int i4) {
        C1588c[] c1588cArr = this.f16238e;
        if (i4 >= 0 && i4 < c1588cArr.length) {
            return c1588cArr[i4];
        }
        if (c1588cArr.length == 0) {
            return new C1586a(i4, i4, 1);
        }
        int length = ((C1588c) AbstractC0434i.c1(c1588cArr)).f15124e + 1 + (i4 - c1588cArr.length);
        return new C1586a(length, length, 1);
    }

    @Override // x6.InterfaceC1803g
    public final Type r() {
        return this.f16235b.r();
    }
}
