package T;

import android.database.DataSetObserver;
import o.E0;
import o.Y0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5478b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f5477a = i4;
        this.f5478b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f5477a) {
            case 0:
                Y0 y02 = (Y0) this.f5478b;
                y02.f5479d = true;
                y02.notifyDataSetChanged();
                return;
            default:
                E0 e02 = (E0) this.f5478b;
                if (e02.f13056C.isShowing()) {
                    e02.c();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f5477a) {
            case 0:
                Y0 y02 = (Y0) this.f5478b;
                y02.f5479d = false;
                y02.notifyDataSetInvalidated();
                return;
            default:
                ((E0) this.f5478b).dismiss();
                return;
        }
    }
}
