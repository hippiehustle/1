package O4;

import c1.C0560a;
import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileLauncherActivity;
import com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters.RequestNotificationPermissionActivity;
import com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters.RestartMediaProjectionActivity;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.TutorialActivity;
import com.buzbuz.smartautoclicker.scenarios.ScenarioActivity;
import com.buzbuz.smartautoclicker.settings.SettingsActivity;
import d5.InterfaceC0609a;
import h4.InterfaceC0827a;
import h4.InterfaceC0829c;
import i.AbstractActivityC0870i;
import i.AbstractC0877p;
import y3.InterfaceC1835d;

/* loaded from: classes.dex */
public final class a implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0870i f4009b;

    public /* synthetic */ a(AbstractActivityC0870i abstractActivityC0870i, int i4) {
        this.f4008a = i4;
        this.f4009b = abstractActivityC0870i;
    }

    @Override // d.b
    public final void a() {
        switch (this.f4008a) {
            case 0:
                TutorialActivity tutorialActivity = (TutorialActivity) this.f4009b;
                if (!tutorialActivity.f9828F) {
                    tutorialActivity.f9828F = true;
                    tutorialActivity.f9831I = (C1.g) ((C0560a) ((h) tutorialActivity.a())).f9433a.f9473f.get();
                    return;
                }
                return;
            case 1:
                ScenarioActivity scenarioActivity = (ScenarioActivity) this.f4009b;
                if (!scenarioActivity.f9856F) {
                    scenarioActivity.f9856F = true;
                    ((U4.c) scenarioActivity.a()).getClass();
                    return;
                }
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                SettingsActivity settingsActivity = (SettingsActivity) this.f4009b;
                if (!settingsActivity.f9871F) {
                    settingsActivity.f9871F = true;
                    ((InterfaceC0609a) settingsActivity.a()).getClass();
                    return;
                }
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                RequestNotificationPermissionActivity requestNotificationPermissionActivity = (RequestNotificationPermissionActivity) this.f4009b;
                if (!requestNotificationPermissionActivity.f9814F) {
                    requestNotificationPermissionActivity.f9814F = true;
                    C0560a c0560a = (C0560a) ((InterfaceC0827a) requestNotificationPermissionActivity.a());
                    requestNotificationPermissionActivity.f9815G = (J1.e) c0560a.f9434b.f9440d.get();
                    requestNotificationPermissionActivity.f9816H = (C1.g) c0560a.f9433a.f9473f.get();
                    return;
                }
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                RestartMediaProjectionActivity restartMediaProjectionActivity = (RestartMediaProjectionActivity) this.f4009b;
                if (!restartMediaProjectionActivity.f9821F) {
                    restartMediaProjectionActivity.f9821F = true;
                    restartMediaProjectionActivity.f9823H = (C1.g) ((C0560a) ((InterfaceC0829c) restartMediaProjectionActivity.a())).f9433a.f9473f.get();
                    return;
                }
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                AbstractActivityC0870i abstractActivityC0870i = this.f4009b;
                AbstractC0877p n3 = abstractActivityC0870i.n();
                n3.a();
                ((A.i) abstractActivityC0870i.f9337h.f89f).b("androidx:appcompat");
                n3.d();
                return;
            default:
                QSTileLauncherActivity qSTileLauncherActivity = (QSTileLauncherActivity) this.f4009b;
                if (!qSTileLauncherActivity.f9800F) {
                    qSTileLauncherActivity.f9800F = true;
                    ((InterfaceC1835d) qSTileLauncherActivity.a()).getClass();
                    return;
                }
                return;
        }
    }
}
