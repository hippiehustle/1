package F6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0010k;
import C6.InterfaceC0018t;
import C6.InterfaceC0019u;
import f7.C0725e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public class N extends AbstractC0061v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC0010k interfaceC0010k, N n3, D6.j jVar, C0725e c0725e, int i4, C6.O o7) {
        super(i4, interfaceC0010k, n3, o7, jVar, c0725e);
        if (interfaceC0010k != null) {
            if (jVar != null) {
                if (c0725e != null) {
                    if (i4 != 0) {
                        if (o7 != null) {
                            return;
                        } else {
                            G0(4);
                            throw null;
                        }
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
        if (i4 != 13 && i4 != 18 && i4 != 23 && i4 != 24 && i4 != 29 && i4 != 30) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 13 && i4 != 18 && i4 != 23 && i4 != 24 && i4 != 29 && i4 != 30) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 27:
                objArr[0] = "annotations";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 26:
                objArr[0] = "kind";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i4 != 13 && i4 != 18 && i4 != 23) {
            if (i4 != 24) {
                if (i4 != 29) {
                    if (i4 != 30) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                    } else {
                        objArr[1] = "newCopyBuilder";
                    }
                } else {
                    objArr[1] = "copy";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i4) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 13 || i4 == 18 || i4 == 23 || i4 == 24 || i4 == 29 || i4 == 30) {
            throw new IllegalStateException(format);
        }
    }

    public static N X0(AbstractC0042b abstractC0042b, C0725e c0725e, int i4, C6.O o7) {
        if (abstractC0042b != null) {
            if (c0725e != null) {
                if (i4 != 0) {
                    if (o7 != null) {
                        return new N(abstractC0042b, null, D6.i.f1043a, c0725e, i4, o7);
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
        G0(5);
        throw null;
    }

    @Override // F6.AbstractC0061v
    public AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, C6.O o7, D6.j jVar, C0725e c0725e) {
        if (interfaceC0010k != null) {
            if (i4 != 0) {
                if (jVar != null) {
                    N n3 = (N) interfaceC0019u;
                    if (c0725e == null) {
                        c0725e = getName();
                    }
                    return new N(interfaceC0010k, n3, jVar, c0725e, i4, o7);
                }
                G0(27);
                throw null;
            }
            G0(26);
            throw null;
        }
        G0(25);
        throw null;
    }

    @Override // F6.AbstractC0061v, F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public final N a() {
        N n3 = (N) super.a();
        if (n3 != null) {
            return n3;
        }
        G0(24);
        throw null;
    }

    @Override // F6.AbstractC0061v
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final N R0(w wVar, w wVar2, List list, List list2, List list3, AbstractC1759v abstractC1759v, EnumC0023y enumC0023y, C0014o c0014o) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (c0014o != null) {
                        return a1(wVar, wVar2, list, list2, list3, abstractC1759v, enumC0023y, c0014o, null);
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

    public N a1(w wVar, w wVar2, List list, List list2, List list3, AbstractC1759v abstractC1759v, EnumC0023y enumC0023y, C0014o c0014o, Map map) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (c0014o != null) {
                        super.R0(wVar, wVar2, list, list2, list3, abstractC1759v, enumC0023y, c0014o);
                        if (map != null && !map.isEmpty()) {
                            this.f1586G = new LinkedHashMap(map);
                        }
                        return this;
                    }
                    G0(22);
                    throw null;
                }
                G0(21);
                throw null;
            }
            G0(20);
            throw null;
        }
        G0(19);
        throw null;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u
    public InterfaceC0018t s0() {
        return S0(w7.Q.f15971b);
    }
}
