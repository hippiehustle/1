package U5;

import R3.r;
import X6.q;
import android.content.Context;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import c1.C0562c;
import c1.h;
import c1.i;
import c1.j;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.AbstractC0948c;
import k0.C0950e;
import l0.C0998b;
import n6.InterfaceC1163b;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final class d implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6163a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6164b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f6163a = i4;
        this.f6164b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.b0
    public final Z a(Class cls, AbstractC0948c abstractC0948c) {
        Map unmodifiableMap;
        Z z8;
        Z z9;
        C0950e c0950e;
        int i4 = 0;
        Object[] objArr = 0;
        switch (this.f6163a) {
            case 0:
                final g gVar = new g();
                r rVar = (r) this.f6164b;
                U.c(abstractC0948c);
                j jVar = new j((h) rVar.f5082e, (C0562c) rVar.f5083f);
                j jVar2 = (j) ((e) D2.f.p(jVar, e.class));
                jVar2.getClass();
                q qVar = new q(1);
                i iVar = jVar2.f9497b;
                LinkedHashMap linkedHashMap = qVar.f7033a;
                linkedHashMap.put("c3.j", iVar);
                linkedHashMap.put("b5.h", jVar2.f9498c);
                linkedHashMap.put("M1.l", jVar2.f9499d);
                linkedHashMap.put("y3.g", jVar2.f9500e);
                linkedHashMap.put("h4.e", jVar2.f9501f);
                linkedHashMap.put("Y4.i", jVar2.f9502g);
                linkedHashMap.put("V4.q", jVar2.f9503h);
                linkedHashMap.put("W4.x", jVar2.f9504i);
                linkedHashMap.put("c5.a", jVar2.j);
                linkedHashMap.put("d5.r", jVar2.k);
                linkedHashMap.put("Q4.t", jVar2.f9505l);
                linkedHashMap.put("R4.i", jVar2.f9506m);
                linkedHashMap.put("O4.l", jVar2.f9507n);
                LinkedHashMap linkedHashMap2 = qVar.f7033a;
                if (linkedHashMap2.isEmpty()) {
                    unmodifiableMap = Collections.EMPTY_MAP;
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(linkedHashMap2);
                }
                Y5.c cVar = (Y5.c) unmodifiableMap.get(cls.getName());
                InterfaceC1163b interfaceC1163b = (InterfaceC1163b) abstractC0948c.a(f.f6165d);
                ((j) ((e) D2.f.p(jVar, e.class))).getClass();
                Object obj = Collections.EMPTY_MAP.get(cls);
                if (obj == null) {
                    if (interfaceC1163b == null) {
                        if (cVar != null) {
                            z8 = (Z) cVar.get();
                        } else {
                            throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                        }
                    } else {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                } else if (cVar == null) {
                    if (interfaceC1163b != null) {
                        z8 = (Z) interfaceC1163b.m(obj);
                    } else {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                } else {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                Closeable closeable = new Closeable() { // from class: U5.c
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        g.this.a();
                    }
                };
                z8.getClass();
                C0998b c0998b = z8.f8824a;
                if (c0998b != null) {
                    if (c0998b.f12186d) {
                        C0998b.a(closeable);
                    } else {
                        synchronized (c0998b.f12183a) {
                            c0998b.f12185c.add(closeable);
                        }
                    }
                }
                return z8;
            case 1:
                W0.c cVar2 = new W0.c(18, (boolean) (objArr == true ? 1 : 0));
                cVar2.f6486e = abstractC0948c;
                return new V5.d(new C0562c(((h) ((V5.c) E2.d.o((Context) this.f6164b, V5.c.class))).f9469b), cVar2);
            default:
                o6.j.e(abstractC0948c, "extras");
                InterfaceC1642c n3 = h2.a.n(cls);
                C0950e[] c0950eArr = (C0950e[]) this.f6164b;
                C0950e[] c0950eArr2 = (C0950e[]) Arrays.copyOf(c0950eArr, c0950eArr.length);
                o6.j.e(c0950eArr2, "initializers");
                int length = c0950eArr2.length;
                while (true) {
                    z9 = null;
                    if (i4 < length) {
                        c0950e = c0950eArr2[i4];
                        if (!o6.j.a(c0950e.f11952a, n3)) {
                            i4++;
                        }
                    } else {
                        c0950e = null;
                    }
                }
                if (c0950e != null) {
                    z9 = (Z) c0950e.f11953b.m(abstractC0948c);
                }
                if (z9 != null) {
                    return z9;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + n3.a()).toString());
        }
    }

    public d(C0950e[] c0950eArr) {
        this.f6163a = 2;
        o6.j.e(c0950eArr, "initializers");
        this.f6164b = c0950eArr;
    }
}
