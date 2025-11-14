package G1;

import P.O;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import t0.Q;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1726b;

    public /* synthetic */ h(int i4, Object obj) {
        this.f1725a = i4;
        this.f1726b = obj;
    }

    public void e() {
        RecyclerView recyclerView = (RecyclerView) this.f1726b;
        if (recyclerView.f8974w && recyclerView.f8972v) {
            Q q6 = recyclerView.f8952l;
            WeakHashMap weakHashMap = O.f4214a;
            recyclerView.postOnAnimation(q6);
        } else {
            recyclerView.f8915D = true;
            recyclerView.requestLayout();
        }
    }

    public final void a() {
    }

    public final void b(int i4, int i8) {
    }

    public final void c(int i4, int i8) {
    }

    public final void d(int i4, int i8) {
    }
}
