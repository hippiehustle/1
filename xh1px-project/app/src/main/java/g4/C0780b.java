package g4;

import E2.d;
import k2.AbstractC0951a;
import k2.C0953c;
import n1.AbstractC1149a;
import o6.j;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780b extends d {

    /* renamed from: e, reason: collision with root package name */
    public final C0953c f11159e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11160f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11161g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11162h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11163i;
    public final int j;
    public final boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0780b(C0953c c0953c, String str, String str2, String str3, int i4, int i8, boolean z8) {
        super(29);
        j.e(c0953c, "event");
        j.e(str, "name");
        j.e(str2, "conditionsCountText");
        j.e(str3, "actionsCountText");
        this.f11159e = c0953c;
        this.f11160f = str;
        this.f11161g = str2;
        this.f11162h = str3;
        this.f11163i = i4;
        this.j = i8;
        this.k = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0780b)) {
            return false;
        }
        C0780b c0780b = (C0780b) obj;
        if (j.a(this.f11159e, c0780b.f11159e) && j.a(this.f11160f, c0780b.f11160f) && j.a(this.f11161g, c0780b.f11161g) && j.a(this.f11162h, c0780b.f11162h) && this.f11163i == c0780b.f11163i && this.j == c0780b.j && this.k == c0780b.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + AbstractC1149a.b(this.j, AbstractC1149a.b(this.f11163i, A.j.c(this.f11162h, A.j.c(this.f11161g, A.j.c(this.f11160f, this.f11159e.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Override // E2.d
    public final AbstractC0951a s() {
        return this.f11159e;
    }

    @Override // E2.d
    public final String toString() {
        StringBuilder sb = new StringBuilder("UiTriggerEvent(event=");
        sb.append(this.f11159e);
        sb.append(", name=");
        sb.append(this.f11160f);
        sb.append(", conditionsCountText=");
        AbstractC1149a.m(sb, this.f11161g, ", actionsCountText=", this.f11162h, ", enabledOnStartTextRes=");
        sb.append(this.f11163i);
        sb.append(", enabledOnStartIconRes=");
        sb.append(this.j);
        sb.append(", haveError=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
