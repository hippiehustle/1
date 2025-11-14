package V4;

import D4.C0036l;
import K3.z;
import O7.V;
import O7.i0;
import android.content.Context;
import androidx.lifecycle.Z;
import com.buzbuz.smartautoclicker.R;
import kotlin.Metadata;
import o2.C1229a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV4/q;", "Landroidx/lifecycle/Z;", "smartautoclicker_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final b2.r f6412b;

    /* renamed from: c, reason: collision with root package name */
    public final C1229a f6413c;

    /* renamed from: d, reason: collision with root package name */
    public final Y1.d f6414d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f6415e;

    /* renamed from: f, reason: collision with root package name */
    public final C4.e f6416f;

    /* renamed from: g, reason: collision with root package name */
    public final C1.f f6417g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f6418h;

    /* renamed from: i, reason: collision with root package name */
    public final A4.c f6419i;
    public final i0 j;
    public final A4.c k;

    public q(Context context, A3.a aVar, b2.r rVar, C1229a c1229a, Y1.d dVar) {
        o6.j.e(aVar, "revenueRepository");
        o6.j.e(rVar, "smartRepository");
        o6.j.e(c1229a, "dumbRepository");
        o6.j.e(dVar, "displayConfigManager");
        this.f6412b = rVar;
        this.f6413c = c1229a;
        this.f6414d = dVar;
        i0 c6 = V.c(context.getString(R.string.default_scenario_name));
        this.f6415e = c6;
        this.f6416f = new C4.e(new z(c6, 2), 12);
        this.f6417g = new C1.f(c6, 2);
        i0 c9 = V.c(t.f6423e);
        this.f6418h = c9;
        this.f6419i = new A4.c(c9, aVar.f277c, new C3.c(3, null, 6), 27);
        z zVar = new z(c6, 3);
        i0 c10 = V.c(a.f6371e);
        this.j = c10;
        this.k = new A4.c(c10, zVar, new C0036l(3, null, 3), 27);
    }
}
