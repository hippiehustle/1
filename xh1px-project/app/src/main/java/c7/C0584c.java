package c7;

import g7.p;

/* renamed from: c7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584c extends AbstractC0585d {

    /* renamed from: c, reason: collision with root package name */
    public final p[] f9679c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0584c(int i4, p[] pVarArr) {
        super(i4, r1);
        if (pVarArr != null) {
            int i8 = 1;
            int length = pVarArr.length - 1;
            if (length != 0) {
                for (int i9 = 31; i9 >= 0; i9--) {
                    if (((1 << i9) & length) != 0) {
                        i8 = 1 + i9;
                    }
                }
                throw new IllegalStateException("Empty enum: " + pVarArr.getClass());
            }
            this.f9679c = pVarArr;
            return;
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
    }

    @Override // c7.AbstractC0585d
    public final Object c(int i4) {
        int i8 = (1 << this.f9681b) - 1;
        int i9 = this.f9680a;
        int i10 = (i4 & (i8 << i9)) >> i9;
        for (p pVar : this.f9679c) {
            if (pVar.a() == i10) {
                return pVar;
            }
        }
        return null;
    }
}
