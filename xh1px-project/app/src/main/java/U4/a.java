package U4;

import T4.k;
import Z4.i;
import Z5.y;
import a.AbstractC0405a;
import android.os.Build;
import android.widget.Toast;
import c5.C0581a;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.scenarios.ScenarioActivity;
import e.C0629e;
import i.C0865d;
import l2.C1001a;
import n6.InterfaceC1162a;
import o6.j;
import p2.e;
import u6.AbstractC1638C;
import z3.EnumC1856b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ScenarioActivity f6159e;

    public /* synthetic */ a(ScenarioActivity scenarioActivity, int i4) {
        this.f6158d = i4;
        this.f6159e = scenarioActivity;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        Object obj;
        int i4 = this.f6158d;
        boolean z8 = false;
        y yVar = y.f7506a;
        int i8 = 1;
        ScenarioActivity scenarioActivity = this.f6159e;
        switch (i4) {
            case 0:
                i iVar = scenarioActivity.f9859I;
                if (iVar != null) {
                    obj = iVar.b();
                } else {
                    obj = null;
                }
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    C0581a z9 = scenarioActivity.z();
                    j.e(eVar, "scenario");
                    if (Build.VERSION.SDK_INT >= 28 && AbstractC1638C.k(scenarioActivity, "android.permission.FOREGROUND_SERVICE") != 0) {
                        Toast.makeText(scenarioActivity, R.string.toast_denied_foreground_permission, 0).show();
                    } else {
                        k kVar = z9.f9672g;
                        if (kVar != null) {
                            kVar.a(eVar);
                        }
                        scenarioActivity.finish();
                    }
                } else if (obj instanceof C1001a) {
                    C0629e c0629e = scenarioActivity.f9858H;
                    if (c0629e != null) {
                        AbstractC0405a.A0(c0629e, scenarioActivity, ((Boolean) scenarioActivity.z().f9670e.f16109g.f4088d.f()).booleanValue(), new a(scenarioActivity, 2));
                    } else {
                        j.i("projectionActivityResult");
                        throw null;
                    }
                }
                return yVar;
            case 1:
                int i9 = ScenarioActivity.f9852J;
                if (scenarioActivity.z().f9673h.f4088d.f() != EnumC1856b.f16629d) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            default:
                int i10 = ScenarioActivity.f9852J;
                scenarioActivity.getClass();
                s5.b bVar = new s5.b(scenarioActivity);
                bVar.l(R.string.dialog_overlay_title_warning);
                C0865d c0865d = (C0865d) bVar.f3288e;
                c0865d.f11665f = c0865d.f11660a.getText(R.string.message_error_screen_capture_permission_dialog_not_found);
                bVar.k(android.R.string.ok, new J1.c(i8, scenarioActivity));
                bVar.j(null);
                bVar.c().show();
                return yVar;
        }
    }
}
