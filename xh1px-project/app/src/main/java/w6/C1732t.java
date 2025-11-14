package w6;

import C6.AbstractC0021w;
import C6.InterfaceC0004e;
import C6.InterfaceC0009j;
import L7.C0165x;
import a6.AbstractC0438m;
import f7.C0722b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1162a;
import p7.InterfaceC1333o;
import s7.C1518i;
import u6.AbstractC1638C;

/* renamed from: w6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1732t implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15912d;

    /* renamed from: e, reason: collision with root package name */
    public final C1710B f15913e;

    public /* synthetic */ C1732t(C1710B c1710b, int i4) {
        this.f15912d = i4;
        this.f15913e = c1710b;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        InterfaceC0004e d2;
        int i4;
        int i8 = this.f15912d;
        EnumC1712D enumC1712D = EnumC1712D.f15788d;
        EnumC1712D enumC1712D2 = EnumC1712D.f15789e;
        Z6.a aVar = null;
        C1710B c1710b = this.f15913e;
        switch (i8) {
            case 0:
                return new C1737y(c1710b);
            case 1:
                return c1710b.k(c1710b.u().l().w0(), enumC1712D);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC1333o o02 = c1710b.u().o0();
                o6.j.d(o02, "getStaticScope(...)");
                return c1710b.k(o02, enumC1712D);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return c1710b.k(c1710b.u().l().w0(), enumC1712D2);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC1333o o03 = c1710b.u().o0();
                o6.j.d(o03, "getStaticScope(...)");
                return c1710b.k(o03, enumC1712D2);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                HashSet hashSet = C1710B.f15783g;
                C0722b t8 = c1710b.t();
                Class cls = c1710b.f15784e;
                s0 s0Var = ((C1737y) c1710b.f15785f.getValue()).f15787a;
                u6.s sVar = AbstractC1711C.f15786b[0];
                Object a3 = s0Var.a();
                o6.j.d(a3, "getValue(...)");
                H6.e eVar = (H6.e) a3;
                C1518i c1518i = eVar.f2042a;
                C6.A a4 = c1518i.f14574b;
                if (t8.f10795c && cls.isAnnotationPresent(Metadata.class)) {
                    d2 = c1518i.b(t8);
                } else {
                    d2 = AbstractC0021w.d(a4, t8);
                }
                if (d2 == null) {
                    if (cls.isSynthetic()) {
                        return C1710B.s(t8, eVar);
                    }
                    H6.b q6 = AbstractC1638C.q(cls);
                    if (q6 != null) {
                        aVar = q6.f2038b.f7517a;
                    }
                    if (aVar == null) {
                        i4 = -1;
                    } else {
                        i4 = AbstractC1738z.f15936a[aVar.ordinal()];
                    }
                    switch (i4) {
                        case -1:
                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            throw new C0165x("Unresolved class: " + cls + " (kind = " + aVar + ')');
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            return C1710B.s(t8, eVar);
                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                            throw new C0165x("Unknown class: " + cls + " (kind = " + aVar + ')');
                    }
                }
                return d2;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Annotation[] annotations = c1710b.f15784e.getAnnotations();
                o6.j.d(annotations, "getAnnotations(...)");
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations) {
                    if (!C1710B.f15783g.contains(h2.a.k(h2.a.g(annotation)).getName())) {
                        arrayList.add(annotation);
                    }
                }
                return y0.m(arrayList);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                Class cls2 = c1710b.f15784e;
                if (cls2.isAnonymousClass()) {
                    return null;
                }
                C0722b t9 = c1710b.t();
                if (t9.f10795c) {
                    String simpleName = cls2.getSimpleName();
                    Method enclosingMethod = cls2.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        return I7.m.s0(simpleName, enclosingMethod.getName() + '$');
                    }
                    Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        return I7.m.s0(simpleName, enclosingConstructor.getName() + '$');
                    }
                    return I7.m.r0('$', simpleName, simpleName);
                }
                String b4 = t9.f().b();
                o6.j.d(b4, "asString(...)");
                return b4;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (c1710b.f15784e.isAnonymousClass()) {
                    return null;
                }
                C0722b t10 = c1710b.t();
                if (t10.f10795c) {
                    return null;
                }
                return t10.a().f10797a.f10800a;
            default:
                Collection h8 = c1710b.h();
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(h8, 10));
                Iterator it = h8.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new H(c1710b, (InterfaceC0009j) it.next()));
                }
                return arrayList2;
        }
    }

    public C1732t(C1710B c1710b, C1737y c1737y) {
        this.f15912d = 7;
        this.f15913e = c1710b;
    }
}
