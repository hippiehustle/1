package w6;

import C6.InterfaceC0002c;
import L7.C0165x;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import d6.InterfaceC0617c;
import f7.C0723c;
import h7.AbstractC0842e;
import i7.AbstractC0892g;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC1098d;
import n6.InterfaceC1162a;
import u6.AbstractC1638C;
import w7.AbstractC1741c;
import w7.AbstractC1759v;

/* renamed from: w6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729p implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15896d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1731s f15897e;

    public /* synthetic */ C1729p(AbstractC1731s abstractC1731s, int i4) {
        this.f15896d = i4;
        this.f15897e = abstractC1731s;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        int i4;
        int i8;
        F6.U u8;
        boolean z8;
        Type type;
        int i9;
        ParameterizedType parameterizedType;
        Type type2;
        WildcardType wildcardType;
        Type[] lowerBounds;
        int i10 = this.f15896d;
        u6.k kVar = u6.k.f15369f;
        Type type3 = null;
        int i11 = 0;
        r3 = false;
        boolean z9 = false;
        int i12 = 1;
        AbstractC1731s abstractC1731s = this.f15897e;
        switch (i10) {
            case 0:
                return y0.d(abstractC1731s.o());
            case 1:
                InterfaceC0002c o7 = abstractC1731s.o();
                ArrayList arrayList = new ArrayList();
                if (!abstractC1731s.t()) {
                    F6.w g8 = y0.g(o7);
                    if (g8 != null) {
                        arrayList.add(new W(abstractC1731s, 0, u6.k.f15367d, new C1730q(g8, 0)));
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    F6.w M8 = o7.M();
                    if (M8 != null) {
                        arrayList.add(new W(abstractC1731s, i4, u6.k.f15368e, new C1730q(M8, 1)));
                        i4++;
                    }
                } else {
                    i4 = 0;
                }
                int size = o7.z0().size();
                while (i11 < size) {
                    arrayList.add(new W(abstractC1731s, i4, kVar, new r(o7, i11)));
                    i11++;
                    i4++;
                }
                if (abstractC1731s.s() && (o7 instanceof R6.a) && arrayList.size() > 1) {
                    a6.p.e0(arrayList, new C1719f(i12));
                }
                arrayList.trimToSize();
                return arrayList;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC1759v r8 = abstractC1731s.o().r();
                o6.j.b(r8);
                return new o0(r8, new C1729p(abstractC1731s, 6));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                List<C6.T> typeParameters = abstractC1731s.o().getTypeParameters();
                o6.j.d(typeParameters, "getTypeParameters(...)");
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(typeParameters, 10));
                for (C6.T t8 : typeParameters) {
                    o6.j.b(t8);
                    arrayList2.add(new p0(abstractC1731s, t8));
                }
                return arrayList2;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                List r9 = abstractC1731s.r();
                int size2 = (abstractC1731s.p() ? 1 : 0) + r9.size();
                ?? r52 = abstractC1731s.f15908e;
                if (((Boolean) r52.getValue()).booleanValue()) {
                    Iterator it = r9.iterator();
                    i8 = 0;
                    while (it.hasNext()) {
                        W w8 = (W) ((u6.l) it.next());
                        if (w8.f15827c == kVar) {
                            if (((Boolean) r52.getValue()).booleanValue()) {
                                if (y0.h(w8.c())) {
                                    ArrayList r10 = AbstractC0842e.r(AbstractC1741c.b(w8.c().f15892a));
                                    o6.j.b(r10);
                                    i9 = r10.size();
                                } else {
                                    i9 = 1;
                                }
                            } else {
                                throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
                            }
                        } else {
                            i9 = 0;
                        }
                        i8 += i9;
                    }
                } else if (r9.isEmpty()) {
                    i8 = 0;
                } else {
                    Iterator it2 = r9.iterator();
                    i8 = 0;
                    while (it2.hasNext()) {
                        if (((W) ((u6.l) it2.next())).f15827c == kVar && (i8 = i8 + 1) < 0) {
                            AbstractC0437l.b0();
                            throw null;
                        }
                    }
                }
                int i13 = (i8 + 31) / 32;
                Object[] objArr = new Object[size2 + i13 + 1];
                Iterator it3 = r9.iterator();
                while (it3.hasNext()) {
                    W w9 = (W) ((u6.l) it3.next());
                    C6.K a3 = w9.a();
                    int i14 = w9.f15826b;
                    if (a3 instanceof F6.U) {
                        u8 = (F6.U) a3;
                    } else {
                        u8 = null;
                    }
                    if (u8 != null) {
                        z8 = AbstractC1098d.a(u8);
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        o0 c6 = w9.c();
                        C0723c c0723c = y0.f15935a;
                        AbstractC1759v abstractC1759v = c6.f15892a;
                        if (abstractC1759v == null || !AbstractC0892g.c(abstractC1759v)) {
                            o0 c9 = w9.c();
                            s0 s0Var = c9.f15893b;
                            if (s0Var != null) {
                                type = (Type) s0Var.a();
                            } else {
                                type = null;
                            }
                            if (type == null) {
                                if (s0Var != null) {
                                    type = (Type) s0Var.a();
                                } else {
                                    type = null;
                                }
                                if (type == null) {
                                    type = AbstractC1638C.l(c9, false);
                                }
                            }
                            objArr[i14] = y0.e(type);
                        }
                    }
                    C6.K a4 = w9.a();
                    if ((a4 instanceof F6.U) && ((F6.U) a4).f1514n != null) {
                        Class k = h2.a.k(AbstractC0842e.p(w9.c()));
                        if (k.isArray()) {
                            Object newInstance = Array.newInstance(k.getComponentType(), 0);
                            o6.j.d(newInstance, "run(...)");
                            objArr[i14] = newInstance;
                        } else {
                            throw new C0165x("Cannot instantiate the default empty array of type " + k.getSimpleName() + ", because it is not an array type");
                        }
                    }
                }
                for (int i15 = 0; i15 < i13; i15++) {
                    objArr[size2 + i15] = 0;
                }
                return objArr;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                List r11 = abstractC1731s.r();
                if (!r11.isEmpty()) {
                    Iterator it4 = r11.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (y0.h(((W) ((u6.l) it4.next())).c())) {
                                z9 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z9);
            default:
                if (abstractC1731s.p()) {
                    Object y02 = AbstractC0436k.y0(abstractC1731s.h().a());
                    if (y02 instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) y02;
                    } else {
                        parameterizedType = null;
                    }
                    if (parameterizedType != null) {
                        type2 = parameterizedType.getRawType();
                    } else {
                        type2 = null;
                    }
                    if (o6.j.a(type2, InterfaceC0617c.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        o6.j.d(actualTypeArguments, "getActualTypeArguments(...)");
                        Object d12 = AbstractC0434i.d1(actualTypeArguments);
                        if (d12 instanceof WildcardType) {
                            wildcardType = (WildcardType) d12;
                        } else {
                            wildcardType = null;
                        }
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type3 = (Type) AbstractC0434i.W0(lowerBounds);
                        }
                    }
                }
                if (type3 == null) {
                    return abstractC1731s.h().r();
                }
                return type3;
        }
    }
}
