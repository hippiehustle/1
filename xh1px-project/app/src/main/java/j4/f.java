package j4;

import L7.AbstractC0166y;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import j3.C0933s;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import o6.v;

/* loaded from: classes.dex */
public final class f extends A1.f {

    /* renamed from: A, reason: collision with root package name */
    public final int f11923A;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1163b f11924v;

    /* renamed from: w, reason: collision with root package name */
    public final A4.d f11925w;

    /* renamed from: x, reason: collision with root package name */
    public b f11926x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11927y;

    /* renamed from: z, reason: collision with root package name */
    public final int f11928z;

    public f(InterfaceC1163b interfaceC1163b) {
        super(R.style.ScenarioConfigTheme);
        this.f11924v = interfaceC1163b;
        this.f11925w = new A4.d(v.f13643a.b(l.class), new e(this, 0), new e(this, 1), new C0933s(1, this));
        this.f11927y = R.string.dialog_overlay_title_copy_from;
        this.f11928z = R.string.search_view_hint_condition_copy;
        this.f11923A = R.string.message_empty_copy;
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        this.f11926x = new b(new A1.h(23, this), new C1.b(8, this));
        RecyclerView recyclerView = (RecyclerView) J().f1331f.j;
        b bVar = this.f11926x;
        if (bVar != null) {
            recyclerView.setAdapter(bVar);
            recyclerView.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager();
            b bVar2 = this.f11926x;
            if (bVar2 != null) {
                gridLayoutManager.K = (C0941a) bVar2.f11916h;
                recyclerView.setLayoutManager(gridLayoutManager);
                AbstractC0166y.q(U.e(this), null, null, new d(this, null), 3);
                return;
            }
            o6.j.i("conditionAdapter");
            throw null;
        }
        o6.j.i("conditionAdapter");
        throw null;
    }

    @Override // A1.f
    public final int G() {
        return this.f11923A;
    }

    @Override // A1.f
    public final int H() {
        return this.f11928z;
    }

    @Override // A1.f
    public final int I() {
        return this.f11927y;
    }

    @Override // A1.f
    public final void K(String str) {
        ((l) this.f11925w.getValue()).f11933c.g(str);
    }
}
