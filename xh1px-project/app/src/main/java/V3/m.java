package V3;

import A1.p;
import D4.z;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import java.util.List;
import n6.InterfaceC1163b;
import o6.v;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: A, reason: collision with root package name */
    public final A4.d f6368A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, InterfaceC1163b interfaceC1163b) {
        super(R.style.ScenarioConfigTheme, R.string.dialog_title_action_type, list, interfaceC1163b, null);
        o6.j.e(list, "choices");
        this.f6368A = new A4.d(v.f13643a.b(n.class), new l(this, 0), new l(this, 1), new z(21, this));
    }

    @Override // A1.p
    public final void G(A1.g gVar, View view) {
        k kVar = (k) gVar;
        o6.j.e(kVar, "choice");
        if (!(kVar instanceof b)) {
            return;
        }
        J2.a aVar = J2.a.f2364d;
        A4.d dVar = this.f6368A;
        if (view != null) {
            ((n) dVar.getValue()).f6369b.a(aVar, view);
        } else {
            ((n) dVar.getValue()).f6369b.b(aVar);
        }
    }

    @Override // z1.b, w1.e
    public final void w() {
        super.w();
        ((n) this.f6368A.getValue()).f6369b.b(J2.a.f2364d);
    }
}
