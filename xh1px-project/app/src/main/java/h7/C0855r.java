package h7;

import I7.v;

/* renamed from: h7.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855r extends EnumC0857t {
    public C0855r() {
        super("HTML", 1);
    }

    @Override // h7.EnumC0857t
    public final String a(String str) {
        o6.j.e(str, "string");
        return v.Z(v.Z(str, "<", "&lt;"), ">", "&gt;");
    }
}
