package F6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0000a;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0011l;
import C6.InterfaceC0019u;
import C6.InterfaceC0022x;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class I extends AbstractC0055o implements C6.L {

    /* renamed from: i, reason: collision with root package name */
    public boolean f1466i;
    public final boolean j;
    public final EnumC0023y k;

    /* renamed from: l, reason: collision with root package name */
    public final C6.M f1467l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1468m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1469n;

    /* renamed from: o, reason: collision with root package name */
    public C0014o f1470o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0019u f1471p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(EnumC0023y enumC0023y, C0014o c0014o, C6.M m6, D6.j jVar, C0725e c0725e, boolean z8, boolean z9, boolean z10, int i4, C6.O o7) {
        super(m6.q(), jVar, c0725e, o7);
        if (enumC0023y != null) {
            if (c0014o != null) {
                if (jVar != null) {
                    if (o7 != null) {
                        this.f1471p = null;
                        this.k = enumC0023y;
                        this.f1470o = c0014o;
                        this.f1467l = m6;
                        this.f1466i = z8;
                        this.j = z9;
                        this.f1468m = z10;
                        this.f1469n = i4;
                        return;
                    }
                    G0(5);
                    throw null;
                }
                G0(3);
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
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i8 = 2;
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "visibility";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "correspondingProperty";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "annotations";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "name";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i4) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getKind";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i4) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // C6.InterfaceC0001b
    public final w A() {
        return M0().A();
    }

    @Override // C6.InterfaceC0019u
    public final boolean A0() {
        return false;
    }

    @Override // C6.InterfaceC0001b
    public final Object L(InterfaceC0000a interfaceC0000a) {
        return null;
    }

    @Override // C6.InterfaceC0001b
    public final w M() {
        return M0().M();
    }

    public final C6.M M0() {
        C6.M m6 = this.f1467l;
        if (m6 != null) {
            return m6;
        }
        G0(13);
        throw null;
    }

    public final ArrayList N0(boolean z8) {
        InterfaceC0022x i4;
        ArrayList arrayList = new ArrayList(0);
        for (C6.M m6 : M0().s()) {
            if (z8) {
                i4 = m6.c();
            } else {
                i4 = m6.i();
            }
            if (i4 != null) {
                arrayList.add(i4);
            }
        }
        return arrayList;
    }

    @Override // C6.InterfaceC0001b
    public final boolean S() {
        return false;
    }

    @Override // C6.InterfaceC0001b
    public final List W() {
        List W7 = M0().W();
        if (W7 != null) {
            return W7;
        }
        G0(14);
        throw null;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return false;
    }

    @Override // C6.InterfaceC0013n
    public final C0014o d() {
        C0014o c0014o = this.f1470o;
        if (c0014o != null) {
            return c0014o;
        }
        G0(11);
        throw null;
    }

    @Override // C6.InterfaceC0002c
    public final int e() {
        int i4 = this.f1469n;
        if (i4 != 0) {
            return i4;
        }
        G0(6);
        throw null;
    }

    @Override // C6.InterfaceC0019u, C6.Q
    public final InterfaceC0019u f(w7.Q q6) {
        if (q6 != null) {
            return this;
        }
        G0(7);
        throw null;
    }

    @Override // C6.InterfaceC0019u
    public final boolean g() {
        return this.f1468m;
    }

    @Override // C6.InterfaceC0019u
    public final boolean g0() {
        return false;
    }

    @Override // C6.InterfaceC0001b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(9);
        throw null;
    }

    @Override // C6.InterfaceC0002c
    public final void h0(Collection collection) {
        if (collection != null) {
            return;
        }
        G0(16);
        throw null;
    }

    @Override // C6.InterfaceC0019u
    public final boolean i0() {
        return false;
    }

    @Override // C6.InterfaceC0022x
    public final EnumC0023y j() {
        EnumC0023y enumC0023y = this.k;
        if (enumC0023y != null) {
            return enumC0023y;
        }
        G0(10);
        throw null;
    }

    @Override // C6.InterfaceC0019u
    public final boolean j0() {
        return false;
    }

    @Override // C6.InterfaceC0019u
    public final boolean p() {
        return false;
    }

    @Override // C6.InterfaceC0019u
    public final boolean q0() {
        return false;
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }

    @Override // C6.InterfaceC0002c
    public final InterfaceC0002c x(InterfaceC0004e interfaceC0004e, EnumC0023y enumC0023y, C0014o c0014o) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // C6.InterfaceC0019u
    public final InterfaceC0019u y() {
        return this.f1471p;
    }

    @Override // C6.InterfaceC0022x
    public final boolean z() {
        return this.j;
    }

    @Override // C6.Q
    public final /* bridge */ /* synthetic */ InterfaceC0011l f(w7.Q q6) {
        f(q6);
        return this;
    }
}
