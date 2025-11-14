package J1;

import L7.AbstractC0166y;
import Y4.i;
import Z.g;
import android.content.DialogInterface;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.scenarios.ScenarioActivity;
import n6.InterfaceC1162a;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2356e;

    public /* synthetic */ c(int i4, Object obj) {
        this.f2355d = i4;
        this.f2356e = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        int i8 = this.f2355d;
        Object obj = this.f2356e;
        switch (i8) {
            case 0:
                e eVar = (e) obj;
                InterfaceC1162a interfaceC1162a = eVar.f2362e;
                if (interfaceC1162a != null) {
                    interfaceC1162a.a();
                }
                eVar.f2361d = null;
                eVar.f2362e = null;
                eVar.f2359b.g(null);
                eVar.f2358a.clear();
                return;
            case 1:
                int i9 = ScenarioActivity.f9852J;
                j.e(dialogInterface, "<unused var>");
                ((ScenarioActivity) obj).finish();
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                Y4.d dVar = (Y4.d) obj;
                i iVar = (i) dVar.f7182x0.getValue();
                long longValue = ((Number) dVar.f7184z0.getValue()).longValue();
                boolean booleanValue = ((Boolean) dVar.f7175A0.getValue()).booleanValue();
                Y4.a aVar = new Y4.a(dVar, 3);
                String str = (String) iVar.f7197f.f();
                if (str != null && str.length() != 0) {
                    AbstractC0166y.q(U.g(iVar), iVar.f7194c, null, new Y4.g(booleanValue, iVar, longValue, str, aVar, null), 2);
                    return;
                }
                return;
            default:
                j.e(dialogInterface, "<unused var>");
                ((InterfaceC1162a) obj).a();
                return;
        }
    }
}
