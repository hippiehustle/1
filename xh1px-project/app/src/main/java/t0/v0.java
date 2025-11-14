package t0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class v0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15008a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f15009b;

    public v0(P p8) {
        this.f15009b = p8;
    }

    @Override // t0.g0
    public final void a(RecyclerView recyclerView, int i4) {
        if (i4 == 0 && this.f15008a) {
            this.f15008a = false;
            this.f15009b.g();
        }
    }

    @Override // t0.g0
    public final void b(RecyclerView recyclerView, int i4, int i8) {
        if (i4 == 0 && i8 == 0) {
            return;
        }
        this.f15008a = true;
    }
}
