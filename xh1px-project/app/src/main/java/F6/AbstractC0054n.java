package F6;

import C6.InterfaceC0010k;
import f7.C0725e;
import h7.C0845h;

/* renamed from: F6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0054n extends D6.b implements InterfaceC0010k {

    /* renamed from: f, reason: collision with root package name */
    public final C0725e f1545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0054n(D6.j jVar, C0725e c0725e) {
        super(jVar);
        if (jVar != null) {
            if (c0725e != null) {
                this.f1545f = c0725e;
                return;
            } else {
                G0(1);
                throw null;
            }
        }
        G0(0);
        throw null;
    }

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "name";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 5 && i4 != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                } else {
                    objArr[1] = "toString";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5 && i4 != 6) {
                    objArr[2] = "<init>";
                }
            } else {
                objArr[2] = "toString";
            }
        }
        String format = String.format(str, objArr);
        if (i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static String K0(InterfaceC0010k interfaceC0010k) {
        try {
            String str = C0845h.f11448e.u(interfaceC0010k) + "[" + interfaceC0010k.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC0010k)) + "]";
            if (str != null) {
                return str;
            }
            G0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC0010k.getClass().getSimpleName() + " " + interfaceC0010k.getName();
            if (str2 != null) {
                return str2;
            }
            G0(6);
            throw null;
        }
    }

    @Override // C6.InterfaceC0010k
    public final C0725e getName() {
        C0725e c0725e = this.f1545f;
        if (c0725e != null) {
            return c0725e;
        }
        G0(2);
        throw null;
    }

    @Override // D6.b
    public String toString() {
        return K0(this);
    }

    public InterfaceC0010k a() {
        return this;
    }
}
