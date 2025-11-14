package F3;

import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class b implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1309d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f1310e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.a f1311f;

    /* renamed from: g, reason: collision with root package name */
    public final A4.a f1312g;

    /* renamed from: h, reason: collision with root package name */
    public final A4.a f1313h;

    /* renamed from: i, reason: collision with root package name */
    public final A.i f1314i;
    public final A.i j;
    public final A4.d k;

    /* renamed from: l, reason: collision with root package name */
    public final A4.a f1315l;

    public b(LinearLayout linearLayout, A4.a aVar, A4.a aVar2, A.i iVar, A.i iVar2, A4.d dVar, A4.a aVar3, A4.a aVar4) {
        this.f1310e = linearLayout;
        this.f1312g = aVar;
        this.f1313h = aVar2;
        this.f1314i = iVar;
        this.j = iVar2;
        this.k = dVar;
        this.f1311f = aVar3;
        this.f1315l = aVar4;
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1309d) {
            case 0:
                return this.f1310e;
            default:
                return this.f1310e;
        }
    }

    public b(LinearLayout linearLayout, A4.a aVar, A4.a aVar2, A4.a aVar3, A.i iVar, A.i iVar2, A4.d dVar, A4.a aVar4) {
        this.f1310e = linearLayout;
        this.f1311f = aVar;
        this.f1312g = aVar2;
        this.f1313h = aVar3;
        this.f1314i = iVar;
        this.j = iVar2;
        this.k = dVar;
        this.f1315l = aVar4;
    }
}
