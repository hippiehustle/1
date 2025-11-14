package F6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.InterfaceC0010k;
import f7.C0725e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p7.C1332n;
import p7.InterfaceC1333o;
import w7.C1747i;
import x7.C1824f;

/* renamed from: F6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0052l extends AbstractC0051k {
    public final EnumC0023y j;
    public final EnumC0005f k;

    /* renamed from: l, reason: collision with root package name */
    public final C1747i f1539l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC1333o f1540m;

    /* renamed from: n, reason: collision with root package name */
    public Set f1541n;

    /* renamed from: o, reason: collision with root package name */
    public C0050j f1542o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052l(InterfaceC0010k interfaceC0010k, C0725e c0725e, EnumC0023y enumC0023y, EnumC0005f enumC0005f, List list, v7.n nVar) {
        super(nVar, interfaceC0010k, c0725e, C6.O.f726a);
        if (interfaceC0010k != null) {
            if (c0725e != null) {
                if (nVar != null) {
                    this.j = enumC0023y;
                    this.k = enumC0005f;
                    this.f1539l = new C1747i(this, Collections.EMPTY_LIST, list, nVar);
                    return;
                }
                V(6);
                throw null;
            }
            V(1);
            throw null;
        }
        V(0);
        throw null;
    }

    public static /* synthetic */ void V(int i4) {
        String str;
        int i8;
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i8 = 2;
                break;
            case 12:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "name";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "modality";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "kind";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "supertypes";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "storageManager";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i4) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // C6.InterfaceC0007h
    public final w7.J B() {
        C1747i c1747i = this.f1539l;
        if (c1747i != null) {
            return c1747i;
        }
        V(10);
        throw null;
    }

    @Override // F6.A
    public final InterfaceC1333o C(C1824f c1824f) {
        InterfaceC1333o interfaceC1333o = this.f1540m;
        if (interfaceC1333o != null) {
            return interfaceC1333o;
        }
        V(13);
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
        Set set = this.f1541n;
        if (set != null) {
            return set;
        }
        V(11);
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
        V(17);
        throw null;
    }

    @Override // C6.InterfaceC0008i
    public final boolean d0() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final EnumC0005f e() {
        EnumC0005f enumC0005f = this.k;
        if (enumC0005f != null) {
            return enumC0005f;
        }
        V(15);
        throw null;
    }

    @Override // C6.InterfaceC0004e
    public final boolean g() {
        return false;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        return D6.i.f1043a;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x
    public final EnumC0023y j() {
        EnumC0023y enumC0023y = this.j;
        if (enumC0023y != null) {
            return enumC0023y;
        }
        V(16);
        throw null;
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
        return this.f1542o;
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o o0() {
        return C1332n.f13842b;
    }

    public final void r0(InterfaceC1333o interfaceC1333o, Set set, C0050j c0050j) {
        this.f1540m = interfaceC1333o;
        this.f1541n = set;
        this.f1542o = c0050j;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0008i
    public final List t() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        V(18);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }
}
