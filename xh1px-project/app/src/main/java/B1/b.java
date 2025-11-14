package B1;

import A5.n;
import L7.AbstractC0166y;
import L7.F;
import P.C0256d;
import P.InterfaceC0255c;
import P.O;
import T4.k;
import Z4.i;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.U;
import c3.C0573e;
import c5.C0581a;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters.RestartMediaProjectionActivity;
import com.buzbuz.smartautoclicker.scenarios.ScenarioActivity;
import e.C0625a;
import e.InterfaceC0626b;
import g0.Y;
import h4.C0830d;
import h4.C0831e;
import java.util.List;
import l0.C0997a;
import l2.C1001a;
import n6.InterfaceC1162a;
import o.C1220w;
import o6.j;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements n, InterfaceC0626b, Y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f423e;

    public /* synthetic */ b(int i4, Object obj) {
        this.f422d = i4;
        this.f423e = obj;
    }

    @Override // g0.Y
    public void a(String str, Bundle bundle) {
        InterfaceC1162a interfaceC1162a = (InterfaceC1162a) this.f423e;
        if (interfaceC1162a != null) {
            interfaceC1162a.a();
        }
    }

    public boolean b(W0.c cVar, int i4, Bundle bundle) {
        InterfaceC0255c interfaceC0255c;
        C1220w c1220w = (C1220w) this.f423e;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25 && (i4 & 1) != 0) {
            try {
                ((R.h) cVar.f6486e).d();
                Parcelable parcelable = (Parcelable) ((R.h) cVar.f6486e).b();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e9) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e9);
                return false;
            }
        }
        R.h hVar = (R.h) cVar.f6486e;
        ClipData clipData = new ClipData(hVar.a(), new ClipData.Item(hVar.c()));
        if (i8 >= 31) {
            interfaceC0255c = new W0.c(clipData, 2);
        } else {
            C0256d c0256d = new C0256d();
            c0256d.f4254e = clipData;
            c0256d.f4255f = 2;
            interfaceC0255c = c0256d;
        }
        interfaceC0255c.e(hVar.e());
        interfaceC0255c.setExtras(bundle);
        if (O.i(c1220w, interfaceC0255c.build()) != null) {
            return false;
        }
        return true;
    }

    @Override // e.InterfaceC0626b
    public void h(Object obj) {
        Object obj2;
        Intent intent;
        Uri data;
        int i4 = this.f422d;
        C1001a c1001a = null;
        Object obj3 = this.f423e;
        switch (i4) {
            case 1:
                Boolean bool = (Boolean) obj;
                j.b(bool);
                ((M7.c) obj3).m(bool);
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ScenarioActivity scenarioActivity = (ScenarioActivity) obj3;
                C0625a c0625a = (C0625a) obj;
                int i8 = ScenarioActivity.f9852J;
                if (c0625a.f10556d != -1) {
                    Toast.makeText(scenarioActivity, R.string.toast_denied_screen_sharing_permission, 0).show();
                    return;
                }
                i iVar = scenarioActivity.f9859I;
                if (iVar != null) {
                    obj2 = iVar.b();
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof C1001a) {
                    c1001a = (C1001a) obj2;
                }
                if (c1001a != null) {
                    C0581a z8 = scenarioActivity.z();
                    int i9 = c0625a.f10556d;
                    Intent intent2 = c0625a.f10557e;
                    j.b(intent2);
                    if (Build.VERSION.SDK_INT >= 28 && AbstractC1638C.k(scenarioActivity, "android.permission.FOREGROUND_SERVICE") != 0) {
                        Toast.makeText(scenarioActivity, R.string.toast_denied_foreground_permission, 0).show();
                        return;
                    }
                    k kVar = z8.f9672g;
                    if (kVar != null) {
                        kVar.b(i9, intent2, c1001a);
                    }
                    scenarioActivity.finish();
                    return;
                }
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                C0573e c0573e = (C0573e) obj3;
                C0625a c0625a2 = (C0625a) obj;
                if (c0625a2.f10556d == -1 && (intent = c0625a2.f10557e) != null && (data = intent.getData()) != null) {
                    c3.j W7 = c0573e.W();
                    Context O8 = c0573e.O();
                    boolean Y = c0573e.Y();
                    List list = (List) c0573e.f9619C0.getValue();
                    List list2 = (List) c0573e.f9618B0.getValue();
                    j.e(list, "dumbScenarios");
                    j.e(list2, "smartScenarios");
                    C0997a g8 = U.g(W7);
                    S7.e eVar = F.f3175a;
                    AbstractC0166y.q(g8, S7.d.f5456f, null, new c3.i(Y, W7, data, list, list2, O8, null), 2);
                    return;
                }
                return;
            default:
                RestartMediaProjectionActivity restartMediaProjectionActivity = (RestartMediaProjectionActivity) obj3;
                C0625a c0625a3 = (C0625a) obj;
                int i10 = RestartMediaProjectionActivity.f9817I;
                Intent intent3 = c0625a3.f10557e;
                int i11 = c0625a3.f10556d;
                if (intent3 != null && i11 == -1) {
                    Log.i("RequestMediaProjectionActivity", "Media projection permission granted, restart recording");
                    C0831e c0831e = (C0831e) restartMediaProjectionActivity.f9822G.getValue();
                    AbstractC0166y.q(U.g(c0831e), c0831e.f11367b, null, new C0830d(c0831e, i11, intent3, null), 2);
                    restartMediaProjectionActivity.z();
                    return;
                }
                Log.i("RequestMediaProjectionActivity", "Media projection permission rejected");
                restartMediaProjectionActivity.z();
                return;
        }
    }
}
