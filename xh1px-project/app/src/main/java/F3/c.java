package F3;

import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class c implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1316d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f1317e;

    /* renamed from: f, reason: collision with root package name */
    public final A.i f1318f;

    /* renamed from: g, reason: collision with root package name */
    public final A.i f1319g;

    /* renamed from: h, reason: collision with root package name */
    public final A4.d f1320h;

    /* renamed from: i, reason: collision with root package name */
    public final A4.a f1321i;

    public /* synthetic */ c(LinearLayout linearLayout, A.i iVar, A.i iVar2, A4.d dVar, A4.a aVar, int i4) {
        this.f1316d = i4;
        this.f1317e = linearLayout;
        this.f1318f = iVar;
        this.f1319g = iVar2;
        this.f1320h = dVar;
        this.f1321i = aVar;
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1316d) {
            case 0:
                return this.f1317e;
            default:
                return this.f1317e;
        }
    }
}
