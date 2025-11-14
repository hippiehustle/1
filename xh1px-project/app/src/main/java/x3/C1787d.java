package x3;

import A.i;
import L7.AbstractC0160s;
import L7.AbstractC0166y;
import M3.K;
import O7.InterfaceC0233f;
import O7.P;
import O7.V;
import O7.Z;
import android.content.Context;
import b2.r;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import o2.C1229a;
import o4.C1254C;
import o6.j;
import q2.C1365k;
import v2.h;
import w3.C1695d;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1787d {

    /* renamed from: a, reason: collision with root package name */
    public final C1229a f16120a;

    /* renamed from: b, reason: collision with root package name */
    public final C1365k f16121b;

    /* renamed from: c, reason: collision with root package name */
    public final r f16122c;

    /* renamed from: d, reason: collision with root package name */
    public final h f16123d;

    /* renamed from: e, reason: collision with root package name */
    public final C1695d f16124e;

    /* renamed from: f, reason: collision with root package name */
    public final Q7.d f16125f;

    /* renamed from: g, reason: collision with root package name */
    public W5.a f16126g;

    /* renamed from: h, reason: collision with root package name */
    public final P f16127h;

    public C1787d(Context context, AbstractC0160s abstractC0160s, C1229a c1229a, C1365k c1365k, r rVar, h hVar, C1695d c1695d) {
        j.e(c1229a, "dumbRepository");
        j.e(c1365k, "dumbEngine");
        j.e(rVar, "smartRepository");
        j.e(hVar, "smartEngine");
        j.e(c1695d, "qsTileConfigDataSource");
        this.f16120a = c1229a;
        this.f16121b = c1365k;
        this.f16122c = rVar;
        this.f16123d = hVar;
        this.f16124e = c1695d;
        Q7.d b4 = AbstractC0166y.b(E2.d.C(AbstractC0166y.c(), abstractC0160s));
        this.f16125f = b4;
        P t8 = V.t(V.k(V.u(new C1254C((InterfaceC0233f) c1695d.f15686a.f5083f, 11), new K((InterfaceC0617c) null, this, context))), b4, Z.f4117a, null);
        this.f16127h = t8;
        V.s(new i(t8, 26, new C1785b(context, null)), b4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1784a a(C1787d c1787d, Context context, boolean z8, Long l6, Long l8, String str) {
        int i4;
        int i8;
        if (l8 != null && str != null) {
            if (l6 == null) {
                i4 = 1;
            } else if (l8.equals(l6)) {
                i4 = 2;
            }
            i8 = R.string.tile_label_start_scenario;
            if (i4 != 1 && i4 == 2) {
                i8 = R.string.tile_label_stop_scenario;
            }
            String string = context.getString(i8);
            j.d(string, "getString(...)");
            if (i4 == 0) {
                str = context.getString(R.string.tile_subtext_unavailable);
            }
            return new C1784a(i4, string, str, l8, Boolean.valueOf(z8));
        }
        i4 = 0;
        i8 = R.string.tile_label_start_scenario;
        if (i4 != 1) {
            i8 = R.string.tile_label_stop_scenario;
        }
        String string2 = context.getString(i8);
        j.d(string2, "getString(...)");
        if (i4 == 0) {
        }
        return new C1784a(i4, string2, str, l8, Boolean.valueOf(z8));
    }
}
