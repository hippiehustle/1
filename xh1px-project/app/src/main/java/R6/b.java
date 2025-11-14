package R6;

import C6.InterfaceC0000a;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.O;
import D6.i;
import D6.j;
import F6.AbstractC0061v;
import F6.C0050j;
import F6.w;
import a6.s;
import f7.C0725e;
import i7.AbstractC0898m;
import java.util.ArrayList;
import u6.AbstractC1638C;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class b extends C0050j implements a {

    /* renamed from: I, reason: collision with root package name */
    public Boolean f5135I;

    /* renamed from: J, reason: collision with root package name */
    public Boolean f5136J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0004e interfaceC0004e, b bVar, j jVar, boolean z8, int i4, O o7) {
        super(interfaceC0004e, bVar, jVar, z8, i4, o7);
        if (interfaceC0004e != null) {
            if (jVar != null) {
                if (i4 != 0) {
                    if (o7 != null) {
                        this.f5135I = null;
                        this.f5136J = null;
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
        if (i4 != 11 && i4 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 11 && i4 != 18) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                objArr[0] = "kind";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 10:
                objArr[0] = "source";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i4 != 11) {
            if (i4 != 18) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
            } else {
                objArr[1] = "enhance";
            }
        } else {
            objArr[1] = "createSubstitutedCopy";
        }
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "createJavaConstructor";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 11 || i4 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static b d1(InterfaceC0004e interfaceC0004e, j jVar, boolean z8, H6.f fVar) {
        if (interfaceC0004e != null) {
            return new b(interfaceC0004e, null, jVar, z8, 1, fVar);
        }
        G0(4);
        throw null;
    }

    @Override // F6.C0050j, F6.AbstractC0061v
    public final /* bridge */ /* synthetic */ AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, O o7, j jVar, C0725e c0725e) {
        return e1(interfaceC0010k, interfaceC0019u, i4, jVar, o7);
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0001b
    public final boolean S() {
        return this.f5136J.booleanValue();
    }

    @Override // F6.AbstractC0061v
    public final void U0(boolean z8) {
        this.f5135I = Boolean.valueOf(z8);
    }

    @Override // F6.AbstractC0061v
    public final void V0(boolean z8) {
        this.f5136J = Boolean.valueOf(z8);
    }

    @Override // F6.C0050j
    /* renamed from: X0 */
    public final /* bridge */ /* synthetic */ C0050j O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, O o7, j jVar, C0725e c0725e) {
        return e1(interfaceC0010k, interfaceC0019u, i4, jVar, o7);
    }

    @Override // R6.a
    public final a b0(AbstractC1759v abstractC1759v, ArrayList arrayList, AbstractC1759v abstractC1759v2, Z5.j jVar) {
        w k;
        b e12 = e1(q(), null, e(), getAnnotations(), h());
        if (abstractC1759v == null) {
            k = null;
        } else {
            k = AbstractC0898m.k(e12, abstractC1759v, i.f1043a);
        }
        w wVar = k;
        e12.R0(wVar, this.f1590n, s.f7766d, getTypeParameters(), AbstractC1638C.p(arrayList, z0(), e12), abstractC1759v2, j(), d());
        if (jVar != null) {
            e12.T0((InterfaceC0000a) jVar.f7485d, jVar.f7486e);
        }
        return e12;
    }

    public final b e1(InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, int i4, j jVar, O o7) {
        if (interfaceC0010k != null) {
            if (i4 != 0) {
                if (jVar != null) {
                    if (o7 != null) {
                        if (i4 != 1 && i4 != 4) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0010k + "\nkind: " + A.j.x(i4));
                        }
                        InterfaceC0004e interfaceC0004e = (InterfaceC0004e) interfaceC0010k;
                        b bVar = (b) interfaceC0019u;
                        if (i4 != 0) {
                            b bVar2 = new b(interfaceC0004e, bVar, jVar, this.f1536H, i4, o7);
                            Boolean bool = this.f5135I;
                            bool.getClass();
                            bVar2.f5135I = bool;
                            Boolean bool2 = this.f5136J;
                            bool2.getClass();
                            bVar2.f5136J = bool2;
                            return bVar2;
                        }
                        G0(13);
                        throw null;
                    }
                    G0(10);
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
}
