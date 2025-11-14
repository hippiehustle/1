package F6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0000a;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import C6.InterfaceC0018t;
import C6.InterfaceC0019u;
import C6.W;
import a6.AbstractC0436k;
import f7.C0725e;
import i7.AbstractC0898m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q7.C1420a;
import q7.C1421b;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.X;

/* renamed from: F6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0061v extends AbstractC0055o implements InterfaceC0019u {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1580A;

    /* renamed from: B, reason: collision with root package name */
    public Collection f1581B;

    /* renamed from: C, reason: collision with root package name */
    public volatile B6.f f1582C;

    /* renamed from: D, reason: collision with root package name */
    public final InterfaceC0019u f1583D;

    /* renamed from: E, reason: collision with root package name */
    public final int f1584E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC0019u f1585F;

    /* renamed from: G, reason: collision with root package name */
    public Map f1586G;

    /* renamed from: i, reason: collision with root package name */
    public List f1587i;
    public List j;
    public AbstractC1759v k;

    /* renamed from: l, reason: collision with root package name */
    public List f1588l;

    /* renamed from: m, reason: collision with root package name */
    public w f1589m;

    /* renamed from: n, reason: collision with root package name */
    public w f1590n;

    /* renamed from: o, reason: collision with root package name */
    public EnumC0023y f1591o;

    /* renamed from: p, reason: collision with root package name */
    public C0014o f1592p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1593q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1594r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1595s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1596t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1597u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1598v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1599w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1600x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1601y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1602z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0061v(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, C6.O o7, D6.j jVar, C0725e c0725e) {
        super(interfaceC0010k, jVar, c0725e, o7);
        if (interfaceC0010k != null) {
            if (jVar != null) {
                if (c0725e != null) {
                    if (i4 != 0) {
                        if (o7 != null) {
                            this.f1592p = AbstractC0015p.f762i;
                            this.f1593q = false;
                            this.f1594r = false;
                            this.f1595s = false;
                            this.f1596t = false;
                            this.f1597u = false;
                            this.f1598v = false;
                            this.f1599w = false;
                            this.f1600x = false;
                            this.f1601y = false;
                            this.f1602z = true;
                            this.f1580A = false;
                            this.f1581B = null;
                            this.f1582C = null;
                            this.f1585F = null;
                            this.f1586G = null;
                            this.f1583D = interfaceC0019u == null ? this : interfaceC0019u;
                            this.f1584E = i4;
                            return;
                        }
                        G0(4);
                        throw null;
                    }
                    G0(3);
                    throw null;
                }
                G0(2);
                throw null;
            }
            G0(1);
            throw null;
        }
        G0(0);
        throw null;
    }

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i8 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "name";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "kind";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "source";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "typeParameters";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static ArrayList Q0(InterfaceC0019u interfaceC0019u, List list, w7.Q q6, boolean z8, boolean z9, boolean[] zArr) {
        AbstractC1759v i4;
        B6.j jVar;
        U u8;
        C6.O o7;
        W t8;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U u9 = (U) it.next();
                U u10 = u9;
                AbstractC1759v b4 = u10.b();
                X x8 = X.IN_VARIANCE;
                AbstractC1759v i8 = q6.i(b4, x8);
                AbstractC1759v abstractC1759v = u9.f1514n;
                if (abstractC1759v == null) {
                    i4 = null;
                } else {
                    i4 = q6.i(abstractC1759v, x8);
                }
                if (i8 == null) {
                    return null;
                }
                if ((i8 != u10.b() || abstractC1759v != i4) && zArr != null) {
                    zArr[0] = true;
                }
                if (u9 instanceof T) {
                    jVar = new B6.j(6, (List) ((T) u9).f1511p.getValue());
                } else {
                    jVar = null;
                }
                if (z8) {
                    u8 = null;
                } else {
                    u8 = u9;
                }
                int i9 = u9.j;
                D6.j annotations = u9.getAnnotations();
                C0725e name = u9.getName();
                boolean N02 = u9.N0();
                boolean z10 = u9.f1512l;
                boolean z11 = u9.f1513m;
                if (z9) {
                    o7 = u9.h();
                } else {
                    o7 = C6.O.f726a;
                }
                o6.j.e(annotations, "annotations");
                o6.j.e(name, "name");
                o6.j.e(o7, "source");
                if (jVar == null) {
                    t8 = new U(interfaceC0019u, u8, i9, annotations, name, i8, N02, z10, z11, i4, o7);
                } else {
                    t8 = new T(interfaceC0019u, u8, i9, annotations, name, i8, N02, z10, z11, i4, o7, jVar);
                }
                arrayList.add(t8);
            }
            return arrayList;
        }
        G0(30);
        throw null;
    }

    @Override // C6.InterfaceC0001b
    public final w A() {
        return this.f1590n;
    }

    @Override // C6.InterfaceC0019u
    public final boolean A0() {
        if (!this.f1594r) {
            Iterator it = a().s().iterator();
            while (it.hasNext()) {
                if (((InterfaceC0019u) it.next()).A0()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.q(this, obj);
    }

    @Override // C6.InterfaceC0001b
    public Object L(InterfaceC0000a interfaceC0000a) {
        Map map = this.f1586G;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0000a);
    }

    @Override // C6.InterfaceC0001b
    public final w M() {
        return this.f1589m;
    }

    public final InterfaceC0019u M0(InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o) {
        InterfaceC0019u build = s0().l(interfaceC0010k).d(enumC0023y).k(c0014o).i(2).a().build();
        if (build != null) {
            return build;
        }
        G0(26);
        throw null;
    }

    @Override // C6.InterfaceC0002c
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public N x(InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o) {
        return (N) M0(interfaceC0010k, enumC0023y, c0014o);
    }

    public abstract AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, C6.O o7, D6.j jVar, C0725e c0725e);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public AbstractC0061v P0(C0060u c0060u) {
        D6.j annotations;
        C6.O o7;
        ?? r8;
        w wVar;
        AbstractC0061v abstractC0061v;
        ArrayList arrayList;
        w wVar2;
        AbstractC1759v i4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object a3;
        X x8 = X.IN_VARIANCE;
        boolean[] zArr = new boolean[1];
        if (c0060u.f1575v != null) {
            annotations = D2.f.d(getAnnotations(), c0060u.f1575v);
        } else {
            annotations = getAnnotations();
        }
        D6.j jVar = annotations;
        InterfaceC0010k interfaceC0010k = c0060u.f1560e;
        InterfaceC0019u interfaceC0019u = c0060u.f1563h;
        int i8 = c0060u.f1564i;
        C0725e c0725e = c0060u.f1568o;
        if (c0060u.f1571r) {
            if (interfaceC0019u != null) {
                a3 = interfaceC0019u;
            } else {
                a3 = a();
            }
            o7 = ((AbstractC0055o) a3).h();
        } else {
            o7 = C6.O.f726a;
        }
        C6.O o8 = o7;
        if (o8 != null) {
            AbstractC0061v O02 = O0(i8, interfaceC0010k, interfaceC0019u, o8, jVar, c0725e);
            List list = c0060u.f1574u;
            if (list == null) {
                list = getTypeParameters();
            }
            zArr[0] = zArr[0] | (!list.isEmpty());
            ArrayList arrayList2 = new ArrayList(list.size());
            w7.Q A2 = AbstractC1741c.A(list, c0060u.f1559d, O02, arrayList2, zArr);
            if (A2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (!c0060u.k.isEmpty()) {
                    int i9 = 0;
                    for (w wVar3 : c0060u.k) {
                        AbstractC1759v i10 = A2.i(wVar3.b(), x8);
                        if (i10 != null) {
                            int i11 = i9 + 1;
                            arrayList3.add(AbstractC0898m.e(O02, i10, ((C1420a) wVar3.M0()).K0(), wVar3.getAnnotations(), i9));
                            boolean z13 = zArr[0];
                            if (i10 != wVar3.b()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            zArr[0] = z13 | z12;
                            i9 = i11;
                        }
                    }
                }
                w wVar4 = c0060u.f1565l;
                if (wVar4 != null) {
                    AbstractC1759v i12 = A2.i(wVar4.b(), x8);
                    if (i12 != null) {
                        c0060u.f1565l.M0();
                        w wVar5 = new w(O02, new C1421b(O02, i12), c0060u.f1565l.getAnnotations());
                        boolean z14 = zArr[0];
                        if (i12 != c0060u.f1565l.b()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[0] = z11 | z14;
                        r8 = 0;
                        wVar = wVar5;
                    }
                    return null;
                }
                r8 = 0;
                wVar = null;
                w wVar6 = c0060u.f1566m;
                if (wVar6 != null) {
                    w f8 = wVar6.f(A2);
                    if (f8 != null) {
                        boolean z15 = zArr[r8];
                        if (f8 != c0060u.f1566m) {
                            z10 = true;
                        } else {
                            z10 = r8;
                        }
                        zArr[r8] = z15 | z10;
                        abstractC0061v = null;
                        arrayList = arrayList2;
                        wVar2 = f8;
                    }
                    return null;
                }
                abstractC0061v = null;
                arrayList = arrayList2;
                wVar2 = null;
                ArrayList Q02 = Q0(O02, c0060u.j, A2, c0060u.f1572s, c0060u.f1571r, zArr);
                if (Q02 == null || (i4 = A2.i(c0060u.f1567n, X.OUT_VARIANCE)) == null) {
                    return abstractC0061v;
                }
                boolean z16 = zArr[r8];
                if (i4 != c0060u.f1567n) {
                    z8 = true;
                } else {
                    z8 = r8;
                }
                boolean z17 = z16 | z8;
                zArr[r8] = z17;
                if (!z17 && c0060u.f1579z) {
                    return this;
                }
                O02.R0(wVar, wVar2, arrayList3, arrayList, Q02, i4, c0060u.f1561f, c0060u.f1562g);
                O02.f1593q = this.f1593q;
                O02.f1594r = this.f1594r;
                O02.f1595s = this.f1595s;
                O02.f1596t = this.f1596t;
                O02.f1597u = this.f1597u;
                O02.f1601y = this.f1601y;
                O02.f1598v = this.f1598v;
                O02.U0(this.f1602z);
                O02.f1599w = c0060u.f1573t;
                O02.f1600x = c0060u.f1576w;
                Boolean bool = c0060u.f1578y;
                if (bool != null) {
                    z9 = bool.booleanValue();
                } else {
                    z9 = this.f1580A;
                }
                O02.V0(z9);
                if (!c0060u.f1577x.isEmpty() || this.f1586G != null) {
                    LinkedHashMap linkedHashMap = c0060u.f1577x;
                    Map map = this.f1586G;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!linkedHashMap.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (linkedHashMap.size() == 1) {
                        O02.f1586G = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    } else {
                        O02.f1586G = linkedHashMap;
                    }
                }
                if (c0060u.f1570q || this.f1585F != null) {
                    InterfaceC0019u interfaceC0019u2 = this.f1585F;
                    if (interfaceC0019u2 == null) {
                        interfaceC0019u2 = this;
                    }
                    O02.f1585F = interfaceC0019u2.f(A2);
                }
                if (c0060u.f1569p && !a().s().isEmpty()) {
                    if (c0060u.f1559d.e()) {
                        B6.f fVar = this.f1582C;
                        if (fVar != null) {
                            O02.f1582C = fVar;
                            return O02;
                        }
                        O02.h0(s());
                        return O02;
                    }
                    O02.f1582C = new B6.f(this, A2, 5);
                }
                return O02;
            }
            return null;
        }
        G0(27);
        throw null;
    }

    public void R0(w wVar, w wVar2, List list, List list2, List list3, AbstractC1759v abstractC1759v, EnumC0023y enumC0023y, C0014o c0014o) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (c0014o != null) {
                        this.f1587i = AbstractC0436k.Q0(list2);
                        this.j = AbstractC0436k.Q0(list3);
                        this.k = abstractC1759v;
                        this.f1591o = enumC0023y;
                        this.f1592p = c0014o;
                        this.f1589m = wVar;
                        this.f1590n = wVar2;
                        this.f1588l = list;
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            C6.T t8 = (C6.T) list2.get(i4);
                            if (t8.getIndex() != i4) {
                                throw new IllegalStateException(t8 + " index is " + t8.getIndex() + " but position is " + i4);
                            }
                        }
                        for (int i8 = 0; i8 < list3.size(); i8++) {
                            U u8 = (U) list3.get(i8);
                            if (u8.j != i8) {
                                throw new IllegalStateException(u8 + "index is " + u8.j + " but position is " + i8);
                            }
                        }
                        return;
                    }
                    G0(8);
                    throw null;
                }
                G0(7);
                throw null;
            }
            G0(6);
            throw null;
        }
        G0(5);
        throw null;
    }

    @Override // C6.InterfaceC0001b
    public boolean S() {
        return this.f1580A;
    }

    public final C0060u S0(w7.Q q6) {
        if (q6 != null) {
            return new C0060u(this, q6.f(), q(), j(), d(), e(), z0(), W(), this.f1589m, r());
        }
        G0(24);
        throw null;
    }

    public final void T0(InterfaceC0000a interfaceC0000a, Object obj) {
        if (this.f1586G == null) {
            this.f1586G = new LinkedHashMap();
        }
        this.f1586G.put(interfaceC0000a, obj);
    }

    public void U0(boolean z8) {
        this.f1602z = z8;
    }

    public void V0(boolean z8) {
        this.f1580A = z8;
    }

    @Override // C6.InterfaceC0001b
    public final List W() {
        List list = this.f1588l;
        if (list != null) {
            return list;
        }
        G0(13);
        throw null;
    }

    public final void W0(w7.z zVar) {
        if (zVar != null) {
            this.k = zVar;
        } else {
            G0(11);
            throw null;
        }
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    public InterfaceC0019u a() {
        InterfaceC0019u a3;
        InterfaceC0019u interfaceC0019u = this.f1583D;
        if (interfaceC0019u == this) {
            a3 = this;
        } else {
            a3 = interfaceC0019u.a();
        }
        if (a3 != null) {
            return a3;
        }
        G0(20);
        throw null;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return this.f1598v;
    }

    @Override // C6.InterfaceC0013n
    public final C0014o d() {
        C0014o c0014o = this.f1592p;
        if (c0014o != null) {
            return c0014o;
        }
        G0(16);
        throw null;
    }

    @Override // C6.InterfaceC0002c
    public final int e() {
        int i4 = this.f1584E;
        if (i4 != 0) {
            return i4;
        }
        G0(21);
        throw null;
    }

    public boolean g() {
        return this.f1596t;
    }

    @Override // C6.InterfaceC0019u
    public final boolean g0() {
        return this.f1599w;
    }

    @Override // C6.InterfaceC0001b
    public final List getTypeParameters() {
        List list = this.f1587i;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public void h0(Collection collection) {
        if (collection != null) {
            this.f1581B = collection;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((InterfaceC0019u) it.next()).q0()) {
                    this.f1600x = true;
                    return;
                }
            }
            return;
        }
        G0(17);
        throw null;
    }

    public boolean i0() {
        return this.f1597u;
    }

    @Override // C6.InterfaceC0022x
    public final EnumC0023y j() {
        EnumC0023y enumC0023y = this.f1591o;
        if (enumC0023y != null) {
            return enumC0023y;
        }
        G0(15);
        throw null;
    }

    @Override // C6.InterfaceC0019u
    public final boolean j0() {
        if (!this.f1593q) {
            Iterator it = a().s().iterator();
            while (it.hasNext()) {
                if (((InterfaceC0019u) it.next()).j0()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // C6.InterfaceC0019u
    public boolean p() {
        return this.f1601y;
    }

    @Override // C6.InterfaceC0019u
    public final boolean q0() {
        return this.f1600x;
    }

    public AbstractC1759v r() {
        return this.k;
    }

    public Collection s() {
        B6.f fVar = this.f1582C;
        if (fVar != null) {
            this.f1581B = (Collection) fVar.a();
            this.f1582C = null;
        }
        Collection collection = this.f1581B;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        G0(14);
        throw null;
    }

    public InterfaceC0018t s0() {
        return S0(w7.Q.f15971b);
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }

    @Override // C6.InterfaceC0019u
    public final InterfaceC0019u y() {
        return this.f1585F;
    }

    public boolean z() {
        return this.f1595s;
    }

    @Override // C6.InterfaceC0001b
    public final List z0() {
        List list = this.j;
        if (list != null) {
            return list;
        }
        G0(19);
        throw null;
    }

    @Override // C6.Q
    public InterfaceC0019u f(w7.Q q6) {
        if (q6 != null) {
            if (q6.f15972a.e()) {
                return this;
            }
            C0060u S02 = S0(q6);
            S02.f1563h = a();
            S02.f1571r = true;
            S02.f1579z = true;
            return S02.f1558A.P0(S02);
        }
        G0(22);
        throw null;
    }
}
