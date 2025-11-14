package f4;

import j2.AbstractC0901a;
import j2.g;
import n1.AbstractC1149a;
import o6.j;
import s3.AbstractC1492c;

/* renamed from: f4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709b extends AbstractC1492c {

    /* renamed from: f, reason: collision with root package name */
    public final g f10762f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10763g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10764h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10765i;
    public final String j;

    public C0709b(g gVar, String str, boolean z8, int i4, String str2) {
        j.e(gVar, "condition");
        j.e(str, "name");
        this.f10762f = gVar;
        this.f10763g = str;
        this.f10764h = z8;
        this.f10765i = i4;
        this.j = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0709b)) {
            return false;
        }
        C0709b c0709b = (C0709b) obj;
        if (j.a(this.f10762f, c0709b.f10762f) && j.a(this.f10763g, c0709b.f10763g) && this.f10764h == c0709b.f10764h && this.f10765i == c0709b.f10765i && j.a(this.j, c0709b.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + AbstractC1149a.b(this.f10765i, AbstractC1149a.c(A.j.c(this.f10763g, this.f10762f.hashCode() * 31, 31), 31, this.f10764h), 31);
    }

    @Override // s3.AbstractC1492c
    public final AbstractC0901a p() {
        return this.f10762f;
    }

    @Override // s3.AbstractC1492c
    public final String s() {
        return this.f10763g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiTriggerCondition(condition=");
        sb.append(this.f10762f);
        sb.append(", name=");
        sb.append(this.f10763g);
        sb.append(", haveError=");
        sb.append(this.f10764h);
        sb.append(", iconRes=");
        sb.append(this.f10765i);
        sb.append(", description=");
        return A.j.r(sb, this.j, ")");
    }
}
