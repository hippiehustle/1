package n0;

import O7.Y;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import o.C1207p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln0/w;", "Ln0/J;", "Ln0/v;", "navigation-common_release"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
@InterfaceC1119I("navigation")
/* renamed from: n0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1145w extends AbstractC1120J {

    /* renamed from: c, reason: collision with root package name */
    public final C1121K f12817c;

    public C1145w(C1121K c1121k) {
        o6.j.e(c1121k, "navigatorProvider");
        this.f12817c = c1121k;
    }

    @Override // n0.AbstractC1120J
    public final AbstractC1143u a() {
        return new C1144v(this);
    }

    @Override // n0.AbstractC1120J
    public final void d(List list, C1148z c1148z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1131i c1131i = (C1131i) it.next();
            AbstractC1143u abstractC1143u = c1131i.f12759e;
            o6.j.c(abstractC1143u, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            C1144v c1144v = (C1144v) abstractC1143u;
            Bundle b4 = c1131i.k.b();
            Y y4 = c1144v.j;
            int i4 = y4.f4113a;
            if (i4 == 0) {
                C1207p c1207p = c1144v.f12813e;
                String str = (String) c1207p.f13344c;
                if (str == null) {
                    str = String.valueOf(c1207p.f13342a);
                }
                o6.j.e(str, "superName");
                if (((C1144v) y4.f4114b).f12813e.f13342a == 0) {
                    str = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(str).toString());
            }
            AbstractC1143u abstractC1143u2 = (AbstractC1143u) ((t.k) y4.f4115c).b(i4);
            if (abstractC1143u2 == null) {
                if (((String) y4.f4116d) == null) {
                    y4.f4116d = String.valueOf(y4.f4113a);
                }
                String str2 = (String) y4.f4116d;
                o6.j.b(str2);
                throw new IllegalArgumentException(A.j.p("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            this.f12817c.b(abstractC1143u2.f12812d).d(E2.d.y(b().b(abstractC1143u2, abstractC1143u2.g(b4))), c1148z);
        }
    }
}
