package q2;

import l1.C1000b;
import r1.C1428b;
import r6.C1474e;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357c {

    /* renamed from: a, reason: collision with root package name */
    public final C1428b f13943a;

    /* renamed from: b, reason: collision with root package name */
    public final C1474e f13944b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13945c;

    /* renamed from: d, reason: collision with root package name */
    public final C1000b f13946d;

    public C1357c(C1428b c1428b) {
        C1000b c1000b;
        o6.j.e(c1428b, "androidExecutor");
        this.f13943a = c1428b;
        this.f13944b = h4.g.a(System.currentTimeMillis());
        if (this.f13945c) {
            c1000b = new C1000b();
        } else {
            c1000b = null;
        }
        this.f13946d = c1000b;
    }
}
