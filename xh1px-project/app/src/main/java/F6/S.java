package F6;

import C6.InterfaceC0010k;
import f7.C0725e;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC1098d;
import w7.AbstractC1741c;
import w7.X;

/* loaded from: classes.dex */
public final class S extends AbstractC0049i {

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1509o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1510p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public S(InterfaceC0010k interfaceC0010k, D6.j jVar, boolean z8, X x8, C0725e c0725e, int i4, v7.n nVar) {
        super(nVar, interfaceC0010k, jVar, c0725e, x8, z8, i4, r8);
        C6.P p8 = C6.P.f728f;
        if (interfaceC0010k != null) {
            if (jVar != null) {
                if (x8 != null) {
                    if (c0725e != null) {
                        if (nVar != null) {
                            this.f1509o = new ArrayList(1);
                            this.f1510p = false;
                            return;
                        }
                        G0(25);
                        throw null;
                    }
                    G0(22);
                    throw null;
                }
                G0(21);
                throw null;
            }
            G0(20);
            throw null;
        }
        G0(19);
        throw null;
    }

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 5 && i4 != 28) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 5 && i4 != 28) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i4 != 5) {
            if (i4 != 28) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
            } else {
                objArr[1] = "resolveUpperBounds";
            }
        } else {
            objArr[1] = "createWithDefaultBound";
        }
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case 28:
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 5 || i4 == 28) {
            throw new IllegalStateException(format);
        }
    }

    public static S O0(InterfaceC0010k interfaceC0010k, D6.j jVar, boolean z8, X x8, C0725e c0725e, int i4, v7.n nVar) {
        if (interfaceC0010k != null) {
            if (jVar != null) {
                if (x8 != null) {
                    if (c0725e != null) {
                        if (nVar != null) {
                            return new S(interfaceC0010k, jVar, z8, x8, c0725e, i4, nVar);
                        }
                        G0(11);
                        throw null;
                    }
                    G0(9);
                    throw null;
                }
                G0(8);
                throw null;
            }
            G0(7);
            throw null;
        }
        G0(6);
        throw null;
    }

    public static S P0(AbstractC0042b abstractC0042b, X x8, C0725e c0725e, int i4, v7.n nVar) {
        if (nVar != null) {
            S O02 = O0(abstractC0042b, D6.i.f1043a, false, x8, c0725e, i4, nVar);
            w7.z n3 = AbstractC1098d.e(abstractC0042b).n();
            if (!O02.f1510p) {
                if (!AbstractC1741c.j(n3)) {
                    O02.f1509o.add(n3);
                }
                if (!O02.f1510p) {
                    O02.f1510p = true;
                    return O02;
                }
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + O02.Q0());
            }
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + O02.Q0());
        }
        G0(4);
        throw null;
    }

    @Override // F6.AbstractC0049i
    public final List N0() {
        if (this.f1510p) {
            ArrayList arrayList = this.f1509o;
            if (arrayList != null) {
                return arrayList;
            }
            G0(28);
            throw null;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + Q0());
    }

    public final String Q0() {
        return getName() + " declared in " + AbstractC0890e.g(q());
    }
}
