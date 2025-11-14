package c3;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f9628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9630c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9632e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9633f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9634g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9635h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9636i;
    public final Integer j;
    public final Integer k;

    public g(int i4, int i8, int i9, int i10, int i11, boolean z8, boolean z9, String str, String str2, Integer num, Integer num2, int i12) {
        str = (i12 & 128) != 0 ? null : str;
        str2 = (i12 & 256) != 0 ? null : str2;
        num = (i12 & 512) != 0 ? null : num;
        num2 = (i12 & 1024) != 0 ? null : num2;
        this.f9628a = i4;
        this.f9629b = i8;
        this.f9630c = i9;
        this.f9631d = i10;
        this.f9632e = i11;
        this.f9633f = z8;
        this.f9634g = z9;
        this.f9635h = str;
        this.f9636i = str2;
        this.j = num;
        this.k = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.f9628a != gVar.f9628a || this.f9629b != gVar.f9629b || this.f9630c != gVar.f9630c || this.f9631d != gVar.f9631d || this.f9632e != gVar.f9632e || this.f9633f != gVar.f9633f || this.f9634g != gVar.f9634g || !o6.j.a(this.f9635h, gVar.f9635h) || !o6.j.a(this.f9636i, gVar.f9636i) || !o6.j.a(this.j, gVar.j) || !o6.j.a(this.k, gVar.k)) {
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
        int hashCode3;
        int c6 = AbstractC1149a.c(AbstractC1149a.c(AbstractC1149a.b(this.f9632e, AbstractC1149a.b(this.f9631d, AbstractC1149a.b(this.f9630c, AbstractC1149a.b(this.f9629b, Integer.hashCode(this.f9628a) * 31, 31), 31), 31), 31), 31, this.f9633f), 31, this.f9634g);
        int i4 = 0;
        String str = this.f9635h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (c6 + hashCode) * 31;
        String str2 = this.f9636i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Integer num = this.j;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Integer num2 = this.k;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        return i10 + i4;
    }

    public final String toString() {
        return "BackupDialogUiState(fileSelectionVisibility=" + this.f9628a + ", loadingVisibility=" + this.f9629b + ", textStatusVisibility=" + this.f9630c + ", compatWarningVisibility=" + this.f9631d + ", iconStatusVisibility=" + this.f9632e + ", dialogOkButtonEnabled=" + this.f9633f + ", dialogCancelButtonEnabled=" + this.f9634g + ", fileSelectionText=" + this.f9635h + ", textStatusText=" + this.f9636i + ", iconStatus=" + this.j + ", iconTint=" + this.k + ")";
    }
}
