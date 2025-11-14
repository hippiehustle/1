package x6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0019u;
import C6.K;
import I6.AbstractC0065d;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import h7.AbstractC0842e;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import w6.F;
import w6.y0;
import w7.AbstractC1741c;
import w7.AbstractC1759v;

/* renamed from: x6.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1795C implements InterfaceC1803g {

    /* renamed from: a, reason: collision with root package name */
    public final Method f16229a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f16230b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16231c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16232d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f16233e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public C1795C(InterfaceC0019u interfaceC0019u, F f8, String str, List list) {
        ?? y4;
        o6.j.e(f8, "container");
        o6.j.e(str, "constructorDesc");
        Method g8 = f8.g("constructor-impl", str);
        o6.j.b(g8);
        this.f16229a = g8;
        Method g9 = f8.g("box-impl", I7.m.p0(str, "V") + AbstractC0065d.b(f8.d()));
        o6.j.b(g9);
        this.f16230b = g9;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (true) {
            List list2 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC1759v b4 = ((K) it.next()).b();
            o6.j.d(b4, "getType(...)");
            w7.z b9 = AbstractC1741c.b(b4);
            ArrayList r8 = AbstractC0842e.r(b9);
            if (r8 == null) {
                Class B8 = AbstractC0842e.B(b9);
                if (B8 != null) {
                    list2 = E2.d.y(AbstractC0842e.o(B8, interfaceC0019u));
                }
            } else {
                list2 = r8;
            }
            arrayList.add(list2);
        }
        this.f16231c = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
        int i4 = 0;
        for (Object obj : list) {
            int i8 = i4 + 1;
            if (i4 >= 0) {
                InterfaceC0007h c6 = ((K) obj).b().B0().c();
                o6.j.c(c6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC0004e interfaceC0004e = (InterfaceC0004e) c6;
                List list3 = (List) this.f16231c.get(i4);
                if (list3 != null) {
                    y4 = new ArrayList(AbstractC0438m.d0(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        y4.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class k = y0.k(interfaceC0004e);
                    o6.j.b(k);
                    y4 = E2.d.y(k);
                }
                arrayList2.add(y4);
                i4 = i8;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        this.f16232d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            a6.q.f0(arrayList3, (Iterable) it3.next());
        }
        this.f16233e = arrayList3;
    }

    @Override // x6.InterfaceC1803g
    public final List a() {
        return this.f16233e;
    }

    @Override // x6.InterfaceC1803g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // x6.InterfaceC1803g
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        ?? y4;
        o6.j.e(objArr, "args");
        ArrayList arrayList = this.f16231c;
        o6.j.e(arrayList, "other");
        int length = objArr.length;
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC0438m.d0(arrayList, 10), length));
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i4 >= length) {
                break;
            }
            arrayList2.add(new Z5.j(objArr[i4], next));
            i4++;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Z5.j jVar = (Z5.j) it2.next();
            Object obj = jVar.f7485d;
            List list = (List) jVar.f7486e;
            if (list != null) {
                y4 = new ArrayList(AbstractC0438m.d0(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    y4.add(((Method) it3.next()).invoke(obj, null));
                }
            } else {
                y4 = E2.d.y(obj);
            }
            a6.q.f0(arrayList3, y4);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.f16229a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f16230b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // x6.InterfaceC1803g
    public final Type r() {
        Class<?> returnType = this.f16230b.getReturnType();
        o6.j.d(returnType, "getReturnType(...)");
        return returnType;
    }
}
