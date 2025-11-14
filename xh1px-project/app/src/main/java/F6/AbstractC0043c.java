package F6;

import C6.InterfaceC0010k;
import f7.C0725e;
import w7.X;

/* renamed from: F6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0043c extends AbstractC0049i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0043c(v7.n nVar, InterfaceC0010k interfaceC0010k, D6.j jVar, C0725e c0725e, X x8, boolean z8, int i4, C6.P p8) {
        super(nVar, interfaceC0010k, jVar, c0725e, x8, z8, i4, p8);
        if (nVar != null) {
            if (interfaceC0010k != null) {
                if (p8 != null) {
                    return;
                } else {
                    G0(6);
                    throw null;
                }
            }
            G0(1);
            throw null;
        }
        G0(0);
        throw null;
    }

    public static /* synthetic */ void G0(int i4) {
        Object[] objArr = new Object[3];
        switch (i4) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "annotations";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "name";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "variance";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // F6.AbstractC0054n, D6.b
    public final String toString() {
        String str;
        String str2 = "";
        if (!this.j) {
            str = "";
        } else {
            str = "reified ";
        }
        if (e0() != X.INVARIANT) {
            str2 = e0() + " ";
        }
        return str + str2 + getName();
    }
}
