package L6;

import c7.AbstractC0586e;
import c7.C0584c;
import g6.C0790b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h0[] f3143e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0790b f3144f;

    /* renamed from: d, reason: collision with root package name */
    public final M6.h f3145d;

    static {
        h0[] h0VarArr = {new h0("FINAL", 0, 0), new h0("OPEN", 1, 1), new h0("ABSTRACT", 2, 2), new h0("SEALED", 3, 3)};
        f3143e = h0VarArr;
        f3144f = new C0790b(h0VarArr);
    }

    public h0(String str, int i4, int i8) {
        C0584c c0584c = AbstractC0586e.f9701e;
        o6.j.d(c0584c, "MODALITY");
        this.f3145d = new M6.h(c0584c, i8);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f3143e.clone();
    }
}
