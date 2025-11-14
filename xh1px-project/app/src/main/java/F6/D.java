package F6;

import C6.C0014o;
import C6.EnumC0005f;
import C6.EnumC0023y;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p7.C1332n;
import p7.InterfaceC1333o;
import w7.C1747i;
import x7.C1824f;

/* loaded from: classes.dex */
public final class D extends AbstractC0051k {
    public final EnumC0005f j;
    public EnumC0023y k;

    /* renamed from: l, reason: collision with root package name */
    public C0014o f1456l;

    /* renamed from: m, reason: collision with root package name */
    public C1747i f1457m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1458n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1459o;

    /* renamed from: p, reason: collision with root package name */
    public final v7.n f1460p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(B6.p pVar, C0725e c0725e, v7.n nVar) {
        super(nVar, pVar, c0725e, C6.O.f726a);
        if (nVar != null) {
            this.f1459o = new ArrayList();
            this.f1460p = nVar;
            this.j = EnumC0005f.f742e;
            return;
        }
        V(4);
        throw null;
    }

    public static /* synthetic */ void V(int i4) {
        String str;
        int i8;
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i8 = 2;
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "kind";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "name";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "source";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "storageManager";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getAnnotations";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getModality";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // C6.InterfaceC0007h
    public final w7.J B() {
        C1747i c1747i = this.f1457m;
        if (c1747i != null) {
            return c1747i;
        }
        V(11);
        throw null;
    }

    @Override // F6.A
    public final InterfaceC1333o C(C1824f c1824f) {
        return C1332n.f13842b;
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
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        V(13);
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
        C0014o c0014o = this.f1456l;
        if (c0014o != null) {
            return c0014o;
        }
        V(10);
        throw null;
    }

    @Override // C6.InterfaceC0008i
    public final boolean d0() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final EnumC0005f e() {
        EnumC0005f enumC0005f = this.j;
        if (enumC0005f != null) {
            return enumC0005f;
        }
        V(8);
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
        EnumC0023y enumC0023y = this.k;
        if (enumC0023y != null) {
            return enumC0023y;
        }
        V(7);
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
        return null;
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o o0() {
        return C1332n.f13842b;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0008i
    public final List t() {
        ArrayList arrayList = this.f1458n;
        if (arrayList != null) {
            return arrayList;
        }
        V(15);
        throw null;
    }

    public final String toString() {
        return AbstractC0054n.K0(this);
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }
}
