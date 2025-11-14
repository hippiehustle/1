package w7;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import f7.C0725e;
import m7.AbstractC1098d;

/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1740b extends AbstractC1744f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1740b(v7.n nVar) {
        super(nVar);
        if (nVar != null) {
        } else {
            l(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void l(int i4) {
        String str;
        int i8;
        String format;
        if (i4 != 1 && i4 != 3 && i4 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 3 && i4 != 4) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    objArr[0] = "storageManager";
                }
            } else {
                objArr[0] = "classifier";
            }
            if (i4 == 1) {
                if (i4 != 3 && i4 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
                } else {
                    objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
                }
            } else {
                objArr[1] = "getBuiltIns";
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3 && i4 != 4) {
                        objArr[2] = "<init>";
                    }
                } else {
                    objArr[2] = "isSameClassifier";
                }
            }
            format = String.format(str, objArr);
            if (i4 != 1 || i4 == 3 || i4 == 4) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i4 == 1) {
        }
        if (i4 != 1) {
        }
        format = String.format(str, objArr);
        if (i4 != 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // w7.AbstractC1744f
    public final AbstractC1759v g() {
        InterfaceC0004e c6 = c();
        if (c6 != null) {
            C0725e c0725e = z6.h.f16714e;
            if (z6.h.b(c6, z6.m.f16762a) || z6.h.b(c6, z6.m.f16764b)) {
                return null;
            }
            return o().e();
        }
        z6.h.a(107);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (o6.j.a(((F6.E) ((C6.F) r0)).f1461i, ((F6.E) ((C6.F) r6)).f1461i) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0072 A[RETURN] */
    @Override // w7.AbstractC1744f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(InterfaceC0007h interfaceC0007h) {
        boolean z8;
        if (interfaceC0007h instanceof InterfaceC0004e) {
            InterfaceC0004e c6 = c();
            o6.j.e(c6, "first");
            if (o6.j.a(c6.getName(), interfaceC0007h.getName())) {
                InterfaceC0010k q6 = c6.q();
                InterfaceC0010k q8 = interfaceC0007h.q();
                while (true) {
                    if (q6 != null && q8 != null) {
                        if (q6 instanceof C6.A) {
                            z8 = q8 instanceof C6.A;
                            break;
                        }
                        if (!(q8 instanceof C6.A)) {
                            if (q6 instanceof C6.F) {
                                if (q8 instanceof C6.F) {
                                }
                            } else {
                                if ((q8 instanceof C6.F) || !o6.j.a(q6.getName(), q8.getName())) {
                                    break;
                                }
                                q6 = q6.q();
                                q8 = q8.q();
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z8 = true;
                if (!z8) {
                    return true;
                }
            }
            z8 = false;
            if (!z8) {
            }
        }
        return false;
    }

    @Override // w7.J
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC0004e c();

    @Override // w7.J
    public final z6.h o() {
        z6.h e9 = AbstractC1098d.e(c());
        if (e9 != null) {
            return e9;
        }
        l(1);
        throw null;
    }
}
