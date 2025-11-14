package F6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0012m;
import f7.AbstractC0727g;
import f7.C0725e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m7.AbstractC1098d;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class M extends I implements C6.L {

    /* renamed from: q, reason: collision with root package name */
    public U f1502q;

    /* renamed from: r, reason: collision with root package name */
    public final M f1503r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C6.M m6, D6.j jVar, EnumC0023y enumC0023y, C0014o c0014o, boolean z8, boolean z9, boolean z10, int i4, M m8, C6.O o7) {
        super(enumC0023y, c0014o, m6, jVar, C0725e.g("<set-" + m6.getName() + ">"), z8, z9, z10, i4, o7);
        M m9;
        if (jVar != null) {
            if (enumC0023y != null) {
                if (c0014o != null) {
                    if (i4 != 0) {
                        if (o7 != null) {
                            if (m8 != null) {
                                m9 = m8;
                            } else {
                                m9 = this;
                            }
                            this.f1503r = m9;
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
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "setterDescriptor";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i4) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i4) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "initialize";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static U O0(M m6, AbstractC1759v abstractC1759v, D6.j jVar) {
        if (abstractC1759v != null) {
            if (jVar != null) {
                return new U(m6, null, 0, jVar, AbstractC0727g.f10814g, abstractC1759v, false, false, false, null, C6.O.f726a);
            }
            G0(9);
            throw null;
        }
        G0(8);
        throw null;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.b(this, obj);
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final M a() {
        M m6 = this.f1503r;
        if (m6 != null) {
            return m6;
        }
        G0(13);
        throw null;
    }

    @Override // C6.InterfaceC0001b
    public final AbstractC1759v r() {
        return AbstractC1098d.e(this).x();
    }

    @Override // C6.InterfaceC0002c, C6.InterfaceC0001b
    public final Collection s() {
        return N0(false);
    }

    @Override // C6.InterfaceC0001b
    public final List z0() {
        U u8 = this.f1502q;
        if (u8 != null) {
            List singletonList = Collections.singletonList(u8);
            if (singletonList != null) {
                return singletonList;
            }
            G0(11);
            throw null;
        }
        throw new IllegalStateException();
    }
}
