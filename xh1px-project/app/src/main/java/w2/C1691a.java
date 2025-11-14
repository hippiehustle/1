package w2;

import E2.d;
import a6.s;
import f2.i;
import h4.AbstractC0832f;
import j2.C0902b;
import java.util.List;
import k2.C0952b;
import l1.C0999a;
import l2.C1001a;
import o6.j;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691a extends AbstractC0832f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15672b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final C1001a f15673c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15674d;

    /* renamed from: e, reason: collision with root package name */
    public final s f15675e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15676f;

    public C1691a(C1001a c1001a, C0902b c0902b) {
        j.e(c1001a, "scenario");
        j.e(c0902b, "condition");
        this.f15673c = c1001a;
        this.f15676f = c0902b;
        C0999a c0999a = new C0999a(1L, (Long) null);
        this.f15674d = d.y(new C0952b(c0999a, c1001a.f12190a, "Test Event", 1, d.y(new i(new C0999a(1L, (Long) null), c0999a, "Test Pause", 0, 500L)), d.y(C0902b.i(c0902b, null, c0999a, null, 0, null, 0, 0, false, null, 1021)), true, 0, false));
        this.f15675e = s.f7766d;
    }

    public final List H() {
        switch (this.f15672b) {
            case 0:
                return this.f15674d;
            default:
                return this.f15674d;
        }
    }

    public final C1001a I() {
        switch (this.f15672b) {
            case 0:
                return this.f15673c;
            default:
                return this.f15673c;
        }
    }

    public final List J() {
        switch (this.f15672b) {
            case 0:
                return this.f15675e;
            default:
                return this.f15675e;
        }
    }

    public C1691a(C1001a c1001a, C0952b c0952b) {
        j.e(c1001a, "scenario");
        j.e(c0952b, "event");
        this.f15673c = c1001a;
        this.f15676f = c0952b;
        this.f15674d = d.y(c0952b);
        this.f15675e = s.f7766d;
    }
}
