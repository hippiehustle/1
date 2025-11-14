package u7;

import C6.C0014o;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0010k;
import C6.M;
import C6.N;
import C6.O;
import C6.P;
import C6.U;
import F6.AbstractC0042b;
import F6.B;
import F6.C0050j;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.x;
import a7.C;
import a7.C0450k;
import a7.C0460v;
import a7.EnumC0449j;
import a7.T;
import a7.Z;
import a7.g0;
import a7.h0;
import c7.AbstractC0582a;
import c7.AbstractC0586e;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0725e;
import g0.b0;
import h7.AbstractC0842e;
import i.AbstractC0862a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m7.AbstractC1098d;
import o.p1;
import p7.AbstractC1334p;
import p7.C1332n;
import p7.C1337s;
import p7.InterfaceC1333o;
import q4.X;
import q7.C1420a;
import s7.C1518i;
import s7.C1519j;
import s7.w;
import w7.AbstractC1759v;
import w7.J;
import w7.z;
import x7.C1824f;

/* renamed from: u7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1655h extends AbstractC0042b implements InterfaceC0010k {

    /* renamed from: h, reason: collision with root package name */
    public final C0450k f15399h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0582a f15400i;
    public final O j;
    public final C0722b k;

    /* renamed from: l, reason: collision with root package name */
    public final EnumC0023y f15401l;

    /* renamed from: m, reason: collision with root package name */
    public final C0014o f15402m;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC0005f f15403n;

    /* renamed from: o, reason: collision with root package name */
    public final F3.m f15404o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1334p f15405p;

    /* renamed from: q, reason: collision with root package name */
    public final T6.h f15406q;

    /* renamed from: r, reason: collision with root package name */
    public final N f15407r;

    /* renamed from: s, reason: collision with root package name */
    public final b0 f15408s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC0010k f15409t;

    /* renamed from: u, reason: collision with root package name */
    public final v7.h f15410u;

    /* renamed from: v, reason: collision with root package name */
    public final v7.i f15411v;

    /* renamed from: w, reason: collision with root package name */
    public final v7.h f15412w;

    /* renamed from: x, reason: collision with root package name */
    public final s7.t f15413x;

    /* renamed from: y, reason: collision with root package name */
    public final D6.j f15414y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r1v17, types: [g0.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [v7.i, v7.h] */
    public C1655h(F3.m mVar, C0450k c0450k, InterfaceC0588g interfaceC0588g, AbstractC0582a abstractC0582a, O o7) {
        super(((C1518i) mVar.f1371d).f14573a, AbstractC0842e.m(interfaceC0588g, c0450k.f8160h).f());
        int i4;
        EnumC0005f enumC0005f;
        AbstractC1334p abstractC1334p;
        b0 b0Var;
        C1655h c1655h;
        s7.t tVar;
        C0450k c0450k2;
        InterfaceC0588g interfaceC0588g2;
        B b4;
        O o8;
        D6.j uVar;
        boolean z8;
        o6.j.e(mVar, "outerContext");
        o6.j.e(c0450k, "classProto");
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(o7, "sourceElement");
        this.f15399h = c0450k;
        this.f15400i = abstractC0582a;
        this.j = o7;
        this.k = AbstractC0842e.m(interfaceC0588g, c0450k.f8160h);
        this.f15401l = C1519j.e((C) AbstractC0586e.f9701e.c(c0450k.f8159g));
        this.f15402m = h7.u.c((h0) AbstractC0586e.f9700d.c(c0450k.f8159g));
        EnumC0449j enumC0449j = (EnumC0449j) AbstractC0586e.f9702f.c(c0450k.f8159g);
        if (enumC0449j == null) {
            i4 = -1;
        } else {
            i4 = w.f14632b[enumC0449j.ordinal()];
        }
        EnumC0005f enumC0005f2 = EnumC0005f.f743f;
        EnumC0005f enumC0005f3 = EnumC0005f.f741d;
        switch (i4) {
            case 1:
            default:
                enumC0005f = enumC0005f3;
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                enumC0005f3 = EnumC0005f.f742e;
                enumC0005f = enumC0005f3;
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                enumC0005f = enumC0005f2;
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                enumC0005f3 = EnumC0005f.f744g;
                enumC0005f = enumC0005f3;
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                enumC0005f3 = EnumC0005f.f745h;
                enumC0005f = enumC0005f3;
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                enumC0005f3 = EnumC0005f.f746i;
                enumC0005f = enumC0005f3;
                break;
        }
        this.f15403n = enumC0005f;
        List list = c0450k.j;
        o6.j.d(list, "getTypeParameterList(...)");
        Z z9 = c0450k.f8152I;
        o6.j.d(z9, "getTypeTable(...)");
        B b9 = new B(z9);
        C0590i c0590i = C0590i.f9728b;
        g0 g0Var = c0450k.K;
        o6.j.d(g0Var, "getVersionRequirementTable(...)");
        F3.m a3 = mVar.a(this, list, interfaceC0588g, b9, X.r(g0Var), abstractC0582a);
        C1518i c1518i = (C1518i) a3.f1371d;
        this.f15404o = a3;
        boolean booleanValue = AbstractC0586e.f9707m.c(c0450k.f8159g).booleanValue();
        int i8 = 0;
        if (enumC0005f == enumC0005f2) {
            if (!booleanValue && !o6.j.a(c1518i.f14589s.b(), Boolean.TRUE)) {
                z8 = false;
            } else {
                z8 = true;
            }
            abstractC1334p = new C1337s(c1518i.f14573a, this, z8);
        } else {
            abstractC1334p = C1332n.f13842b;
        }
        this.f15405p = abstractC1334p;
        this.f15406q = new T6.h(this);
        P p8 = N.f721d;
        v7.k kVar = c1518i.f14573a;
        v7.k kVar2 = c1518i.f14573a;
        ((x7.l) c1518i.f14587q).getClass();
        u4.d dVar = new u4.d(1, this, C1654g.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, 0, 1);
        p8.getClass();
        o6.j.e(kVar, "storageManager");
        this.f15407r = new N(this, kVar, dVar);
        if (enumC0005f == enumC0005f2) {
            ?? obj = new Object();
            obj.f10990g = this;
            List list2 = this.f15399h.f8173w;
            o6.j.d(list2, "getEnumEntryList(...)");
            int N02 = x.N0(AbstractC0438m.d0(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(N02 < 16 ? 16 : N02);
            for (Object obj2 : list2) {
                linkedHashMap.put(AbstractC0842e.t((InterfaceC0588g) this.f15404o.f1372e, ((C0460v) obj2).f8234g), obj2);
            }
            obj.f10987d = linkedHashMap;
            C1655h c1655h2 = (C1655h) obj.f10990g;
            obj.f10988e = ((C1518i) c1655h2.f15404o.f1371d).f14573a.c(new T6.l(obj, 6, c1655h2));
            v7.k kVar3 = ((C1518i) ((C1655h) obj.f10990g).f15404o.f1371d).f14573a;
            B6.j jVar = new B6.j(17, obj);
            kVar3.getClass();
            obj.f10989f = new v7.h(kVar3, jVar);
            b0Var = obj;
        } else {
            b0Var = null;
        }
        this.f15408s = b0Var;
        InterfaceC0010k interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
        this.f15409t = interfaceC0010k;
        C1651d c1651d = new C1651d(this, i8);
        kVar2.getClass();
        this.f15410u = new v7.h(kVar2, c1651d);
        this.f15411v = new v7.h(kVar2, new C1651d(this, 1));
        new v7.h(kVar2, new C1651d(this, 2));
        kVar2.a(new C1651d(this, 3));
        this.f15412w = new v7.h(kVar2, new C1651d(this, 4));
        InterfaceC0588g interfaceC0588g3 = (InterfaceC0588g) a3.f1372e;
        B b10 = (B) a3.f1374g;
        if (interfaceC0010k instanceof C1655h) {
            c1655h = (C1655h) interfaceC0010k;
        } else {
            c1655h = null;
        }
        if (c1655h != null) {
            tVar = c1655h.f15413x;
            interfaceC0588g2 = interfaceC0588g3;
            b4 = b10;
            o8 = o7;
            c0450k2 = c0450k;
        } else {
            tVar = null;
            c0450k2 = c0450k;
            interfaceC0588g2 = interfaceC0588g3;
            b4 = b10;
            o8 = o7;
        }
        this.f15413x = new s7.t(c0450k2, interfaceC0588g2, b4, o8, tVar);
        if (!AbstractC0586e.f9699c.c(c0450k2.f8159g).booleanValue()) {
            uVar = D6.i.f1043a;
        } else {
            uVar = new u(kVar2, new C1651d(this, 5));
        }
        this.f15414y = uVar;
    }

    @Override // C6.InterfaceC0007h
    public final J B() {
        return this.f15406q;
    }

    @Override // F6.A
    public final InterfaceC1333o C(C1824f c1824f) {
        N n3 = this.f15407r;
        AbstractC1098d.j(n3.f723a);
        return (InterfaceC1333o) AbstractC0862a.j(n3.f725c, N.f722e[0]);
    }

    @Override // C6.InterfaceC0004e
    public final boolean D0() {
        return AbstractC0586e.f9704h.c(this.f15399h.f8159g).booleanValue();
    }

    @Override // C6.InterfaceC0004e
    public final boolean E() {
        if (AbstractC0586e.f9702f.c(this.f15399h.f8159g) == EnumC0449j.COMPANION_OBJECT) {
            return true;
        }
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final Collection G() {
        return (Collection) this.f15411v.a();
    }

    @Override // C6.InterfaceC0004e
    public final boolean N() {
        return AbstractC0586e.f9706l.c(this.f15399h.f8159g).booleanValue();
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return AbstractC0586e.j.c(this.f15399h.f8159g).booleanValue();
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x, C6.InterfaceC0013n
    public final C0014o d() {
        return this.f15402m;
    }

    @Override // C6.InterfaceC0008i
    public final boolean d0() {
        return AbstractC0586e.f9703g.c(this.f15399h.f8159g).booleanValue();
    }

    @Override // C6.InterfaceC0004e
    public final EnumC0005f e() {
        return this.f15403n;
    }

    @Override // C6.InterfaceC0004e
    public final boolean g() {
        if (AbstractC0586e.k.c(this.f15399h.f8159g).booleanValue()) {
            AbstractC0582a abstractC0582a = this.f15400i;
            int i4 = abstractC0582a.f9675b;
            if (i4 >= 1) {
                if (i4 <= 1) {
                    int i8 = abstractC0582a.f9676c;
                    if (i8 >= 4 && (i8 > 4 || abstractC0582a.f9677d > 1)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        return this.f15414y;
    }

    @Override // C6.InterfaceC0011l
    public final O h() {
        return this.j;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x
    public final EnumC0023y j() {
        return this.f15401l;
    }

    @Override // C6.InterfaceC0004e
    public final U l0() {
        return (U) this.f15412w.a();
    }

    @Override // C6.InterfaceC0004e
    public final boolean m() {
        if (AbstractC0586e.k.c(this.f15399h.f8159g).booleanValue() && this.f15400i.a(1, 4, 2)) {
            return true;
        }
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final C0050j n0() {
        return (C0050j) this.f15410u.a();
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o o0() {
        return this.f15405p;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        return this.f15409t;
    }

    public final C1654g r0() {
        ((x7.l) ((C1518i) this.f15404o.f1371d).f14587q).getClass();
        N n3 = this.f15407r;
        AbstractC1098d.j(n3.f723a);
        return (C1654g) ((InterfaceC1333o) AbstractC0862a.j(n3.f725c, N.f722e[0]));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    @Override // C6.InterfaceC0004e, C6.InterfaceC0008i
    public final List t() {
        return AbstractC0436k.Q0(((p1) this.f15404o.k).k.values());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("deserialized ");
        if (c0()) {
            str = "expect ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }

    @Override // F6.AbstractC0042b, C6.InterfaceC0004e
    public final List x0() {
        F3.m mVar = this.f15404o;
        List p8 = AbstractC0405a.p(this.f15399h, (B) mVar.f1374g);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(p8, 10));
        Iterator it = p8.iterator();
        while (it.hasNext()) {
            arrayList.add(new F6.w(F0(), new C1420a(this, ((p1) mVar.k).i((T) it.next()), (C0725e) null), D6.i.f1043a));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z y0(C0725e c0725e) {
        Iterator it = r0().f(c0725e, K6.b.j).iterator();
        AbstractC1759v abstractC1759v = null;
        boolean z8 = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((M) next).M() == null) {
                    if (z8) {
                        break;
                    }
                    z8 = true;
                    obj = next;
                }
            }
        }
        M m6 = (M) obj;
        if (m6 != null) {
            abstractC1759v = m6.b();
        }
        return (z) abstractC1759v;
    }

    @Override // C6.InterfaceC0022x
    public final boolean z() {
        return AbstractC0586e.f9705i.c(this.f15399h.f8159g).booleanValue();
    }
}
