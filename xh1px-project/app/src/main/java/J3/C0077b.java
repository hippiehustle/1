package J3;

import android.content.SharedPreferences;
import android.view.Window;
import com.buzbuz.smartautoclicker.R;
import i.C0865d;
import i.DialogInterfaceC0869h;
import n6.InterfaceC1163b;

/* renamed from: J3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0077b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f2429e;

    public /* synthetic */ C0077b(u uVar, int i4) {
        this.f2428d = i4;
        this.f2429e = uVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        int i4 = this.f2428d;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i4) {
            case 0:
                if (!booleanValue) {
                    u uVar = this.f2429e;
                    s5.b bVar = new s5.b(E2.b.u(uVar.k()));
                    bVar.l(R.string.dialog_overlay_title_warning);
                    C0865d c0865d = (C0865d) bVar.f3288e;
                    c0865d.f11665f = c0865d.f11660a.getText(R.string.error_dialog_message_scenario_saving);
                    bVar.k(R.string.generic_modify, new DialogInterfaceOnClickListenerC0078c(uVar, 0));
                    bVar.j(new DialogInterfaceOnClickListenerC0078c(uVar, 1));
                    DialogInterfaceC0869h c6 = bVar.c();
                    Window window = c6.getWindow();
                    if (window != null) {
                        window.setType(2032);
                    }
                    c6.show();
                }
                return Z5.y.f7506a;
            default:
                u uVar2 = this.f2429e;
                if (!booleanValue) {
                    SharedPreferences.Editor edit = uVar2.S().f2415d.f2924g.edit();
                    o6.j.d(edit, "edit(...)");
                    SharedPreferences.Editor putBoolean = edit.putBoolean("Tutorial_Stop_Volume_Down_dont_show_again", true);
                    o6.j.d(putBoolean, "putBoolean(...)");
                    putBoolean.apply();
                }
                uVar2.S().f(uVar2.k());
                return Z5.y.f7506a;
        }
    }
}
