package G1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import t0.AbstractC1537c0;
import t0.P;
import t0.U;

/* loaded from: classes.dex */
public final class j extends P {

    /* renamed from: e, reason: collision with root package name */
    public RecyclerView f1729e;

    /* renamed from: f, reason: collision with root package name */
    public final h f1730f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1731g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f1732h;

    /* renamed from: i, reason: collision with root package name */
    public final i f1733i;
    public d j;
    public int k;

    public j() {
        int i4 = 0;
        this.f1730f = new h(i4, this);
        this.f1733i = new i(i4, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    @Override // t0.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(RecyclerView recyclerView) {
        int i4;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        U adapter;
        ArrayList arrayList;
        if (o6.j.a(this.f1729e, recyclerView)) {
            return;
        }
        RecyclerView recyclerView4 = this.f1729e;
        View view = null;
        i iVar = this.f1733i;
        h hVar = this.f1730f;
        if (recyclerView4 != null) {
            U adapter2 = recyclerView4.getAdapter();
            if (adapter2 != null) {
                adapter2.f14788a.unregisterObserver(hVar);
            }
            RecyclerView recyclerView5 = this.f1729e;
            if (recyclerView5 != null && (arrayList = recyclerView5.f8955m0) != null) {
                arrayList.remove(iVar);
            }
            this.f1729e = null;
        }
        this.f1729e = recyclerView;
        AbstractC1537c0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (layoutManager.e()) {
                view = P.d(layoutManager, f(layoutManager));
            } else if (layoutManager.d()) {
                view = P.d(layoutManager, e(layoutManager));
            }
            if (view != null) {
                i4 = AbstractC1537c0.K(view);
                this.k = i4;
                recyclerView2 = this.f1729e;
                if (recyclerView2 != null) {
                    recyclerView2.j(iVar);
                }
                recyclerView3 = this.f1729e;
                if (recyclerView3 != null && (adapter = recyclerView3.getAdapter()) != null) {
                    adapter.f14788a.registerObserver(hVar);
                }
                super.a(recyclerView);
            }
        }
        i4 = -1;
        this.k = i4;
        recyclerView2 = this.f1729e;
        if (recyclerView2 != null) {
        }
        recyclerView3 = this.f1729e;
        if (recyclerView3 != null) {
            adapter.f14788a.registerObserver(hVar);
        }
        super.a(recyclerView);
    }

    public final void h(int i4) {
        Integer num;
        RecyclerView recyclerView;
        U adapter;
        RecyclerView recyclerView2 = this.f1729e;
        if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
            num = Integer.valueOf(adapter.a());
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (i4 >= 0 && i4 < intValue && (recyclerView = this.f1729e) != null) {
                recyclerView.j0(i4);
            }
        }
    }
}
