package o;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class C0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f13049a;

    public C0(E0 e02) {
        this.f13049a = e02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        E0 e02 = this.f13049a;
        B0 b02 = e02.f13072u;
        if (i4 == 1 && e02.f13056C.getInputMethodMode() != 2 && e02.f13056C.getContentView() != null) {
            e02.f13076y.removeCallbacks(b02);
            b02.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i8, int i9) {
    }
}
