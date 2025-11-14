package B6;

import C6.InterfaceC0004e;
import F6.C;
import F6.C0052l;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import i.AbstractC0862a;
import java.util.Collection;
import n6.InterfaceC1163b;
import o6.v;
import q4.X;

/* loaded from: classes.dex */
public final class h implements E6.c {

    /* renamed from: g, reason: collision with root package name */
    public static final C0725e f478g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0722b f479h;

    /* renamed from: a, reason: collision with root package name */
    public final C f480a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1163b f481b = g.f473e;

    /* renamed from: c, reason: collision with root package name */
    public final v7.i f482c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f476e = {v.f13643a.f(new o6.p(h.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final e f475d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final C0723c f477f = z6.n.k;

    /* JADX WARN: Type inference failed for: r0v2, types: [B6.e, java.lang.Object] */
    static {
        C0724d c0724d = z6.m.f16766c;
        f478g = c0724d.f();
        C0723c g8 = c0724d.g();
        f479h = new C0722b(g8.b(), g8.f10797a.f());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v7.i, v7.h] */
    public h(v7.k kVar, C c6) {
        this.f480a = c6;
        this.f482c = new v7.h(kVar, new f(this, 0, kVar));
    }

    @Override // E6.c
    public final boolean a(C0723c c0723c, C0725e c0725e) {
        o6.j.e(c0723c, "packageFqName");
        o6.j.e(c0725e, "name");
        if (c0725e.equals(f478g) && c0723c.equals(f477f)) {
            return true;
        }
        return false;
    }

    @Override // E6.c
    public final InterfaceC0004e b(C0722b c0722b) {
        o6.j.e(c0722b, "classId");
        if (c0722b.equals(f479h)) {
            return (C0052l) AbstractC0862a.j(this.f482c, f476e[0]);
        }
        return null;
    }

    @Override // E6.c
    public final Collection c(C0723c c0723c) {
        o6.j.e(c0723c, "packageFqName");
        if (c0723c.equals(f477f)) {
            return X.T((C0052l) AbstractC0862a.j(this.f482c, f476e[0]));
        }
        return a6.u.f7768d;
    }
}
