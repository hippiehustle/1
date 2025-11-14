package R6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0000a;
import C6.InterfaceC0010k;
import C6.M;
import C6.O;
import D6.i;
import D6.k;
import F6.K;
import F6.L;
import P6.w;
import X6.v;
import Z5.j;
import a6.s;
import f7.C0723c;
import f7.C0725e;
import i7.AbstractC0898m;
import java.util.ArrayList;
import n6.InterfaceC1162a;
import w7.AbstractC1759v;
import w7.U;
import x7.AbstractC1825g;
import z6.r;

/* loaded from: classes.dex */
public class g extends K implements a {

    /* renamed from: E, reason: collision with root package name */
    public final boolean f5140E;

    /* renamed from: F, reason: collision with root package name */
    public final j f5141F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC0010k interfaceC0010k, D6.j jVar, EnumC0023y enumC0023y, C0014o c0014o, boolean z8, C0725e c0725e, O o7, M m6, int i4, boolean z9, j jVar2) {
        super(interfaceC0010k, m6, jVar, enumC0023y, c0014o, z8, c0725e, i4, o7, false, false, false, false, false);
        if (interfaceC0010k != null) {
            if (jVar != null) {
                if (enumC0023y != null) {
                    if (c0014o != null) {
                        if (c0725e != null) {
                            if (o7 != null) {
                                if (i4 != 0) {
                                    this.f5140E = z9;
                                    this.f5141F = jVar2;
                                    return;
                                }
                                G0(6);
                                throw null;
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
        G0(0);
        throw null;
    }

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 21) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case 9:
                objArr[0] = "modality";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case 10:
                objArr[0] = "visibility";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case 11:
                objArr[0] = "name";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 16:
                objArr[0] = "kind";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i4 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i4) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static g U0(InterfaceC0010k interfaceC0010k, S6.c cVar, C0014o c0014o, boolean z8, C0725e c0725e, H6.f fVar, boolean z9) {
        if (interfaceC0010k != null) {
            if (c0725e != null) {
                return new g(interfaceC0010k, cVar, EnumC0023y.f778e, c0014o, z8, c0725e, fVar, null, 1, z9, null);
            }
            G0(11);
            throw null;
        }
        G0(7);
        throw null;
    }

    @Override // F6.K, C6.W
    public final boolean F() {
        AbstractC1759v b4 = b();
        if (this.f5140E) {
            o6.j.e(b4, "type");
            if (((z6.h.G(b4) || r.a(b4)) && !U.e(b4)) || z6.h.H(b4)) {
                k kVar = v.f7046a;
                C0723c c0723c = w.f4610p;
                o6.j.d(c0723c, "ENHANCED_NULLABILITY_ANNOTATION");
                if (!AbstractC1825g.u(b4, c0723c) || z6.h.H(b4)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // F6.K, C6.InterfaceC0001b
    public final Object L(InterfaceC0000a interfaceC0000a) {
        j jVar = this.f5141F;
        if (jVar != null && ((InterfaceC0000a) jVar.f7485d).equals(interfaceC0000a)) {
            return jVar.f7486e;
        }
        return null;
    }

    @Override // F6.K
    public final K O0(InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o, M m6, int i4, C0725e c0725e) {
        if (interfaceC0010k != null) {
            if (enumC0023y != null) {
                if (c0014o != null) {
                    if (i4 != 0) {
                        if (c0725e != null) {
                            return new g(interfaceC0010k, getAnnotations(), enumC0023y, c0014o, this.j, c0725e, O.f726a, m6, i4, this.f5140E, this.f5141F);
                        }
                        G0(17);
                        throw null;
                    }
                    G0(16);
                    throw null;
                }
                G0(15);
                throw null;
            }
            G0(14);
            throw null;
        }
        G0(13);
        throw null;
    }

    @Override // F6.V, C6.InterfaceC0001b
    public final boolean S() {
        return false;
    }

    @Override // R6.a
    public final a b0(AbstractC1759v abstractC1759v, ArrayList arrayList, AbstractC1759v abstractC1759v2, j jVar) {
        M a3;
        AbstractC1759v abstractC1759v3;
        L l6;
        F6.M m6;
        F6.M i4;
        L c6;
        F6.w wVar = null;
        if (a() == this) {
            a3 = null;
        } else {
            a3 = a();
        }
        g gVar = new g(q(), getAnnotations(), j(), d(), this.j, getName(), h(), a3, e(), this.f5140E, jVar);
        L l8 = this.f1481A;
        if (l8 != null) {
            D6.j annotations = l8.getAnnotations();
            EnumC0023y j = l8.j();
            C0014o d2 = l8.d();
            boolean z8 = l8.f1466i;
            boolean z9 = l8.j;
            boolean z10 = l8.f1468m;
            int e9 = e();
            if (a3 == null) {
                c6 = null;
            } else {
                c6 = a3.c();
            }
            L l9 = new L(gVar, annotations, j, d2, z8, z9, z10, e9, c6, l8.h());
            l9.f1471p = l8.f1471p;
            abstractC1759v3 = abstractC1759v2;
            l9.f1500q = abstractC1759v3;
            l6 = l9;
        } else {
            abstractC1759v3 = abstractC1759v2;
            l6 = null;
        }
        F6.M m8 = this.f1482B;
        if (m8 != null) {
            D6.j annotations2 = m8.getAnnotations();
            F6.M m9 = m8;
            EnumC0023y j5 = m9.j();
            C0014o d3 = m9.d();
            boolean z11 = m9.f1466i;
            boolean z12 = m9.j;
            boolean z13 = m9.f1468m;
            int e10 = e();
            if (a3 == null) {
                i4 = null;
            } else {
                i4 = a3.i();
            }
            m6 = new F6.M(gVar, annotations2, j5, d3, z11, z12, z13, e10, i4, m8.h());
            m6.f1471p = m6.f1471p;
            F6.U u8 = (F6.U) m8.z0().get(0);
            if (u8 != null) {
                m6.f1502q = u8;
            } else {
                F6.M.G0(6);
                throw null;
            }
        } else {
            m6 = null;
        }
        gVar.Q0(l6, m6, this.f1483C, this.f1484D);
        InterfaceC1162a interfaceC1162a = this.f1485l;
        if (interfaceC1162a != null) {
            gVar.R0(this.k, interfaceC1162a);
        }
        gVar.h0(s());
        if (abstractC1759v != null) {
            wVar = AbstractC0898m.k(this, abstractC1759v, i.f1043a);
        }
        gVar.T0(abstractC1759v3, getTypeParameters(), this.f1497x, wVar, s.f7766d);
        return gVar;
    }

    @Override // F6.K
    public final void S0(AbstractC1759v abstractC1759v) {
    }
}
