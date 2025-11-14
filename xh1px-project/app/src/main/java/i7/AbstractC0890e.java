package i7;

import C6.A;
import C6.AbstractC0015p;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.F;
import C6.InterfaceC0001b;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import C6.InterfaceC0013n;
import C6.P;
import F6.E;
import F6.M;
import F6.y;
import f7.AbstractC0727g;
import f7.C0723c;
import f7.C0724d;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w7.AbstractC1759v;
import w7.J;

/* renamed from: i7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0890e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11774a = 0;

    static {
        new C0723c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "getFqNameSafe";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i4) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[2] = "getFqName";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[2] = "getFqNameSafe";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "getFqNameUnsafe";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static void b(InterfaceC0001b interfaceC0001b, LinkedHashSet linkedHashSet) {
        if (interfaceC0001b != null) {
            if (!linkedHashSet.contains(interfaceC0001b)) {
                Iterator it = interfaceC0001b.a().s().iterator();
                while (it.hasNext()) {
                    InterfaceC0001b a3 = ((InterfaceC0001b) it.next()).a();
                    b(a3, linkedHashSet);
                    linkedHashSet.add(a3);
                }
                return;
            }
            return;
        }
        a(72);
        throw null;
    }

    public static InterfaceC0004e c(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            J B02 = abstractC1759v.B0();
            if (B02 != null) {
                InterfaceC0004e interfaceC0004e = (InterfaceC0004e) B02.c();
                if (interfaceC0004e != null) {
                    return interfaceC0004e;
                }
                a(47);
                throw null;
            }
            a(46);
            throw null;
        }
        a(45);
        throw null;
    }

    public static A d(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            A e9 = e(interfaceC0010k);
            if (e9 != null) {
                return e9;
            }
            a(22);
            throw null;
        }
        a(21);
        throw null;
    }

    public static A e(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            while (interfaceC0010k != null) {
                if (interfaceC0010k instanceof A) {
                    return (A) interfaceC0010k;
                }
                if (interfaceC0010k instanceof C6.J) {
                    return ((y) ((C6.J) interfaceC0010k)).f1609g;
                }
                interfaceC0010k = interfaceC0010k.q();
            }
            return null;
        }
        a(23);
        throw null;
    }

    public static P f(InterfaceC0010k interfaceC0010k) {
        P p8 = P.f727e;
        if (interfaceC0010k != null) {
            if (interfaceC0010k instanceof M) {
                interfaceC0010k = ((M) interfaceC0010k).M0();
            }
            if (interfaceC0010k instanceof InterfaceC0011l) {
                ((InterfaceC0011l) interfaceC0010k).h().getClass();
            }
            return p8;
        }
        a(81);
        throw null;
    }

    public static C0724d g(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            C0723c h8 = h(interfaceC0010k);
            if (h8 != null) {
                return h8.f10797a;
            }
            return g(interfaceC0010k.q()).a(interfaceC0010k.getName());
        }
        a(2);
        throw null;
    }

    public static C0723c h(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            if (!(interfaceC0010k instanceof A) && !y7.l.f(interfaceC0010k)) {
                if (interfaceC0010k instanceof C6.J) {
                    return ((y) ((C6.J) interfaceC0010k)).f1610h;
                }
                if (!(interfaceC0010k instanceof F)) {
                    return null;
                }
                return ((E) ((F) interfaceC0010k)).f1461i;
            }
            return C0723c.f10796c;
        }
        a(5);
        throw null;
    }

    public static InterfaceC0010k i(InterfaceC0010k interfaceC0010k, Class cls, boolean z8) {
        if (interfaceC0010k != null) {
            if (z8) {
                interfaceC0010k = interfaceC0010k.q();
            }
            while (interfaceC0010k != null) {
                if (cls.isInstance(interfaceC0010k)) {
                    return interfaceC0010k;
                }
                interfaceC0010k = interfaceC0010k.q();
            }
            return null;
        }
        return null;
    }

    public static InterfaceC0004e j(InterfaceC0004e interfaceC0004e) {
        if (interfaceC0004e != null) {
            Iterator it = interfaceC0004e.B().d().iterator();
            while (it.hasNext()) {
                InterfaceC0004e c6 = c((AbstractC1759v) it.next());
                if (c6.e() != EnumC0005f.f742e) {
                    return c6;
                }
            }
            return null;
        }
        a(44);
        throw null;
    }

    public static boolean k(InterfaceC0010k interfaceC0010k) {
        if (m(interfaceC0010k, EnumC0005f.f741d) && interfaceC0010k.getName().equals(AbstractC0727g.f10808a)) {
            return true;
        }
        return false;
    }

    public static boolean l(InterfaceC0010k interfaceC0010k) {
        if (m(interfaceC0010k, EnumC0005f.f746i) && ((InterfaceC0004e) interfaceC0010k).E()) {
            return true;
        }
        return false;
    }

    public static boolean m(InterfaceC0010k interfaceC0010k, EnumC0005f enumC0005f) {
        if ((interfaceC0010k instanceof InterfaceC0004e) && ((InterfaceC0004e) interfaceC0010k).e() == enumC0005f) {
            return true;
        }
        return false;
    }

    public static boolean n(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            while (interfaceC0010k != null) {
                if (k(interfaceC0010k) || ((interfaceC0010k instanceof InterfaceC0013n) && ((InterfaceC0013n) interfaceC0010k).d() == AbstractC0015p.f759f)) {
                    return true;
                }
                interfaceC0010k = interfaceC0010k.q();
            }
            return false;
        }
        a(1);
        throw null;
    }

    public static boolean o(AbstractC1759v abstractC1759v, InterfaceC0010k interfaceC0010k) {
        if (abstractC1759v != null) {
            if (interfaceC0010k != null) {
                InterfaceC0007h c6 = abstractC1759v.B0().c();
                if (c6 != null) {
                    InterfaceC0010k a3 = c6.a();
                    if ((a3 instanceof InterfaceC0007h) && (interfaceC0010k instanceof InterfaceC0007h) && ((InterfaceC0007h) interfaceC0010k).B().equals(((InterfaceC0007h) a3).B())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            a(31);
            throw null;
        }
        a(30);
        throw null;
    }

    public static boolean p(InterfaceC0010k interfaceC0010k) {
        if ((m(interfaceC0010k, EnumC0005f.f741d) || m(interfaceC0010k, EnumC0005f.f742e)) && ((InterfaceC0004e) interfaceC0010k).j() == EnumC0023y.f779f) {
            return true;
        }
        return false;
    }

    public static boolean q(AbstractC1759v abstractC1759v, InterfaceC0010k interfaceC0010k) {
        if (abstractC1759v != null) {
            if (interfaceC0010k != null) {
                if (!o(abstractC1759v, interfaceC0010k)) {
                    Iterator it = abstractC1759v.B0().d().iterator();
                    while (it.hasNext()) {
                        if (q((AbstractC1759v) it.next(), interfaceC0010k)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            a(33);
            throw null;
        }
        a(32);
        throw null;
    }

    public static boolean r(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null && (interfaceC0010k.q() instanceof F)) {
            return true;
        }
        return false;
    }

    public static InterfaceC0002c s(InterfaceC0002c interfaceC0002c) {
        if (interfaceC0002c != null) {
            while (interfaceC0002c.e() == 2) {
                Collection s8 = interfaceC0002c.s();
                if (!s8.isEmpty()) {
                    interfaceC0002c = (InterfaceC0002c) s8.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC0002c);
                }
            }
            return interfaceC0002c;
        }
        a(58);
        throw null;
    }
}
