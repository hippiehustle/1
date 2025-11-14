package x7;

import w7.AbstractC1741c;
import w7.C1750l;
import w7.H;
import w7.W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: d, reason: collision with root package name */
    public static final q f16302d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f16303e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f16304f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f16305g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s[] f16306h;

    static {
        q qVar = new q();
        f16302d = qVar;
        o oVar = new o();
        f16303e = oVar;
        r rVar = new r();
        f16304f = rVar;
        p pVar = new p();
        f16305g = pVar;
        f16306h = new s[]{qVar, oVar, rVar, pVar};
    }

    public static s b(W w8) {
        o6.j.e(w8, "<this>");
        if (w8.E0()) {
            return f16303e;
        }
        if (w8 instanceof C1750l) {
        }
        if (AbstractC1741c.g(m.f16299a.q0(), AbstractC1741c.l(w8), H.f15955b)) {
            return f16305g;
        }
        return f16304f;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f16306h.clone();
    }

    public abstract s a(W w8);
}
