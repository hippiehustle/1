package y3;

import L7.AbstractC0160s;
import a6.AbstractC0437l;
import android.content.ComponentName;
import androidx.lifecycle.Z;
import b2.r;
import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileLauncherActivity;
import i1.C0879a;
import kotlin.Metadata;
import n6.InterfaceC1162a;
import o2.C1229a;
import o6.j;
import w0.C1686d;
import x3.C1787d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly3/g;", "Landroidx/lifecycle/Z;", "quick-settings-tile_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* renamed from: y3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1838g extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0160s f16504b;

    /* renamed from: c, reason: collision with root package name */
    public final C1787d f16505c;

    /* renamed from: d, reason: collision with root package name */
    public final J1.e f16506d;

    /* renamed from: e, reason: collision with root package name */
    public final r f16507e;

    /* renamed from: f, reason: collision with root package name */
    public final C1229a f16508f;

    /* renamed from: g, reason: collision with root package name */
    public final x2.f f16509g;

    /* renamed from: h, reason: collision with root package name */
    public final C0879a f16510h;

    public C1838g(AbstractC0160s abstractC0160s, C1787d c1787d, J1.e eVar, r rVar, C1229a c1229a, x2.f fVar, C0879a c0879a) {
        j.e(c1787d, "qsTileRepository");
        j.e(eVar, "permissionController");
        j.e(rVar, "smartRepository");
        j.e(c1229a, "dumbRepository");
        j.e(fVar, "settingsRepository");
        j.e(c0879a, "appComponentsProvider");
        this.f16504b = abstractC0160s;
        this.f16505c = c1787d;
        this.f16506d = eVar;
        this.f16507e = rVar;
        this.f16508f = c1229a;
        this.f16509g = fVar;
        this.f16510h = c0879a;
    }

    public final void e(QSTileLauncherActivity qSTileLauncherActivity, InterfaceC1162a interfaceC1162a, InterfaceC1162a interfaceC1162a2) {
        L1.b bVar = new L1.b(false);
        ComponentName componentName = this.f16510h.f11751b;
        if (componentName != null) {
            this.f16506d.b(qSTileLauncherActivity, AbstractC0437l.X(bVar, new L1.c(componentName, new C1686d(2, this)), new L1.e(true)), interfaceC1162a, interfaceC1162a2);
        } else {
            j.i("_klickrServiceComponentName");
            throw null;
        }
    }
}
