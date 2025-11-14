package w7;

import C6.InterfaceC0004e;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: w7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1747i extends AbstractC1740b {

    /* renamed from: c, reason: collision with root package name */
    public final F6.A f15997c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15998d;

    /* renamed from: e, reason: collision with root package name */
    public final Collection f15999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1747i(F6.A a3, List list, Collection collection, v7.n nVar) {
        super(nVar);
        if (list != null) {
            if (collection != null) {
                if (nVar != null) {
                    this.f15997c = a3;
                    this.f15998d = Collections.unmodifiableList(new ArrayList(list));
                    this.f15999e = Collections.unmodifiableCollection(collection);
                    return;
                }
                l(3);
                throw null;
            }
            l(2);
            throw null;
        }
        l(1);
        throw null;
    }

    public static /* synthetic */ void l(int i4) {
        String str;
        int i8;
        if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "parameters";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "supertypes";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "storageManager";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i4 != 4) {
            if (i4 != 5) {
                if (i4 != 6) {
                    if (i4 != 7) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                    } else {
                        objArr[1] = "getSupertypeLoopChecker";
                    }
                } else {
                    objArr[1] = "computeSupertypes";
                }
            } else {
                objArr[1] = "getDeclarationDescriptor";
            }
        } else {
            objArr[1] = "getParameters";
        }
        if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // w7.J
    public final boolean a() {
        return true;
    }

    @Override // w7.J
    public final List e() {
        List list = this.f15998d;
        if (list != null) {
            return list;
        }
        l(4);
        throw null;
    }

    @Override // w7.AbstractC1744f
    public final Collection f() {
        Collection collection = this.f15999e;
        if (collection != null) {
            return collection;
        }
        l(6);
        throw null;
    }

    @Override // w7.AbstractC1744f
    public final C6.P h() {
        return C6.P.f728f;
    }

    @Override // w7.AbstractC1740b
    /* renamed from: m */
    public final InterfaceC0004e c() {
        F6.A a3 = this.f15997c;
        if (a3 != null) {
            return a3;
        }
        l(5);
        throw null;
    }

    public final String toString() {
        return AbstractC0890e.g(this.f15997c).f10800a;
    }
}
