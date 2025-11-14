package L6;

import c7.AbstractC0586e;
import c7.C0584c;
import g6.C0790b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g0[] f3140e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0790b f3141f;

    /* renamed from: d, reason: collision with root package name */
    public final M6.h f3142d;

    static {
        g0[] g0VarArr = {new g0("DECLARATION", 0, 0), new g0("FAKE_OVERRIDE", 1, 1), new g0("DELEGATION", 2, 2), new g0("SYNTHESIZED", 3, 3)};
        f3140e = g0VarArr;
        f3141f = new C0790b(g0VarArr);
    }

    public g0(String str, int i4, int i8) {
        C0584c c0584c = AbstractC0586e.f9710p;
        o6.j.d(c0584c, "MEMBER_KIND");
        this.f3142d = new M6.h(c0584c, i8);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f3140e.clone();
    }
}
