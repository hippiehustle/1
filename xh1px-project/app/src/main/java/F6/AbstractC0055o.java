package F6;

import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import f7.C0725e;

/* renamed from: F6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0055o extends AbstractC0054n implements InterfaceC0011l {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0010k f1546g;

    /* renamed from: h, reason: collision with root package name */
    public final C6.O f1547h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0055o(InterfaceC0010k interfaceC0010k, D6.j jVar, C0725e c0725e, C6.O o7) {
        super(jVar, c0725e);
        if (interfaceC0010k != null) {
            if (jVar != null) {
                if (c0725e != null) {
                    if (o7 != null) {
                        this.f1546g = interfaceC0010k;
                        this.f1547h = o7;
                        return;
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
        G0(0);
        throw null;
    }

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 4 && i4 != 5 && i4 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 4 && i4 != 5 && i4 != 6) {
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
                objArr[0] = "name";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "source";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i4 != 4) {
            if (i4 != 5) {
                if (i4 != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getOriginal";
        }
        if (i4 != 4 && i4 != 5 && i4 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 4 || i4 == 5 || i4 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public C6.O h() {
        C6.O o7 = this.f1547h;
        if (o7 != null) {
            return o7;
        }
        G0(6);
        throw null;
    }

    public InterfaceC0010k q() {
        InterfaceC0010k interfaceC0010k = this.f1546g;
        if (interfaceC0010k != null) {
            return interfaceC0010k;
        }
        G0(5);
        throw null;
    }

    @Override // F6.AbstractC0054n, C6.InterfaceC0010k
    /* renamed from: L0 */
    public InterfaceC0011l a() {
        return this;
    }
}
