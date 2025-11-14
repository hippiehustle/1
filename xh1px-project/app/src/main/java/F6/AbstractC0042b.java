package F6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import f7.C0725e;
import i7.AbstractC0890e;
import java.util.Collections;
import java.util.List;
import m7.AbstractC1098d;
import p7.C1338t;
import p7.InterfaceC1333o;
import x7.C1824f;

/* renamed from: F6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0042b extends A {

    /* renamed from: d, reason: collision with root package name */
    public final C0725e f1519d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.i f1520e;

    /* renamed from: f, reason: collision with root package name */
    public final v7.i f1521f;

    /* renamed from: g, reason: collision with root package name */
    public final v7.i f1522g;

    /* JADX WARN: Type inference failed for: r0v2, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r0v4, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r0v6, types: [v7.i, v7.h] */
    public AbstractC0042b(v7.n nVar, C0725e c0725e) {
        if (nVar != null) {
            if (c0725e != null) {
                this.f1519d = c0725e;
                v7.k kVar = (v7.k) nVar;
                this.f1520e = new v7.h(kVar, new C0041a(this, 0));
                this.f1521f = new v7.h(kVar, new C0041a(this, 1));
                this.f1522g = new v7.h(kVar, new C0041a(this, 2));
                return;
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
        if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6 && i4 != 9 && i4 != 12 && i4 != 14 && i4 != 16 && i4 != 17 && i4 != 19 && i4 != 20) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6 && i4 != 9 && i4 != 12 && i4 != 14 && i4 != 16 && i4 != 17 && i4 != 19 && i4 != 20) {
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
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    if (i4 != 5) {
                        if (i4 != 6) {
                            if (i4 != 9 && i4 != 12 && i4 != 14 && i4 != 16) {
                                if (i4 != 17) {
                                    if (i4 != 19) {
                                        if (i4 != 20) {
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                                        } else {
                                            objArr[1] = "getDefaultType";
                                        }
                                    } else {
                                        objArr[1] = "substitute";
                                    }
                                } else {
                                    objArr[1] = "getUnsubstitutedMemberScope";
                                }
                            } else {
                                objArr[1] = "getMemberScope";
                            }
                        } else {
                            objArr[1] = "getContextReceivers";
                        }
                    } else {
                        objArr[1] = "getThisAsReceiverParameter";
                    }
                } else {
                    objArr[1] = "getUnsubstitutedInnerClassesScope";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        switch (i4) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 6 || i4 == 9 || i4 == 12 || i4 == 14 || i4 == 16 || i4 == 17 || i4 == 19 || i4 == 20) {
            throw new IllegalStateException(format);
        }
    }

    @Override // C6.InterfaceC0004e
    public final w F0() {
        w wVar = (w) this.f1522g.a();
        if (wVar != null) {
            return wVar;
        }
        V(5);
        throw null;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.g(this, obj);
    }

    @Override // C6.Q
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public InterfaceC0004e f(w7.Q q6) {
        if (q6 != null) {
            if (q6.f15972a.e()) {
                return this;
            }
            return new z(this, q6);
        }
        V(18);
        throw null;
    }

    @Override // C6.InterfaceC0004e
    public final InterfaceC1333o Y(w7.O o7) {
        AbstractC1098d.i(AbstractC0890e.d(this));
        InterfaceC1333o k = k(o7, C1824f.f16282a);
        if (k != null) {
            return k;
        }
        V(16);
        throw null;
    }

    @Override // F6.A, C6.InterfaceC0010k
    public final InterfaceC0007h a() {
        return this;
    }

    @Override // C6.InterfaceC0010k
    public final C0725e getName() {
        C0725e c0725e = this.f1519d;
        if (c0725e != null) {
            return c0725e;
        }
        V(2);
        throw null;
    }

    @Override // F6.A
    public InterfaceC1333o k(w7.O o7, C1824f c1824f) {
        if (o7.e()) {
            InterfaceC1333o C8 = C(c1824f);
            if (C8 != null) {
                return C8;
            }
            V(12);
            throw null;
        }
        return new C1338t(C(c1824f), new w7.Q(o7));
    }

    @Override // C6.InterfaceC0004e
    public InterfaceC1333o k0() {
        InterfaceC1333o interfaceC1333o = (InterfaceC1333o) this.f1521f.a();
        if (interfaceC1333o != null) {
            return interfaceC1333o;
        }
        V(4);
        throw null;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0007h
    public final w7.z l() {
        w7.z zVar = (w7.z) this.f1520e.a();
        if (zVar != null) {
            return zVar;
        }
        V(20);
        throw null;
    }

    @Override // C6.InterfaceC0004e
    public InterfaceC1333o t0() {
        AbstractC1098d.i(AbstractC0890e.d(this));
        InterfaceC1333o C8 = C(C1824f.f16282a);
        if (C8 != null) {
            return C8;
        }
        V(17);
        throw null;
    }

    @Override // C6.InterfaceC0004e
    public List x0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        V(6);
        throw null;
    }

    @Override // F6.A, C6.InterfaceC0010k
    public final InterfaceC0010k a() {
        return this;
    }

    @Override // F6.A, C6.InterfaceC0010k
    public final InterfaceC0004e a() {
        return this;
    }
}
