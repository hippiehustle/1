package Z6;

import Y6.l;
import Y6.m;
import f7.C0722b;
import f7.C0725e;

/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f7527e;

    public /* synthetic */ d(f fVar, int i4) {
        this.f7526d = i4;
        this.f7527e = fVar;
    }

    @Override // Y6.l
    public final l B(C0722b c0722b, C0725e c0725e) {
        switch (this.f7526d) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override // Y6.l, Y6.m
    public final void k() {
        int i4 = this.f7526d;
    }

    @Override // Y6.l
    public final void l(C0725e c0725e, C0722b c0722b, C0725e c0725e2) {
        int i4 = this.f7526d;
    }

    @Override // Y6.l
    public final void o(C0725e c0725e, k7.f fVar) {
        int i4 = this.f7526d;
    }

    @Override // Y6.l
    public final void r(C0725e c0725e, Object obj) {
        String str;
        switch (this.f7526d) {
            case 0:
                String b4 = c0725e.b();
                boolean equals = "k".equals(b4);
                f fVar = this.f7527e;
                if (equals) {
                    if (obj instanceof Integer) {
                        a.f7509e.getClass();
                        a aVar = (a) a.f7510f.get((Integer) obj);
                        if (aVar == null) {
                            aVar = a.UNKNOWN;
                        }
                        fVar.j = aVar;
                        return;
                    }
                    return;
                }
                if ("mv".equals(b4)) {
                    if (obj instanceof int[]) {
                        fVar.f7532d = (int[]) obj;
                        return;
                    }
                    return;
                }
                if ("xs".equals(b4)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str2.isEmpty()) {
                            fVar.f7533e = str2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("xi".equals(b4)) {
                    if (obj instanceof Integer) {
                        fVar.f7534f = ((Integer) obj).intValue();
                        return;
                    }
                    return;
                } else {
                    if ("pn".equals(b4) && (obj instanceof String)) {
                        ((String) obj).isEmpty();
                        return;
                    }
                    return;
                }
            default:
                String b9 = c0725e.b();
                boolean equals2 = "version".equals(b9);
                f fVar2 = this.f7527e;
                if (equals2) {
                    if (obj instanceof int[]) {
                        fVar2.f7532d = (int[]) obj;
                        return;
                    }
                    return;
                } else {
                    if ("multifileClassName".equals(b9)) {
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        fVar2.f7533e = str;
                        return;
                    }
                    return;
                }
        }
    }

    @Override // Y6.l
    public final m v(C0725e c0725e) {
        switch (this.f7526d) {
            case 0:
                String b4 = c0725e.b();
                if ("d1".equals(b4)) {
                    return new c(this, 0);
                }
                if ("d2".equals(b4)) {
                    return new c(this, 1);
                }
                return null;
            default:
                String b9 = c0725e.b();
                if (!"data".equals(b9) && !"filePartClassNames".equals(b9)) {
                    if ("strings".equals(b9)) {
                        return new e(this, 1);
                    }
                    return null;
                }
                return new e(this, 0);
        }
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void a(C0725e c0725e, k7.f fVar) {
    }

    private final void b(C0725e c0725e, k7.f fVar) {
    }

    private final void e(C0725e c0725e, C0722b c0722b, C0725e c0725e2) {
    }

    private final void f(C0725e c0725e, C0722b c0722b, C0725e c0725e2) {
    }
}
