package o;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class P0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f13130e;

    public /* synthetic */ P0(SearchView searchView, int i4) {
        this.f13129d = i4;
        this.f13130e = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13129d) {
            case 0:
                this.f13130e.s();
                return;
            default:
                T.c cVar = this.f13130e.f8433S;
                if (cVar instanceof Y0) {
                    cVar.b(null);
                    return;
                }
                return;
        }
    }
}
