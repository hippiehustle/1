package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: o.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225y0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13426e;

    public /* synthetic */ C1225y0(int i4, Object obj) {
        this.f13425d = i4;
        this.f13426e = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j) {
        C1213s0 c1213s0;
        switch (this.f13425d) {
            case 0:
                if (i4 != -1 && (c1213s0 = ((E0) this.f13426e).f13059f) != null) {
                    c1213s0.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f13426e).o(i4);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i4 = this.f13425d;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
