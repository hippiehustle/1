package F6;

import C6.InterfaceC0007h;
import i7.C0886a;
import i7.C0888c;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m7.AbstractC1098d;
import w7.AbstractC1744f;
import w7.AbstractC1759v;

/* renamed from: F6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048h extends AbstractC1744f {

    /* renamed from: c, reason: collision with root package name */
    public final C6.P f1530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0049i f1531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048h(AbstractC0049i abstractC0049i, v7.n nVar, C6.P p8) {
        super(nVar);
        if (nVar != null) {
            this.f1531d = abstractC0049i;
            this.f1530c = p8;
            return;
        }
        l(0);
        throw null;
    }

    public static /* synthetic */ void l(int i4) {
        String str;
        int i8;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 8) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "type";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            if (i4 != 8) {
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                            } else {
                                objArr[1] = "processSupertypesWithoutCycles";
                            }
                        } else {
                            objArr[1] = "getSupertypeLoopChecker";
                        }
                    } else {
                        objArr[1] = "getBuiltIns";
                    }
                } else {
                    objArr[1] = "getDeclarationDescriptor";
                }
            } else {
                objArr[1] = "getParameters";
            }
        } else {
            objArr[1] = "computeSupertypes";
        }
        switch (i4) {
            case 1:
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // w7.J
    public final boolean a() {
        return true;
    }

    @Override // w7.J
    public final InterfaceC0007h c() {
        AbstractC0049i abstractC0049i = this.f1531d;
        if (abstractC0049i != null) {
            return abstractC0049i;
        }
        l(3);
        throw null;
    }

    @Override // w7.J
    public final List e() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l(2);
        throw null;
    }

    @Override // w7.AbstractC1744f
    public final Collection f() {
        List N02 = this.f1531d.N0();
        if (N02 != null) {
            return N02;
        }
        l(1);
        throw null;
    }

    @Override // w7.AbstractC1744f
    public final AbstractC1759v g() {
        return y7.l.c(y7.k.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // w7.AbstractC1744f
    public final C6.P h() {
        C6.P p8 = this.f1530c;
        if (p8 != null) {
            return p8;
        }
        l(5);
        throw null;
    }

    @Override // w7.AbstractC1744f
    public final boolean j(InterfaceC0007h interfaceC0007h) {
        if (interfaceC0007h instanceof C6.T) {
            C0886a c0886a = C0886a.f11770d;
            if (C0888c.f11773a.d(this.f1531d, (C6.T) interfaceC0007h, true, c0886a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // w7.AbstractC1744f
    public final List k(List list) {
        List M02 = this.f1531d.M0(list);
        if (M02 != null) {
            return M02;
        }
        l(8);
        throw null;
    }

    @Override // w7.J
    public final z6.h o() {
        z6.h e9 = AbstractC1098d.e(this.f1531d);
        if (e9 != null) {
            return e9;
        }
        l(4);
        throw null;
    }

    public final String toString() {
        return this.f1531d.getName().f10804d;
    }
}
