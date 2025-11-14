package L6;

import c7.AbstractC0586e;
import c7.C0584c;
import g6.C0790b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i0[] f3146e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0790b f3147f;

    /* renamed from: d, reason: collision with root package name */
    public final M6.h f3148d;

    static {
        i0[] i0VarArr = {new i0("INTERNAL", 0, 0), new i0("PRIVATE", 1, 1), new i0("PROTECTED", 2, 2), new i0("PUBLIC", 3, 3), new i0("PRIVATE_TO_THIS", 4, 4), new i0("LOCAL", 5, 5)};
        f3146e = i0VarArr;
        f3147f = new C0790b(i0VarArr);
    }

    public i0(String str, int i4, int i8) {
        C0584c c0584c = AbstractC0586e.f9700d;
        o6.j.d(c0584c, "VISIBILITY");
        this.f3148d = new M6.h(c0584c, i8);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f3146e.clone();
    }
}
