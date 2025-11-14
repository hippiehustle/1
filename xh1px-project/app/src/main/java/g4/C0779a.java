package g4;

import E2.d;
import k2.AbstractC0951a;
import k2.C0952b;
import n1.AbstractC1149a;
import o6.j;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final C0952b f11154e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11155f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11156g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11157h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11158i;
    public final int j;
    public final boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779a(C0952b c0952b, String str, String str2, String str3, int i4, int i8, boolean z8) {
        super(29);
        j.e(c0952b, "event");
        j.e(str, "name");
        j.e(str2, "conditionsCountText");
        j.e(str3, "actionsCountText");
        this.f11154e = c0952b;
        this.f11155f = str;
        this.f11156g = str2;
        this.f11157h = str3;
        this.f11158i = i4;
        this.j = i8;
        this.k = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0779a)) {
            return false;
        }
        C0779a c0779a = (C0779a) obj;
        if (j.a(this.f11154e, c0779a.f11154e) && j.a(this.f11155f, c0779a.f11155f) && j.a(this.f11156g, c0779a.f11156g) && j.a(this.f11157h, c0779a.f11157h) && this.f11158i == c0779a.f11158i && this.j == c0779a.j && this.k == c0779a.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + AbstractC1149a.b(this.j, AbstractC1149a.b(this.f11158i, A.j.c(this.f11157h, A.j.c(this.f11156g, A.j.c(this.f11155f, this.f11154e.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Override // E2.d
    public final AbstractC0951a s() {
        return this.f11154e;
    }

    @Override // E2.d
    public final String toString() {
        StringBuilder sb = new StringBuilder("UiImageEvent(event=");
        sb.append(this.f11154e);
        sb.append(", name=");
        sb.append(this.f11155f);
        sb.append(", conditionsCountText=");
        AbstractC1149a.m(sb, this.f11156g, ", actionsCountText=", this.f11157h, ", enabledOnStartTextRes=");
        sb.append(this.f11158i);
        sb.append(", enabledOnStartIconRes=");
        sb.append(this.j);
        sb.append(", haveError=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
