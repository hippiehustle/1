package O3;

import android.content.Context;
import d4.C0600f;
import g2.C0777a;
import l1.C1000b;
import n6.InterfaceC1162a;

/* renamed from: O3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0204b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0219q f3942e;

    public /* synthetic */ C0204b(C0219q c0219q, int i4) {
        this.f3941d = i4;
        this.f3942e = c0219q;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        String str;
        int i4;
        Integer num;
        switch (this.f3941d) {
            case 0:
                C0219q c0219q = this.f3942e;
                c0219q.c(new C0204b(c0219q, 1));
                break;
            case 1:
                C0219q c0219q2 = this.f3942e;
                H3.b bVar = c0219q2.t().f3924b.f1949d;
                c0219q2.u(new C0777a(((C1000b) bVar.f1907l).a(), bVar.g(), null, null));
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0219q c0219q3 = this.f3942e;
                C1.g o7 = c0219q3.i().o();
                Context h8 = c0219q3.h();
                f2.f fVar = (f2.f) c0219q3.t().f3924b.f1950e.a();
                if (fVar != null) {
                    str = fVar.f10705g;
                } else {
                    str = null;
                }
                o7.d(h8, new C0600f(str, new C0205c(c0219q3, 1), false), true);
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C0219q c0219q4 = this.f3942e;
                C1.g o8 = c0219q4.i().o();
                Context h9 = c0219q4.h();
                f2.f fVar2 = (f2.f) c0219q4.t().f3924b.f1950e.a();
                boolean z8 = false;
                if (fVar2 != null && (num = fVar2.f10707i) != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 0;
                }
                f2.f fVar3 = (f2.f) c0219q4.t().f3924b.f1950e.a();
                if (fVar3 != null) {
                    z8 = fVar3.f10704f;
                }
                o8.d(h9, new S3.g(i4, !z8, new C0205c(c0219q4, 0)), true);
                break;
            default:
                C0219q c0219q5 = this.f3942e;
                c0219q5.i().o().d(c0219q5.h(), new Q3.f(new C0205c(c0219q5, 7)), true);
                break;
        }
        return Z5.y.f7506a;
    }
}
