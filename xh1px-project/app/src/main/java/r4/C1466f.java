package r4;

import L7.AbstractC0166y;
import android.content.Context;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import j3.C0933s;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import o6.v;
import r2.C1429a;

/* renamed from: r4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1466f extends A1.f {

    /* renamed from: A, reason: collision with root package name */
    public final int f14388A;

    /* renamed from: B, reason: collision with root package name */
    public final int f14389B;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f14390v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1163b f14391w;

    /* renamed from: x, reason: collision with root package name */
    public final A4.d f14392x;

    /* renamed from: y, reason: collision with root package name */
    public R4.d f14393y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14394z;

    public C1466f(boolean z8, InterfaceC1163b interfaceC1163b) {
        super(R.style.ScenarioConfigTheme);
        this.f14390v = z8;
        this.f14391w = interfaceC1163b;
        this.f14392x = new A4.d(v.f13643a.b(n.class), new C1465e(this, 0), new C1465e(this, 1), new C0933s(18, this));
        this.f14394z = R.string.dialog_overlay_title_copy_from;
        this.f14388A = R.string.search_view_hint_event_copy;
        this.f14389B = R.string.message_empty_copy;
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        n nVar = (n) this.f14392x.getValue();
        AbstractC0166y.q(U.g(nVar), null, null, new l(nVar, this.f14390v, null), 3);
        this.f14393y = new R4.d(new C1429a(1, this));
        RecyclerView recyclerView = (RecyclerView) J().f1331f.j;
        Context context = recyclerView.getContext();
        o6.j.d(context, "getContext(...)");
        recyclerView.i(E2.b.C(context));
        R4.d dVar = this.f14393y;
        if (dVar != null) {
            recyclerView.setAdapter(dVar);
            AbstractC0166y.q(U.e(this), null, null, new C1464d(this, null), 3);
        } else {
            o6.j.i("eventCopyAdapter");
            throw null;
        }
    }

    @Override // A1.f
    public final int G() {
        return this.f14389B;
    }

    @Override // A1.f
    public final int H() {
        return this.f14388A;
    }

    @Override // A1.f
    public final int I() {
        return this.f14394z;
    }

    @Override // A1.f
    public final void K(String str) {
        n nVar = (n) this.f14392x.getValue();
        AbstractC0166y.q(U.g(nVar), null, null, new m(nVar, str, null), 3);
    }
}
