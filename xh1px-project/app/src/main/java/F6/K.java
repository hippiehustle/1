package F6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0000a;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import C6.InterfaceC0019u;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n6.InterfaceC1162a;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public class K extends V implements C6.M {

    /* renamed from: A, reason: collision with root package name */
    public L f1481A;

    /* renamed from: B, reason: collision with root package name */
    public M f1482B;

    /* renamed from: C, reason: collision with root package name */
    public C0059t f1483C;

    /* renamed from: D, reason: collision with root package name */
    public C0059t f1484D;
    public final boolean j;
    public v7.h k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1162a f1485l;

    /* renamed from: m, reason: collision with root package name */
    public final EnumC0023y f1486m;

    /* renamed from: n, reason: collision with root package name */
    public C0014o f1487n;

    /* renamed from: o, reason: collision with root package name */
    public Collection f1488o;

    /* renamed from: p, reason: collision with root package name */
    public final C6.M f1489p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1490q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1491r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1492s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1493t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1494u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1495v;

    /* renamed from: w, reason: collision with root package name */
    public List f1496w;

    /* renamed from: x, reason: collision with root package name */
    public w f1497x;

    /* renamed from: y, reason: collision with root package name */
    public w f1498y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f1499z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(InterfaceC0010k interfaceC0010k, C6.M m6, D6.j jVar, EnumC0023y enumC0023y, C0014o c0014o, boolean z8, C0725e c0725e, int i4, C6.O o7, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(interfaceC0010k, jVar, c0725e, null, o7);
        if (interfaceC0010k == null) {
            G0(0);
            throw null;
        }
        if (jVar == null) {
            G0(1);
            throw null;
        }
        if (enumC0023y == null) {
            G0(2);
            throw null;
        }
        if (c0014o == null) {
            G0(3);
            throw null;
        }
        if (c0725e == null) {
            G0(4);
            throw null;
        }
        if (i4 == 0) {
            G0(5);
            throw null;
        }
        if (o7 != null) {
            this.j = z8;
            this.f1488o = null;
            this.f1496w = Collections.EMPTY_LIST;
            this.f1486m = enumC0023y;
            this.f1487n = c0014o;
            this.f1489p = m6 == null ? this : m6;
            this.f1490q = i4;
            this.f1491r = z9;
            this.f1492s = z10;
            this.f1493t = z11;
            this.f1494u = z12;
            this.f1495v = z13;
            return;
        }
        G0(6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 28 && i4 != 38 && i4 != 39 && i4 != 41 && i4 != 42) {
            switch (i4) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 28 && i4 != 38 && i4 != 39 && i4 != 41 && i4 != 42) {
                switch (i4) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        break;
                    default:
                        i8 = 3;
                        break;
                }
                Object[] objArr = new Object[i8];
                switch (i4) {
                    case 1:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        objArr[0] = "annotations";
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case 10:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case 11:
                        objArr[0] = "name";
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case 12:
                    case 35:
                        objArr[0] = "kind";
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 13:
                    case 37:
                        objArr[0] = "source";
                        break;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case 30:
                        objArr[0] = "substitutor";
                        break;
                    case 31:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case 33:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case 36:
                        objArr[0] = "newName";
                        break;
                    case 40:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i4 == 28) {
                    if (i4 != 38) {
                        if (i4 != 39) {
                            if (i4 != 41) {
                                if (i4 != 42) {
                                    switch (i4) {
                                        case 21:
                                            objArr[1] = "getTypeParameters";
                                            break;
                                        case 22:
                                            objArr[1] = "getContextReceiverParameters";
                                            break;
                                        case 23:
                                            objArr[1] = "getReturnType";
                                            break;
                                        case 24:
                                            objArr[1] = "getModality";
                                            break;
                                        case 25:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 26:
                                            objArr[1] = "getAccessors";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                                            break;
                                    }
                                } else {
                                    objArr[1] = "copy";
                                }
                            } else {
                                objArr[1] = "getOverriddenDescriptors";
                            }
                        } else {
                            objArr[1] = "getKind";
                        }
                    } else {
                        objArr[1] = "getOriginal";
                    }
                } else {
                    objArr[1] = "getSourceToUseForCopy";
                }
                switch (i4) {
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case 40:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 28 && i4 != 38 && i4 != 39 && i4 != 41 && i4 != 42) {
                    switch (i4) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i8 = 2;
            Object[] objArr2 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 28) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 28) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 28) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 28) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 28) {
            }
            throw new IllegalStateException(format22);
        }
        i8 = 2;
        Object[] objArr222 = new Object[i8];
        switch (i4) {
        }
        if (i4 == 28) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 28) {
        }
        throw new IllegalStateException(format222);
    }

    public static K N0(InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o, boolean z8, C0725e c0725e, int i4, C6.O o7) {
        if (interfaceC0010k != null) {
            if (c0014o != null) {
                if (c0725e != null) {
                    if (i4 != 0) {
                        if (o7 != null) {
                            return new K(interfaceC0010k, null, D6.i.f1043a, enumC0023y, c0014o, z8, c0725e, i4, o7, false, false, false, false, false);
                        }
                        G0(13);
                        throw null;
                    }
                    G0(12);
                    throw null;
                }
                G0(11);
                throw null;
            }
            G0(10);
            throw null;
        }
        G0(7);
        throw null;
    }

    public static InterfaceC0019u P0(w7.Q q6, C6.L l6) {
        if (l6 != null) {
            InterfaceC0019u interfaceC0019u = ((I) l6).f1471p;
            if (interfaceC0019u == null) {
                return null;
            }
            return interfaceC0019u.f(q6);
        }
        G0(31);
        throw null;
    }

    @Override // F6.V, C6.InterfaceC0001b
    public final w A() {
        return this.f1497x;
    }

    @Override // C6.W
    public boolean F() {
        return this.f1492s;
    }

    @Override // C6.W
    public final boolean H() {
        return this.j;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.N(this, obj);
    }

    @Override // C6.InterfaceC0001b
    public Object L(InterfaceC0000a interfaceC0000a) {
        return null;
    }

    @Override // F6.V, C6.InterfaceC0001b
    public final w M() {
        return this.f1498y;
    }

    @Override // C6.InterfaceC0002c
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final K x(InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o) {
        J j = new J(this);
        if (interfaceC0010k != null) {
            j.f1472a = interfaceC0010k;
            j.f1475d = null;
            j.f1473b = enumC0023y;
            if (c0014o != null) {
                j.f1474c = c0014o;
                j.f1476e = 2;
                j.f1478g = false;
                K b4 = j.b();
                if (b4 != null) {
                    return b4;
                }
                G0(42);
                throw null;
            }
            J.a(8);
            throw null;
        }
        J.a(0);
        throw null;
    }

    @Override // C6.M
    public final C0059t O() {
        return this.f1484D;
    }

    public K O0(InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o, C6.M m6, int i4, C0725e c0725e) {
        if (interfaceC0010k != null) {
            if (enumC0023y != null) {
                if (c0014o != null) {
                    if (i4 != 0) {
                        if (c0725e != null) {
                            return new K(interfaceC0010k, m6, getAnnotations(), enumC0023y, c0014o, this.j, c0725e, i4, C6.O.f726a, this.f1491r, F(), this.f1493t, z(), this.f1495v);
                        }
                        G0(36);
                        throw null;
                    }
                    G0(35);
                    throw null;
                }
                G0(34);
                throw null;
            }
            G0(33);
            throw null;
        }
        G0(32);
        throw null;
    }

    public final void Q0(L l6, M m6, C0059t c0059t, C0059t c0059t2) {
        this.f1481A = l6;
        this.f1482B = m6;
        this.f1483C = c0059t;
        this.f1484D = c0059t2;
    }

    public final void R0(v7.h hVar, InterfaceC1162a interfaceC1162a) {
        if (interfaceC1162a != null) {
            this.f1485l = interfaceC1162a;
            if (hVar == null) {
                hVar = (v7.h) interfaceC1162a.a();
            }
            this.k = hVar;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
    }

    @Override // C6.M
    public final C0059t T() {
        return this.f1483C;
    }

    public final void T0(AbstractC1759v abstractC1759v, List list, w wVar, w wVar2, List list2) {
        if (abstractC1759v != null) {
            if (list != null) {
                if (list2 != null) {
                    this.f1516i = abstractC1759v;
                    this.f1499z = new ArrayList(list);
                    this.f1498y = wVar2;
                    this.f1497x = wVar;
                    this.f1496w = list2;
                    return;
                }
                G0(19);
                throw null;
            }
            G0(18);
            throw null;
        }
        G0(17);
        throw null;
    }

    @Override // C6.InterfaceC0001b
    public final List W() {
        List list = this.f1496w;
        if (list != null) {
            return list;
        }
        G0(22);
        throw null;
    }

    @Override // C6.W
    public final boolean Z() {
        return this.f1491r;
    }

    @Override // C6.M
    public final L c() {
        return this.f1481A;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return this.f1493t;
    }

    @Override // C6.InterfaceC0013n
    public final C0014o d() {
        C0014o c0014o = this.f1487n;
        if (c0014o != null) {
            return c0014o;
        }
        G0(25);
        throw null;
    }

    @Override // C6.InterfaceC0002c
    public final int e() {
        int i4 = this.f1490q;
        if (i4 != 0) {
            return i4;
        }
        G0(39);
        throw null;
    }

    @Override // C6.M
    public final boolean f0() {
        return this.f1495v;
    }

    @Override // F6.V, C6.InterfaceC0001b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f1499z;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // C6.InterfaceC0002c
    public final void h0(Collection collection) {
        if (collection != null) {
            this.f1488o = collection;
        } else {
            G0(40);
            throw null;
        }
    }

    @Override // C6.M
    public final M i() {
        return this.f1482B;
    }

    @Override // C6.InterfaceC0022x
    public final EnumC0023y j() {
        EnumC0023y enumC0023y = this.f1486m;
        if (enumC0023y != null) {
            return enumC0023y;
        }
        G0(24);
        throw null;
    }

    @Override // F6.V, C6.InterfaceC0001b
    public final AbstractC1759v r() {
        AbstractC1759v b4 = b();
        if (b4 != null) {
            return b4;
        }
        G0(23);
        throw null;
    }

    @Override // C6.InterfaceC0001b
    public final Collection s() {
        Collection collection = this.f1488o;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        G0(41);
        throw null;
    }

    @Override // C6.W
    public final k7.g u0() {
        v7.h hVar = this.k;
        if (hVar != null) {
            return (k7.g) hVar.a();
        }
        return null;
    }

    @Override // C6.M
    public final ArrayList v() {
        ArrayList arrayList = new ArrayList(2);
        L l6 = this.f1481A;
        if (l6 != null) {
            arrayList.add(l6);
        }
        M m6 = this.f1482B;
        if (m6 != null) {
            arrayList.add(m6);
        }
        return arrayList;
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }

    @Override // C6.InterfaceC0022x
    public boolean z() {
        return this.f1494u;
    }

    @Override // C6.Q
    public final C6.M f(w7.Q q6) {
        if (q6 != null) {
            if (q6.f15972a.e()) {
                return this;
            }
            J j = new J(this);
            w7.O f8 = q6.f();
            if (f8 != null) {
                j.f1477f = f8;
                j.f1475d = a();
                return j.b();
            }
            J.a(15);
            throw null;
        }
        G0(27);
        throw null;
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    public final C6.M a() {
        C6.M m6 = this.f1489p;
        C6.M a3 = m6 == this ? this : m6.a();
        if (a3 != null) {
            return a3;
        }
        G0(38);
        throw null;
    }

    public void S0(AbstractC1759v abstractC1759v) {
    }
}
