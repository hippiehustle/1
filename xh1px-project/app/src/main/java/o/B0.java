package o;

/* loaded from: classes.dex */
public final class B0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E0 f13044e;

    public /* synthetic */ B0(E0 e02, int i4) {
        this.f13043d = i4;
        this.f13044e = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13043d) {
            case 0:
                C1213s0 c1213s0 = this.f13044e.f13059f;
                if (c1213s0 != null) {
                    c1213s0.setListSelectionHidden(true);
                    c1213s0.requestLayout();
                    return;
                }
                return;
            default:
                E0 e02 = this.f13044e;
                C1213s0 c1213s02 = e02.f13059f;
                if (c1213s02 != null && c1213s02.isAttachedToWindow() && e02.f13059f.getCount() > e02.f13059f.getChildCount() && e02.f13059f.getChildCount() <= e02.f13067p) {
                    e02.f13056C.setInputMethodMode(2);
                    e02.c();
                    return;
                }
                return;
        }
    }
}
