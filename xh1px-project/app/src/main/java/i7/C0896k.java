package i7;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0001b;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.L;
import C6.M;
import C6.T;
import F6.AbstractC0061v;
import F6.K;
import F6.U;
import F6.w;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.C1742d;
import w7.I;
import w7.W;
import x.AbstractC1769h;
import x7.AbstractC1825g;
import x7.InterfaceC1821c;
import x7.InterfaceC1822d;

/* renamed from: i7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896k {

    /* renamed from: b, reason: collision with root package name */
    public static final List f11781b = AbstractC0436k.Q0(ServiceLoader.load(InterfaceC0891f.class, InterfaceC0891f.class.getClassLoader()));

    /* renamed from: c, reason: collision with root package name */
    public static final C0896k f11782c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0888c f11783d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1821c f11784a;

    /* JADX WARN: Type inference failed for: r0v3, types: [i7.c, x7.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        f11783d = obj;
        f11782c = new C0896k(obj);
    }

    public C0896k(InterfaceC1821c interfaceC1821c) {
        if (interfaceC1821c != null) {
            this.f11784a = interfaceC1821c;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x0263. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x0266. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x0269. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0275 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        Object[] objArr;
        if (i4 != 11 && i4 != 12 && i4 != 16 && i4 != 21 && i4 != 93 && i4 != 96 && i4 != 101 && i4 != 42 && i4 != 43) {
            switch (i4) {
                default:
                    switch (i4) {
                        default:
                            switch (i4) {
                                default:
                                    switch (i4) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
            }
            if (i4 != 11 && i4 != 12 && i4 != 16 && i4 != 21 && i4 != 93 && i4 != 96 && i4 != 101 && i4 != 42 && i4 != 43) {
                switch (i4) {
                    default:
                        switch (i4) {
                            default:
                                switch (i4) {
                                    default:
                                        switch (i4) {
                                            case 88:
                                            case 89:
                                            case 90:
                                                break;
                                            default:
                                                i8 = 3;
                                                break;
                                        }
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                        i8 = 2;
                                        break;
                                }
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                                break;
                        }
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        break;
                }
                objArr = new Object[i8];
                switch (i4) {
                    case 1:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[0] = "customSubtype";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        objArr[0] = "equalityAxioms";
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        objArr[0] = "axioms";
                        break;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                        objArr[0] = "candidateSet";
                        break;
                    case 10:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 42:
                    case 43:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                    case 90:
                    case 93:
                    case 96:
                    case 101:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case 14:
                        objArr[0] = "g";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case 22:
                    case 28:
                    case 38:
                        objArr[0] = "superDescriptor";
                        break;
                    case 20:
                    case 23:
                    case 29:
                    case 39:
                        objArr[0] = "subDescriptor";
                        break;
                    case 40:
                        objArr[0] = "firstParameters";
                        break;
                    case 41:
                        objArr[0] = "secondParameters";
                        break;
                    case 44:
                        objArr[0] = "typeInSuper";
                        break;
                    case 45:
                        objArr[0] = "typeInSub";
                        break;
                    case 46:
                    case 49:
                    case 75:
                        objArr[0] = "typeCheckerState";
                        break;
                    case 47:
                        objArr[0] = "superTypeParameter";
                        break;
                    case 48:
                        objArr[0] = "subTypeParameter";
                        break;
                    case 50:
                        objArr[0] = "name";
                        break;
                    case 51:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case 52:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case 53:
                    case 59:
                    case 62:
                    case 84:
                    case 87:
                    case 94:
                        objArr[0] = "current";
                        break;
                    case 54:
                    case 60:
                    case 64:
                    case 85:
                    case 104:
                        objArr[0] = "strategy";
                        break;
                    case 55:
                        objArr[0] = "overriding";
                        break;
                    case 56:
                        objArr[0] = "fromSuper";
                        break;
                    case 57:
                        objArr[0] = "fromCurrent";
                        break;
                    case 58:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case 61:
                    case 63:
                        objArr[0] = "notOverridden";
                        break;
                    case 65:
                    case 67:
                    case 71:
                        objArr[0] = "a";
                        break;
                    case 66:
                    case 68:
                    case 73:
                        objArr[0] = "b";
                        break;
                    case 69:
                        objArr[0] = "candidate";
                        break;
                    case 70:
                    case 86:
                    case 91:
                    case 107:
                        objArr[0] = "descriptors";
                        break;
                    case 72:
                        objArr[0] = "aReturnType";
                        break;
                    case 74:
                        objArr[0] = "bReturnType";
                        break;
                    case 76:
                    case 83:
                        objArr[0] = "overridables";
                        break;
                    case 77:
                    case 99:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case 92:
                        objArr[0] = "classModality";
                        break;
                    case 95:
                        objArr[0] = "toFilter";
                        break;
                    case 97:
                    case 102:
                        objArr[0] = "overrider";
                        break;
                    case 98:
                    case 103:
                        objArr[0] = "extractFrom";
                        break;
                    case 100:
                        objArr[0] = "onConflict";
                        break;
                    case 105:
                    case 106:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i4 == 11 && i4 != 12) {
                    if (i4 != 16) {
                        if (i4 != 21) {
                            if (i4 != 93) {
                                if (i4 != 96) {
                                    if (i4 != 101) {
                                        if (i4 != 42 && i4 != 43) {
                                            switch (i4) {
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                    break;
                                                default:
                                                    switch (i4) {
                                                        case 30:
                                                        case 31:
                                                        case 32:
                                                        case 33:
                                                        case 34:
                                                        case 35:
                                                        case 36:
                                                        case 37:
                                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                                            break;
                                                        default:
                                                            switch (i4) {
                                                                case 78:
                                                                case 79:
                                                                case 80:
                                                                case 81:
                                                                case 82:
                                                                    objArr[1] = "selectMostSpecificMember";
                                                                    break;
                                                                default:
                                                                    switch (i4) {
                                                                        case 88:
                                                                        case 89:
                                                                        case 90:
                                                                            objArr[1] = "determineModalityForFakeOverride";
                                                                            break;
                                                                        default:
                                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                        } else {
                                            objArr[1] = "createTypeCheckerState";
                                        }
                                    } else {
                                        objArr[1] = "extractMembersOverridableInBothWays";
                                    }
                                } else {
                                    objArr[1] = "filterVisibleFakeOverrides";
                                }
                            } else {
                                objArr[1] = "getMinimalModality";
                            }
                        }
                        objArr[1] = "isOverridableBy";
                    } else {
                        objArr[1] = "getOverriddenDeclarations";
                    }
                } else {
                    objArr[1] = "filterOverrides";
                }
                switch (i4) {
                    case 1:
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        objArr[2] = "create";
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[2] = "<init>";
                        break;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 42:
                    case 43:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                    case 90:
                    case 93:
                    case 96:
                    case 101:
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "overrides";
                        break;
                    case 15:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case 17:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        objArr[2] = "isOverridableBy";
                        break;
                    case 28:
                    case 29:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case 44:
                    case 45:
                    case 46:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case 47:
                    case 48:
                    case 49:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case 55:
                    case 56:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case 61:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case 62:
                    case 63:
                    case 64:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case 65:
                    case 66:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case 67:
                    case 68:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case 69:
                    case 70:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case 76:
                    case 77:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case 83:
                    case 84:
                    case 85:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case 86:
                    case 87:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case 91:
                    case 92:
                        objArr[2] = "getMinimalModality";
                        break;
                    case 94:
                    case 95:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case 105:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case 106:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case 107:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 11 && i4 != 12 && i4 != 16 && i4 != 21 && i4 != 93 && i4 != 96 && i4 != 101 && i4 != 42 && i4 != 43) {
                    switch (i4) {
                        default:
                            switch (i4) {
                                default:
                                    switch (i4) {
                                        default:
                                            switch (i4) {
                                                case 88:
                                                case 89:
                                                case 90:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                            throw new IllegalStateException(format);
                                    }
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                    break;
                            }
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                            break;
                    }
                }
                throw new IllegalStateException(format);
            }
            i8 = 2;
            objArr = new Object[i8];
            switch (i4) {
            }
            if (i4 == 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i4) {
            }
            String format2 = String.format(str, objArr);
            if (i4 != 11) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 11) {
            switch (i4) {
            }
            objArr = new Object[i8];
            switch (i4) {
            }
            if (i4 == 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i4) {
            }
            String format22 = String.format(str, objArr);
            if (i4 != 11) {
            }
            throw new IllegalStateException(format22);
        }
        i8 = 2;
        objArr = new Object[i8];
        switch (i4) {
        }
        if (i4 == 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i4) {
        }
        String format222 = String.format(str, objArr);
        if (i4 != 11) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(AbstractC1759v abstractC1759v, AbstractC1759v abstractC1759v2, I i4) {
        if (abstractC1759v != null) {
            if (abstractC1759v2 != null) {
                if (AbstractC1741c.j(abstractC1759v) && AbstractC1741c.j(abstractC1759v2)) {
                    return true;
                }
                return C1742d.h(i4, abstractC1759v.H0(), abstractC1759v2.H0());
            }
            a(45);
            throw null;
        }
        a(44);
        throw null;
    }

    public static void c(InterfaceC0002c interfaceC0002c, LinkedHashSet linkedHashSet) {
        if (interfaceC0002c != null) {
            if (interfaceC0002c.e() != 2) {
                linkedHashSet.add(interfaceC0002c);
                return;
            }
            if (!interfaceC0002c.s().isEmpty()) {
                Iterator it = interfaceC0002c.s().iterator();
                while (it.hasNext()) {
                    c((InterfaceC0002c) it.next(), linkedHashSet);
                }
                return;
            } else {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC0002c);
            }
        }
        a(17);
        throw null;
    }

    public static ArrayList d(InterfaceC0001b interfaceC0001b) {
        w M8 = interfaceC0001b.M();
        ArrayList arrayList = new ArrayList();
        if (M8 != null) {
            arrayList.add(M8.b());
        }
        Iterator it = interfaceC0001b.z0().iterator();
        while (it.hasNext()) {
            arrayList.add(((U) it.next()).b());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r6 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Collection collection, InterfaceC0004e interfaceC0004e, AbstractC0898m abstractC0898m) {
        EnumC0023y enumC0023y;
        EnumC0023y j;
        EnumC0023y enumC0023y2;
        C0014o c0014o;
        boolean z8;
        if (collection != null) {
            if (interfaceC0004e != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (true) {
                    boolean z9 = true;
                    boolean z10 = false;
                    if (it.hasNext()) {
                        Object next = it.next();
                        InterfaceC0002c interfaceC0002c = (InterfaceC0002c) next;
                        if (!AbstractC0015p.e(interfaceC0002c.d())) {
                            if (interfaceC0002c != null) {
                                if (interfaceC0004e != null) {
                                    if (AbstractC0015p.c(AbstractC0015p.f763l, interfaceC0002c, interfaceC0004e) == null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                } else {
                                    AbstractC0015p.a(3);
                                    throw null;
                                }
                            } else {
                                AbstractC0015p.a(2);
                                throw null;
                            }
                        }
                        z9 = false;
                        if (z9) {
                            arrayList.add(next);
                        }
                    } else {
                        boolean isEmpty = arrayList.isEmpty();
                        if (!isEmpty) {
                            collection = arrayList;
                        }
                        Iterator it2 = collection.iterator();
                        boolean z11 = false;
                        boolean z12 = false;
                        while (true) {
                            if (it2.hasNext()) {
                                InterfaceC0002c interfaceC0002c2 = (InterfaceC0002c) it2.next();
                                int ordinal = interfaceC0002c2.j().ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            if (ordinal == 3) {
                                                z12 = true;
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                    } else {
                                        throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC0002c2);
                                    }
                                } else {
                                    enumC0023y = EnumC0023y.f778e;
                                    break;
                                }
                            } else {
                                boolean c02 = interfaceC0004e.c0();
                                EnumC0023y enumC0023y3 = EnumC0023y.f781h;
                                if (c02 && interfaceC0004e.j() != enumC0023y3 && interfaceC0004e.j() != EnumC0023y.f779f) {
                                    z10 = true;
                                }
                                if (z11 && !z12) {
                                    enumC0023y = EnumC0023y.f780g;
                                } else if (!z11 && z12) {
                                    if (z10) {
                                        enumC0023y2 = interfaceC0004e.j();
                                    } else {
                                        enumC0023y2 = enumC0023y3;
                                    }
                                    if (enumC0023y2 != null) {
                                        enumC0023y = enumC0023y2;
                                    } else {
                                        a(90);
                                        throw null;
                                    }
                                } else {
                                    HashSet<InterfaceC0002c> hashSet = new HashSet();
                                    for (InterfaceC0002c interfaceC0002c3 : collection) {
                                        if (interfaceC0002c3 != null) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            c(interfaceC0002c3, linkedHashSet);
                                            hashSet.addAll(linkedHashSet);
                                        } else {
                                            a(15);
                                            throw null;
                                        }
                                    }
                                    if (!hashSet.isEmpty() && AbstractC1098d.j((InterfaceC0010k) hashSet.iterator().next()).m0(AbstractC1825g.f16283a) != null) {
                                        throw new ClassCastException();
                                    }
                                    if (hashSet.size() > 1) {
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                        Iterator it3 = hashSet.iterator();
                                        while (it3.hasNext()) {
                                            Object next2 = it3.next();
                                            Iterator it4 = linkedHashSet2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    InterfaceC0001b interfaceC0001b = (InterfaceC0001b) next2;
                                                    InterfaceC0001b interfaceC0001b2 = (InterfaceC0001b) it4.next();
                                                    if (q(interfaceC0001b, interfaceC0001b2)) {
                                                        it4.remove();
                                                    } else if (q(interfaceC0001b2, interfaceC0001b)) {
                                                        break;
                                                    }
                                                } else {
                                                    linkedHashSet2.add(next2);
                                                    break;
                                                }
                                            }
                                        }
                                        hashSet = linkedHashSet2;
                                    }
                                    EnumC0023y j5 = interfaceC0004e.j();
                                    if (j5 != null) {
                                        EnumC0023y enumC0023y4 = enumC0023y3;
                                        for (InterfaceC0002c interfaceC0002c4 : hashSet) {
                                            if (z10 && interfaceC0002c4.j() == enumC0023y3) {
                                                j = j5;
                                            } else {
                                                j = interfaceC0002c4.j();
                                            }
                                            if (j.compareTo(enumC0023y4) < 0) {
                                                enumC0023y4 = j;
                                            }
                                        }
                                        if (enumC0023y4 != null) {
                                            enumC0023y = enumC0023y4;
                                        } else {
                                            a(93);
                                            throw null;
                                        }
                                    } else {
                                        a(92);
                                        throw null;
                                    }
                                }
                            }
                        }
                        if (isEmpty) {
                            c0014o = AbstractC0015p.f761h;
                        } else {
                            c0014o = AbstractC0015p.f760g;
                        }
                        InterfaceC0002c x8 = ((InterfaceC0002c) s(collection, new C0894i(0))).x(interfaceC0004e, enumC0023y, c0014o);
                        abstractC0898m.p(x8, collection);
                        abstractC0898m.b(x8);
                        return;
                    }
                }
            } else {
                a(84);
                throw null;
            }
        } else {
            a(83);
            throw null;
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, InterfaceC1163b interfaceC1163b, InterfaceC1163b interfaceC1163b2) {
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            InterfaceC0001b interfaceC0001b = (InterfaceC0001b) interfaceC1163b.m(obj);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                InterfaceC0001b interfaceC0001b2 = (InterfaceC0001b) interfaceC1163b.m(next);
                if (obj == next) {
                    it.remove();
                } else {
                    int j = j(interfaceC0001b, interfaceC0001b2);
                    if (j == 1) {
                        arrayList.add(next);
                        it.remove();
                    } else if (j == 3) {
                        interfaceC1163b2.m(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        }
        a(97);
        throw null;
    }

    public static C0895j i(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2) {
        boolean z8;
        boolean z9;
        C0895j c0895j;
        if (interfaceC0001b != null) {
            if (interfaceC0001b2 != null) {
                boolean z10 = interfaceC0001b instanceof InterfaceC0019u;
                if ((z10 && !(interfaceC0001b2 instanceof InterfaceC0019u)) || (((z8 = interfaceC0001b instanceof M)) && !(interfaceC0001b2 instanceof M))) {
                    return C0895j.c("Member kind mismatch");
                }
                if (!z10 && !z8) {
                    throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC0001b);
                }
                if (!interfaceC0001b.getName().equals(interfaceC0001b2.getName())) {
                    return C0895j.c("Name mismatch");
                }
                boolean z11 = false;
                if (interfaceC0001b.M() == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (interfaceC0001b2.M() == null) {
                    z11 = true;
                }
                if (z9 != z11) {
                    c0895j = C0895j.c("Receiver presence mismatch");
                } else if (interfaceC0001b.z0().size() != interfaceC0001b2.z0().size()) {
                    c0895j = C0895j.c("Value parameter number mismatch");
                } else {
                    c0895j = null;
                }
                if (c0895j == null) {
                    return null;
                }
                return c0895j;
            }
            a(39);
            throw null;
        }
        a(38);
        throw null;
    }

    public static int j(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2) {
        C0896k c0896k = f11782c;
        int b4 = c0896k.l(interfaceC0001b2, interfaceC0001b, null).b();
        int b9 = c0896k.m(interfaceC0001b, interfaceC0001b2, null, false).b();
        if (b4 == 1 && b9 == 1) {
            return 1;
        }
        if (b4 == 3 || b9 == 3) {
            return 3;
        }
        return 2;
    }

    public static boolean k(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2) {
        boolean z8;
        if (interfaceC0001b != null) {
            if (interfaceC0001b2 != null) {
                AbstractC1759v r8 = interfaceC0001b.r();
                AbstractC1759v r9 = interfaceC0001b2.r();
                if (p(interfaceC0001b, interfaceC0001b2)) {
                    I f8 = f11782c.f(interfaceC0001b.getTypeParameters(), interfaceC0001b2.getTypeParameters());
                    if (interfaceC0001b instanceof InterfaceC0019u) {
                        return o(interfaceC0001b, r8, interfaceC0001b2, r9, f8);
                    }
                    if (interfaceC0001b instanceof M) {
                        M m6 = (M) interfaceC0001b;
                        M m8 = (M) interfaceC0001b2;
                        F6.M i4 = m6.i();
                        F6.M i8 = m8.i();
                        if (i4 != null && i8 != null) {
                            z8 = p(i4, i8);
                        } else {
                            z8 = true;
                        }
                        if (z8) {
                            if (m6.H() && m8.H()) {
                                return C1742d.h(f8, r8.H0(), r9.H0());
                            }
                            if ((m6.H() || !m8.H()) && o(interfaceC0001b, r8, interfaceC0001b2, r9, f8)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("Unexpected callable: " + interfaceC0001b.getClass());
                }
                return false;
            }
            a(66);
            throw null;
        }
        a(65);
        throw null;
    }

    public static boolean o(InterfaceC0001b interfaceC0001b, AbstractC1759v abstractC1759v, InterfaceC0001b interfaceC0001b2, AbstractC1759v abstractC1759v2, I i4) {
        if (interfaceC0001b != null) {
            if (abstractC1759v != null) {
                if (interfaceC0001b2 != null) {
                    if (abstractC1759v2 != null) {
                        W H02 = abstractC1759v.H0();
                        W H03 = abstractC1759v2.H0();
                        if (H02 == H03) {
                            return true;
                        }
                        if (!i4.b(H02, H03)) {
                            return false;
                        }
                        return C1742d.f(i4, H02, H03);
                    }
                    a(74);
                    throw null;
                }
                a(73);
                throw null;
            }
            a(72);
            throw null;
        }
        a(71);
        throw null;
    }

    public static boolean p(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2) {
        if (interfaceC0001b != null) {
            if (interfaceC0001b2 != null) {
                Integer b4 = AbstractC0015p.b(interfaceC0001b.d(), interfaceC0001b2.d());
                if (b4 != null && b4.intValue() < 0) {
                    return false;
                }
                return true;
            }
            a(68);
            throw null;
        }
        a(67);
        throw null;
    }

    public static boolean q(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2) {
        if (interfaceC0001b != null) {
            if (interfaceC0001b2 != null) {
                boolean equals = interfaceC0001b.equals(interfaceC0001b2);
                C0888c c0888c = C0888c.f11773a;
                if (equals || !c0888c.c(interfaceC0001b.a(), interfaceC0001b2.a(), false)) {
                    InterfaceC0001b a3 = interfaceC0001b2.a();
                    int i4 = AbstractC0890e.f11774a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    AbstractC0890e.b(interfaceC0001b.a(), linkedHashSet);
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        if (c0888c.c(a3, (InterfaceC0001b) it.next(), false)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(InterfaceC0002c interfaceC0002c, InterfaceC1163b interfaceC1163b) {
        C0014o c0014o;
        C0014o c0014o2;
        C0014o c0014o3;
        InterfaceC1163b interfaceC1163b2;
        if (interfaceC0002c != null) {
            for (InterfaceC0002c interfaceC0002c2 : interfaceC0002c.s()) {
                if (interfaceC0002c2.d() == AbstractC0015p.f760g) {
                    r(interfaceC0002c2, interfaceC1163b);
                }
            }
            if (interfaceC0002c.d() == AbstractC0015p.f760g) {
                Collection<InterfaceC0002c> s8 = interfaceC0002c.s();
                if (s8 != null) {
                    if (s8.isEmpty()) {
                        c0014o2 = AbstractC0015p.j;
                    } else {
                        Iterator it = s8.iterator();
                        loop3: while (true) {
                            c0014o = null;
                            while (it.hasNext()) {
                                C0014o d2 = ((InterfaceC0002c) it.next()).d();
                                if (c0014o != null) {
                                    Integer b4 = AbstractC0015p.b(d2, c0014o);
                                    if (b4 == null) {
                                        break;
                                    } else if (b4.intValue() > 0) {
                                    }
                                }
                                c0014o = d2;
                            }
                        }
                        if (c0014o != null) {
                            Iterator it2 = s8.iterator();
                            while (it2.hasNext()) {
                                Integer b9 = AbstractC0015p.b(c0014o, ((InterfaceC0002c) it2.next()).d());
                                if (b9 != null && b9.intValue() >= 0) {
                                }
                            }
                            c0014o2 = c0014o;
                        }
                        c0014o2 = null;
                        break;
                    }
                    if (c0014o2 != null) {
                        if (interfaceC0002c.e() == 2) {
                            for (InterfaceC0002c interfaceC0002c3 : s8) {
                                if (interfaceC0002c3.j() == EnumC0023y.f781h || interfaceC0002c3.d().equals(c0014o2)) {
                                }
                            }
                        } else {
                            c0014o2 = AbstractC0015p.f(c0014o2.f752a.k());
                        }
                        if (c0014o2 != null) {
                            if (interfaceC1163b != null) {
                                interfaceC1163b.m(interfaceC0002c);
                            }
                            c0014o3 = AbstractC0015p.f758e;
                        } else {
                            c0014o3 = c0014o2;
                        }
                        if (!(interfaceC0002c instanceof K)) {
                            K k = (K) interfaceC0002c;
                            if (c0014o3 != null) {
                                k.f1487n = c0014o3;
                                Iterator it3 = ((M) interfaceC0002c).v().iterator();
                                while (it3.hasNext()) {
                                    L l6 = (L) it3.next();
                                    if (c0014o2 == null) {
                                        interfaceC1163b2 = null;
                                    } else {
                                        interfaceC1163b2 = interfaceC1163b;
                                    }
                                    r(l6, interfaceC1163b2);
                                }
                                return;
                            }
                            K.G0(20);
                            throw null;
                        }
                        if (interfaceC0002c instanceof AbstractC0061v) {
                            AbstractC0061v abstractC0061v = (AbstractC0061v) interfaceC0002c;
                            if (c0014o3 != null) {
                                abstractC0061v.f1592p = c0014o3;
                                return;
                            } else {
                                AbstractC0061v.G0(10);
                                throw null;
                            }
                        }
                        F6.I i4 = (F6.I) interfaceC0002c;
                        i4.f1470o = c0014o3;
                        if (c0014o3 != i4.M0().d()) {
                            i4.f1466i = false;
                            return;
                        }
                        return;
                    }
                    c0014o2 = null;
                    if (c0014o2 != null) {
                    }
                    if (!(interfaceC0002c instanceof K)) {
                    }
                } else {
                    a(107);
                    throw null;
                }
            }
        } else {
            a(105);
            throw null;
        }
    }

    public static Object s(Collection collection, InterfaceC1163b interfaceC1163b) {
        Object obj;
        if (collection.size() == 1) {
            Object o02 = AbstractC0436k.o0(collection);
            if (o02 != null) {
                return o02;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(interfaceC1163b.m(it.next()));
        }
        Object o03 = AbstractC0436k.o0(collection);
        InterfaceC0001b interfaceC0001b = (InterfaceC0001b) interfaceC1163b.m(o03);
        for (Object obj2 : collection) {
            InterfaceC0001b interfaceC0001b2 = (InterfaceC0001b) interfaceC1163b.m(obj2);
            if (interfaceC0001b2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!k(interfaceC0001b2, (InterfaceC0001b) it2.next())) {
                            break;
                        }
                    } else {
                        arrayList.add(obj2);
                        break;
                    }
                }
                if (k(interfaceC0001b2, interfaceC0001b) && !k(interfaceC0001b, interfaceC0001b2)) {
                    o03 = obj2;
                }
            } else {
                a(69);
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            if (o03 != null) {
                return o03;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object o04 = AbstractC0436k.o0(arrayList);
            if (o04 != null) {
                return o04;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                if (!AbstractC1741c.k(((InterfaceC0001b) interfaceC1163b.m(obj)).r())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return obj;
        }
        Object o05 = AbstractC0436k.o0(arrayList);
        if (o05 != null) {
            return o05;
        }
        a(82);
        throw null;
    }

    public final I f(List list, List list2) {
        if (list != null) {
            if (list2 != null) {
                boolean isEmpty = list.isEmpty();
                InterfaceC1821c interfaceC1821c = this.f11784a;
                if (isEmpty) {
                    return new C0897l(null, interfaceC1821c).p0();
                }
                HashMap hashMap = new HashMap();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    hashMap.put(((T) list.get(i4)).B(), ((T) list2.get(i4)).B());
                }
                return new C0897l(hashMap, interfaceC1821c).p0();
            }
            a(41);
            throw null;
        }
        a(40);
        throw null;
    }

    public final void h(C0725e c0725e, Collection collection, Collection collection2, InterfaceC0004e interfaceC0004e, AbstractC0898m abstractC0898m) {
        Integer b4;
        boolean z8;
        if (c0725e != null) {
            if (collection != null) {
                if (collection2 != null) {
                    if (interfaceC0004e != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
                        Iterator it = collection2.iterator();
                        while (it.hasNext()) {
                            InterfaceC0002c interfaceC0002c = (InterfaceC0002c) it.next();
                            if (interfaceC0002c != null) {
                                ArrayList arrayList = new ArrayList(collection.size());
                                int i4 = F7.i.f1630f;
                                F7.i e9 = F7.l.e();
                                Iterator it2 = collection.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC0002c interfaceC0002c2 = (InterfaceC0002c) it2.next();
                                    int b9 = l(interfaceC0002c2, interfaceC0002c, interfaceC0004e).b();
                                    if (!AbstractC0015p.e(interfaceC0002c2.d()) && AbstractC0015p.c(AbstractC0015p.f763l, interfaceC0002c2, interfaceC0002c) == null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    int b10 = AbstractC1769h.b(b9);
                                    if (b10 != 0) {
                                        if (b10 == 2) {
                                            if (z8) {
                                                abstractC0898m.d(interfaceC0002c2, interfaceC0002c);
                                            }
                                            arrayList.add(interfaceC0002c2);
                                        }
                                    } else {
                                        if (z8) {
                                            e9.add(interfaceC0002c2);
                                        }
                                        arrayList.add(interfaceC0002c2);
                                    }
                                }
                                abstractC0898m.p(interfaceC0002c, e9);
                                linkedHashSet.removeAll(arrayList);
                            } else {
                                a(57);
                                throw null;
                            }
                        }
                        if (linkedHashSet.size() >= 2) {
                            InterfaceC0010k q6 = ((InterfaceC0002c) linkedHashSet.iterator().next()).q();
                            if (!linkedHashSet.isEmpty()) {
                                Iterator it3 = linkedHashSet.iterator();
                                while (it3.hasNext()) {
                                    if (((InterfaceC0002c) it3.next()).q() != q6) {
                                        LinkedList<InterfaceC0002c> linkedList = new LinkedList(linkedHashSet);
                                        while (!linkedList.isEmpty()) {
                                            linkedList.isEmpty();
                                            InterfaceC0002c interfaceC0002c3 = null;
                                            for (InterfaceC0002c interfaceC0002c4 : linkedList) {
                                                if (interfaceC0002c3 == null || ((b4 = AbstractC0015p.b(interfaceC0002c3.d(), interfaceC0002c4.d())) != null && b4.intValue() < 0)) {
                                                    interfaceC0002c3 = interfaceC0002c4;
                                                }
                                            }
                                            o6.j.b(interfaceC0002c3);
                                            e(g(interfaceC0002c3, linkedList, new C0894i(1), new T6.l(abstractC0898m, 5, interfaceC0002c3)), interfaceC0004e, abstractC0898m);
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                        Iterator it4 = linkedHashSet.iterator();
                        while (it4.hasNext()) {
                            e(Collections.singleton((InterfaceC0002c) it4.next()), interfaceC0004e, abstractC0898m);
                        }
                        return;
                    }
                    a(53);
                    throw null;
                }
                a(52);
                throw null;
            }
            a(51);
            throw null;
        }
        a(50);
        throw null;
    }

    public final C0895j l(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2, InterfaceC0004e interfaceC0004e) {
        if (interfaceC0001b != null) {
            if (interfaceC0001b2 != null) {
                return m(interfaceC0001b, interfaceC0001b2, interfaceC0004e, false);
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public final C0895j m(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2, InterfaceC0004e interfaceC0004e, boolean z8) {
        boolean z9;
        if (interfaceC0001b != null) {
            if (interfaceC0001b2 != null) {
                C0895j n3 = n(interfaceC0001b, interfaceC0001b2, z8);
                if (n3.b() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                List<InterfaceC0891f> list = f11781b;
                for (InterfaceC0891f interfaceC0891f : list) {
                    if (interfaceC0891f.a() != 1 && (!z9 || interfaceC0891f.a() != 2)) {
                        int b4 = AbstractC1769h.b(interfaceC0891f.b(interfaceC0001b, interfaceC0001b2, interfaceC0004e));
                        if (b4 != 0) {
                            if (b4 == 1) {
                                return C0895j.c("External condition");
                            }
                        } else {
                            z9 = true;
                        }
                    }
                }
                if (!z9) {
                    return n3;
                }
                for (InterfaceC0891f interfaceC0891f2 : list) {
                    if (interfaceC0891f2.a() == 1) {
                        int b9 = AbstractC1769h.b(interfaceC0891f2.b(interfaceC0001b, interfaceC0001b2, interfaceC0004e));
                        if (b9 != 0) {
                            if (b9 == 1) {
                                return C0895j.c("External condition");
                            }
                        } else {
                            throw new IllegalStateException("Contract violation in " + interfaceC0891f2.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                    }
                }
                C0895j c0895j = C0895j.f11778c;
                if (c0895j != null) {
                    return c0895j;
                }
                C0895j.a(0);
                throw null;
            }
            a(23);
            throw null;
        }
        a(22);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r15.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0895j n(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2, boolean z8) {
        boolean f8;
        if (interfaceC0001b != null) {
            if (interfaceC0001b2 != null) {
                C0895j i4 = i(interfaceC0001b, interfaceC0001b2);
                if (i4 != null) {
                    return i4;
                }
                ArrayList d2 = d(interfaceC0001b);
                ArrayList d3 = d(interfaceC0001b2);
                List typeParameters = interfaceC0001b.getTypeParameters();
                List typeParameters2 = interfaceC0001b2.getTypeParameters();
                if (typeParameters.size() != typeParameters2.size()) {
                    for (int i8 = 0; i8 < d2.size(); i8++) {
                        if (!InterfaceC1822d.f16280a.a((AbstractC1759v) d2.get(i8), (AbstractC1759v) d3.get(i8))) {
                            return C0895j.c("Type parameter number mismatch");
                        }
                    }
                    return new C0895j("Type parameter number mismatch", 3);
                }
                I f9 = f(typeParameters, typeParameters2);
                for (int i9 = 0; i9 < typeParameters.size(); i9++) {
                    T t8 = (T) typeParameters.get(i9);
                    T t9 = (T) typeParameters2.get(i9);
                    if (t8 != null) {
                        if (t9 != null) {
                            List<AbstractC1759v> upperBounds = t8.getUpperBounds();
                            ArrayList arrayList = new ArrayList(t9.getUpperBounds());
                            if (upperBounds.size() == arrayList.size()) {
                                for (AbstractC1759v abstractC1759v : upperBounds) {
                                    ListIterator listIterator = arrayList.listIterator();
                                    while (listIterator.hasNext()) {
                                        if (b(abstractC1759v, (AbstractC1759v) listIterator.next(), f9)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return C0895j.c("Type parameter bounds mismatch");
                        }
                        a(48);
                        throw null;
                    }
                    a(47);
                    throw null;
                }
                for (int i10 = 0; i10 < d2.size(); i10++) {
                    if (!b((AbstractC1759v) d2.get(i10), (AbstractC1759v) d3.get(i10), f9)) {
                        return C0895j.c("Value parameter type mismatch");
                    }
                }
                if ((interfaceC0001b instanceof InterfaceC0019u) && (interfaceC0001b2 instanceof InterfaceC0019u) && ((InterfaceC0019u) interfaceC0001b).p() != ((InterfaceC0019u) interfaceC0001b2).p()) {
                    return new C0895j("Incompatible suspendability", 3);
                }
                if (z8) {
                    AbstractC1759v r8 = interfaceC0001b.r();
                    AbstractC1759v r9 = interfaceC0001b2.r();
                    if (r8 != null && r9 != null && (!AbstractC1741c.j(r9) || !AbstractC1741c.j(r8))) {
                        W H02 = r9.H0();
                        W H03 = r8.H0();
                        if (H02 == H03) {
                            f8 = true;
                        } else {
                            f8 = C1742d.f(f9, H02, H03);
                        }
                        if (!f8) {
                            return new C0895j("Return type mismatch", 3);
                        }
                    }
                }
                C0895j c0895j = C0895j.f11778c;
                if (c0895j != null) {
                    return c0895j;
                }
                C0895j.a(0);
                throw null;
            }
            a(29);
            throw null;
        }
        a(28);
        throw null;
    }
}
