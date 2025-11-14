package w7;

import x7.C1824f;

/* loaded from: classes.dex */
public final class T extends AbstractC1751m {

    /* renamed from: e, reason: collision with root package name */
    public final String f15976e;

    public T(String str) {
        this.f15976e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void Q0(int i4) {
        String str;
        int i8;
        String format;
        if (i4 != 1 && i4 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 4) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        objArr[0] = "newAttributes";
                    }
                } else {
                    objArr[0] = "kotlinTypeRefiner";
                }
            } else {
                objArr[0] = "delegate";
            }
            if (i4 == 1) {
                if (i4 != 4) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                } else {
                    objArr[1] = "refine";
                }
            } else {
                objArr[1] = "toString";
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            objArr[2] = "replaceAttributes";
                        }
                    } else {
                        objArr[2] = "refine";
                    }
                } else {
                    objArr[2] = "replaceDelegate";
                }
            }
            format = String.format(str, objArr);
            if (i4 != 1 || i4 == 4) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        if (i4 == 1) {
        }
        if (i4 != 1) {
        }
        format = String.format(str, objArr);
        if (i4 != 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // w7.AbstractC1751m, w7.AbstractC1759v
    /* renamed from: G0 */
    public final AbstractC1759v J0(C1824f c1824f) {
        if (c1824f != null) {
            return this;
        }
        Q0(3);
        throw null;
    }

    @Override // w7.z, w7.W
    public final /* bridge */ /* synthetic */ W I0(boolean z8) {
        I0(z8);
        throw null;
    }

    @Override // w7.AbstractC1751m, w7.W
    /* renamed from: J0 */
    public final W G0(C1824f c1824f) {
        if (c1824f != null) {
            return this;
        }
        Q0(3);
        throw null;
    }

    @Override // w7.z, w7.W
    public final /* bridge */ /* synthetic */ W K0(G g8) {
        K0(g8);
        throw null;
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        throw new IllegalStateException(this.f15976e);
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        if (g8 == null) {
            Q0(0);
            throw null;
        }
        throw new IllegalStateException(this.f15976e);
    }

    @Override // w7.AbstractC1751m
    public final z N0() {
        throw new IllegalStateException(this.f15976e);
    }

    @Override // w7.AbstractC1751m
    /* renamed from: O0 */
    public final z G0(C1824f c1824f) {
        if (c1824f != null) {
            return this;
        }
        Q0(3);
        throw null;
    }

    @Override // w7.AbstractC1751m
    public final AbstractC1751m P0(z zVar) {
        throw new IllegalStateException(this.f15976e);
    }

    @Override // w7.z
    public final String toString() {
        String str = this.f15976e;
        if (str != null) {
            return str;
        }
        Q0(1);
        throw null;
    }
}
