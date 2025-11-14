package e3;

import A.i;
import A4.c;
import A4.d;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642a implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10600d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10601e;

    /* renamed from: f, reason: collision with root package name */
    public final i f10602f;

    /* renamed from: g, reason: collision with root package name */
    public final i f10603g;

    /* renamed from: h, reason: collision with root package name */
    public final A4.a f10604h;

    /* renamed from: i, reason: collision with root package name */
    public final i f10605i;
    public final c j;
    public final d k;

    public /* synthetic */ C0642a(LinearLayout linearLayout, i iVar, i iVar2, A4.a aVar, i iVar3, c cVar, d dVar, int i4) {
        this.f10600d = i4;
        this.f10601e = linearLayout;
        this.f10602f = iVar;
        this.f10603g = iVar2;
        this.f10604h = aVar;
        this.f10605i = iVar3;
        this.j = cVar;
        this.k = dVar;
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f10600d) {
            case 0:
                return this.f10601e;
            default:
                return this.f10601e;
        }
    }
}
