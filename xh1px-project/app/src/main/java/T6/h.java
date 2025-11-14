package T6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.P;
import C6.T;
import F6.AbstractC0042b;
import L6.Q;
import P6.EnumC0278a;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a7.C0450k;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.EnumC0729i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import o.p1;
import s7.C1518i;
import s7.InterfaceC1521l;
import t6.C1586a;
import t6.C1587b;
import u7.C1651d;
import u7.C1655h;
import w7.AbstractC1740b;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.G;
import w7.J;
import w7.S;
import w7.X;

/* loaded from: classes.dex */
public final class h extends AbstractC1740b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5835c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final v7.i f5836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0042b f5837e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r4v1, types: [v7.i, v7.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(i iVar) {
        super(((S6.a) r0.f280e).f5398a);
        this.f5837e = iVar;
        A4.a aVar = iVar.f5839m;
        v7.n nVar = ((S6.a) aVar.f280e).f5398a;
        g gVar = new g(iVar, 2);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        this.f5836d = new v7.h(kVar, gVar);
    }

    @Override // w7.J
    public final boolean a() {
        switch (this.f5835c) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // w7.AbstractC1740b, w7.J
    public final InterfaceC0007h c() {
        switch (this.f5835c) {
            case 0:
                return (i) this.f5837e;
            default:
                return (C1655h) this.f5837e;
        }
    }

    @Override // w7.J
    public final List e() {
        switch (this.f5835c) {
            case 0:
                return (List) this.f5836d.a();
            default:
                return (List) this.f5836d.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01cc, code lost:
    
        if (r6 == null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0322  */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Collection] */
    @Override // w7.AbstractC1744f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection f() {
        ?? arrayList;
        k7.w wVar;
        String str;
        C0723c c0723c;
        C0723c c0723c2;
        InterfaceC0004e interfaceC0004e;
        ArrayList arrayList2;
        w7.z s8;
        InterfaceC0004e interfaceC0004e2;
        AbstractC1759v abstractC1759v;
        J j;
        String b4;
        C0723c a3;
        C6.E e9;
        int i4 = this.f5835c;
        AbstractC0042b abstractC0042b = this.f5837e;
        switch (i4) {
            case 0:
                i iVar = (i) abstractC0042b;
                A4.a aVar = iVar.f5839m;
                Class cls = iVar.k.f2208a;
                Type type = Object.class;
                boolean a4 = o6.j.a(cls, type);
                a6.s sVar = a6.s.f7766d;
                if (a4) {
                    arrayList = sVar;
                } else {
                    Q q6 = new Q(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        type = genericSuperclass;
                    }
                    q6.a(type);
                    q6.b(cls.getGenericInterfaces());
                    ArrayList arrayList3 = q6.f3079a;
                    List X8 = AbstractC0437l.X(arrayList3.toArray(new Type[arrayList3.size()]));
                    arrayList = new ArrayList(AbstractC0438m.d0(X8, 10));
                    Iterator it = X8.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new I6.q((Type) it.next()));
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                ArrayList arrayList5 = new ArrayList(0);
                S6.c cVar = iVar.f5850x;
                C0723c c0723c3 = P6.w.f4608n;
                o6.j.d(c0723c3, "PURELY_IMPLEMENTS_ANNOTATION");
                D6.c e10 = cVar.e(c0723c3);
                if (e10 != null) {
                    Object H02 = AbstractC0436k.H0(e10.c().values());
                    if (H02 instanceof k7.w) {
                        wVar = (k7.w) H02;
                    } else {
                        wVar = null;
                    }
                    if (wVar != null && (str = (String) wVar.f12144a) != null) {
                        EnumC0729i enumC0729i = EnumC0729i.f10840d;
                        int i8 = 0;
                        while (true) {
                            int length = str.length();
                            EnumC0729i enumC0729i2 = EnumC0729i.f10842f;
                            if (i8 < length) {
                                char charAt = str.charAt(i8);
                                int ordinal = enumC0729i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        if (charAt != '.') {
                                            if (Character.isJavaIdentifierPart(charAt)) {
                                                i8++;
                                            }
                                        }
                                        enumC0729i = enumC0729i2;
                                        i8++;
                                    }
                                }
                                if (Character.isJavaIdentifierStart(charAt)) {
                                    enumC0729i2 = EnumC0729i.f10841e;
                                    enumC0729i = enumC0729i2;
                                    i8++;
                                }
                            } else if (enumC0729i != enumC0729i2) {
                                c0723c = new C0723c(str);
                            }
                        }
                    }
                }
                c0723c = null;
                if (c0723c == null || c0723c.f10797a.c() || !c0723c.c(z6.n.j)) {
                    c0723c = null;
                }
                X x8 = X.INVARIANT;
                if (c0723c == null) {
                    LinkedHashMap linkedHashMap = P6.j.f4565a;
                    c0723c2 = (C0723c) P6.j.f4566b.get(AbstractC1098d.g(iVar));
                    break;
                } else {
                    c0723c2 = c0723c;
                }
                C6.A a9 = ((S6.a) aVar.f280e).f5410o;
                int i9 = AbstractC1098d.f12556a;
                o6.j.e(a9, "<this>");
                C0724d c0724d = c0723c2.f10797a;
                c0724d.c();
                InterfaceC0007h d2 = ((F6.y) a9.U(c0723c2.b())).k.d(c0724d.f(), K6.b.k);
                if (d2 instanceof InterfaceC0004e) {
                    interfaceC0004e = (InterfaceC0004e) d2;
                } else {
                    interfaceC0004e = null;
                }
                if (interfaceC0004e != null) {
                    int size = interfaceC0004e.B().e().size();
                    List e11 = iVar.f5845s.e();
                    o6.j.d(e11, "getParameters(...)");
                    int size2 = e11.size();
                    if (size2 == size) {
                        arrayList2 = new ArrayList(AbstractC0438m.d0(e11, 10));
                        Iterator it2 = e11.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new w7.E(((T) it2.next()).l(), x8));
                        }
                    } else if (size2 == 1 && size > 1 && c0723c == null) {
                        w7.E e12 = new w7.E(((T) AbstractC0436k.G0(e11)).l(), x8);
                        C1586a c1586a = new C1586a(1, size, 1);
                        ArrayList arrayList6 = new ArrayList(AbstractC0438m.d0(c1586a, 10));
                        Iterator it3 = c1586a.iterator();
                        while (((C1587b) it3).f15128f) {
                            ((a6.w) it3).nextInt();
                            arrayList6.add(e12);
                        }
                        arrayList2 = arrayList6;
                    }
                    G.f15953e.getClass();
                    s8 = AbstractC1741c.s(G.f15954f, interfaceC0004e, arrayList2);
                    for (I6.q qVar : arrayList) {
                        AbstractC1759v R5 = ((R.g) aVar.f283h).R(qVar, AbstractC0405a.D0(S.f15973d, false, null, 7));
                        X6.d dVar = ((S6.a) aVar.f280e).f5413r;
                        dVar.getClass();
                        X x9 = x8;
                        AbstractC1759v b9 = dVar.b(new X6.r(null, false, aVar, EnumC0278a.f4546h, true), R5, sVar, null, false);
                        if (b9 == null) {
                            b9 = R5;
                        }
                        if (b9.B0().c() instanceof C6.E) {
                            arrayList5.add(qVar);
                        }
                        J B02 = b9.B0();
                        if (s8 != null) {
                            j = s8.B0();
                        } else {
                            j = null;
                        }
                        if (!o6.j.a(B02, j) && !z6.h.y(b9)) {
                            arrayList4.add(b9);
                        }
                        x8 = x9;
                    }
                    X x10 = x8;
                    interfaceC0004e2 = iVar.f5838l;
                    if (interfaceC0004e2 == null) {
                        abstractC1759v = new w7.Q(E2.d.j(interfaceC0004e2, iVar)).i(interfaceC0004e2.l(), x10);
                    } else {
                        abstractC1759v = null;
                    }
                    F7.l.a(arrayList4, abstractC1759v);
                    F7.l.a(arrayList4, s8);
                    if (!arrayList5.isEmpty()) {
                        InterfaceC1521l interfaceC1521l = ((S6.a) aVar.f280e).f5403f;
                        ArrayList arrayList7 = new ArrayList(AbstractC0438m.d0(arrayList5, 10));
                        Iterator it4 = arrayList5.iterator();
                        while (it4.hasNext()) {
                            W6.d dVar2 = (W6.d) it4.next();
                            o6.j.c(dVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                            arrayList7.add(((I6.q) dVar2).f2210a.toString());
                        }
                        interfaceC1521l.c(iVar, arrayList7);
                    }
                    if (arrayList4.isEmpty()) {
                        return AbstractC0436k.Q0(arrayList4);
                    }
                    return E2.d.y(((S6.a) aVar.f280e).f5410o.o().e());
                }
                s8 = null;
                while (r18.hasNext()) {
                }
                X x102 = x8;
                interfaceC0004e2 = iVar.f5838l;
                if (interfaceC0004e2 == null) {
                }
                F7.l.a(arrayList4, abstractC1759v);
                F7.l.a(arrayList4, s8);
                if (!arrayList5.isEmpty()) {
                }
                if (arrayList4.isEmpty()) {
                }
                break;
            default:
                C1655h c1655h = (C1655h) abstractC0042b;
                C0450k c0450k = c1655h.f15399h;
                F3.m mVar = c1655h.f15404o;
                List B03 = AbstractC0405a.B0(c0450k, (F6.B) mVar.f1374g);
                ArrayList arrayList8 = new ArrayList(AbstractC0438m.d0(B03, 10));
                Iterator it5 = B03.iterator();
                while (it5.hasNext()) {
                    arrayList8.add(((p1) mVar.k).i((a7.T) it5.next()));
                }
                ArrayList C02 = AbstractC0436k.C0(arrayList8, ((C1518i) mVar.f1371d).f14584n.d(c1655h));
                ArrayList arrayList9 = new ArrayList();
                Iterator it6 = C02.iterator();
                while (it6.hasNext()) {
                    InterfaceC0007h c6 = ((AbstractC1759v) it6.next()).B0().c();
                    if (c6 instanceof C6.E) {
                        e9 = (C6.E) c6;
                    } else {
                        e9 = null;
                    }
                    if (e9 != null) {
                        arrayList9.add(e9);
                    }
                }
                if (!arrayList9.isEmpty()) {
                    InterfaceC1521l interfaceC1521l2 = ((C1518i) mVar.f1371d).f14580h;
                    ArrayList arrayList10 = new ArrayList(AbstractC0438m.d0(arrayList9, 10));
                    Iterator it7 = arrayList9.iterator();
                    while (it7.hasNext()) {
                        C6.E e13 = (C6.E) it7.next();
                        C0722b f8 = AbstractC1098d.f(e13);
                        if (f8 == null || (a3 = f8.a()) == null || (b4 = a3.f10797a.f10800a) == null) {
                            b4 = e13.getName().b();
                            o6.j.d(b4, "asString(...)");
                        }
                        arrayList10.add(b4);
                    }
                    interfaceC1521l2.c(c1655h, arrayList10);
                }
                return AbstractC0436k.Q0(C02);
        }
    }

    @Override // w7.AbstractC1744f
    public final P h() {
        switch (this.f5835c) {
            case 0:
                return ((S6.a) ((i) this.f5837e).f5839m.f280e).f5408m;
            default:
                return P.f728f;
        }
    }

    @Override // w7.AbstractC1740b
    /* renamed from: m */
    public final InterfaceC0004e c() {
        switch (this.f5835c) {
            case 0:
                return (i) this.f5837e;
            default:
                return (C1655h) this.f5837e;
        }
    }

    public final String toString() {
        switch (this.f5835c) {
            case 0:
                String b4 = ((i) this.f5837e).getName().b();
                o6.j.d(b4, "asString(...)");
                return b4;
            default:
                String str = ((C1655h) this.f5837e).getName().f10804d;
                o6.j.d(str, "toString(...)");
                return str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r4v1, types: [v7.i, v7.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(C1655h c1655h) {
        super(((C1518i) r0.f1371d).f14573a);
        this.f5837e = c1655h;
        F3.m mVar = c1655h.f15404o;
        v7.k kVar = ((C1518i) mVar.f1371d).f14573a;
        C1651d c1651d = new C1651d(c1655h, 6);
        kVar.getClass();
        this.f5836d = new v7.h(kVar, c1651d);
    }
}
