package Z3;

import a6.AbstractC0437l;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import n6.InterfaceC1164c;
import t0.s0;

/* loaded from: classes.dex */
public final class o extends s0 {

    /* renamed from: w, reason: collision with root package name */
    public static final B2.e f7391w = new B2.e(AbstractC0437l.X(Integer.valueOf(R.drawable.ic_confirm), Integer.valueOf(R.drawable.ic_invert), Integer.valueOf(R.drawable.ic_cancel)), false);

    /* renamed from: u, reason: collision with root package name */
    public final A4.d f7392u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1164c f7393v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(A4.d dVar, A1.o oVar) {
        super((ConstraintLayout) dVar.f295e);
        o6.j.e(oVar, "onEventToggleStateChanged");
        this.f7392u = dVar;
        this.f7393v = oVar;
        E2.c.B0((A4.a) dVar.f299i, f7391w);
    }
}
