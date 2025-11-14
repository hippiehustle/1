package w7;

import x7.C1824f;

/* loaded from: classes.dex */
public final class E extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15948a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15949b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15950c;

    public E(C6.T t8) {
        o6.j.e(t8, "typeParameter");
        this.f15949b = t8;
        this.f15950c = Z5.a.c(Z5.h.f7482d, new B6.j(26, this));
    }

    public static /* synthetic */ void e(int i4) {
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
        switch (i4) {
            case 1:
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "type";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i4 != 4) {
            if (i4 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
            } else {
                objArr[1] = "getType";
            }
        } else {
            objArr[1] = "getProjectionKind";
        }
        if (i4 != 3) {
            if (i4 != 4 && i4 != 5) {
                if (i4 != 6) {
                    objArr[2] = "<init>";
                } else {
                    objArr[2] = "refine";
                }
            }
        } else {
            objArr[2] = "replaceType";
        }
        String format = String.format(str, objArr);
        if (i4 == 4 || i4 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // w7.M
    public final X a() {
        switch (this.f15948a) {
            case 0:
                return X.OUT_VARIANCE;
            default:
                X x8 = (X) this.f15949b;
                if (x8 != null) {
                    return x8;
                }
                e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z5.g] */
    @Override // w7.M
    public final AbstractC1759v b() {
        switch (this.f15948a) {
            case 0:
                return (AbstractC1759v) this.f15950c.getValue();
            default:
                AbstractC1759v abstractC1759v = (AbstractC1759v) this.f15950c;
                if (abstractC1759v != null) {
                    return abstractC1759v;
                }
                e(5);
                throw null;
        }
    }

    @Override // w7.M
    public final boolean c() {
        switch (this.f15948a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // w7.M
    public final M d(C1824f c1824f) {
        switch (this.f15948a) {
            case 0:
                o6.j.e(c1824f, "kotlinTypeRefiner");
                return this;
            default:
                if (c1824f != null) {
                    X x8 = (X) this.f15949b;
                    AbstractC1759v abstractC1759v = (AbstractC1759v) this.f15950c;
                    c1824f.getClass();
                    o6.j.e(abstractC1759v, "type");
                    return new E(abstractC1759v, x8);
                }
                e(6);
                throw null;
        }
    }

    public E(AbstractC1759v abstractC1759v, X x8) {
        if (x8 == null) {
            e(0);
            throw null;
        }
        if (abstractC1759v != null) {
            this.f15949b = x8;
            this.f15950c = abstractC1759v;
        } else {
            e(1);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(AbstractC1759v abstractC1759v) {
        this(abstractC1759v, X.INVARIANT);
        if (abstractC1759v != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
