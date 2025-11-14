package F6;

import C6.InterfaceC0010k;
import C6.W;
import f7.C0725e;
import java.util.Collections;
import java.util.List;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public abstract class V extends AbstractC0055o implements W {

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1759v f1516i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC0010k interfaceC0010k, D6.j jVar, C0725e c0725e, AbstractC1759v abstractC1759v, C6.O o7) {
        super(interfaceC0010k, jVar, c0725e, o7);
        if (interfaceC0010k != null) {
            if (jVar != null) {
                if (c0725e != null) {
                    if (o7 != null) {
                        this.f1516i = abstractC1759v;
                        return;
                    } else {
                        G0(3);
                        throw null;
                    }
                }
                G0(2);
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
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
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
                i8 = 2;
                break;
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "name";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "source";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[1] = "getType";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getOriginal";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getValueParameters";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public w A() {
        return null;
    }

    public w M() {
        return null;
    }

    @Override // C6.InterfaceC0001b
    public boolean S() {
        return false;
    }

    @Override // D6.b, q7.InterfaceC1423d
    public final AbstractC1759v b() {
        AbstractC1759v abstractC1759v = this.f1516i;
        if (abstractC1759v != null) {
            return abstractC1759v;
        }
        G0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(8);
        throw null;
    }

    public AbstractC1759v r() {
        AbstractC1759v b4 = b();
        if (b4 != null) {
            return b4;
        }
        G0(10);
        throw null;
    }

    @Override // C6.InterfaceC0001b
    public final List z0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(6);
        throw null;
    }
}
