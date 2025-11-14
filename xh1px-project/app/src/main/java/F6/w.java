package F6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import f7.AbstractC0727g;
import f7.C0725e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import q7.C1422c;
import q7.InterfaceC1423d;
import w7.AbstractC1759v;
import w7.X;

/* loaded from: classes.dex */
public final class w extends AbstractC0054n implements C6.K {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1603g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0010k f1604h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1423d f1605i;

    public w(InterfaceC0004e interfaceC0004e) {
        super(D6.i.f1043a, AbstractC0727g.f10811d);
        this.f1604h = interfaceC0004e;
        this.f1605i = new C1422c(interfaceC0004e);
    }

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 1 && i4 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "newOwner";
            }
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        }
        if (i4 != 1) {
            if (i4 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public static /* synthetic */ void H0(int i4) {
        String str;
        int i8;
        if (i4 != 7 && i4 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 7 && i4 != 8) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "value";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "annotations";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "name";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i4 != 7) {
            if (i4 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        switch (i4) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 7 || i4 == 8) {
            throw new IllegalStateException(format);
        }
    }

    public static /* synthetic */ void L0(int i4) {
        String str;
        int i8;
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "name";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "substitutor";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getTypeParameters";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getType";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getValueParameters";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i4) {
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[2] = "substitute";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // C6.InterfaceC0001b
    public final w A() {
        return null;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.S(this, obj);
    }

    @Override // C6.InterfaceC0001b
    public final w M() {
        return null;
    }

    public final InterfaceC1423d M0() {
        switch (this.f1603g) {
            case 0:
                C1422c c1422c = (C1422c) this.f1605i;
                if (c1422c != null) {
                    return c1422c;
                }
                G0(1);
                throw null;
            default:
                D6.b bVar = (D6.b) this.f1605i;
                if (bVar != null) {
                    return bVar;
                }
                H0(7);
                throw null;
        }
    }

    @Override // C6.Q
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final w f(w7.Q q6) {
        AbstractC1759v i4;
        if (q6 != null) {
            if (!q6.f15972a.e()) {
                if (q() instanceof InterfaceC0004e) {
                    i4 = q6.i(b(), X.OUT_VARIANCE);
                } else {
                    i4 = q6.i(b(), X.INVARIANT);
                }
                if (i4 == null) {
                    return null;
                }
                if (i4 != b()) {
                    return new w(q(), new D6.b(i4), getAnnotations());
                }
            }
            return this;
        }
        L0(3);
        throw null;
    }

    @Override // C6.InterfaceC0001b
    public final boolean S() {
        return false;
    }

    @Override // F6.AbstractC0054n, C6.InterfaceC0010k
    public final InterfaceC0001b a() {
        return this;
    }

    @Override // D6.b, q7.InterfaceC1423d
    public final AbstractC1759v b() {
        AbstractC1759v b4 = M0().b();
        if (b4 != null) {
            return b4;
        }
        L0(6);
        throw null;
    }

    @Override // C6.InterfaceC0013n
    public final C0014o d() {
        C0014o c0014o = AbstractC0015p.f759f;
        if (c0014o != null) {
            return c0014o;
        }
        L0(9);
        throw null;
    }

    @Override // C6.InterfaceC0001b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        L0(5);
        throw null;
    }

    @Override // C6.InterfaceC0011l
    public final C6.O h() {
        return C6.O.f726a;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        switch (this.f1603g) {
            case 0:
                InterfaceC0004e interfaceC0004e = (InterfaceC0004e) this.f1604h;
                if (interfaceC0004e != null) {
                    return interfaceC0004e;
                }
                G0(2);
                throw null;
            default:
                InterfaceC0010k interfaceC0010k = this.f1604h;
                if (interfaceC0010k != null) {
                    return interfaceC0010k;
                }
                H0(8);
                throw null;
        }
    }

    @Override // C6.InterfaceC0001b
    public final AbstractC1759v r() {
        return b();
    }

    @Override // C6.InterfaceC0001b
    public final Collection s() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        L0(8);
        throw null;
    }

    @Override // F6.AbstractC0054n, D6.b
    public String toString() {
        switch (this.f1603g) {
            case 0:
                return "class " + ((InterfaceC0004e) this.f1604h).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // C6.InterfaceC0001b
    public final List z0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        L0(7);
        throw null;
    }

    @Override // F6.AbstractC0054n, C6.InterfaceC0010k
    public final InterfaceC0010k a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(InterfaceC0010k interfaceC0010k, D6.b bVar, D6.j jVar) {
        this(interfaceC0010k, bVar, jVar, AbstractC0727g.f10811d);
        if (interfaceC0010k == null) {
            H0(0);
            throw null;
        }
        if (jVar != null) {
        } else {
            H0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(InterfaceC0010k interfaceC0010k, D6.b bVar, D6.j jVar, C0725e c0725e) {
        super(jVar, c0725e);
        if (interfaceC0010k == null) {
            H0(3);
            throw null;
        }
        if (jVar == null) {
            H0(5);
            throw null;
        }
        if (c0725e != null) {
            this.f1604h = interfaceC0010k;
            this.f1605i = bVar;
            return;
        }
        H0(6);
        throw null;
    }
}
