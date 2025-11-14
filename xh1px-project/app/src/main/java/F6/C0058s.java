package F6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import f7.C0725e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p7.C1332n;
import p7.InterfaceC1333o;
import w7.C1747i;
import x7.C1824f;

/* renamed from: F6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058s extends AbstractC0051k {
    public final C1747i j;
    public final r k;

    /* renamed from: l, reason: collision with root package name */
    public final v7.l f1556l;

    /* renamed from: m, reason: collision with root package name */
    public final D6.j f1557m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058s(v7.n nVar, InterfaceC0004e interfaceC0004e, w7.z zVar, C0725e c0725e, v7.l lVar, D6.j jVar, C6.O o7) {
        super(nVar, interfaceC0004e, c0725e, o7);
        if (nVar != null) {
            if (interfaceC0004e != null) {
                if (zVar != null) {
                    if (c0725e != null) {
                        if (lVar != null) {
                            this.f1557m = jVar;
                            this.j = new C1747i(this, Collections.EMPTY_LIST, Collections.singleton(zVar), nVar);
                            this.k = new r(this, nVar);
                            this.f1556l = lVar;
                            return;
                        }
                        V(10);
                        throw null;
                    }
                    V(9);
                    throw null;
                }
                V(8);
                throw null;
            }
            V(7);
            throw null;
        }
        V(6);
        throw null;
    }

    public static /* synthetic */ void V(int i4) {
        String str;
        int i8;
        switch (i4) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case 9:
                objArr[0] = "name";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case 11:
                objArr[0] = "annotations";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case 12:
                objArr[0] = "source";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                objArr[0] = "storageManager";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "containingClass";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i4) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i4) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static C0058s r0(v7.n nVar, InterfaceC0004e interfaceC0004e, C0725e c0725e, v7.i iVar, D6.j jVar, C6.O o7) {
        if (nVar != null) {
            if (interfaceC0004e != null) {
                if (c0725e != null) {
                    if (iVar != null) {
                        return new C0058s(nVar, interfaceC0004e, interfaceC0004e.l(), c0725e, iVar, jVar, o7);
                    }
                    V(3);
                    throw null;
                }
                V(2);
                throw null;
            }
            V(1);
            throw null;
        }
        V(0);
        throw null;
    }

    @Override // C6.InterfaceC0007h
    public final w7.J B() {
        C1747i c1747i = this.j;
        if (c1747i != null) {
            return c1747i;
        }
        V(17);
        throw null;
    }

    @Override // F6.A
    public final InterfaceC1333o C(C1824f c1824f) {
        r rVar = this.k;
        if (rVar != null) {
            return rVar;
        }
        V(14);
        throw null;
    }

    @Override // C6.InterfaceC0004e
    public final boolean D0() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final boolean E() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final Collection G() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        V(16);
        throw null;
    }

    @Override // C6.InterfaceC0004e
    public final boolean N() {
        return false;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return false;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x, C6.InterfaceC0013n
    public final C0014o d() {
        C0014o c0014o = AbstractC0015p.f758e;
        if (c0014o != null) {
            return c0014o;
        }
        V(20);
        throw null;
    }

    @Override // C6.InterfaceC0008i
    public final boolean d0() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final EnumC0005f e() {
        return EnumC0005f.f744g;
    }

    @Override // C6.InterfaceC0004e
    public final boolean g() {
        return false;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        D6.j jVar = this.f1557m;
        if (jVar != null) {
            return jVar;
        }
        V(21);
        throw null;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x
    public final EnumC0023y j() {
        return EnumC0023y.f778e;
    }

    @Override // C6.InterfaceC0004e
    public final C6.U l0() {
        return null;
    }

    @Override // C6.InterfaceC0004e
    public final boolean m() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final C0050j n0() {
        return null;
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o o0() {
        return C1332n.f13842b;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0008i
    public final List t() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        V(22);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }
}
