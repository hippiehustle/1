package F6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0010k;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC1098d;
import n6.InterfaceC1162a;
import q7.C1420a;
import q7.C1421b;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.X;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a */
    public InterfaceC0010k f1472a;

    /* renamed from: b */
    public EnumC0023y f1473b;

    /* renamed from: c */
    public C0014o f1474c;

    /* renamed from: e */
    public int f1476e;

    /* renamed from: h */
    public final w f1479h;

    /* renamed from: i */
    public final C0725e f1480i;
    public final AbstractC1759v j;
    public final /* synthetic */ K k;

    /* renamed from: d */
    public C6.M f1475d = null;

    /* renamed from: f */
    public w7.O f1477f = w7.O.f15970a;

    /* renamed from: g */
    public boolean f1478g = true;

    public J(K k) {
        this.k = k;
        this.f1472a = k.q();
        this.f1473b = k.j();
        this.f1474c = k.d();
        this.f1476e = k.e();
        this.f1479h = k.f1497x;
        this.f1480i = k.getName();
        this.j = k.b();
    }

    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 5 && i4 != 7 && i4 != 9 && i4 != 11 && i4 != 19 && i4 != 13 && i4 != 14 && i4 != 16 && i4 != 17) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 5 && i4 != 7 && i4 != 9 && i4 != 11 && i4 != 19 && i4 != 13 && i4 != 14 && i4 != 16 && i4 != 17) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "type";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "modality";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 7) {
                            if (i4 != 9) {
                                if (i4 != 11) {
                                    if (i4 != 19) {
                                        if (i4 != 13) {
                                            if (i4 != 14) {
                                                if (i4 != 16) {
                                                    if (i4 != 17) {
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                                                    } else {
                                                        objArr[1] = "setCopyOverrides";
                                                    }
                                                } else {
                                                    objArr[1] = "setSubstitution";
                                                }
                                            } else {
                                                objArr[1] = "setDispatchReceiverParameter";
                                            }
                                        } else {
                                            objArr[1] = "setTypeParameters";
                                        }
                                    } else {
                                        objArr[1] = "setName";
                                    }
                                } else {
                                    objArr[1] = "setKind";
                                }
                            } else {
                                objArr[1] = "setVisibility";
                            }
                        } else {
                            objArr[1] = "setModality";
                        }
                    } else {
                        objArr[1] = "setReturnType";
                    }
                } else {
                    objArr[1] = "setPreserveSourceElement";
                }
            } else {
                objArr[1] = "setOriginal";
            }
        } else {
            objArr[1] = "setOwner";
        }
        switch (i4) {
            case 1:
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[2] = "setReturnType";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "setModality";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 19 || i4 == 13 || i4 == 14 || i4 == 16 || i4 == 17) {
            throw new IllegalStateException(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    public final K b() {
        w wVar;
        w wVar2;
        L c6;
        L l6;
        M i4;
        M m6;
        w7.Q q6;
        C0059t c0059t;
        C0059t c0059t2;
        InterfaceC1162a interfaceC1162a;
        AbstractC1759v abstractC1759v;
        w wVar3;
        w wVar4;
        Iterator it;
        AbstractC1759v i8;
        InterfaceC0010k interfaceC0010k = this.f1472a;
        EnumC0023y enumC0023y = this.f1473b;
        C0014o c0014o = this.f1474c;
        C6.M m8 = this.f1475d;
        int i9 = this.f1476e;
        C0725e c0725e = this.f1480i;
        K k = this.k;
        K O02 = k.O0(interfaceC0010k, enumC0023y, c0014o, m8, i9, c0725e);
        List typeParameters = k.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        w7.Q z8 = AbstractC1741c.z(typeParameters, this.f1477f, O02, arrayList);
        AbstractC1759v abstractC1759v2 = this.j;
        X x8 = X.OUT_VARIANCE;
        AbstractC1759v i10 = z8.i(abstractC1759v2, x8);
        w wVar5 = null;
        if (i10 != null) {
            X x9 = X.IN_VARIANCE;
            AbstractC1759v i11 = z8.i(abstractC1759v2, x9);
            if (i11 != null) {
                O02.S0(i11);
            }
            w wVar6 = this.f1479h;
            if (wVar6 != null) {
                w f8 = wVar6.f(z8);
                if (f8 != null) {
                    wVar = f8;
                }
            } else {
                wVar = null;
            }
            w wVar7 = k.f1498y;
            if (wVar7 != null && (i8 = z8.i(wVar7.b(), x9)) != null) {
                wVar7.M0();
                wVar2 = new w(O02, new C1421b(O02, i8), wVar7.getAnnotations());
            } else {
                wVar2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = k.f1496w.iterator();
            while (it2.hasNext()) {
                w wVar8 = (w) it2.next();
                AbstractC1759v i12 = z8.i(wVar8.b(), x9);
                if (i12 == null) {
                    it = it2;
                    wVar3 = wVar5;
                    wVar4 = wVar3;
                } else {
                    wVar4 = wVar5;
                    it = it2;
                    C0725e K02 = ((C1420a) wVar8.M0()).K0();
                    wVar8.M0();
                    wVar3 = new w(O02, new C1420a(O02, i12, K02), wVar8.getAnnotations());
                }
                if (wVar3 != null) {
                    arrayList2.add(wVar3);
                }
                it2 = it;
                wVar5 = wVar4;
            }
            ?? r19 = wVar5;
            O02.T0(i10, arrayList, wVar, wVar2, arrayList2);
            L l8 = k.f1481A;
            C6.P p8 = C6.O.f726a;
            if (l8 == null) {
                l6 = r19;
            } else {
                D6.j annotations = l8.getAnnotations();
                EnumC0023y enumC0023y2 = this.f1473b;
                C0014o d2 = k.f1481A.d();
                if (this.f1476e == 2 && AbstractC0015p.e(AbstractC0015p.f(d2.f752a.k()))) {
                    d2 = AbstractC0015p.f761h;
                }
                C0014o c0014o2 = d2;
                L l9 = k.f1481A;
                boolean z9 = l9.f1466i;
                boolean z10 = l9.j;
                boolean z11 = l9.f1468m;
                int i13 = this.f1476e;
                C6.M m9 = this.f1475d;
                if (m9 == null) {
                    c6 = r19;
                } else {
                    c6 = m9.c();
                }
                l6 = new L(O02, annotations, enumC0023y2, c0014o2, z9, z10, z11, i13, c6, p8);
            }
            if (l6 != null) {
                L l10 = k.f1481A;
                AbstractC1759v abstractC1759v3 = l10.f1500q;
                l6.f1471p = K.P0(z8, l10);
                if (abstractC1759v3 != null) {
                    abstractC1759v = z8.i(abstractC1759v3, x8);
                } else {
                    abstractC1759v = r19;
                }
                l6.P0(abstractC1759v);
            }
            M m10 = k.f1482B;
            if (m10 == null) {
                m6 = r19;
            } else {
                D6.j annotations2 = m10.getAnnotations();
                EnumC0023y enumC0023y3 = this.f1473b;
                C0014o d3 = k.f1482B.d();
                if (this.f1476e == 2 && AbstractC0015p.e(AbstractC0015p.f(d3.f752a.k()))) {
                    d3 = AbstractC0015p.f761h;
                }
                C0014o c0014o3 = d3;
                M m11 = k.f1482B;
                boolean z12 = m11.f1466i;
                boolean z13 = m11.j;
                boolean z14 = m11.f1468m;
                int i14 = this.f1476e;
                C6.M m12 = this.f1475d;
                if (m12 == null) {
                    i4 = r19;
                } else {
                    i4 = m12.i();
                }
                m6 = new M(O02, annotations2, enumC0023y3, c0014o3, z12, z13, z14, i14, i4, p8);
            }
            if (m6 != null) {
                q6 = z8;
                List Q02 = AbstractC0061v.Q0(m6, k.f1482B.z0(), q6, false, false, null);
                if (Q02 == null) {
                    Q02 = Collections.singletonList(M.O0(m6, AbstractC1098d.e(this.f1472a).o(), ((U) k.f1482B.z0().get(0)).getAnnotations()));
                }
                if (Q02.size() == 1) {
                    m6.f1471p = K.P0(q6, k.f1482B);
                    U u8 = (U) Q02.get(0);
                    if (u8 != null) {
                        m6.f1502q = u8;
                    } else {
                        M.G0(6);
                        throw r19;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                q6 = z8;
            }
            C0059t c0059t3 = k.f1483C;
            if (c0059t3 == null) {
                c0059t = r19;
            } else {
                c0059t = new C0059t(c0059t3.getAnnotations(), O02);
            }
            C0059t c0059t4 = k.f1484D;
            if (c0059t4 == null) {
                c0059t2 = r19;
            } else {
                c0059t2 = new C0059t(c0059t4.getAnnotations(), O02);
            }
            O02.Q0(l6, m6, c0059t, c0059t2);
            if (this.f1478g) {
                int i15 = F7.i.f1630f;
                F7.i e9 = F7.l.e();
                Iterator it3 = k.s().iterator();
                while (it3.hasNext()) {
                    e9.add(((C6.M) it3.next()).f(q6));
                }
                O02.f1488o = e9;
            }
            if (k.F() && (interfaceC1162a = k.f1485l) != null) {
                O02.R0(k.k, interfaceC1162a);
            }
            return O02;
        }
        return null;
    }
}
