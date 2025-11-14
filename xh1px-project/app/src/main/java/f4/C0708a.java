package f4;

import j2.AbstractC0901a;
import j2.C0902b;
import n1.AbstractC1149a;
import o6.j;
import s3.AbstractC1492c;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708a extends AbstractC1492c {

    /* renamed from: f, reason: collision with root package name */
    public final C0902b f10757f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10758g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10759h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10760i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10761l;

    public C0708a(C0902b c0902b, String str, boolean z8, int i4, int i8, int i9, String str2) {
        j.e(c0902b, "condition");
        j.e(str, "name");
        this.f10757f = c0902b;
        this.f10758g = str;
        this.f10759h = z8;
        this.f10760i = i4;
        this.j = i8;
        this.k = i9;
        this.f10761l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0708a)) {
            return false;
        }
        C0708a c0708a = (C0708a) obj;
        if (j.a(this.f10757f, c0708a.f10757f) && j.a(this.f10758g, c0708a.f10758g) && this.f10759h == c0708a.f10759h && this.f10760i == c0708a.f10760i && this.j == c0708a.j && this.k == c0708a.k && j.a(this.f10761l, c0708a.f10761l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10761l.hashCode() + AbstractC1149a.b(this.k, AbstractC1149a.b(this.j, AbstractC1149a.b(this.f10760i, AbstractC1149a.c(A.j.c(this.f10758g, this.f10757f.hashCode() * 31, 31), 31, this.f10759h), 31), 31), 31);
    }

    @Override // s3.AbstractC1492c
    public final AbstractC0901a p() {
        return this.f10757f;
    }

    @Override // s3.AbstractC1492c
    public final String s() {
        return this.f10758g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiImageCondition(condition=");
        sb.append(this.f10757f);
        sb.append(", name=");
        sb.append(this.f10758g);
        sb.append(", haveError=");
        sb.append(this.f10759h);
        sb.append(", shouldBeVisibleIconRes=");
        sb.append(this.f10760i);
        sb.append(", shouldBeVisibleTextRes=");
        sb.append(this.j);
        sb.append(", detectionTypeIconRes=");
        sb.append(this.k);
        sb.append(", thresholdText=");
        return A.j.r(sb, this.f10761l, ")");
    }
}
