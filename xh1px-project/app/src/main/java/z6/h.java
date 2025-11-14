package z6;

import C6.A;
import C6.AbstractC0021w;
import C6.F;
import C6.H;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.M;
import F6.B;
import F6.C;
import F6.E;
import F6.L;
import a6.AbstractC0434i;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import i7.AbstractC0890e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m7.AbstractC1098d;
import s7.C1518i;
import t7.C1591a;
import t7.C1592b;
import t7.C1593c;
import t7.C1594d;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.J;
import w7.U;
import w7.W;
import w7.X;
import w7.z;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: e */
    public static final C0725e f16714e = C0725e.g("<built-ins module>");

    /* renamed from: a */
    public C f16715a;

    /* renamed from: b */
    public final v7.i f16716b;

    /* renamed from: c */
    public final v7.e f16717c;

    /* renamed from: d */
    public final v7.k f16718d;

    /* JADX WARN: Type inference failed for: r1v2, types: [v7.i, v7.h] */
    public h(v7.k kVar) {
        this.f16718d = kVar;
        kVar.a(new C1883f(this, 0));
        this.f16716b = new v7.h(kVar, new C1883f(this, 1));
        this.f16717c = kVar.b(new D6.f(this, 1));
    }

    public static boolean A(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            if (AbstractC0890e.i(interfaceC0010k, C1593c.class, false) == null) {
                return false;
            }
            return true;
        }
        a(9);
        throw null;
    }

    public static boolean B(AbstractC1759v abstractC1759v, C0724d c0724d) {
        if (abstractC1759v != null) {
            if (c0724d != null) {
                return I(abstractC1759v.B0(), c0724d);
            }
            a(98);
            throw null;
        }
        a(97);
        throw null;
    }

    public static boolean C(AbstractC1759v abstractC1759v, C0724d c0724d) {
        if (c0724d != null) {
            if (B(abstractC1759v, c0724d) && !abstractC1759v.E0()) {
                return true;
            }
            return false;
        }
        a(135);
        throw null;
    }

    public static boolean D(InterfaceC0019u interfaceC0019u) {
        if (!interfaceC0019u.a().getAnnotations().a(m.f16779m)) {
            if (interfaceC0019u instanceof M) {
                M m6 = (M) interfaceC0019u;
                boolean H2 = m6.H();
                L c6 = m6.c();
                F6.M i4 = m6.i();
                if (c6 != null && D(c6)) {
                    if (H2) {
                        if (i4 != null && D(i4)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean E(AbstractC1759v abstractC1759v, C0724d c0724d) {
        if (abstractC1759v != null) {
            if (c0724d != null) {
                if (!abstractC1759v.E0() && B(abstractC1759v, c0724d)) {
                    return true;
                }
                return false;
            }
            a(106);
            throw null;
        }
        a(105);
        throw null;
    }

    public static boolean F(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            if (abstractC1759v != null) {
                if (B(abstractC1759v, m.f16764b) && !U.e(abstractC1759v)) {
                    return true;
                }
                return false;
            }
            a(138);
            throw null;
        }
        a(136);
        throw null;
    }

    public static boolean G(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            if (!abstractC1759v.E0()) {
                InterfaceC0007h c6 = abstractC1759v.B0().c();
                if (c6 instanceof InterfaceC0004e) {
                    InterfaceC0004e interfaceC0004e = (InterfaceC0004e) c6;
                    if (interfaceC0004e != null) {
                        if (u(interfaceC0004e) != null) {
                            return true;
                        }
                        return false;
                    }
                    a(96);
                    throw null;
                }
                return false;
            }
            return false;
        }
        a(94);
        throw null;
    }

    public static boolean H(AbstractC1759v abstractC1759v) {
        if (E(abstractC1759v, m.f16772f)) {
            return true;
        }
        return false;
    }

    public static boolean I(J j, C0724d c0724d) {
        if (j != null) {
            if (c0724d != null) {
                InterfaceC0007h c6 = j.c();
                if ((c6 instanceof InterfaceC0004e) && b((InterfaceC0004e) c6, c0724d)) {
                    return true;
                }
                return false;
            }
            a(102);
            throw null;
        }
        a(101);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean J(InterfaceC0007h interfaceC0007h) {
        if (interfaceC0007h != null) {
            for (InterfaceC0007h interfaceC0007h2 = interfaceC0007h; interfaceC0007h2 != null; interfaceC0007h2 = interfaceC0007h2.q()) {
                if (interfaceC0007h2 instanceof F) {
                    return ((E) ((F) interfaceC0007h2)).f1461i.c(n.j);
                }
            }
            return false;
        }
        a(10);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:141:0x0419. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:142:0x041c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:143:0x041f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0409 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 11 && i4 != 13 && i4 != 15 && i4 != 69 && i4 != 74 && i4 != 81 && i4 != 84 && i4 != 86 && i4 != 87) {
            switch (i4) {
                default:
                    switch (i4) {
                        default:
                            switch (i4) {
                                default:
                                    switch (i4) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                    }
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    break;
            }
            if (i4 != 11 && i4 != 13 && i4 != 15 && i4 != 69 && i4 != 74 && i4 != 81 && i4 != 84 && i4 != 86 && i4 != 87) {
                switch (i4) {
                    default:
                        switch (i4) {
                            default:
                                switch (i4) {
                                    default:
                                        switch (i4) {
                                            case 55:
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 67:
                                                break;
                                            default:
                                                i8 = 3;
                                                break;
                                        }
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                        i8 = 2;
                                        break;
                                }
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                                break;
                        }
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        break;
                }
                Object[] objArr = new Object[i8];
                switch (i4) {
                    case 1:
                    case 72:
                        objArr[0] = "module";
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[0] = "computation";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    case 11:
                    case 13:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 69:
                    case 74:
                    case 81:
                    case 84:
                    case 86:
                    case 87:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                        break;
                    case 9:
                    case 10:
                    case 76:
                    case 77:
                    case 89:
                    case 96:
                    case 103:
                    case 107:
                    case 108:
                    case 143:
                    case 146:
                    case 147:
                    case 149:
                    case 157:
                    case 158:
                    case 159:
                        objArr[0] = "descriptor";
                        break;
                    case 12:
                    case 98:
                    case 100:
                    case 102:
                    case 104:
                    case 106:
                    case 135:
                        objArr[0] = "fqName";
                        break;
                    case 14:
                        objArr[0] = "simpleName";
                        break;
                    case 16:
                    case 17:
                    case 54:
                    case 88:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 97:
                    case 99:
                    case 105:
                    case 109:
                    case 110:
                    case 111:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 144:
                    case 145:
                    case 148:
                    case 150:
                    case 151:
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 161:
                        objArr[0] = "type";
                        break;
                    case 47:
                        objArr[0] = "classSimpleName";
                        break;
                    case 68:
                    case 70:
                        objArr[0] = "arrayType";
                        break;
                    case 71:
                        objArr[0] = "notNullArrayType";
                        break;
                    case 73:
                        objArr[0] = "primitiveType";
                        break;
                    case 75:
                        objArr[0] = "kotlinType";
                        break;
                    case 78:
                    case 82:
                        objArr[0] = "projectionType";
                        break;
                    case 79:
                    case 83:
                    case 85:
                        objArr[0] = "argument";
                        break;
                    case 80:
                        objArr[0] = "annotations";
                        break;
                    case 101:
                        objArr[0] = "typeConstructor";
                        break;
                    case 112:
                        objArr[0] = "classDescriptor";
                        break;
                    case 160:
                        objArr[0] = "declarationDescriptor";
                        break;
                    default:
                        objArr[0] = "storageManager";
                        break;
                }
                if (i4 == 11) {
                    if (i4 != 13) {
                        if (i4 != 15) {
                            if (i4 != 69) {
                                if (i4 != 74) {
                                    if (i4 != 81 && i4 != 84) {
                                        if (i4 != 86) {
                                            if (i4 != 87) {
                                                switch (i4) {
                                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                        objArr[1] = "getAdditionalClassPartsProvider";
                                                        break;
                                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                        objArr[1] = "getPlatformDependentDeclarationFilter";
                                                        break;
                                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                                        objArr[1] = "getClassDescriptorFactories";
                                                        break;
                                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                        objArr[1] = "getStorageManager";
                                                        break;
                                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                        objArr[1] = "getBuiltInsModule";
                                                        break;
                                                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                                        objArr[1] = "getBuiltInPackagesImportedByDefault";
                                                        break;
                                                    default:
                                                        switch (i4) {
                                                            case 18:
                                                                objArr[1] = "getSuspendFunction";
                                                                break;
                                                            case 19:
                                                                objArr[1] = "getKFunction";
                                                                break;
                                                            case 20:
                                                                objArr[1] = "getKSuspendFunction";
                                                                break;
                                                            case 21:
                                                                objArr[1] = "getKClass";
                                                                break;
                                                            case 22:
                                                                objArr[1] = "getKType";
                                                                break;
                                                            case 23:
                                                                objArr[1] = "getKCallable";
                                                                break;
                                                            case 24:
                                                                objArr[1] = "getKProperty";
                                                                break;
                                                            case 25:
                                                                objArr[1] = "getKProperty0";
                                                                break;
                                                            case 26:
                                                                objArr[1] = "getKProperty1";
                                                                break;
                                                            case 27:
                                                                objArr[1] = "getKProperty2";
                                                                break;
                                                            case 28:
                                                                objArr[1] = "getKMutableProperty0";
                                                                break;
                                                            case 29:
                                                                objArr[1] = "getKMutableProperty1";
                                                                break;
                                                            case 30:
                                                                objArr[1] = "getKMutableProperty2";
                                                                break;
                                                            case 31:
                                                                objArr[1] = "getIterator";
                                                                break;
                                                            case 32:
                                                                objArr[1] = "getIterable";
                                                                break;
                                                            case 33:
                                                                objArr[1] = "getMutableIterable";
                                                                break;
                                                            case 34:
                                                                objArr[1] = "getMutableIterator";
                                                                break;
                                                            case 35:
                                                                objArr[1] = "getCollection";
                                                                break;
                                                            case 36:
                                                                objArr[1] = "getMutableCollection";
                                                                break;
                                                            case 37:
                                                                objArr[1] = "getList";
                                                                break;
                                                            case 38:
                                                                objArr[1] = "getMutableList";
                                                                break;
                                                            case 39:
                                                                objArr[1] = "getSet";
                                                                break;
                                                            case 40:
                                                                objArr[1] = "getMutableSet";
                                                                break;
                                                            case 41:
                                                                objArr[1] = "getMap";
                                                                break;
                                                            case 42:
                                                                objArr[1] = "getMutableMap";
                                                                break;
                                                            case 43:
                                                                objArr[1] = "getMapEntry";
                                                                break;
                                                            case 44:
                                                                objArr[1] = "getMutableMapEntry";
                                                                break;
                                                            case 45:
                                                                objArr[1] = "getListIterator";
                                                                break;
                                                            case 46:
                                                                objArr[1] = "getMutableListIterator";
                                                                break;
                                                            default:
                                                                switch (i4) {
                                                                    case 48:
                                                                        objArr[1] = "getBuiltInTypeByClassName";
                                                                        break;
                                                                    case 49:
                                                                        objArr[1] = "getNothingType";
                                                                        break;
                                                                    case 50:
                                                                        objArr[1] = "getNullableNothingType";
                                                                        break;
                                                                    case 51:
                                                                        objArr[1] = "getAnyType";
                                                                        break;
                                                                    case 52:
                                                                        objArr[1] = "getNullableAnyType";
                                                                        break;
                                                                    case 53:
                                                                        objArr[1] = "getDefaultBound";
                                                                        break;
                                                                    default:
                                                                        switch (i4) {
                                                                            case 55:
                                                                                objArr[1] = "getPrimitiveKotlinType";
                                                                                break;
                                                                            case 56:
                                                                                objArr[1] = "getNumberType";
                                                                                break;
                                                                            case 57:
                                                                                objArr[1] = "getByteType";
                                                                                break;
                                                                            case 58:
                                                                                objArr[1] = "getShortType";
                                                                                break;
                                                                            case 59:
                                                                                objArr[1] = "getIntType";
                                                                                break;
                                                                            case 60:
                                                                                objArr[1] = "getLongType";
                                                                                break;
                                                                            case 61:
                                                                                objArr[1] = "getFloatType";
                                                                                break;
                                                                            case 62:
                                                                                objArr[1] = "getDoubleType";
                                                                                break;
                                                                            case 63:
                                                                                objArr[1] = "getCharType";
                                                                                break;
                                                                            case 64:
                                                                                objArr[1] = "getBooleanType";
                                                                                break;
                                                                            case 65:
                                                                                objArr[1] = "getUnitType";
                                                                                break;
                                                                            case 66:
                                                                                objArr[1] = "getStringType";
                                                                                break;
                                                                            case 67:
                                                                                objArr[1] = "getIterableType";
                                                                                break;
                                                                            default:
                                                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                }
                                            } else {
                                                objArr[1] = "getAnnotationType";
                                            }
                                        } else {
                                            objArr[1] = "getEnumType";
                                        }
                                    } else {
                                        objArr[1] = "getArrayType";
                                    }
                                } else {
                                    objArr[1] = "getPrimitiveArrayKotlinType";
                                }
                            } else {
                                objArr[1] = "getArrayElementType";
                            }
                        } else {
                            objArr[1] = "getBuiltInClassByName";
                        }
                    } else {
                        objArr[1] = "getBuiltInClassByFqName";
                    }
                } else {
                    objArr[1] = "getBuiltInsPackageScope";
                }
                switch (i4) {
                    case 1:
                        objArr[2] = "setBuiltInsModule";
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[2] = "setPostponedBuiltinsModuleComputation";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    case 11:
                    case 13:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 69:
                    case 74:
                    case 81:
                    case 84:
                    case 86:
                    case 87:
                        break;
                    case 9:
                        objArr[2] = "isBuiltIn";
                        break;
                    case 10:
                        objArr[2] = "isUnderKotlinPackage";
                        break;
                    case 12:
                        objArr[2] = "getBuiltInClassByFqName";
                        break;
                    case 14:
                        objArr[2] = "getBuiltInClassByName";
                        break;
                    case 16:
                        objArr[2] = "getPrimitiveClassDescriptor";
                        break;
                    case 17:
                        objArr[2] = "getPrimitiveArrayClassDescriptor";
                        break;
                    case 47:
                        objArr[2] = "getBuiltInTypeByClassName";
                        break;
                    case 54:
                        objArr[2] = "getPrimitiveKotlinType";
                        break;
                    case 68:
                        objArr[2] = "getArrayElementType";
                        break;
                    case 70:
                        objArr[2] = "getArrayElementTypeOrNull";
                        break;
                    case 71:
                    case 72:
                        objArr[2] = "getElementTypeForUnsignedArray";
                        break;
                    case 73:
                        objArr[2] = "getPrimitiveArrayKotlinType";
                        break;
                    case 75:
                        objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                        break;
                    case 76:
                    case 93:
                        objArr[2] = "getPrimitiveType";
                        break;
                    case 77:
                        objArr[2] = "getPrimitiveArrayType";
                        break;
                    case 78:
                    case 79:
                    case 80:
                    case 82:
                    case 83:
                        objArr[2] = "getArrayType";
                        break;
                    case 85:
                        objArr[2] = "getEnumType";
                        break;
                    case 88:
                        objArr[2] = "isArray";
                        break;
                    case 89:
                    case 90:
                        objArr[2] = "isArrayOrPrimitiveArray";
                        break;
                    case 91:
                        objArr[2] = "isPrimitiveArray";
                        break;
                    case 92:
                        objArr[2] = "getPrimitiveArrayElementType";
                        break;
                    case 94:
                        objArr[2] = "isPrimitiveType";
                        break;
                    case 95:
                        objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                        break;
                    case 96:
                        objArr[2] = "isPrimitiveClass";
                        break;
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                        objArr[2] = "isConstructedFromGivenClass";
                        break;
                    case 101:
                    case 102:
                        objArr[2] = "isTypeConstructorForGivenClass";
                        break;
                    case 103:
                    case 104:
                        objArr[2] = "classFqNameEquals";
                        break;
                    case 105:
                    case 106:
                        objArr[2] = "isNotNullConstructedFromGivenClass";
                        break;
                    case 107:
                        objArr[2] = "isSpecialClassWithNoSupertypes";
                        break;
                    case 108:
                    case 109:
                        objArr[2] = "isAny";
                        break;
                    case 110:
                    case 112:
                        objArr[2] = "isBoolean";
                        break;
                    case 111:
                        objArr[2] = "isBooleanOrNullableBoolean";
                        break;
                    case 113:
                        objArr[2] = "isNumber";
                        break;
                    case 114:
                        objArr[2] = "isChar";
                        break;
                    case 115:
                        objArr[2] = "isCharOrNullableChar";
                        break;
                    case 116:
                        objArr[2] = "isInt";
                        break;
                    case 117:
                        objArr[2] = "isByte";
                        break;
                    case 118:
                        objArr[2] = "isLong";
                        break;
                    case 119:
                        objArr[2] = "isLongOrNullableLong";
                        break;
                    case 120:
                        objArr[2] = "isShort";
                        break;
                    case 121:
                        objArr[2] = "isFloat";
                        break;
                    case 122:
                        objArr[2] = "isFloatOrNullableFloat";
                        break;
                    case 123:
                        objArr[2] = "isDouble";
                        break;
                    case 124:
                        objArr[2] = "isUByte";
                        break;
                    case 125:
                        objArr[2] = "isUShort";
                        break;
                    case 126:
                        objArr[2] = "isUInt";
                        break;
                    case 127:
                        objArr[2] = "isULong";
                        break;
                    case 128:
                        objArr[2] = "isUByteArray";
                        break;
                    case 129:
                        objArr[2] = "isUShortArray";
                        break;
                    case 130:
                        objArr[2] = "isUIntArray";
                        break;
                    case 131:
                        objArr[2] = "isULongArray";
                        break;
                    case 132:
                        objArr[2] = "isUnsignedArrayType";
                        break;
                    case 133:
                        objArr[2] = "isDoubleOrNullableDouble";
                        break;
                    case 134:
                    case 135:
                        objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                        break;
                    case 136:
                        objArr[2] = "isNothing";
                        break;
                    case 137:
                        objArr[2] = "isNullableNothing";
                        break;
                    case 138:
                        objArr[2] = "isNothingOrNullableNothing";
                        break;
                    case 139:
                        objArr[2] = "isAnyOrNullableAny";
                        break;
                    case 140:
                        objArr[2] = "isNullableAny";
                        break;
                    case 141:
                        objArr[2] = "isDefaultBound";
                        break;
                    case 142:
                        objArr[2] = "isUnit";
                        break;
                    case 143:
                        objArr[2] = "mayReturnNonUnitValue";
                        break;
                    case 144:
                        objArr[2] = "isUnitOrNullableUnit";
                        break;
                    case 145:
                        objArr[2] = "isBooleanOrSubtype";
                        break;
                    case 146:
                        objArr[2] = "isMemberOfAny";
                        break;
                    case 147:
                    case 148:
                        objArr[2] = "isEnum";
                        break;
                    case 149:
                    case 150:
                        objArr[2] = "isComparable";
                        break;
                    case 151:
                        objArr[2] = "isCollectionOrNullableCollection";
                        break;
                    case 152:
                        objArr[2] = "isListOrNullableList";
                        break;
                    case 153:
                        objArr[2] = "isSetOrNullableSet";
                        break;
                    case 154:
                        objArr[2] = "isMapOrNullableMap";
                        break;
                    case 155:
                        objArr[2] = "isIterableOrNullableIterable";
                        break;
                    case 156:
                        objArr[2] = "isThrowableOrNullableThrowable";
                        break;
                    case 157:
                        objArr[2] = "isThrowable";
                        break;
                    case 158:
                        objArr[2] = "isKClass";
                        break;
                    case 159:
                        objArr[2] = "isNonPrimitiveArray";
                        break;
                    case 160:
                        objArr[2] = "isDeprecated";
                        break;
                    case 161:
                        objArr[2] = "isNotNullOrNullableFunctionSupertype";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 11 && i4 != 13 && i4 != 15 && i4 != 69 && i4 != 74 && i4 != 81 && i4 != 84 && i4 != 86 && i4 != 87) {
                    switch (i4) {
                        default:
                            switch (i4) {
                                default:
                                    switch (i4) {
                                        default:
                                            switch (i4) {
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                            throw new IllegalStateException(format);
                                    }
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                    break;
                            }
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            break;
                    }
                }
                throw new IllegalStateException(format);
            }
            i8 = 2;
            Object[] objArr2 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 11) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
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
            Object[] objArr22 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 11) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 11) {
            }
            throw new IllegalStateException(format22);
        }
        i8 = 2;
        Object[] objArr222 = new Object[i8];
        switch (i4) {
        }
        if (i4 == 11) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 11) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(InterfaceC0004e interfaceC0004e, C0724d c0724d) {
        if (interfaceC0004e != null) {
            if (c0724d != null) {
                if (interfaceC0004e.getName().equals(c0724d.f()) && c0724d.equals(AbstractC0890e.g(interfaceC0004e))) {
                    return true;
                }
                return false;
            }
            a(104);
            throw null;
        }
        a(103);
        throw null;
    }

    public static j s(InterfaceC0007h interfaceC0007h) {
        if (interfaceC0007h != null) {
            if (!m.f16771e0.contains(interfaceC0007h.getName())) {
                return null;
            }
            return (j) m.f16775g0.get(AbstractC0890e.g(interfaceC0007h));
        }
        a(77);
        throw null;
    }

    public static j u(InterfaceC0004e interfaceC0004e) {
        if (interfaceC0004e != null) {
            if (!m.f16769d0.contains(interfaceC0004e.getName())) {
                return null;
            }
            return (j) m.f16773f0.get(AbstractC0890e.g(interfaceC0004e));
        }
        a(76);
        throw null;
    }

    public static boolean y(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            return B(abstractC1759v, m.f16762a);
        }
        a(139);
        throw null;
    }

    public static boolean z(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            return B(abstractC1759v, m.f16774g);
        }
        a(88);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Z5.g] */
    public final void c() {
        C1593c c1593c;
        C0725e c0725e = f16714e;
        o6.j.e(c0725e, "moduleName");
        v7.k kVar = this.f16718d;
        C c6 = new C(c0725e, kVar, this, 48);
        this.f16715a = c6;
        InterfaceC1880c.f16707a.getClass();
        InterfaceC1880c interfaceC1880c = (InterfaceC1880c) C1879b.f16706b.getValue();
        C c9 = this.f16715a;
        Iterable m6 = m();
        E6.d q6 = q();
        E6.b d2 = d();
        ((C1592b) interfaceC1880c).getClass();
        o6.j.e(c9, "builtInsModule");
        o6.j.e(m6, "classDescriptorFactories");
        o6.j.e(q6, "platformDependentDeclarationFilter");
        o6.j.e(d2, "additionalClassPartsProvider");
        Set<C0723c> set = n.f16807q;
        o6.j.e(set, "packageFqNames");
        ArrayList arrayList = new ArrayList();
        for (C0723c c0723c : set) {
            C1591a.f15138m.getClass();
            String a3 = C1591a.a(c0723c);
            o6.j.e(a3, "p0");
            InputStream m8 = C1594d.m(a3);
            if (m8 != null) {
                c1593c = h4.g.e(c0723c, kVar, c9, m8);
            } else {
                c1593c = null;
            }
            if (c1593c != null) {
                arrayList.add(c1593c);
            }
        }
        H h8 = new H(arrayList);
        A4.a aVar = new A4.a(kVar, c9);
        W5.a aVar2 = new W5.a(27, h8);
        C1591a c1591a = C1591a.f15138m;
        C1518i c1518i = new C1518i(kVar, c9, aVar2, new R3.r(c9, aVar, c1591a), h8, m6, aVar, d2, q6, c1591a.f14423a, null, new G5.e(kVar), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1593c) it.next()).N0(c1518i);
        }
        c6.f1452l = h8;
        C c10 = this.f16715a;
        c10.getClass();
        c10.k = new B(AbstractC0434i.i1(new C[]{c10}));
    }

    public E6.b d() {
        return E6.a.f1251b;
    }

    public final z e() {
        z l6 = k("Any").l();
        if (l6 != null) {
            return l6;
        }
        a(51);
        throw null;
    }

    public final AbstractC1759v f(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            AbstractC1759v g8 = g(abstractC1759v);
            if (g8 != null) {
                return g8;
            }
            throw new IllegalStateException("not array: " + abstractC1759v);
        }
        a(68);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1759v g(AbstractC1759v abstractC1759v) {
        A e9;
        C0722b f8;
        C0722b c0722b;
        InterfaceC0004e d2;
        z l6;
        if (abstractC1759v != null) {
            if (z(abstractC1759v)) {
                if (abstractC1759v.r0().size() == 1) {
                    return ((w7.M) abstractC1759v.r0().get(0)).b();
                }
            } else {
                W g8 = U.g(abstractC1759v, false);
                AbstractC1759v abstractC1759v2 = (AbstractC1759v) ((g) this.f16716b.a()).f16713b.get(g8);
                if (abstractC1759v2 != null) {
                    return abstractC1759v2;
                }
                int i4 = AbstractC0890e.f11774a;
                InterfaceC0007h c6 = g8.B0().c();
                if (c6 == null) {
                    e9 = null;
                } else {
                    e9 = AbstractC0890e.e(c6);
                }
                if (e9 != null) {
                    InterfaceC0007h c9 = g8.B0().c();
                    if (c9 != null) {
                        Set set = r.f16819a;
                        C0725e name = c9.getName();
                        o6.j.e(name, "name");
                        if (r.f16822d.contains(name) && (f8 = AbstractC1098d.f(c9)) != null && (c0722b = (C0722b) r.f16820b.get(f8)) != null && (d2 = AbstractC0021w.d(e9, c0722b)) != null) {
                            l6 = d2.l();
                            if (l6 == null) {
                                return l6;
                            }
                        }
                    }
                    l6 = null;
                    if (l6 == null) {
                    }
                }
            }
            return null;
        }
        a(70);
        throw null;
    }

    public final z h(W w8) {
        if (w8 != null) {
            return i(X.INVARIANT, w8, D6.i.f1043a);
        }
        a(83);
        throw null;
    }

    public final z i(X x8, AbstractC1759v abstractC1759v, D6.j jVar) {
        if (abstractC1759v != null) {
            return AbstractC1741c.s(AbstractC1741c.B(jVar), k("Array"), Collections.singletonList(new w7.E(abstractC1759v, x8)));
        }
        a(79);
        throw null;
    }

    public final InterfaceC0004e j(C0723c c0723c) {
        if (c0723c != null) {
            InterfaceC0004e j = AbstractC0021w.j(l(), c0723c);
            if (j != null) {
                return j;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public final InterfaceC0004e k(String str) {
        if (str != null) {
            return (InterfaceC0004e) this.f16717c.m(C0725e.e(str));
        }
        a(14);
        throw null;
    }

    public final C l() {
        this.f16715a.getClass();
        C c6 = this.f16715a;
        if (c6 != null) {
            return c6;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List singletonList = Collections.singletonList(new A6.a(this.f16718d, l()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public final z n() {
        z p8 = p();
        if (p8 != null) {
            return p8;
        }
        a(53);
        throw null;
    }

    public final z o() {
        z l6 = k("Nothing").l();
        if (l6 != null) {
            return l6;
        }
        a(49);
        throw null;
    }

    public final z p() {
        z I02 = e().I0(true);
        if (I02 != null) {
            return I02;
        }
        a(52);
        throw null;
    }

    public E6.d q() {
        return E6.a.f1253d;
    }

    public final z r(j jVar) {
        if (jVar != null) {
            z zVar = (z) ((g) this.f16716b.a()).f16712a.get(jVar);
            if (zVar != null) {
                return zVar;
            }
            a(74);
            throw null;
        }
        a(73);
        throw null;
    }

    public final z t(j jVar) {
        if (jVar != null) {
            z l6 = k(jVar.f16729d.b()).l();
            if (l6 != null) {
                return l6;
            }
            a(55);
            throw null;
        }
        a(54);
        throw null;
    }

    public final z v() {
        z l6 = k("String").l();
        if (l6 != null) {
            return l6;
        }
        a(66);
        throw null;
    }

    public final InterfaceC0004e w(int i4) {
        return j(n.f16798f.a(C0725e.e(A6.j.f402c.f404b + i4)));
    }

    public final z x() {
        z l6 = k("Unit").l();
        if (l6 != null) {
            return l6;
        }
        a(65);
        throw null;
    }
}
