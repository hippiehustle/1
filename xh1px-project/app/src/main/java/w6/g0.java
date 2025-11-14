package w6;

import C6.C0014o;
import C6.EnumC0005f;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import F6.C0059t;
import L7.C0165x;
import a6.AbstractC0436k;
import f7.C0722b;
import f7.C0725e;
import g7.C0799h;
import h6.AbstractC0837b;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import n6.InterfaceC1162a;
import z6.AbstractC1881d;

/* loaded from: classes.dex */
public final class g0 implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15855d;

    /* renamed from: e, reason: collision with root package name */
    public final m0 f15856e;

    public /* synthetic */ g0(m0 m0Var, int i4) {
        this.f15855d = i4;
        this.f15856e = m0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d6, code lost:
    
        if (a6.AbstractC0436k.l0(r3, r9) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0203, code lost:
    
        if (r3 != false) goto L68;
     */
    @Override // n6.InterfaceC1162a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        Class<?> enclosingClass;
        boolean a3;
        C0722b c0722b;
        String concat;
        int i4 = this.f15855d;
        m0 m0Var = this.f15856e;
        int i8 = 2;
        int i9 = 0;
        switch (i4) {
            case 0:
                C0722b c0722b2 = w0.f15923a;
                C6.M o7 = m0Var.o();
                F f8 = m0Var.f15877f;
                AbstractC0837b b4 = w0.b(o7);
                if (b4 instanceof C1727n) {
                    C1727n c1727n = (C1727n) b4;
                    a7.I i10 = c1727n.f15882b;
                    C6.M m6 = c1727n.f15881a;
                    C0799h c0799h = e7.g.f10671a;
                    e7.d b9 = e7.g.b(i10, c1727n.f15884d, c1727n.f15885e, true);
                    if (b9 == null) {
                        return null;
                    }
                    if (m6.e() != 2) {
                        InterfaceC0010k q6 = m6.q();
                        if (q6 != null) {
                            if (AbstractC0890e.l(q6)) {
                                InterfaceC0010k q8 = q6.q();
                                if (AbstractC0890e.m(q8, EnumC0005f.f741d) || AbstractC0890e.m(q8, EnumC0005f.f743f)) {
                                    InterfaceC0004e interfaceC0004e = (InterfaceC0004e) q6;
                                    LinkedHashSet linkedHashSet = AbstractC1881d.f16708a;
                                    if (AbstractC0890e.l(interfaceC0004e)) {
                                        LinkedHashSet linkedHashSet2 = AbstractC1881d.f16708a;
                                        C0722b f9 = AbstractC1098d.f(interfaceC0004e);
                                        if (f9 != null) {
                                            c0722b = f9.e();
                                        } else {
                                            c0722b = null;
                                        }
                                        break;
                                    }
                                    i9 = 1;
                                }
                            }
                            if (AbstractC0890e.l(m6.q())) {
                                C0059t T5 = m6.T();
                                if (T5 != null && T5.getAnnotations().a(P6.v.f4595a)) {
                                    a3 = true;
                                    break;
                                } else {
                                    a3 = m6.getAnnotations().a(P6.v.f4595a);
                                    break;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                        }
                    }
                    if (i9 == 0 && !e7.g.d(i10)) {
                        InterfaceC0010k q9 = m6.q();
                        if (q9 instanceof InterfaceC0004e) {
                            enclosingClass = y0.k((InterfaceC0004e) q9);
                        } else {
                            enclosingClass = f8.d();
                        }
                    } else {
                        enclosingClass = f8.d().getEnclosingClass();
                    }
                    if (enclosingClass == null) {
                        return null;
                    }
                    try {
                        return enclosingClass.getDeclaredField(b9.f10663e);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                if (b4 instanceof C1725l) {
                    return ((C1725l) b4).f15870a;
                }
                if ((b4 instanceof C1726m) || (b4 instanceof C1728o)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            default:
                F f10 = m0Var.f15877f;
                String str = m0Var.f15878g;
                String str2 = m0Var.f15879h;
                f10.getClass();
                o6.j.e(str, "name");
                o6.j.e(str2, "signature");
                A4.a b10 = F.f15791d.b(str2);
                if (b10 != null) {
                    if (((I7.i) b10.f283h) == null) {
                        b10.f283h = new I7.i(i9, b10);
                    }
                    I7.i iVar = (I7.i) b10.f283h;
                    o6.j.b(iVar);
                    String str3 = (String) iVar.get(1);
                    C6.M j = f10.j(Integer.parseInt(str3));
                    if (j == null) {
                        StringBuilder s8 = A.j.s("Local property #", str3, " not found in ");
                        s8.append(f10.d());
                        throw new C0165x(s8.toString());
                    }
                    return j;
                }
                Collection n3 = f10.n(C0725e.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : n3) {
                    if (o6.j.a(w0.b((C6.M) obj).a(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() != 1) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            C0014o d2 = ((C6.M) next).d();
                            Object obj2 = linkedHashMap.get(d2);
                            if (obj2 == null) {
                                obj2 = new ArrayList();
                                linkedHashMap.put(d2, obj2);
                            }
                            ((List) obj2).add(next);
                        }
                        TreeMap treeMap = new TreeMap(new C1719f(i8));
                        treeMap.putAll(linkedHashMap);
                        Collection values = treeMap.values();
                        o6.j.d(values, "<get-values>(...)");
                        List list = (List) AbstractC0436k.w0(values);
                        if (list.size() == 1) {
                            return (C6.M) AbstractC0436k.p0(list);
                        }
                        String v02 = AbstractC0436k.v0(f10.n(C0725e.e(str)), "\n", null, null, C1715b.f15840i, 30);
                        StringBuilder sb = new StringBuilder("Property '");
                        sb.append(str);
                        sb.append("' (JVM signature: ");
                        sb.append(str2);
                        sb.append(") not resolved in ");
                        sb.append(f10);
                        sb.append(':');
                        if (v02.length() == 0) {
                            concat = " no members found";
                        } else {
                            concat = "\n".concat(v02);
                        }
                        sb.append(concat);
                        throw new C0165x(sb.toString());
                    }
                    return (C6.M) AbstractC0436k.G0(arrayList);
                }
                throw new C0165x("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + f10);
        }
    }
}
