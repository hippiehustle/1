package F6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0012m;
import f7.C0725e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class L extends I implements C6.L {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC1759v f1500q;

    /* renamed from: r, reason: collision with root package name */
    public final L f1501r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C6.M m6, D6.j jVar, EnumC0023y enumC0023y, C0014o c0014o, boolean z8, boolean z9, boolean z10, int i4, L l6, C6.O o7) {
        super(enumC0023y, c0014o, m6, jVar, C0725e.g("<get-" + m6.getName() + ">"), z8, z9, z10, i4, o7);
        L l8;
        if (jVar != null) {
            if (enumC0023y != null) {
                if (c0014o != null) {
                    if (i4 != 0) {
                        if (o7 != null) {
                            if (l6 != null) {
                                l8 = l6;
                            } else {
                                l8 = this;
                            }
                            this.f1501r = l8;
                            return;
                        }
                        G0(5);
                        throw null;
                    }
                    G0(4);
                    throw null;
                }
                G0(3);
                throw null;
            }
            G0(2);
            throw null;
        }
        G0(1);
        throw null;
    }

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "modality";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "visibility";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "kind";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i4 != 6) {
            if (i4 != 7) {
                if (i4 != 8) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                } else {
                    objArr[1] = "getOriginal";
                }
            } else {
                objArr[1] = "getValueParameters";
            }
        } else {
            objArr[1] = "getOverriddenDescriptors";
        }
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.u(this, obj);
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final L a() {
        L l6 = this.f1501r;
        if (l6 != null) {
            return l6;
        }
        G0(8);
        throw null;
    }

    public final void P0(AbstractC1759v abstractC1759v) {
        if (abstractC1759v == null) {
            abstractC1759v = M0().b();
        }
        this.f1500q = abstractC1759v;
    }

    @Override // C6.InterfaceC0001b
    public final AbstractC1759v r() {
        return this.f1500q;
    }

    @Override // C6.InterfaceC0002c, C6.InterfaceC0001b
    public final Collection s() {
        return N0(true);
    }

    @Override // C6.InterfaceC0001b
    public final List z0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(7);
        throw null;
    }
}
