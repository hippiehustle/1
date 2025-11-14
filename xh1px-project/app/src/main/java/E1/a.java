package E1;

import D2.f;
import Z.g;
import Z5.y;
import android.graphics.Point;
import android.view.ViewGroup;
import c1.h;
import n6.InterfaceC1162a;
import o6.j;
import y1.InterfaceC1831b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f1153e;

    public /* synthetic */ a(c cVar, int i4) {
        this.f1152d = i4;
        this.f1153e = cVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f1152d) {
            case 0:
                return (H1.b) ((h) ((InterfaceC1831b) f.p(this.f1153e.k().getApplicationContext(), InterfaceC1831b.class))).f9472e.get();
            case 1:
                c cVar = this.f1153e;
                int i4 = cVar.l().f7104e.f7094a.x;
                ViewGroup viewGroup = cVar.f1171w;
                if (viewGroup != null) {
                    int width = (i4 - viewGroup.getWidth()) / 2;
                    int i8 = cVar.l().f7104e.f7094a.y / 2;
                    ViewGroup viewGroup2 = cVar.f1171w;
                    if (viewGroup2 != null) {
                        cVar.R(new Point(width, i8 - viewGroup2.getHeight()));
                        return y.f7506a;
                    }
                    j.i("menuLayout");
                    throw null;
                }
                j.i("menuLayout");
                throw null;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                c.D(this.f1153e);
                return y.f7506a;
            default:
                c cVar2 = this.f1153e;
                cVar2.hashCode();
                if (cVar2.f1168t) {
                    cVar2.f1168t = false;
                    cVar2.z();
                }
                return y.f7506a;
        }
    }
}
