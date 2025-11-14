package w7;

import C6.InterfaceC0004e;
import a6.AbstractC0436k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final y7.i f15977a = y7.l.c(y7.k.DONT_CARE, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final y7.i f15978b = y7.l.c(y7.k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final T f15979c = new T("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final T f15980d = new T("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 4 && i4 != 9 && i4 != 11 && i4 != 15 && i4 != 17 && i4 != 19 && i4 != 26 && i4 != 35 && i4 != 48 && i4 != 53 && i4 != 6 && i4 != 7) {
            switch (i4) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 4 && i4 != 9 && i4 != 11 && i4 != 15 && i4 != 17 && i4 != 19 && i4 != 26 && i4 != 35 && i4 != 48 && i4 != 53 && i4 != 6 && i4 != 7) {
                switch (i4) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        i8 = 3;
                        break;
                }
                Object[] objArr = new Object[i8];
                switch (i4) {
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    case 10:
                    case 18:
                    case 23:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 38:
                    case 40:
                    default:
                        objArr[0] = "type";
                        break;
                    case 12:
                        objArr[0] = "typeConstructor";
                        break;
                    case 13:
                        objArr[0] = "unsubstitutedMemberScope";
                        break;
                    case 14:
                        objArr[0] = "refinedTypeFactory";
                        break;
                    case 16:
                        objArr[0] = "parameters";
                        break;
                    case 20:
                        objArr[0] = "subType";
                        break;
                    case 21:
                        objArr[0] = "superType";
                        break;
                    case 22:
                        objArr[0] = "substitutor";
                        break;
                    case 24:
                        objArr[0] = "result";
                        break;
                    case 31:
                    case 33:
                        objArr[0] = "clazz";
                        break;
                    case 32:
                        objArr[0] = "typeArguments";
                        break;
                    case 34:
                        objArr[0] = "projections";
                        break;
                    case 36:
                        objArr[0] = "a";
                        break;
                    case 37:
                        objArr[0] = "b";
                        break;
                    case 39:
                        objArr[0] = "typeParameters";
                        break;
                    case 41:
                        objArr[0] = "typeParameterConstructors";
                        break;
                    case 42:
                        objArr[0] = "specialType";
                        break;
                    case 43:
                    case 44:
                        objArr[0] = "isSpecialType";
                        break;
                    case 45:
                    case 46:
                        objArr[0] = "parameterDescriptor";
                        break;
                    case 47:
                    case 51:
                        objArr[0] = "numberValueTypeConstructor";
                        break;
                    case 49:
                    case 50:
                        objArr[0] = "supertypes";
                        break;
                    case 52:
                    case 55:
                        objArr[0] = "expectedType";
                        break;
                    case 54:
                        objArr[0] = "literalTypeConstructor";
                        break;
                }
                if (i4 == 4) {
                    if (i4 != 9) {
                        if (i4 != 11 && i4 != 15) {
                            if (i4 != 17) {
                                if (i4 != 19) {
                                    if (i4 != 26) {
                                        if (i4 != 35) {
                                            if (i4 != 48) {
                                                if (i4 != 53) {
                                                    if (i4 != 6 && i4 != 7) {
                                                        switch (i4) {
                                                            case 56:
                                                            case 57:
                                                            case 58:
                                                            case 59:
                                                                break;
                                                            default:
                                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                                                break;
                                                        }
                                                    }
                                                }
                                                objArr[1] = "getPrimitiveNumberType";
                                            } else {
                                                objArr[1] = "getDefaultPrimitiveNumberType";
                                            }
                                        } else {
                                            objArr[1] = "substituteProjectionsForParameters";
                                        }
                                    } else {
                                        objArr[1] = "getAllSupertypes";
                                    }
                                } else {
                                    objArr[1] = "getImmediateSupertypes";
                                }
                            } else {
                                objArr[1] = "getDefaultTypeProjections";
                            }
                        } else {
                            objArr[1] = "makeUnsubstitutedType";
                        }
                    }
                    objArr[1] = "makeNullableIfNeeded";
                } else {
                    objArr[1] = "makeNullableAsSpecified";
                }
                switch (i4) {
                    case 1:
                        objArr[2] = "makeNullable";
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[2] = "makeNotNullable";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        objArr[2] = "makeNullableAsSpecified";
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        objArr[2] = "makeNullableIfNeeded";
                        break;
                    case 10:
                        objArr[2] = "canHaveSubtypes";
                        break;
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "makeUnsubstitutedType";
                        break;
                    case 16:
                        objArr[2] = "getDefaultTypeProjections";
                        break;
                    case 18:
                        objArr[2] = "getImmediateSupertypes";
                        break;
                    case 20:
                    case 21:
                    case 22:
                        objArr[2] = "createSubstitutedSupertype";
                        break;
                    case 23:
                    case 24:
                        objArr[2] = "collectAllSupertypes";
                        break;
                    case 25:
                        objArr[2] = "getAllSupertypes";
                        break;
                    case 27:
                        objArr[2] = "isNullableType";
                        break;
                    case 28:
                        objArr[2] = "acceptsNullable";
                        break;
                    case 29:
                        objArr[2] = "hasNullableSuperType";
                        break;
                    case 30:
                        objArr[2] = "getClassDescriptor";
                        break;
                    case 31:
                    case 32:
                        objArr[2] = "substituteParameters";
                        break;
                    case 33:
                    case 34:
                        objArr[2] = "substituteProjectionsForParameters";
                        break;
                    case 36:
                    case 37:
                        objArr[2] = "equalTypes";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "dependsOnTypeParameters";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "dependsOnTypeConstructors";
                        break;
                    case 42:
                    case 43:
                    case 44:
                        objArr[2] = "contains";
                        break;
                    case 45:
                    case 46:
                        objArr[2] = "makeStarProjection";
                        break;
                    case 47:
                    case 49:
                        objArr[2] = "getDefaultPrimitiveNumberType";
                        break;
                    case 50:
                        objArr[2] = "findByFqName";
                        break;
                    case 51:
                    case 52:
                    case 54:
                    case 55:
                        objArr[2] = "getPrimitiveNumberType";
                        break;
                    case 60:
                        objArr[2] = "isTypeParameter";
                        break;
                    case 61:
                        objArr[2] = "isReifiedTypeParameter";
                        break;
                    case 62:
                        objArr[2] = "isNonReifiedTypeParameter";
                        break;
                    case 63:
                        objArr[2] = "getTypeParameterDescriptorOrNull";
                        break;
                    default:
                        objArr[2] = "noExpectedType";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 4 && i4 != 9 && i4 != 11 && i4 != 15 && i4 != 17 && i4 != 19 && i4 != 26 && i4 != 35 && i4 != 48 && i4 != 53 && i4 != 6 && i4 != 7) {
                    switch (i4) {
                        case 56:
                        case 57:
                        case 58:
                        case 59:
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
            if (i4 == 4) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 4) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 4) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 4) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i8 = 2;
        Object[] objArr222 = new Object[i8];
        switch (i4) {
        }
        if (i4 == 4) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            if (!abstractC1759v.E0()) {
                if (AbstractC1741c.k(abstractC1759v) && b(((AbstractC1754p) abstractC1759v.H0()).f16007f)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        a(28);
        throw null;
    }

    public static boolean c(AbstractC1759v abstractC1759v, InterfaceC1163b interfaceC1163b, F7.i iVar) {
        AbstractC1754p abstractC1754p;
        if (abstractC1759v != null) {
            W H02 = abstractC1759v.H0();
            if (l(abstractC1759v)) {
                return ((Boolean) interfaceC1163b.m(H02)).booleanValue();
            }
            if (iVar == null || !iVar.contains(abstractC1759v)) {
                if (!((Boolean) interfaceC1163b.m(H02)).booleanValue()) {
                    if (iVar == null) {
                        int i4 = F7.i.f1630f;
                        iVar = F7.l.e();
                    }
                    iVar.add(abstractC1759v);
                    if (H02 instanceof AbstractC1754p) {
                        abstractC1754p = (AbstractC1754p) H02;
                    } else {
                        abstractC1754p = null;
                    }
                    if (abstractC1754p == null || (!c(abstractC1754p.f16006e, interfaceC1163b, iVar) && !c(abstractC1754p.f16007f, interfaceC1163b, iVar))) {
                        if (!(H02 instanceof C1750l) || !c(((C1750l) H02).f16001e, interfaceC1163b, iVar)) {
                            J B02 = abstractC1759v.B0();
                            if (B02 instanceof C1758u) {
                                Iterator it = ((C1758u) B02).f16016b.iterator();
                                while (it.hasNext()) {
                                    if (c((AbstractC1759v) it.next(), interfaceC1163b, iVar)) {
                                        return true;
                                    }
                                }
                                return false;
                            }
                            for (M m6 : abstractC1759v.r0()) {
                                if (!m6.c() && c(m6.b(), interfaceC1163b, iVar)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static List d(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new E(((C6.T) it.next()).l()));
            }
            return AbstractC0436k.Q0(arrayList);
        }
        a(16);
        throw null;
    }

    public static boolean e(AbstractC1759v abstractC1759v) {
        AbstractC1759v abstractC1759v2;
        if (abstractC1759v != null) {
            if (!abstractC1759v.E0() && (!AbstractC1741c.k(abstractC1759v) || !e(((AbstractC1754p) abstractC1759v.H0()).f16007f))) {
                if (!(abstractC1759v.H0() instanceof C1750l)) {
                    if (f(abstractC1759v)) {
                        if (!(abstractC1759v.B0().c() instanceof InterfaceC0004e)) {
                            Q d2 = Q.d(abstractC1759v);
                            Collection<AbstractC1759v> d3 = abstractC1759v.B0().d();
                            ArrayList arrayList = new ArrayList(d3.size());
                            for (AbstractC1759v abstractC1759v3 : d3) {
                                if (abstractC1759v3 != null) {
                                    AbstractC1759v i4 = d2.i(abstractC1759v3, X.INVARIANT);
                                    if (i4 != null) {
                                        abstractC1759v2 = h(i4, abstractC1759v.E0());
                                    } else {
                                        abstractC1759v2 = null;
                                    }
                                    if (abstractC1759v2 != null) {
                                        arrayList.add(abstractC1759v2);
                                    }
                                } else {
                                    a(21);
                                    throw null;
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (e((AbstractC1759v) it.next())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    J B02 = abstractC1759v.B0();
                    if (B02 instanceof C1758u) {
                        Iterator it2 = ((C1758u) B02).f16016b.iterator();
                        while (it2.hasNext()) {
                            if (e((AbstractC1759v) it2.next())) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        a(27);
        throw null;
    }

    public static boolean f(AbstractC1759v abstractC1759v) {
        C6.T t8 = null;
        if (abstractC1759v != null) {
            if (abstractC1759v.B0().c() instanceof C6.T) {
                t8 = (C6.T) abstractC1759v.B0().c();
            }
            if (t8 == null) {
                abstractC1759v.B0();
                return false;
            }
            return true;
        }
        a(60);
        throw null;
    }

    public static W g(AbstractC1759v abstractC1759v, boolean z8) {
        if (abstractC1759v != null) {
            W I02 = abstractC1759v.H0().I0(z8);
            if (I02 != null) {
                return I02;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static AbstractC1759v h(AbstractC1759v abstractC1759v, boolean z8) {
        if (abstractC1759v != null) {
            if (z8) {
                return g(abstractC1759v, true);
            }
            return abstractC1759v;
        }
        a(8);
        throw null;
    }

    public static z i(z zVar, boolean z8) {
        if (zVar != null) {
            if (z8) {
                z I02 = zVar.I0(true);
                if (I02 != null) {
                    return I02;
                }
                a(6);
                throw null;
            }
            return zVar;
        }
        a(5);
        throw null;
    }

    public static E j(C6.T t8) {
        if (t8 != null) {
            return new E(t8);
        }
        a(45);
        throw null;
    }

    public static M k(C6.T t8, U6.a aVar) {
        if (t8 != null) {
            if (aVar.f6170a == S.f15973d) {
                return new E(AbstractC1741c.w(t8));
            }
            return new E(t8);
        }
        a(46);
        throw null;
    }

    public static boolean l(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            if (abstractC1759v != f15979c && abstractC1759v != f15980d) {
                return false;
            }
            return true;
        }
        a(0);
        throw null;
    }
}
