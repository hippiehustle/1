package M3;

import android.graphics.Bitmap;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final f2.d f3361a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3362b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3363c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3364d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3365e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3366f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3367g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3368h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap f3369i;

    public I(f2.d dVar, boolean z8, boolean z9, boolean z10, String str, boolean z11, String str2, String str3, Bitmap bitmap) {
        this.f3361a = dVar;
        this.f3362b = z8;
        this.f3363c = z9;
        this.f3364d = z10;
        this.f3365e = str;
        this.f3366f = z11;
        this.f3367g = str2;
        this.f3368h = str3;
        this.f3369i = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I) {
                I i4 = (I) obj;
                if (this.f3361a != i4.f3361a || this.f3362b != i4.f3362b || this.f3363c != i4.f3363c || this.f3364d != i4.f3364d || !o6.j.a(this.f3365e, i4.f3365e) || this.f3366f != i4.f3366f || !o6.j.a(this.f3367g, i4.f3367g) || !o6.j.a(this.f3368h, i4.f3368h) || !o6.j.a(this.f3369i, i4.f3369i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int c6 = AbstractC1149a.c(AbstractC1149a.c(AbstractC1149a.c(this.f3361a.hashCode() * 31, 31, this.f3362b), 31, this.f3363c), 31, this.f3364d);
        int i4 = 0;
        String str = this.f3365e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c9 = A.j.c(this.f3367g, AbstractC1149a.c((c6 + hashCode) * 31, 31, this.f3366f), 31);
        String str2 = this.f3368h;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i8 = (c9 + hashCode2) * 31;
        Bitmap bitmap = this.f3369i;
        if (bitmap != null) {
            i4 = bitmap.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickPositionUiState(positionType=");
        sb.append(this.f3361a);
        sb.append(", isTypeFieldVisible=");
        sb.append(this.f3362b);
        sb.append(", isClickOffsetVisible=");
        sb.append(this.f3363c);
        sb.append(", isClickOffsetEnabled=");
        sb.append(this.f3364d);
        sb.append(", clickOffsetDescription=");
        sb.append(this.f3365e);
        sb.append(", isSelectorEnabled=");
        sb.append(this.f3366f);
        sb.append(", selectorTitle=");
        AbstractC1149a.m(sb, this.f3367g, ", selectorDescription=", this.f3368h, ", selectorBitmap=");
        sb.append(this.f3369i);
        sb.append(")");
        return sb.toString();
    }
}
