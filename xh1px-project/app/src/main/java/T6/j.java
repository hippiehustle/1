package T6;

import C6.C0014o;
import C6.InterfaceC0004e;
import C6.T;
import F6.C0050j;
import F6.U;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1162a;
import n7.C1168a;
import n7.InterfaceC1172e;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import w7.AbstractC1759v;
import w7.S;

/* loaded from: classes.dex */
public final class j implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5852d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final A4.a f5853e;

    /* renamed from: f, reason: collision with root package name */
    public final o f5854f;

    public j(A4.a aVar, o oVar) {
        this.f5853e = aVar;
        this.f5854f = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [T6.o] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T6.o] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [R6.b] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [F6.v, F6.j, R6.b] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        o oVar;
        ?? r42;
        ?? r32;
        Object obj;
        ArrayList arrayList;
        ?? r22;
        int i4;
        Z5.j jVar;
        List d2;
        switch (this.f5852d) {
            case 0:
                o oVar2 = this.f5854f;
                I6.o oVar3 = oVar2.f5870o;
                A4.a aVar = oVar2.f5793b;
                InterfaceC0004e interfaceC0004e = oVar2.f5869n;
                Constructor<?>[] declaredConstructors = oVar3.f2208a.getDeclaredConstructors();
                o6.j.d(declaredConstructors, "getDeclaredConstructors(...)");
                boolean z8 = false;
                List<I6.r> Y = H7.m.Y(H7.m.W(new H7.g(AbstractC0434i.L0(declaredConstructors), false, I6.j.f2203l), I6.k.f2204l));
                ArrayList arrayList2 = new ArrayList(Y.size());
                for (I6.r rVar : Y) {
                    S6.c H2 = AbstractC1492c.H(aVar, rVar);
                    S6.a aVar2 = (S6.a) aVar.f280e;
                    R6.b d12 = R6.b.d1(interfaceC0004e, H2, z8, aVar2.j.b(rVar));
                    A4.a aVar3 = new A4.a(aVar2, new S6.e(aVar, d12, rVar, interfaceC0004e.t().size()), (Z5.g) aVar.f282g);
                    Constructor constructor = rVar.f2212a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    o6.j.b(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        d2 = a6.s.f7766d;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) AbstractC0434i.T0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length >= genericParameterTypes.length) {
                            if (parameterAnnotations.length > genericParameterTypes.length) {
                                parameterAnnotations = (Annotation[][]) AbstractC0434i.T0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                            }
                            d2 = rVar.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                        } else {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                    }
                    N.f u8 = A.u(aVar3, d12, d2);
                    List t8 = interfaceC0004e.t();
                    o6.j.d(t8, "getDeclaredTypeParameters(...)");
                    ArrayList typeParameters = rVar.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        T a3 = ((S6.f) aVar3.f281f).a((I6.C) it.next());
                        o6.j.b(a3);
                        arrayList3.add(a3);
                    }
                    d12.b1((List) u8.f3525f, AbstractC1638C.N(rVar.e()), AbstractC0436k.C0(t8, arrayList3));
                    d12.U0(false);
                    d12.V0(u8.f3524e);
                    d12.W0(interfaceC0004e.l());
                    ((S6.a) aVar3.f280e).f5404g.getClass();
                    arrayList2.add(d12);
                    z8 = false;
                }
                boolean g8 = oVar3.g();
                Class cls = oVar3.f2208a;
                S s8 = S.f15974e;
                A4.a aVar4 = this.f5853e;
                D6.h hVar = D6.i.f1043a;
                if (g8) {
                    R6.b d13 = R6.b.d1(interfaceC0004e, hVar, true, ((S6.a) aVar.f280e).j.b(oVar3));
                    ArrayList f8 = oVar3.f();
                    ArrayList arrayList4 = new ArrayList(f8.size());
                    oVar = oVar2;
                    U6.a D02 = AbstractC0405a.D0(s8, false, null, 6);
                    int i8 = 0;
                    for (Iterator it2 = f8.iterator(); it2.hasNext(); it2 = it2) {
                        I6.A a4 = (I6.A) it2.next();
                        arrayList4.add(new U(d13, null, i8, hVar, a4.c(), ((R.g) aVar.f283h).R(a4.f(), D02), false, false, false, null, ((S6.a) aVar.f280e).j.b(a4)));
                        i8++;
                    }
                    d13.V0(false);
                    C0014o d3 = interfaceC0004e.d();
                    o6.j.d(d3, "getVisibility(...)");
                    if (d3.equals(P6.o.f4575b)) {
                        d3 = P6.o.f4576c;
                        o6.j.d(d3, "PROTECTED_AND_PACKAGE");
                    }
                    d13.a1(arrayList4, d3);
                    d13.U0(false);
                    d13.W0(interfaceC0004e.l());
                    String e9 = D2.f.e(d13, 2);
                    if (!arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            if (o6.j.a(D2.f.e((C0050j) it3.next(), 2), e9)) {
                            }
                        }
                    }
                    arrayList2.add(d13);
                    ((S6.a) aVar4.f280e).f5404g.getClass();
                } else {
                    oVar = oVar2;
                }
                ((C1168a) ((S6.a) aVar4.f280e).f5419x).getClass();
                o6.j.e(interfaceC0004e, "thisDescriptor");
                o6.j.e(aVar4, "c");
                X6.d dVar = ((S6.a) aVar4.f280e).f5413r;
                boolean isEmpty = arrayList2.isEmpty();
                Collection collection = arrayList2;
                if (isEmpty) {
                    boolean isAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (!isAnnotation) {
                        obj = null;
                    } else {
                        S6.a aVar5 = (S6.a) aVar.f280e;
                        R.g gVar = (R.g) aVar.f283h;
                        R6.b d14 = R6.b.d1(interfaceC0004e, hVar, true, aVar5.j.b(oVar3));
                        if (isAnnotation) {
                            List d9 = oVar3.d();
                            r32 = new ArrayList(d9.size());
                            U6.a D03 = AbstractC0405a.D0(s8, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj2 : d9) {
                                if (o6.j.a(((I6.x) obj2).c(), P6.w.f4598b)) {
                                    arrayList5.add(obj2);
                                } else {
                                    arrayList6.add(obj2);
                                }
                            }
                            arrayList5.size();
                            I6.x xVar = (I6.x) AbstractC0436k.r0(arrayList5);
                            if (xVar != null) {
                                I6.B f9 = xVar.f();
                                if (f9 instanceof I6.i) {
                                    I6.i iVar = (I6.i) f9;
                                    jVar = new Z5.j(gVar.Q(iVar, D03, true), gVar.R(iVar.f2201b, D03));
                                } else {
                                    jVar = new Z5.j(gVar.R(f9, D03), null);
                                }
                                AbstractC1759v abstractC1759v = (AbstractC1759v) jVar.f7485d;
                                AbstractC1759v abstractC1759v2 = (AbstractC1759v) jVar.f7486e;
                                arrayList = arrayList6;
                                R6.b bVar = d14;
                                ?? r23 = oVar;
                                r23.v(r32, bVar, 0, xVar, abstractC1759v, abstractC1759v2);
                                r22 = r23;
                                r42 = bVar;
                            } else {
                                r42 = d14;
                                arrayList = arrayList6;
                                r22 = oVar;
                            }
                            if (xVar != null) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            Iterator it4 = arrayList.iterator();
                            int i9 = 0;
                            while (it4.hasNext()) {
                                I6.x xVar2 = (I6.x) it4.next();
                                r22.v(r32, r42, i9 + i4, xVar2, gVar.R(xVar2.f(), D03), null);
                                i9++;
                            }
                        } else {
                            r42 = d14;
                            r32 = Collections.EMPTY_LIST;
                        }
                        r42.V0(false);
                        C0014o d10 = interfaceC0004e.d();
                        o6.j.d(d10, "getVisibility(...)");
                        if (d10.equals(P6.o.f4575b)) {
                            d10 = P6.o.f4576c;
                            o6.j.d(d10, "PROTECTED_AND_PACKAGE");
                        }
                        r42.a1(r32, d10);
                        r42.U0(true);
                        r42.W0(interfaceC0004e.l());
                        ((S6.a) aVar.f280e).f5404g.getClass();
                        obj = r42;
                    }
                    collection = AbstractC0437l.Y(obj);
                }
                return AbstractC0436k.Q0(dVar.e(aVar4, collection));
            default:
                A4.a aVar6 = this.f5853e;
                InterfaceC1172e interfaceC1172e = ((S6.a) aVar6.f280e).f5419x;
                InterfaceC0004e interfaceC0004e2 = this.f5854f.f5869n;
                ((C1168a) interfaceC1172e).getClass();
                o6.j.e(interfaceC0004e2, "thisDescriptor");
                o6.j.e(aVar6, "c");
                return AbstractC0436k.V0(new ArrayList());
        }
    }

    public j(o oVar, A4.a aVar) {
        this.f5854f = oVar;
        this.f5853e = aVar;
    }
}
