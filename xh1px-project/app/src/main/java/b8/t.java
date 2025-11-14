package b8;

import g6.C0790b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    public static final t f9290f;

    /* renamed from: g, reason: collision with root package name */
    public static final t f9291g;

    /* renamed from: h, reason: collision with root package name */
    public static final t f9292h;

    /* renamed from: i, reason: collision with root package name */
    public static final t f9293i;
    public static final /* synthetic */ t[] j;
    public static final /* synthetic */ C0790b k;

    /* renamed from: d, reason: collision with root package name */
    public final char f9294d;

    /* renamed from: e, reason: collision with root package name */
    public final char f9295e;

    static {
        t tVar = new t("OBJ", 0, '{', '}');
        f9290f = tVar;
        t tVar2 = new t("LIST", 1, '[', ']');
        f9291g = tVar2;
        t tVar3 = new t("MAP", 2, '{', '}');
        f9292h = tVar3;
        t tVar4 = new t("POLY_OBJ", 3, '[', ']');
        f9293i = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        j = tVarArr;
        k = new C0790b(tVarArr);
    }

    public t(String str, int i4, char c6, char c9) {
        this.f9294d = c6;
        this.f9295e = c9;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) j.clone();
    }
}
