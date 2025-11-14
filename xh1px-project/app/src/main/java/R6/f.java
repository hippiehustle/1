package R6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0000a;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.O;
import C7.i;
import C7.r;
import D6.j;
import F6.AbstractC0061v;
import F6.C0060u;
import F6.N;
import F6.w;
import I7.k;
import f7.C0725e;
import i7.AbstractC0898m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import u6.AbstractC1638C;
import w7.AbstractC1759v;
import w7.Q;

/* loaded from: classes.dex */
public final class f extends N implements a {

    /* renamed from: J, reason: collision with root package name */
    public static final e f5137J = new Object();
    public static final e K = new Object();

    /* renamed from: H, reason: collision with root package name */
    public int f5138H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f5139I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC0010k interfaceC0010k, N n3, j jVar, C0725e c0725e, int i4, O o7, boolean z8) {
        super(interfaceC0010k, n3, jVar, c0725e, i4, o7);
        if (interfaceC0010k != null) {
            if (jVar != null) {
                if (c0725e != null) {
                    if (i4 != 0) {
                        this.f5138H = 0;
                        this.f5139I = z8;
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
        if (i4 != 13 && i4 != 18 && i4 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 13 && i4 != 18 && i4 != 21) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 16:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case 15:
                objArr[0] = "kind";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 17:
                objArr[0] = "source";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i4 != 13) {
            if (i4 != 18) {
                if (i4 != 21) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                } else {
                    objArr[1] = "enhance";
                }
            } else {
                objArr[1] = "createSubstitutedCopy";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 13 || i4 == 18 || i4 == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static f b1(InterfaceC0010k interfaceC0010k, S6.c cVar, C0725e c0725e, H6.f fVar, boolean z8) {
        if (interfaceC0010k != null) {
            if (c0725e != null) {
                return new f(interfaceC0010k, null, cVar, c0725e, 1, fVar, z8);
            }
            G0(7);
            throw null;
        }
        G0(5);
        throw null;
    }

    @Override // F6.N, F6.AbstractC0061v
    public final AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, O o7, j jVar, C0725e c0725e) {
        if (interfaceC0010k != null) {
            if (i4 != 0) {
                if (jVar != null) {
                    N n3 = (N) interfaceC0019u;
                    if (c0725e == null) {
                        c0725e = getName();
                    }
                    f fVar = new f(interfaceC0010k, n3, jVar, c0725e, i4, o7, this.f5139I);
                    int i8 = this.f5138H;
                    boolean z8 = false;
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    throw null;
                                }
                            }
                        }
                        z8 = true;
                    }
                    fVar.c1(z8, A.j.b(i8));
                    return fVar;
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

    @Override // F6.AbstractC0061v, C6.InterfaceC0001b
    public final boolean S() {
        return A.j.b(this.f5138H);
    }

    @Override // F6.N
    public final N a1(w wVar, w wVar2, List list, List list2, List list3, AbstractC1759v abstractC1759v, EnumC0023y enumC0023y, C0014o c0014o, Map map) {
        C7.g gVar;
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (c0014o != null) {
                        super.a1(wVar, wVar2, list, list2, list3, abstractC1759v, enumC0023y, c0014o, map);
                        for (i iVar : r.f821i) {
                            k kVar = iVar.f804b;
                            C0725e c0725e = iVar.f803a;
                            if (c0725e == null || o6.j.a(getName(), c0725e)) {
                                if (kVar != null) {
                                    String b4 = getName().b();
                                    o6.j.d(b4, "asString(...)");
                                    if (!kVar.c(b4)) {
                                        continue;
                                    }
                                }
                                Collection collection = iVar.f805c;
                                if (collection == null || collection.contains(getName())) {
                                    C7.e[] eVarArr = iVar.f807e;
                                    int length = eVarArr.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < length) {
                                            if (eVarArr[i4].c(this) != null) {
                                                gVar = new C7.g(false);
                                                break;
                                            }
                                            i4++;
                                        } else if (((String) iVar.f806d.m(this)) != null) {
                                            gVar = new C7.g(false);
                                        } else {
                                            gVar = C7.f.f793c;
                                        }
                                    }
                                    this.f1593q = gVar.f794a;
                                    return this;
                                }
                            }
                        }
                        gVar = C7.f.f792b;
                        this.f1593q = gVar.f794a;
                        return this;
                    }
                    G0(12);
                    throw null;
                }
                G0(11);
                throw null;
            }
            G0(10);
            throw null;
        }
        G0(9);
        throw null;
    }

    @Override // R6.a
    public final a b0(AbstractC1759v abstractC1759v, ArrayList arrayList, AbstractC1759v abstractC1759v2, Z5.j jVar) {
        w k;
        ArrayList p8 = AbstractC1638C.p(arrayList, z0(), this);
        if (abstractC1759v == null) {
            k = null;
        } else {
            k = AbstractC0898m.k(this, abstractC1759v, D6.i.f1043a);
        }
        C0060u S02 = S0(Q.f15971b);
        S02.j = p8;
        S02.f1567n = abstractC1759v2;
        S02.f1565l = k;
        S02.f1572s = true;
        S02.f1571r = true;
        f fVar = (f) S02.f1558A.P0(S02);
        if (jVar != null) {
            fVar.T0((InterfaceC0000a) jVar.f7485d, jVar.f7486e);
        }
        if (fVar != null) {
            return fVar;
        }
        G0(21);
        throw null;
    }

    public final void c1(boolean z8, boolean z9) {
        int i4;
        if (z8) {
            if (z9) {
                i4 = 4;
            } else {
                i4 = 2;
            }
        } else if (z9) {
            i4 = 3;
        } else {
            i4 = 1;
        }
        this.f5138H = i4;
    }
}
