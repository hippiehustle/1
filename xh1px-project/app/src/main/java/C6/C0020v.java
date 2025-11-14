package C6;

import f7.C0725e;
import z7.InterfaceC1888e;

/* renamed from: C6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020v extends U {

    /* renamed from: a, reason: collision with root package name */
    public final C0725e f774a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1888e f775b;

    public C0020v(C0725e c0725e, InterfaceC1888e interfaceC1888e) {
        o6.j.e(interfaceC1888e, "underlyingType");
        this.f774a = c0725e;
        this.f775b = interfaceC1888e;
    }

    @Override // C6.U
    public final boolean a(C0725e c0725e) {
        return this.f774a.equals(c0725e);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f774a + ", underlyingType=" + this.f775b + ')';
    }
}
