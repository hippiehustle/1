package A1;

import android.content.DialogInterface;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f256e;

    public /* synthetic */ k(int i4, Object obj) {
        this.f255d = i4;
        this.f256e = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f255d) {
            case 0:
                l lVar = (l) this.f256e;
                lVar.f262u = null;
                lVar.i();
                return;
            default:
                ((ScenarioListFragment) this.f256e).f9867k0 = null;
                return;
        }
    }
}
