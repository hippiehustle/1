package k3;

import L7.AbstractC0166y;
import android.content.Context;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import j3.C0933s;
import l5.DialogC1035e;
import o6.v;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958e extends A1.f {

    /* renamed from: A, reason: collision with root package name */
    public final int f11982A;

    /* renamed from: v, reason: collision with root package name */
    public final i3.f f11983v;

    /* renamed from: w, reason: collision with root package name */
    public final A4.d f11984w;

    /* renamed from: x, reason: collision with root package name */
    public R4.d f11985x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11986y;

    /* renamed from: z, reason: collision with root package name */
    public final int f11987z;

    public C0958e(i3.f fVar) {
        super(R.style.AppTheme);
        this.f11983v = fVar;
        this.f11984w = new A4.d(v.f13643a.b(C0964k.class), new C0957d(this, 0), new C0957d(this, 1), new C0933s(2, this));
        this.f11986y = R.string.dialog_overlay_title_copy_from;
        this.f11987z = R.string.search_view_hint_dumb_action_copy;
        this.f11982A = R.string.message_empty_copy;
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        this.f11985x = new R4.d(new A1.h(24, this), (byte) 0);
        RecyclerView recyclerView = (RecyclerView) J().f1331f.j;
        Context context = recyclerView.getContext();
        o6.j.d(context, "getContext(...)");
        recyclerView.i(E2.b.C(context));
        R4.d dVar = this.f11985x;
        if (dVar != null) {
            recyclerView.setAdapter(dVar);
            AbstractC0166y.q(U.e(this), null, null, new C0956c(this, null), 3);
        } else {
            o6.j.i("actionCopyAdapter");
            throw null;
        }
    }

    @Override // A1.f
    public final int G() {
        return this.f11982A;
    }

    @Override // A1.f
    public final int H() {
        return this.f11987z;
    }

    @Override // A1.f
    public final int I() {
        return this.f11986y;
    }

    @Override // A1.f
    public final void K(String str) {
        ((C0964k) this.f11984w.getValue()).f11996b.g(str);
    }
}
