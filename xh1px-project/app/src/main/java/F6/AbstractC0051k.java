package F6;

import C6.InterfaceC0010k;
import f7.C0725e;

/* renamed from: F6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0051k extends AbstractC0042b {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0010k f1537h;

    /* renamed from: i, reason: collision with root package name */
    public final C6.O f1538i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0051k(v7.n nVar, InterfaceC0010k interfaceC0010k, C0725e c0725e, C6.O o7) {
        super(nVar, c0725e);
        if (nVar != null) {
            if (interfaceC0010k != null) {
                if (c0725e != null) {
                    this.f1537h = interfaceC0010k;
                    this.f1538i = o7;
                    return;
                }
                V(2);
                throw null;
            }
            V(1);
            throw null;
        }
        V(0);
        throw null;
    }

    public static /* synthetic */ void V(int i4) {
        String str;
        int i8;
        if (i4 != 4 && i4 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 4 && i4 != 5) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4 && i4 != 5) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                    }
                } else {
                    objArr[0] = "source";
                }
            } else {
                objArr[0] = "name";
            }
        } else {
            objArr[0] = "containingDeclaration";
        }
        if (i4 != 4) {
            if (i4 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            } else {
                objArr[1] = "getSource";
            }
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i4 != 4 && i4 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 4 || i4 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // C6.InterfaceC0011l
    public final C6.O h() {
        C6.O o7 = this.f1538i;
        if (o7 != null) {
            return o7;
        }
        V(5);
        throw null;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        InterfaceC0010k interfaceC0010k = this.f1537h;
        if (interfaceC0010k != null) {
            return interfaceC0010k;
        }
        V(4);
        throw null;
    }

    public boolean z() {
        return false;
    }
}
